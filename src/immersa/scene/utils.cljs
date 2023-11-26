(ns immersa.scene.utils
  (:require
    [applied-science.js-interop :as j]
    [immersa.common.utils :as common.utils]))

(defn register-object-to-rotate [canvas object rotation-factor]
  (let [on-mousemove (fn [event]
                       (let [mouse-x (- (* (/ (j/get event :clientX) (j/get canvas :width)) 2) 1)
                             mouse-y (- (* (/ (j/get event :clientY) (j/get canvas :height)) 2) 1)]

                         (j/assoc-in! object [:rotation :y] (* mouse-x rotation-factor))
                         (j/assoc-in! object [:rotation :x] (* mouse-y rotation-factor))))]
    (common.utils/register-event-listener canvas "mousemove" on-mousemove)))
