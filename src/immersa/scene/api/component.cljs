(ns immersa.scene.api.component
  (:require
    ["@babylonjs/core/Materials/Textures/cubeTexture" :refer [CubeTexture]]
    [applied-science.js-interop :as j]
    [immersa.scene.api.animation :as api.animation]
    [immersa.scene.api.constant :as api.const]
    [immersa.scene.api.constant :as api.const]
    [immersa.scene.api.core :as api.core :refer [v2 v3 v4]]
    [immersa.scene.api.gui :as api.gui]
    [immersa.scene.api.material :as api.material]
    [immersa.scene.api.mesh :as api.mesh])
  (:require-macros
    [immersa.scene.macros :as m]
    [shadow.resource :as rc]))

(defn create-sky-box [& {:keys [skybox1
                                skybox2
                                noise
                                speed-factor]
                         :or {speed-factor 1
                              skybox1 "img/skybox/black/black"
                              skybox2 "img/skybox/space/space"
                              noise "img/texture/noise/ac.jpg"}}]
  (let [skybox (api.mesh/box "sky-box"
                             :size 1000.0
                             :skybox? true
                             :infinite-distance? false)
        mat (api.material/shader-mat
              "skybox-shader"
              :vertex (rc/inline "shader/skybox/vertex.glsl")
              :fragment (rc/inline "shader/skybox/fragment.glsl")
              :attrs ["position"]
              :uniforms ["worldViewProjection" "dissolve" "skybox1" "skybox2" "noiseTexture"])]
    (j/call mat :setTexture "skybox1" (api.core/cube-texture :root-url skybox1))
    (j/call mat :setTexture "skybox2" (api.core/cube-texture :root-url skybox2))
    (j/call mat :setTexture "noiseTexture" (api.core/texture noise))
    (j/call mat :setFloat "dissolve" 0)
    (j/assoc! mat
              :backFaceCulling false
              :skybox-path skybox1
              :default-skybox-path skybox1)
    (j/assoc! skybox :material mat)
    skybox))

(defn create-sky-sphere []
  (let [sky-sphere (api.mesh/sphere "sky-sphere"
                                    :diameter 1000.0
                                    :side-orientation api.const/mesh-double-side
                                    :skybox? true
                                    :infinite-distance? false)
        mat (api.material/shader-mat "sky-sphere-mat"
                                     :vertex (rc/inline "shader/gradient/vertex.glsl")
                                     :fragment (rc/inline "shader/gradient/fragment.glsl")
                                     :attrs ["position" "uv" "v_uv"]
                                     :uniforms ["worldViewProjection"
                                                "u_mixColor"
                                                "u_mixColor1"
                                                "u_mixScale"
                                                "u_Time"
                                                "u_mixSpeed"
                                                "u_mixColor2"
                                                "u_mixScale1"
                                                "u_Time1"
                                                "u_mixSpeed1"
                                                "u_mixOffset"
                                                "u_visibility"])
        elapsed-time (atom 0)]
    (doto mat
      (j/call :setVector3 "u_mixColor" (v3 0.0 0.0 0.0))
      (j/call :setVector3 "u_mixColor1" (v3 0.92 0.18 1.0))
      (j/call :setVector3 "u_mixColor2" (v3 0.04 0.04 0.99))
      (j/call :setVector2 "u_mixScale" (v2 2.25 2.75))
      (j/call :setVector2 "u_mixScale1" (v2 2.79 2.55))
      (j/call :setFloat "u_mixSpeed" 0.2)
      (j/call :setFloat "u_mixSpeed1" 0.2)
      (j/call :setFloat "u_Time" 0.0)
      (j/call :setFloat "u_Time1" 0.0)
      (j/call :setFloat "u_mixOffset" 1.0)
      (j/call :setFloat "u_visibility" 0.0))
    (api.core/register-before-render-fn "sky-sphere-before-render"
                                        (fn []
                                          (let [delta (api.core/get-delta-time)
                                                elapsed-time (swap! elapsed-time + delta)]
                                            (j/call mat :setFloat "u_Time" elapsed-time)
                                            (j/call mat :setFloat "u_Time1" elapsed-time))))
    (j/assoc! mat :backFaceCulling false)
    (j/assoc! sky-sphere
              :material mat
              :visibility 0)))

(comment
  (create-sky-sphere)
  (api.core/dispose "sky-sphere")


  (j/call (api.core/get-object-by-name "sky-sphere-mat") :setFloat "u_visibility" 1)
  (j/assoc! (api.core/get-object-by-name "sky-box") :visibility 0)
  )

