(ns immersa.common.macros
  (:require
    [cljs.core.async.macros :refer [go-loop]]))

(defmacro go-loop-sub [pub key binding & body]
  `(let [ch# (cljs.core.async/chan)]
     (cljs.core.async/sub ~pub ~key ch#)
     (go-loop []
       (let [~binding (cljs.core.async/<! ch#)]
         ~@body)
       (recur))))

(defmacro js-await [[name thenable] & body]
  (let [last-expr (last body)

        [body catch]
        (if (and (seq? last-expr) (= 'catch (first last-expr)))
          [(butlast body) last-expr]
          [body nil])]

    `(-> ~thenable
         ~@(when (seq body)
             [`(.then (fn [~name] ~@body))])
         ~@(when catch
             (let [[_ name & body] catch]
               [`(.catch (fn [~name] ~@body))])))))
