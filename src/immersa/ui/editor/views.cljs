(ns immersa.ui.editor.views
  (:require
    [applied-science.js-interop :as j]
    [goog.functions :as functions]
    [immersa.scene.core :as scene.core]
    [immersa.ui.editor.events :as event]
    [immersa.ui.editor.styles :as styles]
    [immersa.ui.editor.subs :as subs]
    [immersa.ui.icons :as icon]
    [immersa.ui.theme.colors :as colors]
    [re-frame.core :refer [dispatch subscribe]]
    [reagent.core :as r]))

(defn- canvas []
  (r/create-class
    {:component-did-mount #(scene.core/start-scene
                             (js/document.getElementById "renderCanvas")
                             :start-slide-show? false)
     :reagent-render (fn []
                       [:canvas
                        {:id "renderCanvas"
                         :class (styles/canvas)}])}))

(defn- canvas-container []
  (let [{:keys [width height]} @(subscribe [::subs/calculated-canvas-wrapper-dimensions])]
    (when (and width height (> width 0) (> height 0))
      [:div
       {:id "canvas-container"
        :style {:width (str width "px")
                :height (str height "px")}
        :class (styles/canvas-container)}
       [canvas]])))

(defn- canvas-wrapper []
  (let [ref (r/atom nil)
        on-resize (functions/debounce
                    (fn [entries]
                      ;; TODO resize the BabylonJS
                      (doseq [e entries]
                        (dispatch [::event/set-canvas-wrapper-dimensions
                                   (j/get-in e [:contentRect :width])
                                   (j/get-in e [:contentRect :height])])))
                    200)]
    (r/create-class
      {:component-did-mount (fn []
                              (when @ref
                                (let [observer (js/ResizeObserver. on-resize)]
                                  (j/call observer :observe @ref))))
       :reagent-render (fn []
                         [:div
                          {:id "canvas-wrapper"
                           :ref #(reset! ref %)
                           :style {:display "flex"
                                   :flex 1
                                   :flex-direction "column"
                                   :position "relative"
                                   :overflow "hidden"
                                   ;; TODO add those when show no UI
                                   ;; :justify-content "center"
                                   ;; :align-items "center"
                                   :box-sizing "border-box"
                                   :box-shadow "none"}}
                          (when @ref
                            [canvas-container])])})))

(defn- header-left-panel []
  [:div (styles/title-bar)
   [:div (styles/menubar-list-icon)
    [icon/list {:size 24
                :color colors/text-primary}]]
   [:div (styles/title-bar-full-width)
    [:div (styles/title-container)
     [:span (styles/title-label) "My 3D Presentation"]]]])

(defn presentation-component [{:keys [icon class text]}]
  [:div {:class [(styles/presentation-component) class]}
   [icon {:size 24
          :color colors/text-primary}]
   [:span (styles/presentation-component-label) text]])

(defn- header-center-panel []
  [:div (styles/header-center-panel)
   [presentation-component {:icon icon/text
                            :text "Text"}]
   [presentation-component {:icon icon/image
                            :text "Image"}]
   [presentation-component {:icon icon/cube
                            :text "3D Model"
                            :class (styles/presentation-component-cube)}]
   [presentation-component {:icon icon/image
                            :text "Light"}]])

(defn- header-right-panel []
  [:div (styles/header-right)
   [:div (styles/header-right-container)
    [:button
     {:style {:padding "0 8px"
              :height "30px"
              :border-radius "5px"
              :border "1px solid rgba(13, 14, 19, 0.1)"}}
     "Present"]
    [:button
     {:style {:display "flex"
              :align-items "center"
              :gap "4px"
              :padding "0 8px"
              :height "30px"
              :border-radius "8px"
              :border "1px solid rgba(13, 14, 19, 0.1)"}}
     [:span "Share"]
     [icon/share]]]])

(defn- header []
  [:div (styles/header-container)
   [header-left-panel]
   [header-center-panel]
   [header-right-panel]])

(defn editor-panel []
  [:div
   {:id "editor-container"
    :class (styles/content-container)}
   [header]

   [:div
    {:id "content-container"
     :style {:display "flex"
             :flex 1
             :overflow "hidden"
             :position "relative"}}
    [:div
     {:id "side-bar"
      :style {:flex-shrink "0"
              :width "200px"
              :border-right "1px solid rgb(239, 241, 244)"
              :box-sizing "border-box"
              :box-shadow "none"
              :display "flex"
              :position "relative"
              :flex-direction "column"}}]

    [canvas-wrapper]

    [:div
     {:id "options-bar"
      :style {;; :background "white"
              :width "340px"
              :z-index "5000"
              :display "flex"
              :flex-direction "column"
              :overflow "hidden"
              ;; :border-radius "8px"
              ;; :margin-right "8px"
              ;; :margin-top "4px"
              ;; :margin-bottom "12px"
              :border-left "1px solid rgb(239, 241, 244)"
              :box-sizing "border-box"}}]]

   #_[canvas-container]])