(defn billboard [name & {:keys [text
                                position
                                rotation
                                width
                                height
                                visibility
                                color
                                scale
                                resolution-scale
                                font-weight
                                rect-height
                                rect-corner-radius
                                rect-background]
                         :or {width 1.2
                              height 1
                              scale 1
                              resolution-scale 5
                              color "white"
                              rect-height "2500px"
                              rect-corner-radius 500
                              rect-background "rgba(128, 128, 128, 0.4)"}}]
  (let [plane (api.mesh/plane name
                              :width width
                              :height height
                              :position position
                              :rotation rotation
                              :billboard-mode api.const/mesh-billboard-mode-all
                              :visibility visibility
                              :scale scale
                              :type :billboard)
        gui (api.gui/create-for-mesh plane :width (* resolution-scale 1024) :height (* resolution-scale 1024))
        text (api.gui/text-block (str name "-text-block")
                                 :text text
                                 :font-size-in-pixels (* 60 resolution-scale)
                                 :text-wrapping api.const/gui-text-wrapping-word-wrap
                                 :text-horizontal-alignment api.const/gui-horizontal-align-left
                                 :padding-left (* 50 resolution-scale)
                                 :color color
                                 :font-weight font-weight)
        rect (api.gui/rectangle (str name "-rect")
                                :corner-radius rect-corner-radius
                                :height rect-height
                                :background rect-background)]
    (api.core/add-prop-to-db name :children [plane gui text rect])
    (api.gui/add-control gui rect)
    (api.gui/add-control rect text)
    plane))

;; TODO move to mesh, it is a tiled box
(defn create-box-with-numbers [name params]
  (let [columns 6
        rows 1
        face-uv (js/Array. columns)
        _ (dotimes [i columns]
            (aset face-uv i (v4 (/ i columns) 0 (/ (+ i 1) columns) (/ 1 rows))))
        texture (api.core/texture "img/texture/numbers.jpg")
        mat (api.material/standard-mat "mat" :diffuse-texture texture)]
    (api.mesh/box name (assoc params
                              :face-uv face-uv
                              :wrap? true
                              :mat mat))))

(defn earth [name & {:keys [position visibility] :as opts}]
  (let [mat (api.material/standard-mat (str name "-mat")
                                       :diffuse-texture (api.core/texture "img/texture/earth/diffuse2-min.png")
                                       :emissive-texture (api.core/texture "img/texture/earth/emmisive.jpeg")
                                       :specular-texture (api.core/texture "img/texture/earth/specular.jpeg")
                                       :bump-texture (api.core/texture "img/texture/earth/bump.jpeg"))
        mat-clouds (api.material/standard-mat (str name "-clouds")
                                              :opacity-texture (api.core/texture "img/texture/earth/clouds2-min.jpg")
                                              :get-alpha-from-rgb? true)
        tn (api.core/mesh name :position position)
        sp (api.mesh/sphere (str name "-earth-sphere")
                            :mat mat
                            :visibility visibility
                            :scale 1.2
                            :rotation (v3 0 0 js/Math.PI))
        clouds (api.mesh/sphere (str name "-cloud-sphere")
                                :mat mat-clouds
                                :visibility visibility
                                :scale 1.21
                                :rotation (v3 0 0 js/Math.PI))
        ;; TODO it's suggested to use only one highlight layer for a scene
        hl (api.core/highlight-layer "hl"
                                     :blur-vertical-size 3
                                     :blur-horizontal-size 3)]
    (api.core/add-children tn sp clouds)
    (api.core/add-prop-to-db name :type :earth)
    (j/call hl :addMesh clouds (api.core/color 0.3 0.74 0.94 0.82))
    tn))

