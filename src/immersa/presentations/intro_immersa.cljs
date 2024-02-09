(ns immersa.presentations.intro-immersa)

(def immersa-intro-slides
  [{:data {:camera {:position [0 0 -10]
                    :rotation 0}
           :skybox {:background {:color [80 157 105]}}
           "wave" {:type :wave}
           "immersa-text" {:type :billboard
                           :position 0
                           :text "IMMERSA"
                           :scale 4
                           :visibility 0}
           "world" {:type :earth
                    :position [0 -0.7 -9.5]
                    :visibility 0}}}
   {:data {:skybox {:background {:asset-type :cube-texture
                                 :path "img/skybox/space/space"}
                    :duration 1.5}
           "wave" {:type :wave}
           "immersa-text" {:type :billboard
                           :visibility 1}
           "world" {:type :earth
                    :position [0 -0.7 -8.5]
                    :visibility 1}
           "world-cloud-sphere" {:visibility 1}
           "world-earth-sphere" {:visibility 1}
           "immersa-text-2" {:type :billboard
                             :position [0 -0.8 -7.5]
                             :text "A 3D Presentation Tool for the Web"
                             :scale 1
                             :width 3
                             :height 3
                             :font-size 35
                             :visibility 0}}}
   {:data {:skybox {:background {:image "img/skybox/sunny/sunny"}
                    :duration 2.5}
           "wave" {:type :wave}
           "immersa-text-2" {:type :billboard
                             :text "A 3D Presentation Tool for the Web"
                             :visibility 1}
           "world" {:type :earth
                    :position [0 0 -7.5]
                    :visibility 1}
           "text-3" {:type :text3D
                     :text "A new dimension to your presentations"
                     :depth 0.001
                     :emissive-color :color/white
                     :size 0.4
                     :position [0 0 5]
                     :rotation [(/ js/Math.PI 2) 0 0]
                     :visibility 0}}}
   {:data {:skybox {:background {:color [80 157 105]}}
           :camera {:position [0 2 -10]}
           "text-3" {:type :text3D
                     :position [0 0 -2]
                     :rotation 0
                     :delay 500
                     :visibility 1}
           "image" {:type :image
                    :path "img/texture/gg.png"
                    :visibility 0}
           "world" {:type :earth
                    :position [0 2.25 -7.5]
                    :visibility 1}}}

   {:data {:skybox {:background {:color 255}}
           :camera {:position [0 2 -1]
                    :duration 3
                    :delay 100}
           "text-dots" {:type :pcs-text
                        :text "      Welcome to the\n\n\n\n\n\n\n\nFuture of Presentation"
                        :duration 1.5
                        :delay 2500
                        :point-size 5
                        :rand-range [-10 20]
                        :position [-5.5 1 9]
                        :color :color/white}
           "particle-cycle" {:type :particle
                             :particle-type :sparkle
                             :duration 2
                             :position [[-2 0.5 -6]
                                        [-5 0.5 0]
                                        [5 0.5 5]
                                        [0 0 8]]
                             :target-stop-duration 1.5}
           "2d-slide-text-1" {:type :text3D
                              :text "From 2D Clarity to..."
                              :depth 0.001
                              :emissive-color :color/white
                              :size 0.215
                              :position [0 2.65 5]
                              :visibility 0}
           "2d-slide-text-2" {:type :text3D
                              :text "3D IMMERSION"
                              :nme :purple-glass
                              :depth 0.1
                              :size 0.35
                              :position [0 1.53 9.1]
                              :visibility 0}
           "2d-slide" {:type :image
                       :path "img/texture/2d-slide.png"
                       :scale 2
                       :position [0 1 9]
                       :rotation 0
                       :visibility 0}
           "box" {:type :box
                  :position [0 2 0]
                  :rotation [1.2 2.3 4.1]
                  :visibility 0}}}

   {:data {:skybox {:background {:image "img/skybox/space/space"}}
           :camera {:position [0 2 -1]}
           "2d-slide" {:visibility 1
                       :scale 3.7}
           "2d-slide-text-1" {:visibility 1}
           "2d-slide-text-2" {:visibility 0}
           "plane" {:type :glb
                    :path "model/plane_2.glb"
                    :position [0 -1 50]
                    :rotation [0 Math/PI 0]}

           "3d-slide-text-1" {:type :text3D
                              :text "$412B\n(TOM)"
                              :depth 0.1
                              :size 0.25
                              :position [-1.5 1.5 5]
                              :hl-color [252.45 204 255]
                              :hl-blur 0.5
                              :visibility 0}
           "3d-slide-text-2" {:type :text3D
                              :text "$177.2B\n  (SAM)"
                              :depth 0.1
                              :size 0.25
                              :position [0 1.5 5]
                              :hl-color [229.5 204 102]
                              :hl-blur 0.5
                              :visibility 0}
           "3d-slide-text-3" {:type :text3D
                              :text "$1.78B\n (SOM)"
                              :depth 0.1
                              :size 0.25
                              :position [1.5 1.5 5]
                              :hl-color [229.5 224.4 224.4]
                              :hl-blur 0.5
                              :visibility 0}}}

   {:data {:camera {:position [0 2 -1]
                    :rotation [[(/ Math/PI -7) 0 0]
                               [0 0 0]]
                    :duration 3.5
                    :delay 1250}
           :skybox {:path "img/skybox/space/space"}
           ;; "2d-slide-text-1" {}
           "2d-slide-text-2" {:position [0 2.75 5]
                              :visibility 1}
           "2d-slide" {:visibility 0
                       :rotation [(/ js/Math.PI 2) 0 0]}
           "3d-slide-text-1" {:visibility 1
                              :delay 3000}
           "3d-slide-text-2" {:visibility 1
                              :delay 3000}
           "3d-slide-text-3" {:visibility 1
                              :delay 3000}
           "plane" {:type :glb
                    :position [0 5 -10]
                    :rotation [-0.25 Math/PI 0.15]
                    :delay 750
                    :duration 4}
           "porche" {:type :glb
                     :path "model/porche_911.glb"
                     :position [-15 1 5]
                     :rotation [0 (/ Math/PI 8) 0]
                     :update-materials {"paint" {:albedo-color :color/black}}}
           "3d-lib-header" {:type :text3D
                            :text "Extensive 3D Library"
                            :depth 0.001
                            :emissive-color :color/white
                            :size 0.7
                            :position [15 4 9]
                            :visibility 1}
           "3d-lib-text-2" {:type :text3D
                            :text "Over 100 pre-built 3D models at your fingertips"
                            :depth 0.001
                            :emissive-color :color/white
                            :size 0.3
                            :position [19 3 9]
                            :visibility 1}
           "3d-lib-text-3" {:type :text3D
                            :text "ready to elevate your presentations"
                            :depth 0.001
                            :emissive-color :color/white
                            :size 0.3
                            :position [19 2.5 9]
                            :visibility 1}
           "cloud-particle" {:type :particle
                             :particle-type :cloud
                             :position [10 2.1 2]
                             :scale 0.9
                             :update-speed 0.01}}}

   {:data {:camera {:position [0 2 -1]
                    :rotation 0}
           ;; TODO replace color and parse here as well
           :skybox {:background {:color 103}
                    :speed-factor 1.0}
           "porche" {:type :glb
                     :position [-1.25 1 5]}

           "3d-lib-header" {:position [0 4 9]
                            :duration 1.5
                            :visibility 1}
           "3d-lib-text-2" {:position [0 3 9]
                            :duration 1.5
                            :delay 250
                            :visibility 1}
           "3d-lib-text-3" {:position [0 2.5 9]
                            :duration 1.5
                            :delay 350
                            :visibility 1}
           "cloud-particle" {:delay 600
                             :position [0 2.1 2]}
           "3d-lib-header-2" {:type :text3D
                              :text "Personalized Imports"
                              :depth 0.001
                              :emissive-color :color/white
                              :size 0.55
                              :position [15 4 9]
                              :visibility 1}
           "3d-lib-text-4" {:type :text3D
                            :text "Seamlessly integrate your own models"
                            :depth 0.001
                            :emissive-color :color/white
                            :size 0.25
                            :position [19 3 9]
                            :visibility 1}
           "3d-lib-text-5" {:type :text3D
                            :text "making each presentation uniquely yours"
                            :depth 0.001
                            :emissive-color :color/white
                            :size 0.25
                            :position [19 2.5 9]
                            :visibility 1}}}

   {:data {:camera {:position [0 1 -1]}
           :skybox {:background {:color 103}
                    :speed-factor 1.0}
           "porche" {:type :glb
                     :path "model/porche_911.glb"
                     :position [-0.7 1 3]
                     :rotation [0 Math/PI 0]}
           "3d-lib-header-2" {:type :text3D
                              :position [0 4 9]
                              :duration 1.5
                              :visibility 1}
           "3d-lib-text-4" {:position [0 3 9]
                            :duration 1.5
                            :delay 250
                            :visibility 1}
           "3d-lib-text-5" {:position [3.5 2.5 9]
                            :duration 1.5
                            :delay 350
                            :visibility 1}
           "cloud-particle" {:position [1 1.3 2]}
           "sphere-text" {:type :text3D
                          :text "Rich Material Library"
                          :depth 0.001
                          :emissive-color :color/white
                          :size 0.25
                          :position [0 5.5 4]
                          :visibility 1}
           "sphere1" {:type :sphere-mat
                      :component :specular
                      :position [0 -2 4]}
           "sphere2" {:type :sphere-mat
                      :component :stone
                      :position [4.5 0.75 4]}
           "sphere3" {:type :sphere-mat
                      :component :copper
                      :position [-4.5 0.75 4]}
           "sphere4" {:type :sphere-mat
                      :component :nebula
                      :position [0 5.5 4]}
           "sphere5" {:type :sphere-mat
                      :component :world
                      :position [4.5 2.25 4]}
           "sphere6" {:type :sphere-mat
                      :component :translucent
                      :position [-4.5 2.25 4]}}}

   {:data {:camera {:position [0 2 -1]
                    :rotation 0}
           :skybox {:background {:color [80 157 105]}
                    :speed-factor 1.0}
           "porche" {:type :glb
                     :path "model/porche_911.glb"
                     :position [-0.7 1 500]}
           "sphere-text" {:position [0 3.3 4]}
           "sphere1" {:position [0 0.75 4]}
           "sphere2" {:position [2 0.75 4]}
           "sphere3" {:position [-2 0.75 4]}
           "sphere4" {:position [0 2.25 4]}
           "sphere5" {:position [2 2.25 4]}
           "sphere6" {:position [-2 2.25 4]}
           "sphere-text-2" {:type :greased-line
                            :text "Over 30 ready-made materials"
                            :color :color/white
                            :position [-0.5 2 5]
                            :rotation [(/ Math/PI 2) 0 0]
                            :width 0.01
                            :size 0.27
                            :visibility 0}
           "sphere-text-3" {:type :greased-line
                            :text "for enhancing texts and models"
                            :color :color/white
                            :position [-0.25 1.6 5]
                            :rotation [(/ Math/PI 2) 0 0]
                            :width 0.01
                            :size 0.23
                            :visibility 0}}}

   {:data {:camera {:position [0 2 -1.5]
                    :rotation 0}
           :skybox {:background {:color [80 157 105]}
                    :speed-factor 1.0}
           "sphere-text-2" {:position [-0.5 2 5]
                            :rotation 0
                            :visibility 1}
           "sphere-text-3" {:position [-0.25 1.6 5]
                            :rotation 0
                            :visibility 1}
           "sphere1" {:position [-2.5 0.75 4]}
           "sphere2" {:position [-1.2 0.75 4]}
           "sphere3" {:position [-2.5 2 4]}
           "sphere4" {:position [-1.2 2 4]}
           "sphere5" {:position [-1.2 3.25 4]}
           "sphere6" {:position [-2.5 3.25 4]}
           "enjoy-text" {:type :billboard
                         :text "✦ Enjoy the Immersive Experience ✦"
                         :scale 5
                         :width 3
                         :height 3
                         :font-size 30
                         :visibility 0}
           "join-text" {:type :billboard
                        :position [0 -0.75 0]
                        :text "Join Waitlist"
                        :scale 5
                        :width 3
                        :height 3
                        :font-size 30
                        :visibility 0}}}

   {:data {:camera {:position [0 0 -10]
                    :rotation 0}
           :skybox {:gradient? true
                    :speed-factor 1.0}
           "enjoy-text" {:type :billboard
                         :visibility 1
                         :delay 600}
           "join-text" {:type :billboard
                        :visibility 1
                        :delay 900}}}])
