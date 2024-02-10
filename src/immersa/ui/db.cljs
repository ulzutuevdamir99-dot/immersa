(ns immersa.ui.db)

(def default-db
  {:name "re-frame"
   :mode :editor
   :editor {:slides {:current-index 0
                     :all [{:id "14e4ee76-bb27-4904-9d30-360a40d8abb7"
                            :data {:camera {:position [0 0 -10]
                                            :rotation [0 0 0]}
                                   :skybox {:background {:color [1000 1000 1000]}}
                                   "wave" {:type :wave}
                                   "33e4ee76-bb27-4904-9d30-360a40d8abc1" {:type :image
                                                                           :asset-type :texture
                                                                           :visibility 0
                                                                           :path "https://firebasestorage.googleapis.com/v0/b/immersa-6d29f.appspot.com/o/images%2Fschaltbau%2Flogo.png?alt=media&token=2afccb59-5489-4553-9a98-0425f0bac1db"
                                                                           :transparent? true
                                                                           :position [0 0.5 0]
                                                                           :rotation [0 0 0]
                                                                           :scale [1 1 1]}}}
                           {:id "23e4ee76-bb27-4904-9d30-360a40d8abb1"
                            :data {:camera {:position [0 0 -10]
                                            :rotation [0 0 0]}
                                   :skybox {:background {:color [1000 1000 1000]}}
                                   "wave" {:type :wave}
                                   "22e09fae-b39f-4901-9283-bc1cdb7374bb" {:type :particle
                                                                           :particle-type :cloud
                                                                           :position [0 -7 0]
                                                                           :scale 5
                                                                           :update-speed 0.01}
                                   "33e4ee76-bb27-4904-9d30-360a40d8abc1" {:type :image
                                                                           :asset-type :texture
                                                                           :visibility 1
                                                                           :path "https://firebasestorage.googleapis.com/v0/b/immersa-6d29f.appspot.com/o/images%2Fschaltbau%2Flogo.png?alt=media&token=2afccb59-5489-4553-9a98-0425f0bac1db"
                                                                           :transparent? true
                                                                           :position [0 0.5 0]
                                                                           :rotation [0 0 0]
                                                                           :scale [1 1 1]}
                                   "4007122c-65e4-4df1-bd1f-e26d2c292165" {:rotation [0 0 0], :color [0 0 0], :scale [1 1 1], :roughness 1, :metallic 0, :type :text3D, :size 0.7 :position [-8.88040542602539 -5.599999904632568 11.399999618530273], :depth 0.01, :delay 600, :visibility 0, :emissive-intensity 1, :text "• Konnektörler"}
                                   "b9293064-66d5-41fc-b37f-e622a4ef3574" {:rotation [0 0 0], :color [0 0 0], :scale [1 1 1], :roughness 1, :metallic 0, :type :text3D, :size 0.7 :position [-6.650000095367432 -7.563302040100098 11.399999618530273], :depth 0.01, :delay 600, :visibility 0, :emissive-intensity 1, :text "• Ani hareket anahtarları"}
                                   "c68648ee-a14f-4161-a7ac-d200195a5b73" {:rotation [0 0 0], :color [0 0 0], :scale [1 1 1], :roughness 1, :metallic 0, :type :text3D, :size 0.7 :position [6 -5.6 11.4], :depth 0.01, :delay 600, :visibility 0, :emissive-intensity 1, :text "• AC ve DC kontaktörler"}
                                   "36009fae-b39f-4901-9283-bc1cdb737490" {:rotation [0 0 0], :color [0 0 0], :scale [1 1 1], :roughness 1, :metallic 0, :type :text3D, :size 0.7 :position [5.814161777496338 -7.800000190734863 11.399999618530273], :depth 0.01, :delay 600, :visibility 0, :emissive-intensity 1, :text "• Demiryolu bileşenleri"}}}
                           {:id "44e4ee76-bb27-4904-9d30-360a40d8abb1"
                            :data {:camera {:position [0 0 -10]
                                            :rotation [0 0 0]}
                                   :skybox {:background {:color [1000 1000 1000]}}
                                   "08e09fae-b39f-4901-9283-bc1cdb737490" {:delay 600
                                                                           :rotation [0 0 0]
                                                                           :color [0 0 0]
                                                                           :scale [1 1 1]
                                                                           :roughness 1
                                                                           :metallic 0
                                                                           :type :text3D
                                                                           :size 1
                                                                           :position [0 0 11.4]
                                                                           :depth 0.01
                                                                           :visibility 1
                                                                           :emissive-intensity 1
                                                                           :text "1929’dan bu yana en yüksek güvenlik standartı"}
                                   "55k4ee76-bb27-4904-9d30-360a40d8ab00" {:type :glb
                                                                           :asset-type :model
                                                                           :path "https://firebasestorage.googleapis.com/v0/b/immersa-6d29f.appspot.com/o/models%2Fschaltbau%2Ftrain.glb?alt=media&token=5059924a-b432-4c9a-9711-3c401259083b"
                                                                           :position [-65 2 75]
                                                                           :rotation [0 2.44 0]
                                                                           :scale [0.001 0.001 0.001]}
                                   "4007122c-65e4-4df1-bd1f-e26d2c292165" {:rotation [0 0 0], :color [0 0 0], :scale [1 1 1], :roughness 1, :metallic 0, :type :text3D, :size 0.7 :position [-8.88040542602539 -5.599999904632568 11.399999618530273], :depth 0.01, :delay 1250, :visibility 1, :emissive-intensity 1, :text "• Konnektörler"}
                                   "b9293064-66d5-41fc-b37f-e622a4ef3574" {:rotation [0 0 0], :color [0 0 0], :scale [1 1 1], :roughness 1, :metallic 0, :type :text3D, :size 0.7 :position [-6.650000095367432 -7.563302040100098 11.399999618530273], :depth 0.01, :delay 1750, :visibility 1, :emissive-intensity 1, :text "• Ani hareket anahtarları"}
                                   "c68648ee-a14f-4161-a7ac-d200195a5b73" {:rotation [0 0 0], :color [0 0 0], :scale [1 1 1], :roughness 1, :metallic 0, :type :text3D, :size 0.7 :position [6 -5.6 11.4], :depth 0.01, :delay 2250, :visibility 1, :emissive-intensity 1, :text "• AC ve DC kontaktörler"}
                                   "36009fae-b39f-4901-9283-bc1cdb737490" {:rotation [0 0 0], :color [0 0 0], :scale [1 1 1], :roughness 1, :metallic 0, :type :text3D, :size 0.7 :position [5.814161777496338 -7.800000190734863 11.399999618530273], :depth 0.01, :delay 2750, :visibility 1, :emissive-intensity 1, :text "• Demiryolu bileşenleri"}
                                   "22e09fae-b39f-4901-9283-bc1cdb7374bb" {:type :particle
                                                                           :particle-type :cloud
                                                                           :position [0 -0.5 0]
                                                                           :scale 5
                                                                           :update-speed 0.01}}}
                           #_{:id "10e4ee76-bb27-4904-9d30-360a40d8abb0"
                            :data {:camera {:position [0 0 -10]
                                            :rotation [0 0 0]}
                                   :skybox {:background {:color [1000 1000 1000]}}
                                   "1a8ac149-35cc-402d-8bde-a2287261930e" {:rotation [0 -0.0003164062503844267 0]
                                                                           :delay 500
                                                                           :color [0 0 0]
                                                                           :scale [1 1 1]
                                                                           :roughness 1
                                                                           :metallic 0
                                                                           :type :text3D
                                                                           :size 1
                                                                           :position [0 -3.48 14.6]
                                                                           :depth 0.01
                                                                           :visibility 1
                                                                           :emissive-intensity 1
                                                                           :text "• Konnektörler \n• Ani hareket anahtarları (Snap action switch)\n• AC ve DC kontaktörler\n• Demiryolu bileşenleri "}
                                   "22e09fae-b39f-4901-9283-bc1cdb7374bb" {:type :particle
                                                                           :particle-type :cloud
                                                                           :position [0 -7 0]
                                                                           :scale 5
                                                                           :update-speed 0.01}
                                   "55k4ee76-bb27-4904-9d30-360a40d8ab00" {:type :glb
                                                                           :asset-type :model
                                                                           :path "https://firebasestorage.googleapis.com/v0/b/immersa-6d29f.appspot.com/o/models%2Fschaltbau%2Ftrain.glb?alt=media&token=5059924a-b432-4c9a-9711-3c401259083b"
                                                                           :position [-65 2 75]
                                                                           :rotation [0 2.44 0]
                                                                           :scale [0.001 0.001 0.001]}}}
                           {:id "3bc5da96-f729-4ca1-a5e4-ab22fecd29b7"
                            :data {:camera {:position [0 1.7 -10]
                                            :rotation [0 0 0]}
                                   :skybox {:background {:color [72 104 166]}}
                                   "ba6506d5-ab90-42f4-b620-37d8ac2c763f" {:delay 1350
                                                                           :rotation [0 0 0],
                                                                           :color [255 255 255],
                                                                           :scale [1 1 1],
                                                                           :roughness 1,
                                                                           :metallic 0,
                                                                           :type :text3D,
                                                                           :size 1,
                                                                           :position [11.62 1.2 18.6],
                                                                           :depth 0.01,
                                                                           :visibility 1,
                                                                           :emissive-intensity 1,
                                                                           :text "• Hafif raylı sistemler\n• Elektrikli banliyö trenleri\n• Dizel banliyö trenleri\n• Şehir içi trenler\n• Metro trenleri\n• Yüksek hızlı trenler"}
                                   "55k4ee76-bb27-4904-9d30-360a40d8ab00" {:type :glb
                                                                           :delay 400
                                                                           :asset-type :model
                                                                           :path "https://firebasestorage.googleapis.com/v0/b/immersa-6d29f.appspot.com/o/models%2Fschaltbau%2Ftrain.glb?alt=media&token=5059924a-b432-4c9a-9711-3c401259083b"
                                                                           :position [-6.030381679534912 2 5.016758918762207],
                                                                           :rotation [-0.0039163727797618675
                                                                                      2.4807240579617416
                                                                                      -0.00403986816352861]
                                                                           :scale [0.001 0.001 0.001]}
                                   "33k4ee76-bb27-4904-9d30-360a40d8ab00" {:type :glb,
                                                                           :asset-type :model,
                                                                           :path "https://firebasestorage.googleapis.com/v0/b/immersa-6d29f.appspot.com/o/models%2Fschaltbau%2Frobot_arm.glb?alt=media&token=50efc292-2fd9-4c8c-b648-450b76b23001",
                                                                           :position [-1.500159740447998
                                                                                      17.5
                                                                                      26.670000076293945],
                                                                           :rotation [0 2 0],
                                                                           :scale [1 1 1]}}}
                           {:id "e8bc7d52-eecc-4c69-b020-4bb366ad4594",
                            :data {:camera {:position [-0.0011328124975828636 1.7000000000000006 21.272332594691633],
                                            :rotation [0 0 0]
                                            :duration 1.5},
                                   :skybox {:background {:color [145 234 181]}},
                                   "ba6506d5-ab90-42f4-b620-37d8ac2c763f" {:rotation [0 0 0],
                                                                           :color [255 255 255],
                                                                           :scale [1 1 1],
                                                                           :roughness 1,
                                                                           :metallic 0,
                                                                           :type :text3D,
                                                                           :size 1,
                                                                           :position [31.095727920532227
                                                                                      1.2000000476837158
                                                                                      18.600000381469727],
                                                                           :depth 0.01,
                                                                           :visibility 1,
                                                                           :emissive-intensity 1,
                                                                           :text "• Hafif raylı sistemler
                                                                      • Elektrikli banliyö trenleri
                                                                      • Dizel banliyö trenleri
                                                                      • Şehir içi trenler
                                                                      • Metro trenleri
                                                                      • Yüksek hızlı trenler"},
                                   "55k4ee76-bb27-4904-9d30-360a40d8ab00" {:type :glb,
                                                                           :asset-type :model,
                                                                           :path "https://firebasestorage.googleapis.com/v0/b/immersa-6d29f.appspot.com/o/models%2Fschaltbau%2Ftrain.glb?alt=media&token=5059924a-b432-4c9a-9711-3c401259083b",
                                                                           :position [-70.929140090942383 2 -70.016758918762207],
                                                                           :rotation [-0.0039163727797618675
                                                                                      2.4807240579617416
                                                                                      -0.00403986816352861],
                                                                           :scale [0.001 0.001 0.001]}
                                   "33k4ee76-bb27-4904-9d30-360a40d8ab00" {:type :glb,
                                                                           :duration 2
                                                                           :asset-type :model,
                                                                           :path "https://firebasestorage.googleapis.com/v0/b/immersa-6d29f.appspot.com/o/models%2Fschaltbau%2Frobot_arm.glb?alt=media&token=50efc292-2fd9-4c8c-b648-450b76b23001",
                                                                           :position [-1.500159740447998
                                                                                      -0.09360121935606003
                                                                                      26.670000076293945],
                                                                           :rotation [0 -1.0783072643835807 0],
                                                                           :scale [2.5 2.5 2.5]}

                                   "38d3c0a4-c9b5-417c-92d3-a21cb690bfae" {:rotation [0 0 0]
                                                                           :delay 1500
                                                                           :color [255 255 255]
                                                                           :scale [1 1 1]
                                                                           :roughness 1
                                                                           :metallic 0
                                                                           :type :text3D
                                                                           :size 1, :position [7.150000095367432 -4.233860969543457 45.599998474121094], :depth 0.01, :visibility 1, :emissive-intensity 1, :text "• Tünel ve Madencilik\n• Tıbbi teknoloji\n• Pil test standları\n• Bina kontrolü\n• Test sistemleri\n• DC enerji ağı\n• Makine ve tesis mühendisliği"}}}
                           {:id "99bc7d52-eecc-4c69-b020-4bb366ad4594",
                            :data {:camera {:position [-0.0011328124975828636 0 21.272332594691633],
                                            :rotation [0.0021289062499999997 -1.7224036360377644 0]},
                                   :skybox {:background {:color [234 204 145]}}
                                   "581c8ea9-262f-4d5d-ab63-7f6bf29d2705" {:rotation [0 4.560781667210461 0], :color [255 255 255], :scale [1 1 1], :roughness 1, :metallic 0, :type :text3D, :size 0.35, :position [-9.890000343322754 -1.9507310390472412 15.564252853393555], :depth 0.01, :visibility 1, :emissive-intensity 1, :text "• Elektrikli araçlar\n• Elektrikli gemiler / denizaltılar\n• İç lojistik için elektrikli araçlar\n• Pil şarj istasyonları\n• Pil test standları\n• Deniz şarj ve tahrik sistemleri"}
                                   "22a4ee76-bb27-4904-9d30-360a40d8ab00" {:type :glb,
                                                                           :asset-type :model,
                                                                           :path "https://firebasestorage.googleapis.com/v0/b/immersa-6d29f.appspot.com/o/models%2Fschaltbau%2Fstation.glb?alt=media&token=f9a3cec6-fa24-409e-b7be-c3f33c78e508",
                                                                           :position [-7.15240478515625 -1.1018229722976685 22.277658462524414]
                                                                           :rotation [0 2.1019629985152637 0]
                                                                           :update-materials {"Energy_Station" {:use-alpha-from-albedo? false}}
                                                                           :scale [1 1 1]}}}
                           {:id "56zc7d52-eecc-4c69-b020-4bb366ad4594",
                            :data {:camera {:position [-0.0011328124975828636 0 21.272332594691633],
                                            :rotation [0.0020943951023931952 -3.144908779168582 0]},
                                   :skybox {:background {:color [177 241 255]}}
                                   "581c8ea9-262f-4d5d-ab63-7f6bf29d2705" {:rotation [0 4.560781667210461 0], :color [255 255 255], :scale [1 1 1], :roughness 1, :metallic 0, :type :text3D, :size 0.35, :position [-9.890000343322754 -1.9507310390472412 15.564252853393555], :depth 0.01, :visibility 1, :emissive-intensity 1, :text "• Elektrikli araçlar\n• Elektrikli gemiler / denizaltılar\n• İç lojistik için elektrikli araçlar\n• Pil şarj istasyonları\n• Pil test standları\n• Deniz şarj ve tahrik sistemleri"}
                                   "22a4ee76-bb27-4904-9d30-360a40d8ab00" {:type :glb,
                                                                           :asset-type :model,
                                                                           :path "https://firebasestorage.googleapis.com/v0/b/immersa-6d29f.appspot.com/o/models%2Fschaltbau%2Fstation.glb?alt=media&token=f9a3cec6-fa24-409e-b7be-c3f33c78e508",
                                                                           :position [-7.15240478515625 -1.1018229722976685 22.277658462524414]
                                                                           :rotation [0 2.1019629985152637 0]
                                                                           :update-materials {"Energy_Station" {:use-alpha-from-albedo? false}}
                                                                           :scale [1 1 1]}}}]}}
   :present {:show-arrow-keys-text? true
             :show-pre-warm-text? false
             :background-color "rgb(0,0,0)"}})
