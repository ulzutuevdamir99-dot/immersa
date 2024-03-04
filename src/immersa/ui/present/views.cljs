(ns immersa.ui.present.views
  (:require
    ["progressbar.js" :as ProgressBar]
    [applied-science.js-interop :as j]
    [immersa.common.utils :as common.utils]
    [immersa.scene.core :as scene.core]
    [immersa.ui.editor.subs :as editor.subs]
    [immersa.ui.icons :as icon]
    [immersa.ui.loading-screen :refer [loading-screen]]
    [immersa.ui.present.events :as events]
    [immersa.ui.present.styles :as styles]
    [immersa.ui.present.subs :as subs]
    [immersa.ui.subs :as main.subs]
    [re-frame.core :refer [dispatch subscribe]]
    [reagent.core :as r]))

(defn- canvas []
  (r/create-class
    {:component-did-mount #(scene.core/start-scene (js/document.getElementById "renderCanvas")
                                                   {:mode :present
                                                    :slides @(subscribe [::editor.subs/slides-all])})
     :reagent-render (fn []
                       [:canvas
                        {:id "renderCanvas"
                         :class (styles/canvas)}])}))

(defn- canvas-editor []
  [:div {:id "canvas-present-origin"
         :style {:width "100%"
                 :height "100%"}}])

(defn- canvas-container [mode]
  (let [{:keys [width height]} @(subscribe [::subs/calculated-canvas-dimensions])]
    (when (and (> width 0) (> height 0))
      [:div
       {:id "canvas-container"
        :style {:width (str width "px")
                :height (str height "px")}
        :class (styles/canvas-container)}
       (when @(subscribe [::subs/show-arrow-keys-text?])
         [:div (styles/arrow-keys-text)
          [:h2 "Use arrow keys to navigate"]
          [:div
           [icon/arrow-left {:size 32
                             :color "white"
                             :weight "bold"}]
           [icon/arrow-right {:size 32
                              :color "white"
                              :weight "bold"}]]])
       (when @(subscribe [::subs/show-pre-warm-text?])
         [:div (styles/arrow-keys-text)
          [:h2 "Pre-warming scene..."]])
       (if (= mode :editor)
         [canvas-editor]
         [canvas])
       (when @(subscribe [::main.subs/loading-screen?])
         [loading-screen height])])))

(defn- progress-bar-line []
  [:div
   {:id "progress-line"
    :class (styles/progress-line)
    :ref (fn [ref]
           (when ref
             (let [bar (ProgressBar/Line. ref
                                          #js {:strokeWidth 1
                                               :easing "easeInOut"
                                               :duration 500
                                               :color "white"
                                               :trailColor "rgb(63, 66, 80)"
                                               :trailWidth 1
                                               :svgStyle #js{:width "100%"
                                                             :height "100%"
                                                             :borderRadius "3px"}})]
               (dispatch [::events/add-progress-bar bar]))))}])

(defn- immersa-home-page-button []
  [:button
   {:on-click #(js/window.open "https://immersa.app" "_blank")
    :class [(styles/immersa-button)
            (styles/immersa-button-glow)
            (styles/immersa-button-gradient-border)]}
   [:img {:src "img/logo_white.png"
          :style {:width "70px"
                  :padding "3px"}}]])

(defn present-panel [& {:keys [mode]}]
  [:div
   {:id "content-container"
    :class (styles/content-container)
    :style {:background @(subscribe [::subs/background-color])}}
   (if (= mode :editor)
     [canvas-container mode]
     [canvas-container])
   [:div
    {:id "progress-bar"
     :class (styles/progress-bar)}
    [progress-bar-line]
    [:div
     {:id "progress-controls"
      :class (styles/progress-controls)}
     [:div
      {:id "slide-controls"
       :class (styles/slide-controls)}
      [icon/prev {:size 24
                  :color "white"
                  :weight "bold"
                  :cursor "pointer"}]
      [:span {:id "slide-indicator"
              :class (styles/current-slide-indicator)}
       (let [{:keys [current-slide-index slide-count]} @(subscribe [::subs/slide-info])]
         (str current-slide-index " / " slide-count))]
      [icon/next {:size 24
                  :color "white"
                  :weight "bold"
                  :cursor "pointer"}]]
     [:div {:id "right-controls"
            :class (styles/right-controls)}
      [immersa-home-page-button]
      [icon/control {:size 24
                     :color "white"
                     :cursor "pointer"}]
      [icon/chat {:size 24
                  :color "white"
                  :cursor "pointer"}]
      [icon/dots {:size 24
                  :color "white"
                  :weight "bold"
                  :cursor "pointer"}]]]]])
