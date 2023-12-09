(ns immersa.views
  (:require
    ["@babylonjs/core/Cameras/freeCamera" :refer [FreeCamera]]
    ["@babylonjs/core/Engines/engine" :refer [Engine]]
    ["@babylonjs/core/Lights/hemisphericLight" :refer [HemisphericLight]]
    ["@babylonjs/core/Materials/standardMaterial" :refer [StandardMaterial]]
    ["@babylonjs/core/Maths/math" :refer [Vector3]]
    ["@babylonjs/core/Meshes/meshBuilder" :refer [MeshBuilder]]
    ["@babylonjs/core/scene" :refer [Scene]]
    [applied-science.js-interop :as j]
    [immersa.scene.core :as scene.core]
    [immersa.styles :as styles]
    [immersa.subs :as subs]
    [re-frame.core :refer [subscribe]]
    [reagent.core :as r]))

(defn- canvas []
  (r/create-class
    {:component-did-mount #(scene.core/start-scene (js/document.getElementById "renderCanvas"))
     :reagent-render (fn []
                       [:canvas
                        {:id "renderCanvas"
                         :class (styles/canvas)}])}))

(defn main-panel []
  [:div (styles/app-container)
   [:div
    {:id "content-container"
     :class (styles/content-container)}
    [:div
     {:id "canvas-container"
      :class (styles/canvas-container @(subscribe [::subs/calculated-canvas-dimensions]))}
     [canvas]]
    [:div
     {:id "progress-bar"
      :class (styles/progress-bar)}
     [:div
      {:id "progress-line"
       :class (styles/progress-line)}]]]])
