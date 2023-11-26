(ns immersa.scene.core
  (:require
    [applied-science.js-interop :as j]
    [immersa.scene.api :as api :refer [v3 v4]]))

(defn- create-box [name]
  (let [columns 6
        rows 1
        face-uv (js/Array. columns)
        _ (dotimes [i columns]
            (aset face-uv i (v4 (/ i columns) 0 (/ (+ i 1) columns) (/ 1 rows))))
        texture (api/texture "img/texture/numbers.jpg")
        mat (api/standard-mat "mat" :diffuse-texture texture)]
    (api/box name
             ;:height 1
             ;:width 15
             :position (v3 0 -5 0)
             :face-uv face-uv
             :wrap? true
             :mat mat)))

(defn animate-camera [object]
  (let [_ (j/call object :computeWorldMatrix true)
        bounding-box (j/get (j/call object :getBoundingInfo) :boundingBox)
        diagonal-size (j/call-in bounding-box [:maximumWorld :subtract] (j/get bounding-box :minimumWorld))
        diagonal-size (j/call diagonal-size :length)
        camera (api/active-camera)
        {:keys [x y z]} (j/lookup (api/get-pos object))
        radius 1.5
        final-radius (* radius diagonal-size)
        final-position (v3 x y (- z final-radius))
        easing-function (api/cubic-ease :EASINGMODE_EASEINOUT)
        position-animation (api/animation "cameraPositionAnim"
                                          :target-prop "position"
                                          :fps 30
                                          :data-type :ANIMATIONTYPE_VECTOR3
                                          :loop-mode :ANIMATIONLOOPMODE_CONSTANT
                                          :keys [{:frame 0 :value (j/get camera :position)}
                                                 {:frame 30 :value final-position}]
                                          :easing easing-function)
        target-animation (api/animation "cameraTargetAnim"
                                        :target-prop "target"
                                        :fps 15
                                        :data-type :ANIMATIONTYPE_VECTOR3
                                        :loop-mode :ANIMATIONLOOPMODE_CONSTANT
                                        :keys [{:frame 0 :value (j/call camera :getTarget)}
                                               {:frame 30 :value (v3 (+ x (* diagonal-size radius 0.35)) y z)}]
                                        :easing easing-function)]
    (api/begin-direct-animation :target camera
                                :animations [position-animation target-animation]
                                :from 0
                                :to 30
                                :delay 1000)))

(defn create-position-animation [start end duration]
  (api/animation "position-animation"
                 :target-prop "position"
                 :fps 30
                 :data-type :ANIMATIONTYPE_VECTOR3
                 :loop-mode :ANIMATIONLOOPMODE_CONSTANT
                 :keys [{:frame 0 :value start}
                        {:frame (* 30 duration) :value end}]
                 :easing (api/cubic-ease :EASINGMODE_EASEINOUT)))

(comment
  (doseq [slide [{:objects {"box" {:type :box
                                   :position (v3 0 -5 0)}}
                  "box" {:position (v3 0 0 0)}}]]

    (let [objects (:objects slide)
          object-names (keys (dissoc slide :objects))
          objects-to-create (filter #(not (api/get-object-by-name %)) object-names)]
      )))

(comment
  (j/get (api/active-camera) :rotation)

  (animate-camera (api/get-object-by-name "box"))

  (do
    (api/dispose "box")
    (create-box "box"))

  (api/show-debug)

  (let [box (api/get-object-by-name "box")
        keys [{:frame 0 :value 0}
              {:frame 30 :value 5}]
        animation (api/animation "linearAnimation"
                                 :target-prop "position.y"
                                 :fps 30
                                 :data-type :ANIMATIONTYPE_FLOAT
                                 :loop-mode :ANIMATIONLOOPMODE_CONSTANT
                                 :keys keys)]
    (api/begin-direct-animation :target box
                                :animations animation
                                :from 0
                                :to 30
                                :delay 1500)))

(defn when-scene-ready []
  (create-box "box"))

(defn start-scene [canvas]
  (let [engine (api/create-engine canvas)
        scene (api/create-scene engine)
        camera (api/create-free-camera "free-camera" :pos (v3 0 0 -10))
        light (api/hemispheric-light "light")
        ground-material (api/grid-mat "grid-mat"
                                      :major-unit-frequency 5
                                      :minor-unit-visibility 0.45
                                      :grid-ratio 2
                                      :back-face-culling? false
                                      :main-color (api/color 1 1 1)
                                      :line-color (api/color 1 1 1)
                                      :opacity 0.98)
        ground (api/create-ground "ground"
                                  :width 50
                                  :height 50
                                  :mat ground-material)
        sky-box (api/create-sky-box)]
    (j/assoc! light :intensity 0.7)
    (j/call camera :setTarget (v3))
    (j/call camera :attachControl canvas false)
    (j/call engine :runRenderLoop #(j/call scene :render))
    (j/call scene :executeWhenReady when-scene-ready)))