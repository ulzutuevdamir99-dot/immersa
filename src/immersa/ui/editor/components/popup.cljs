(ns immersa.ui.editor.components.popup
  (:require
    ["@radix-ui/react-popover" :as Popover]
    [immersa.ui.icons :as icon]
    [immersa.ui.theme.colors :as colors]
    [spade.core :refer [defglobal defclass defattrs]]))

(defclass popover-root []
  {:all :unset})

(defclass popover-content []
  {:z-index 6000
   :margin-right "8px"
   :border-radius "4px"
   :outline :none
   :padding "20px"
   :width "450px"
   :background-color colors/app-background
   :box-shadow "0px 10px 38px -10px rgba(22, 23, 24, 0.35), 0px 10px 20px -15px rgba(22, 23, 24, 0.2)"}
  #_[:&:focus
           {:box-shadow (str "hsl(206 22% 7% / 35%) 0px 10px 38px -10px, "
                             "hsl(206 22% 7% / 20%) 0px 10px 20px -15px, 0 0 0 2px " colors/black-a7)}])

(defclass popover-arrow []
  {:fill :white})

(defclass popover-close []
  {:height "35px"
   :width "35px"
   :outline :none
   :display "inline-flex"
   :background :transparent
   :border :none
   :align-items "center"
   :justify-content "center"
   :color colors/text-primary
   :font-weight :bold
   :position :absolute
   :top "5px"
   :right "13px"}
  [:&:hover
   {:background-color colors/hover-bg
    :border-radius "50%"}])

(defn popup [{:keys [trigger style content]}]
  [:> Popover/Root {:class (popover-root)}
   [:> Popover/Trigger {:as-child true}
    (if (-> trigger first fn?)
      (apply (first trigger) (rest trigger))
      trigger)]
   [:> Popover/Portal
    [:> Popover/Content {:sideOffset 5
                         :style style
                         :class (popover-content)}
     content
     [:> Popover/Close {:aria-label "Close"
                        :class (popover-close)}
      [icon/x {:size 16}]]
     [:> Popover/Arrow {:class (popover-arrow)}]]]])
