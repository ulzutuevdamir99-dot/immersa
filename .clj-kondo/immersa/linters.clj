(ns immersa.linters
  (:require
    [clj-kondo.hooks-api :as api]
    [clojure.string :as str]))

(defn- form-body-nodes [form-node]
  (rest (:children form-node)))

(defn- interceptor-nodes [body-nodes]
  (:children (second body-nodes)))

(defn- schema-check-interceptor? [node]
  (and (api/vector-node? node)
       (= "check-schema-mw" (-> node :children first :string-value))))

(defn- has-schema-check-interceptor? [body-nodes]
  (->> body-nodes
       interceptor-nodes
       (filter schema-check-interceptor?)
       first
       some?))

(defn- has-db-key? [body-nodes]
  (->> body-nodes
       last
       :children
       last
       (tree-seq :children :children)
       (filter #(and (api/keyword-node? %)
                     (= :db (:k %))))
       seq
       some?))

(defn reg-db-linter [{:keys [node]}]
  (when-not (re-seq #"check-schema-mw" (str (api/sexpr node)))
    (api/reg-finding!
      (assoc (meta node)
             :message "Missing schema check"
             :type :immersa.linters/missing-schema-check))))

(defn reg-fx-linter [{form-node :node}]
  (let [body-nodes (form-body-nodes form-node)]
    (when (and (has-db-key? body-nodes)
               (not (has-schema-check-interceptor? body-nodes)))
      (api/reg-finding!
        (assoc (meta form-node)
               :message "Missing schema check"
               :type :immersa.linters/missing-schema-check)))))

(defn qualified-keyword [{:keys [node]}]
  (let [sexpr (api/sexpr node)
        event (second sexpr)
        kw (first event)]
    (when (and (vector? event)
               (keyword? kw)
               (not (qualified-keyword? kw)))
      (let [m (some-> node :children second :children first meta)]
        (api/reg-finding! (assoc m :message "keyword should be fully qualified!"
                                 :type :re-frame/keyword))))))

(defn- rgb-or-hex-used? [defn-as-text]
  (re-seq #"rgb|#" defn-as-text))

(defn spade-linter [{:keys [node]}]
  (let [s-expression (api/sexpr node)
        style-map (nth s-expression 3)]
    (when (map? style-map)
      (when (contains? style-map :font-family)
        (let [font-family (:font-family style-map)]
          (when-not (or (symbol? font-family)
                        (list? font-family))
            (api/reg-finding!
              (assoc (meta node)
                     :message "Use fonts from the immersa.common.theme.typography namespace"
                     :type :immersa.linters/incorrect-style-usage)))))
      (when (rgb-or-hex-used? (str style-map))
        (api/reg-finding!
          (assoc (meta node)
                 :message "Use colors from the immersa.common.theme.colors namespace"
                 :type :immersa.linters/incorrect-style-usage)))
      (when (contains? style-map :font-weight)
        (when-not (symbol? (:font-weight style-map))
          (api/reg-finding!
            (assoc (meta node)
                   :message "Use font weights from the immersa.common.theme.typography namespace"
                   :type :immersa.linters/incorrect-style-usage)))))))

;; TODO: Make it support variadic defs
(defn defn-linter [{:keys [node]}]
  (let [argument-vector (first (filter vector? (api/sexpr node)))]
    (when (< 4 (count argument-vector))
      (api/reg-finding!
        (assoc (meta node)
               :message "Too many function arguments. Max is 4"
               :type :immersa.linters/function-arguments)))))

(defn find-required-ns? [node ns]
  (->> (:children node)
       (filter api/list-node?)
       (map :children)
       (filter #(-> % first api/sexpr (= :require)))
       (map #(->> % (filter api/vector-node?)))
       flatten
       (filter #(-> % api/sexpr first (= ns)))
       first))

(defn restrict-phosphor-icons-require-linter [{:keys [node]}]
  (let [phosphor-icons-react-ns "@phosphor-icons/react"]
    (when-let [require-node (find-required-ns? node phosphor-icons-react-ns)]
      (api/reg-finding!
        (assoc (meta require-node)
               :message "Use of @phosphor-icons/react namespace is restricted. Prefer to use immersa.loyto.icons instead."
               :type :immersa.linters/restrict-phosphor-icons-require)))))
