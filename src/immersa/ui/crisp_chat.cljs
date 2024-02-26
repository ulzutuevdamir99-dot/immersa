(ns immersa.ui.crisp-chat
  (:require
    [applied-science.js-interop :as j]))

(def open-params #js["do" "chat:open"])
(def close-params #js["do" "chat:close"])

(def show-params #js["do" "chat:show"])
(def hide-params #js["do" "chat:hide"])

(defn open []
  (j/call-in js/window [:$crisp :push] show-params)
  (j/call-in js/window [:$crisp :push] open-params))

(defn close []
  (j/call-in js/window [:$crisp :push] hide-params)
  (j/call-in js/window [:$crisp :push] close-params))

(defn toggle []
  (if (j/call-in js/window [:$crisp :is] "chat:opened")
    (close)
    (open)))

(defn set-user-email [email]
  (j/call-in js/window [:$crisp :push] #js["set" "user:email" #js[email]]))

(defn set-user-name [name]
  (j/call-in js/window [:$crisp :push] #js["set" "user:nickname" #js[name]]))

(defn- register-on-close []
  (j/call-in js/window [:$crisp :push] #js["on" "chat:closed" close]))

(defn init []
  (j/assoc! js/window :$crisp [])
  (j/assoc! js/window :CRISP_WEBSITE_ID "e1741deb-404b-4f1c-a3ab-8a925b7a4b95")
  (j/assoc! js/window :CRISP_READY_TRIGGER (fn []
                                             (close)
                                             (register-on-close)))
  (let [d js/document
        s (j/call d :createElement "script")]
    (j/assoc! s :src "https://client.crisp.chat/l.js")
    (j/assoc! s :async 1)
    (j/call (j/get (j/call d :getElementsByTagName "head") 0) :appendChild s)))

;; $crisp.push(["on", "chat:initiated", callback])
(comment
  (push)
  (set-user-name "kek2")
  )