(defn wave [name & {:keys [width
                           height
                           resolution
                           point-size
                           time-scale
                           noise-amp-1
                           noise-freq-1
                           spd-modifier-1
                           noise-amp-2
                           noise-freq-2
                           spd-modifier-2]
                    :or {width 50
                         height 50
                         resolution 100
                         point-size 3.0
                         time-scale 1.0
                         noise-amp-1 0.2
                         noise-freq-1 3.0
                         spd-modifier-1 1.0
                         noise-amp-2 0.3
                         noise-freq-2 2.0
                         spd-modifier-2 0.8}
                    :as opts}]
  (let [mat (api.material/shader-mat
              (str name "-wave-shader")
              :fragment (rc/inline "shader/wave/fragment.glsl")
              :vertex (rc/inline "shader/wave/vertex.glsl")
              :attrs ["position" "normal" "uv"]
              :uniforms ["world" "worldView" "worldViewProjection" "view" "projection"
                         "u_time" "u_pointsize" "u_noise_amp_1" "u_noise_freq_1"
                         "u_spd_modifier_1" "u_noise_amp_2" "u_noise_freq_2"
                         "u_spd_modifier_2"])
        pcs (api.core/point-cloud-system
              (str name "-wave-pcs")
              :point-count (* width resolution)
              :on-add-point (fn [particle i]
                              (let [x (- (/ (* (mod i resolution) width) resolution) (/ width 2))
                                    z (- (/ (* (Math/floor (/ i resolution)) height) resolution) (/ height 2))]
                                (j/assoc! particle :position (v3 x 0 z))))
              :on-build-done (fn [mesh]
                               (m/assoc! mesh
                                         :material mat
                                         :material.pointsCloud true
                                         :position (v3 0 -5 35)
                                         :rotation (v3 (/ js/Math.PI 70) 0 0)
                                         :visibility 0.5)))
        start-time (js/Date.now)
        engine (api.core/get-engine)
        temp-v2 (v2)
        _ (api.core/register-before-render-fn
            (str name "-wave-before-render")
            (fn []
              (j/call mat :setFloat "u_pointsize" point-size)
              (j/call mat :setFloat "u_noise_amp_1" noise-amp-1)
              (j/call mat :setFloat "u_noise_freq_1" noise-freq-1)
              (j/call mat :setFloat "u_spd_modifier_1" spd-modifier-1)
              (j/call mat :setFloat "u_noise_amp_2" noise-amp-2)
              (j/call mat :setFloat "u_noise_freq_2" noise-freq-2)
              (j/call mat :setFloat "u_spd_modifier_2" spd-modifier-2)
              (j/call mat :setFloat "u_time" (* (/ (- (js/Date.now) start-time) 1000) time-scale))
              (j/call mat :setVector2 "u_resolution" (api.core/set-v2 temp-v2
                                                                      (j/call engine :getRenderWidth)
                                                                      (j/call engine :getRenderHeight)))))]
    (api.core/add-node-to-db name pcs (assoc opts :type :pcs))))

(defn create-pcs-text [])

(comment
  (let [font (api.core/get-p5-font :big-caslon)
        points (j/call font :textToPoints "     Welcome to the \n\n\n\n\n\n\nImmersive Experience"
                       0 0 120 #js {:sampleFactor 0.25
                                    :simplifyThreshold 0})
        pcs (api.core/pcs "pcs" :point-size 5)
        down-scale 100]
    (doseq [p points]
      (api.core/add-points
        pcs
        1
        (fn [particle]
          (j/assoc! particle
                    :position (v3 (/ (j/get p :x) down-scale)
                                  (/ (- (j/get p :y)) down-scale)
                                  0)
                    :color (api.core/color (js/Math.random) (js/Math.random) (js/Math.random))))))
    (api.core/build-mesh-async
      pcs
      (fn [mesh]
        (j/assoc-in! mesh [:position :x] -5)
        (let [end-positions (j/call mesh :getPositionData)
              end-positions-len (j/get end-positions :length)
              points-count (/ end-positions-len 3)
              init-positions (into-array
                               (map
                                 (fn [_]
                                   (api.core/rand-range -10 10))
                                 (range end-positions-len)))
              new-positions (js/Array. end-positions-len)
              interpolate-factor #js {:value 0}
              anim (api.animation/animation "pcs-morph"
                                            :target-prop "value"
                                            :from 0
                                            :to 1
                                            :duration 2.0
                                            :fps 60
                                            :data-type api.const/animation-type-float
                                            :loop-mode api.const/animation-loop-cons
                                            :easing (api.animation/cubic-ease api.const/easing-ease-in-out))]
          (api.animation/begin-direct-animation
            :target interpolate-factor
            :animations anim
            :from 0
            :to (* 60 2.0)
            :on-animation-end (fn [] (api.core/remove-before-render-fn "pcs-morph")))
          (api.core/register-before-render-fn
            "pcs-morph"
            (fn []
              (let [inter (j/get interpolate-factor :value)]
                (doseq [p (range 0 points-count)]
                  (doseq [axis (range 0 3)]
                    (let [index (+ (* 3 p) axis)
                          start-value (j/get init-positions index)
                          end-value (j/get end-positions index)]
                      (j/assoc! new-positions index (api.core/lerp start-value end-value inter))))))
              (api.core/update-vertices-data mesh new-positions)
              ))
          )
        ))
    )
  )
