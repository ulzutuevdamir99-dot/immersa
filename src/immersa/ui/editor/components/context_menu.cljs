(ns immersa.ui.editor.components.context-menu
  (:require
    [immersa.ui.editor.components.dropdown :refer [dropdown
                                                   dropdown-item
                                                   dropdown-separator
                                                   dropdown-context-menu]]
    [immersa.ui.editor.components.scroll-area :refer [scroll-area]]
    [immersa.ui.editor.components.text :refer [text]]
    [immersa.ui.editor.events :as events]
    [immersa.ui.editor.subs :as subs]
    [re-frame.core :refer [dispatch subscribe]]
    [spade.core :refer [defclass defattrs]]))

(def context-menu-width "220px")
(def context-menu-height "220px")

(defclass context-menu-scroll-area []
  {:width context-menu-width
   :height context-menu-height
   :overflow :hidden}
  ;; Fade out effect
  [:&:before
   {:content "''"
    :position "fixed"
    :width context-menu-width
    :height "8px"
    :background "linear-gradient(180deg,#ffffff 0%,rgba(252,252,253,0) 100%)"}])

(defattrs option-text-style [disabled?]
  {:display :flex
   :flex-direction :row
   :justify-content :space-between
   :width "100%"}
  (when disabled?
    {:cursor :not-allowed}))

(defn- option-text [label shortcut disabled?]
  [:div (option-text-style disabled?)
   [text {:weight :light
          :disabled? disabled?} label]
   (when shortcut
     [text {:weight :light
            :disabled? disabled?} shortcut])])

(defn- main-options []
  [:<>
   [dropdown-item
    [option-text "Add new slide" "N"]]
   [dropdown-item
    [option-text "Delete slide" "⌘ + ⌫"]]
   [dropdown-item
    [option-text "Paste" "⌘ + V"]]])

(defn- selected-mesh-options []
  [:<>
   [dropdown-item
    [option-text "Focus" "F"]]
   [dropdown-item
    [option-text "Reset position"]]
   [dropdown-item
    [option-text "Reset rotation"]]
   [dropdown-item
    [option-text "Reset scale"]]
   [dropdown-item
    [option-text "Duplicate" "⌘ + D"]]
   [dropdown-item
    [option-text "Copy" "⌘ + C"]]
   [dropdown-item
    [option-text "Paste" "⌘ + V"]]
   [dropdown-item
    [option-text "Delete" "⌫"]]])

(defn- camera-options []
  (let [camera-locked? @(subscribe [::subs/camera-locked?])
        lock-text (if camera-locked? "Unlock" "Lock")]
    [:<>
     [dropdown-item
      [option-text "Reset camera to initials" "Shift + I" camera-locked?]]
     [dropdown-item
      [option-text "Reset camera position" "Shift + P" camera-locked?]]
     [dropdown-item
      [option-text "Reset camera rotation" "Shift + R" camera-locked?]]
     [dropdown-item
      [option-text (str lock-text " camera") "Shift + L"]]]))

(defn context-menu []
  (let [[x y] @(subscribe [::subs/context-menu-position])]
    (when x
      [dropdown-context-menu
       {:on-open-change (fn [open?]
                          (when-not open?
                            (dispatch [::events/clear-context-menu-position])
                            (some-> (js/document.getElementById "renderCanvas") .focus)))
        :trigger [:div
                  {:id "context-menu-trigger"
                   :style {:position "absolute"
                           :z-index 9999
                           :top (str (- y 55) "px")
                           :left (str (+ x 115) "px")}}]
        :children [scroll-area
                   {:class (context-menu-scroll-area)
                    :children
                    [:<>
                     (if @(subscribe [::subs/selected-mesh])
                       [selected-mesh-options]
                       [main-options])
                     [dropdown-separator]
                     [camera-options]]}]}])))
