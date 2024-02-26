(ns immersa.ui.editor.components.alert-dialog
  (:require
    ["@radix-ui/react-alert-dialog" :as AlertDialog]
    [immersa.ui.editor.components.button :refer [button]]
    [immersa.ui.theme.colors :as colors]
    [spade.core :refer [defclass defattrs]]))

(defclass alert-dialog-root []
  {:all :unset})

(defclass alert-dialog-overlay []
  {:background-color colors/black-a9
   :position :fixed
   :inset 0
   :z-index 6000
   :animation "overlayShow 150ms cubic-bezier(0.16, 1, 0.3, 1)"})

(defclass alert-dialog-content []
  {:background-color :white
   :border-radius "6px"
   :box-shadow "hsl(206 22% 7% / 35%) 0px 10px 38px -10px, hsl(206 22% 7% / 20%) 0px 10px 20px -15px"
   :position :fixed
   :top "50%"
   :left "50%"
   :transform "translate(-50%, -50%)"
   :width "90vw"
   :max-width "500px"
   :max-height "85vh"
   :padding "15px"
   :z-index 7000
   :box-sizing :border-box
   :animation "contentShow 150ms cubic-bezier(0.16, 1, 0.3, 1)"}
  [:&:focus
   {:outline :none}])

(defclass alert-dialog-title []
  {:margin 0
   :color colors/text-primary
   :font-size "17px"
   :font-weight 500})

(defclass alert-dialog-description []
  {:margin-bottom "20px"
   :color colors/text-primary
   :font-size "15px"
   :line-height 1.5})

(defn alert-dialog [{:keys [open? trigger title description content cancel-button action-button]}]
  [:> AlertDialog/Root (cond-> {:class (alert-dialog-root)}
                         (some? open?) (assoc :open open?))
   [:> AlertDialog/Trigger {:as-child true}
    (if (-> trigger first fn?)
      (apply (first trigger) (rest trigger))
      trigger)]
   [:> AlertDialog/Portal
    [:> AlertDialog/Overlay {:class (alert-dialog-overlay)}]
    [:> AlertDialog/Content {:class (alert-dialog-content)}
     [:> AlertDialog/Title {:class (alert-dialog-title)} title]
     [:> AlertDialog/Description {:class (alert-dialog-description)} description]
     [:div {:style {:display "flex"
                    :flex-direction "column"
                    :gap "20px"
                    :align-items "end"}}
      (when content
        content)
      [:> AlertDialog/Cancel {:as-child true}
       (when cancel-button
         (if (string? cancel-button)
           (button {:text cancel-button})
           (apply (first cancel-button) (rest cancel-button))))]
      (when action-button
        [:> AlertDialog/Action {:as-child true}
         (if (-> action-button first fn?)
           (apply (first action-button) (rest action-button))
           action-button)])]]]])
