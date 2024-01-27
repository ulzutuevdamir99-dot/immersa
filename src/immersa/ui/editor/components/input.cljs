(ns immersa.ui.editor.components.input
  (:require
    [immersa.ui.editor.components.text :refer [text]]
    [immersa.ui.theme.colors :as colors]
    [immersa.ui.theme.typography :as typography]
    [spade.core :refer [defclass defattrs]]))

(defattrs input-wrapper []
  {:position :relative}
  [:&:hover
   [:label {:visibility :hidden}]])

(defclass input-number-style []
  {:font-size typography/s
   :font-weight typography/medium
   :color colors/text-primary
   :border (str "1px solid " colors/border2)
   :border-radius "5px"
   :padding "0 0.4rem"
   :outline :none}
  [:&:hover
   {:box-shadow (str colors/button-box-shadow " 0px 1px 2px")
    :border (str "1px solid " colors/border3)}]
  [:&:focus
   {:box-shadow (str colors/button-box-shadow " 0px 1px 2px")
    :border (str "1px solid " colors/button-outline-border)}]
  ["&[type=\"number\"]::-webkit-outer-spin-button"
   "&[type=\"number\"]::-webkit-inner-spin-button"
   {:height "25px"
    :z-index 2
    :position :absolute
    :top "0"
    :right "0"
    :bottom "0"}])

(defattrs label-style []
  {:width :min-content
   :height "calc(100% - 2px)"
   :padding "0 0.4rem"
   :z-index 1
   :top "1px"
   :right "1px"
   :position :absolute
   :display :flex
   :justify-content :center
   :align-items :center
   :border-top-right-radius "1rem"
   :border-bottom-right-radius "1rem"})

(defn input-number [{:keys [min max step class style label on-change]
                     :or {min "-Infinity"
                          max "Infinity"
                          step "1"}}]
  [:div (input-wrapper)
   [:input {:class [(input-number-style) class]
            :style (merge {:width "56px"
                           :height "24px"} style)
            :type "number"
            :min min
            :max max
            :default-value 0
            :step step
            :on-change on-change}]
   [:label (label-style)
    [text {:size :s} label]]])
