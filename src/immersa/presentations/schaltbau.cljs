(ns immersa.presentations.schaltbau)

(def slides
  [{:id "14e4ee76-bb27-4904-9d30-360a40d8abb7"
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
           :skybox {:background {:color [247 255 186]}}
           "581c8ea9-262f-4d5d-ab63-7f6bf29d2705" {:rotation [0 4.560781667210461 0], :color [255 255 255], :scale [1 1 1], :roughness 1, :metallic 0, :type :text3D, :size 0.35, :position [-9.890000343322754 -1.9507310390472412 15.564252853393555], :depth 0.01, :visibility 1, :emissive-intensity 1, :text "• Elektrikli araçlar\n• Elektrikli gemiler / denizaltılar\n• İç lojistik için elektrikli araçlar\n• Pil şarj istasyonları\n• Pil test standları\n• Deniz şarj ve tahrik sistemleri"}
           "22a4ee76-bb27-4904-9d30-360a40d8ab00" {:type :glb,
                                                   :asset-type :model,
                                                   :path "https://firebasestorage.googleapis.com/v0/b/immersa-6d29f.appspot.com/o/models%2Fschaltbau%2Fstation.glb?alt=media&token=f9a3cec6-fa24-409e-b7be-c3f33c78e508",
                                                   :position [-7.15240478515625 -1.1018229722976685 22.277658462524414]
                                                   :rotation [0 2.1019629985152637 0]
                                                   :update-materials {"Energy_Station" {:use-alpha-from-albedo? false}}
                                                   :scale [1 1 1]}
           "95z3ee76-bb27-4904-9d30-360a40d8ab44" {:type :glb,
                                                   :asset-type :model,
                                                   :path "https://firebasestorage.googleapis.com/v0/b/immersa-6d29f.appspot.com/o/models%2Fschaltbau%2Fpanel_solar_comp.glb?alt=media&token=e86a2324-89bf-41f2-88c7-b177096cc974",
                                                   :position [12 -1.8574519157409668 10.833869934082031]
                                                   :rotation [0 0.8674111074663644 0]
                                                   :scale [1 1 1]}}}
   {:id "56zc7d52-eecc-4c69-b020-4bb366ad4594",
    :data {:camera {:position [-0.0011328124975828636 0 21.272332594691633],
                    :rotation [0.0020943951023931952 -3.144908779168582 0]},
           :skybox {:background {:color [177 241 255]}}
           "95z3ee76-bb27-4904-9d30-360a40d8ab44" {:type :glb,
                                                   :duration 2.0
                                                   :asset-type :model,
                                                   :path "https://firebasestorage.googleapis.com/v0/b/immersa-6d29f.appspot.com/o/models%2Fschaltbau%2Fpanel_solar_comp.glb?alt=media&token=e86a2324-89bf-41f2-88c7-b177096cc974",
                                                   :position [3.592869281768799 -1.8574519157409668 10.833869934082031]
                                                   :rotation [0 7.1370003772552115 0]
                                                   :scale [1 1 1]}
           "cab626c0-695a-44c4-a2fc-88484b5eb1dd" {:rotation [0 3.135921059200114 0], :color [255 255 255], :scale [1 1 1], :roughness 1, :metallic 0, :type :text3D, :size 0.3, :position [-3.6639790534973145 -2.1218996047973633 11.270173072814941], :depth 0.01, :visibility 1, :emissive-intensity 1, :text "• Güneş panelleri\n• Rüzgar türbinleri\n• izleme sistemleri\n• Yakıt hücreleri\n• Pil şarj istasyonları\n• Enerji dönüşümü\n• Pil yenileme\n• Sabit pil enerji depoları"}}}
   {:id "1266656e-5d43-4f2a-a15d-cd5b6617b7c6",
    :data {:camera {:position [-0.001132812497582604 -5.447031714567174e-16 21.272332594691633],
                    :rotation [0.0020943951023931952 -3.1382765280110037 0]},
           :skybox {:background {:color [255 255 255]}},
           "95z3ee76-bb27-4904-9d30-360a40d8ab44" {:type :glb,
                                                   :asset-type :model,
                                                   :path "https://firebasestorage.googleapis.com/v0/b/immersa-6d29f.appspot.com/o/models%2Fschaltbau%2Fpanel_solar_comp.glb?alt=media&token=e86a2324-89bf-41f2-88c7-b177096cc974",
                                                   :position [3.59 -1.86 22.05],
                                                   :rotation [0 7.1370003772552115 0],
                                                   :scale [1 1 1]},
           "cab626c0-695a-44c4-a2fc-88484b5eb1dd" {:rotation [0 3.135921059200114 0],
                                                   :color [255 255 255],
                                                   :scale [1 1 1],
                                                   :roughness 1,
                                                   :metallic 0,
                                                   :type :text3D,
                                                   :size 0.3,
                                                   :position [-10.143378257751465
                                                              -2.1218996047973633
                                                              11.270173072814941],
                                                   :depth 0.01,
                                                   :visibility 1,
                                                   :emissive-intensity 1,
                                                   :text "• Güneş panelleri
                                                                      • Rüzgar türbinleri
                                                                      • izleme sistemleri
                                                                      • Yakıt hücreleri
                                                                      • Pil şarj istasyonları
                                                                      • Enerji dönüşümü
                                                                      • Pil yenileme
                                                                      • Sabit pil enerji depoları"}
           "00d4ss76-bb27-4904-9d30-360a40d8abc1" {:type :image, :asset-type :texture, :visibility 1, :path "https://firebasestorage.googleapis.com/v0/b/immersa-6d29f.appspot.com/o/models%2Fschaltbau%2Fc1.png?alt=media&token=faa6102a-e15e-430d-9203-8e1df538a094", :transparent? true, :position [-0.03429393470287323 1.6224138736724854 11.272409439086914], :rotation [0 3.141592653589793 0], :scale [4 4 4]}
           "dfcc126f-3c9d-489f-8784-0fc0dbc448f9" {:rotation [0 3.1449087792603736 0], :color [255 255 255], :scale [1 1 1], :roughness 1, :metallic 0, :type :text3D, :size 0.4, :position [-0.03429393470287323 -1.5883097648620605 11.272409439086914], :depth 0.01, :visibility 1, :emissive-intensity 1, :text "Patentli Ark Sönümleme Teknolojisi"}}}
   {:id "1166656e-5d43-4f2a-a15d-cd5b6617b7c6",
    :data {:camera {:position [-0.001132812497582604 -5.447031714567174e-16 21.272332594691633],
                    :rotation [0 -3.1382765280110037 0]},
           :skybox {:background {:color [255 255 255]}}
           "27o4ss76-bb27-4904-9d30-360a40d8abc1" {:type :image, :asset-type :texture, :visibility 1, :path "https://firebasestorage.googleapis.com/v0/b/immersa-6d29f.appspot.com/o/models%2Fschaltbau%2Fc2.png?alt=media&token=cab78695-3d3b-4fd0-9751-8eca41c64554", :transparent? true, :position [-0.03429393470287323 1.6224138736724854 11.272409439086914], :rotation [0 3.141592653589793 0], :scale [4 4 4]}
           "dfcc126f-3c9d-489f-8784-0fc0dbc448f9" {:rotation [0 3.1449087792603736 0], :color [255 255 255], :scale [1 1 1], :roughness 1, :metallic 0, :type :text3D, :size 0.4, :position [-0.03429393470287323 -1.5883097648620605 11.272409439086914], :depth 0.01, :visibility 1, :emissive-intensity 1, :text "Patentli Ark Sönümleme Teknolojisi"}
           "kfcc126f-3c9d-489f-8784-0fc0dbc448f9" {:rotation [0 3.1449087792603736 0], :color [255 255 255], :scale [1 1 1], :roughness 1, :metallic 0, :type :text3D, :size 0.4, :position [-0.03429393470287323 -2.3460140228271484 11.272409439086914], :depth 0.01, :visibility 1, :emissive-intensity 1, :text "Kaynak/Yapışma Direnci"}}}
   {:id "0166656e-5d43-4f2a-a15d-cd5b6617b7c2",
    :data {:camera {:position [0 -5.447031714567174e-16 21.272332594691633],
                    :rotation [0 -3.1382765280110037 0]},
           :skybox {:background {:color [255 255 255]}}
           "97o4ss76-bb27-4904-9d30-360a40d8abc1" {:type :image, :asset-type :texture, :visibility 1, :path "https://firebasestorage.googleapis.com/v0/b/immersa-6d29f.appspot.com/o/models%2Fschaltbau%2Fc3.png?alt=media&token=94f10dfc-2952-4fe3-ad28-ba07bcaf24a2", :transparent? true, :position [-0.03429393470287323 1.6224138736724854 11.272409439086914], :rotation [0 3.141592653589793 0], :scale [4 4 4]}
           "dfcc126f-3c9d-489f-8784-0fc0dbc448f9" {:rotation [0 3.1449087792603736 0], :color [255 255 255], :scale [1 1 1], :roughness 1, :metallic 0, :type :text3D, :size 0.4, :position [-0.03429393470287323 -1.5883097648620605 11.272409439086914], :depth 0.01, :visibility 1, :emissive-intensity 1, :text "Patentli Ark Sönümleme Teknolojisi"}
           "kfcc126f-3c9d-489f-8784-0fc0dbc448f9" {:rotation [0 3.1449087792603736 0], :color [255 255 255], :scale [1 1 1], :roughness 1, :metallic 0, :type :text3D, :size 0.4, :position [-0.03429393470287323 -2.3460140228271484 11.272409439086914], :depth 0.01, :visibility 1, :emissive-intensity 1, :text "Kaynak/Yapışma Direnci"}
           "zlcc126f-3c9d-489f-8784-0fc0dbc448f9" {:rotation [0 3.1449087792603736 0], :color [255 255 255], :scale [1 1 1], :roughness 1, :metallic 0, :type :text3D, :size 0.4, :position [-0.03429393470287323 -3.1403250694274902 11.272409439086914], :depth 0.01, :visibility 1, :emissive-intensity 1, :text "Çıkarılabilir Anahtarlama Haznesi*"}
           "xkcc126f-3c9d-489f-8784-0fc0dbc448f9" {:rotation [0 3.1449087792603736 0], :color [255 255 255], :scale [1 1 1], :roughness 1, :metallic 0, :type :text3D, :size 0.25, :position [-0.03429393470287323 -3.857837438583374 11.272409439086914], :depth 0.01, :visibility 1, :emissive-intensity 1, :text "(Sadece C310 modelinde mevcuttur*)"}
           "87z4ee76-bb27-4904-9d30-360a40d8ab00" {:type :glb
                                                   :asset-type :model
                                                   :path "https://firebasestorage.googleapis.com/v0/b/immersa-6d29f.appspot.com/o/models%2Fschaltbau%2FC320.glb?alt=media&token=2a2d7138-e5d8-4da1-bf4d-58ddedb192e5"
                                                   :position [2.0005428791046143 -15 0]
                                                   :rotation [0 0 0]
                                                   :scale [0.01 0.01 0.01]}
           "77z4xe76-bb27-4904-9d30-360a40d8ab00" {:type :glb
                                                   :asset-type :model
                                                   :path "https://firebasestorage.googleapis.com/v0/b/immersa-6d29f.appspot.com/o/models%2Fschaltbau%2FC310.glb?alt=media&token=af315c76-ea0b-4e8c-8931-48e6d9b17ba2"
                                                   :position [0.007200113032013178 -15 0]
                                                   :rotation [0 0 0]
                                                   :scale [0.01 0.01 -0.01]}
           "11z4xe26-bb27-4904-9d30-360a40d8ab00" {:type :glb
                                                   :asset-type :model
                                                   :path "https://firebasestorage.googleapis.com/v0/b/immersa-6d29f.appspot.com/o/models%2Fschaltbau%2FC300.glb?alt=media&token=37f3680a-07be-439c-b082-7fdba1d288c2"
                                                   :position [-1.892021656036377 -15 0]
                                                   :rotation [0 0 0]
                                                   :scale [0.01 0.01 0.01]}}}
   {:id "2233656e-5d43-4f2a-a15d-cd5b6617b7c6",
    :data {:camera {:delay 500,
                    :duration 2,
                    :position [4.3021142204224816e-16 1.0000000000000007 5],
                    :rotation [6.661337221303573e-17 -3.1382765280147797 0]},
           :skybox {:background {:color [500 500 500]}},
           "87z4ee76-bb27-4904-9d30-360a40d8ab00" {:type :glb,
                                                   :asset-type :model,
                                                   :duration 2.5,
                                                   :path "https://firebasestorage.googleapis.com/v0/b/immersa-6d29f.appspot.com/o/models%2Fschaltbau%2FC320.glb?alt=media&token=2a2d7138-e5d8-4da1-bf4d-58ddedb192e5",
                                                   :position [2.125737428665161 0.20000000298023224 0],
                                                   :rotation [0 3.141592653589793 0],
                                                   :scale [0.01 0.01 0.01]},
           "77z4xe76-bb27-4904-9d30-360a40d8ab00" {:type :glb,
                                                   :asset-type :model,
                                                   :duration 2.5,
                                                   :path "https://firebasestorage.googleapis.com/v0/b/immersa-6d29f.appspot.com/o/models%2Fschaltbau%2FC310.glb?alt=media&token=af315c76-ea0b-4e8c-8931-48e6d9b17ba2",
                                                   :position [0.007200113032013178 0.2 0],
                                                   :rotation [0 3.141592653589793 -1.5707963267948966],
                                                   :scale [0.01 0.01 -0.01]},
           "11z4xe26-bb27-4904-9d30-360a40d8ab00" {:type :glb,
                                                   :asset-type :model,
                                                   :duration 2.5,
                                                   :path "https://firebasestorage.googleapis.com/v0/b/immersa-6d29f.appspot.com/o/models%2Fschaltbau%2FC300.glb?alt=media&token=37f3680a-07be-439c-b082-7fdba1d288c2",
                                                   :position [-1.892021656036377 0.7 0],
                                                   :rotation [0 3.141592653589793 0],
                                                   :scale [0.01 0.01 0.01]}}}
   {:id "d0e30d94-61f7-467e-a5f2-46c071938887",
    :data {"77z4xe76-bb27-4904-9d30-360a40d8ab00" {:type :glb,
                                                   :asset-type :model,
                                                   :duration 2.5,
                                                   :path "https://firebasestorage.googleapis.com/v0/b/immersa-6d29f.appspot.com/o/models%2Fschaltbau%2FC310.glb?alt=media&token=af315c76-ea0b-4e8c-8931-48e6d9b17ba2",
                                                   :position [-0.25690165162086487 0.20000000298023224 1.4501289129257202],
                                                   :rotation [0.08270623264164967 -0.8555043084843956 -1.7044942195554162],
                                                   :scale [0.01 0.01 -0.01]},
           "0e623eb0-cdb1-4108-a977-711c1dcd92a4" {:rotation [0.001660971510399293
                                                              -3.1387224800576603
                                                              -0.5246100874717244],
                                                   :color [0 0 0],
                                                   :scale [1 1 1],
                                                   :roughness 1,
                                                   :metallic 0,
                                                   :type :text3D,
                                                   :size 0.2,
                                                   :position [0.3736768662929535 -1.375217080116272 -2.651867628097534],
                                                   :depth 0.01,
                                                   :delay 2000,
                                                   :visibility 1,
                                                   :emissive-intensity 1,
                                                   :text "_ 81 mm __"},
           "7339136f-2994-4e1e-8758-38c1a0267da0" {:rotation [-0.0013938410282869661
                                                              -3.14151043641562
                                                              0.37200395354472643],
                                                   :color [0 0 0],
                                                   :scale [1 1 1],
                                                   :roughness 1,
                                                   :metallic 0,
                                                   :type :text3D,
                                                   :size 0.2,
                                                   :position [2.5603132247924805 -1.2463653087615967 -2.680000066757202],
                                                   :depth 0.01,
                                                   :delay 2000,
                                                   :visibility 1,
                                                   :emissive-intensity 1,
                                                   :text "_______ 190 mm _______"},
           "6747ca9c-4adb-4ac7-a174-c714f196438e" {:rotation [0.001660971510399293
                                                              -3.1387224800576603
                                                              -0.5246100874717244],
                                                   :color [0 0 0],
                                                   :scale [1 1 1],
                                                   :roughness 1,
                                                   :metallic 0,
                                                   :type :text3D,
                                                   :size 0.2,
                                                   :position [4.574224472045898 -1.375217080116272 -2.651867628097534],
                                                   :depth 0.01,
                                                   :delay 2000,
                                                   :visibility 1,
                                                   :emissive-intensity 1,
                                                   :text "__ 89 mm __"},
           :skybox {:background {:color [500 500 500]}},
           "3af8b0ba-83f5-41c8-afcd-a3021924f78e" {:rotation [-0.0013962634015954637
                                                              -3.141592653589793
                                                              0.3719296635999916],
                                                   :color [0 0 0],
                                                   :scale [1 1 1],
                                                   :roughness 1,
                                                   :metallic 0,
                                                   :type :text3D,
                                                   :size 0.2,
                                                   :position [-1.314905047416687 -1.3217108249664307 -2.680000066757202],
                                                   :depth 0.01,
                                                   :delay 2000,
                                                   :visibility 1,
                                                   :emissive-intensity 1,
                                                   :text "____ 146,2 mm ___"},
           "01522ac8-e71d-41e4-9397-cf5466fb53cf" {:rotation [-0.0013764070602549628
                                                              -3.1413580127054153
                                                              0.20307907678926837],
                                                   :color [0 0 0],
                                                   :scale [1 1 1],
                                                   :roughness 1,
                                                   :metallic 0,
                                                   :type :text3D,
                                                   :size 0.2,
                                                   :position [-4.608361721038818 -1.2752928733825684 -2.680000066757202],
                                                   :depth 0.01,
                                                   :delay 2000,
                                                   :visibility 1,
                                                   :emissive-intensity 1,
                                                   :text "___ 121 mm __"},
           "11z4xe26-bb27-4904-9d30-360a40d8ab00" {:type :glb,
                                                   :asset-type :model,
                                                   :duration 2.5,
                                                   :path "https://firebasestorage.googleapis.com/v0/b/immersa-6d29f.appspot.com/o/models%2Fschaltbau%2FC300.glb?alt=media&token=37f3680a-07be-439c-b082-7fdba1d288c2",
                                                   :position [-2.1096208095550537 0.699999988079071 1.1705044507980347],
                                                   :rotation [0.01623159117090591 -0.3208284022080041 -0.0696385969888865],
                                                   :scale [0.01 0.01 0.01]},
           "87z4ee76-bb27-4904-9d30-360a40d8ab00" {:type :glb,
                                                   :asset-type :model,
                                                   :duration 2.5,
                                                   :path "https://firebasestorage.googleapis.com/v0/b/immersa-6d29f.appspot.com/o/models%2Fschaltbau%2FC320.glb?alt=media&token=2a2d7138-e5d8-4da1-bf4d-58ddedb192e5",
                                                   :position [1.5318732261657715 0.20000000298023224 0.5806358456611633],
                                                   :rotation [0.05889475630790639
                                                              -0.9555484008560188
                                                              -0.07518087025799675],
                                                   :scale [0.01 0.01 0.01]},
           "34c88fa5-061f-41b6-95cc-d9661db397cf" {:rotation [-0.003316125578789226 3.141592653589793 1.5707963267948966],
                                                   :color [0 0 0],
                                                   :scale [1 1 1],
                                                   :roughness 1,
                                                   :metallic 0,
                                                   :type :text3D,
                                                   :size 0.2,
                                                   :position [5.243363380432129 0.823275625705719 -2.676748752593994],
                                                   :depth 0.01,
                                                   :delay 2000,
                                                   :visibility 1,
                                                   :emissive-intensity 1,
                                                   :text "_________ 165,7 mm _________"},
           "f76c561f-f04a-47d0-a9bf-42ef23be6bd2" {:rotation [-0.003316125578789226 3.141592653589793 1.5707963267948966],
                                                   :color [0 0 0],
                                                   :scale [1 1 1],
                                                   :roughness 1,
                                                   :metallic 0,
                                                   :type :text3D,
                                                   :size 0.2,
                                                   :position [0.9734572172164917 0.33525413274765015 -2.680000066757202],
                                                   :depth 0.01,
                                                   :delay 2000,
                                                   :visibility 1,
                                                   :emissive-intensity 1,
                                                   :text "______ 99,9 mm ______"},
           :camera {:delay 500,
                    :duration 2,
                    :position [0 1 5],
                    :rotation [6.661337221303573e-17 -3.1382765280147797 0]},
           "04c88fa5-061f-41b6-95cc-d9661db397cf" {:rotation [-0.003316125578789226 3.141592653589793 1.5707963267948966],
                                                   :color [0 0 0],
                                                   :scale [1 1 1],
                                                   :roughness 1,
                                                   :metallic 0,
                                                   :type :text3D,
                                                   :size 0.2,
                                                   :position [-2.526470184326172 0.21405090391635895 -2.680000066757202],
                                                   :depth 0.01,
                                                   :delay 2000,
                                                   :visibility 1,
                                                   :emissive-intensity 1,
                                                   :text "____ 91,5 mm ____"},
           "9047ca9c-4adb-4ac7-a174-c714f196438e" {:rotation [0.0013709230454753618
                                                              -3.1385731679548643
                                                              -0.4261954440952545],
                                                   :color [0 0 0],
                                                   :scale [1 1 1],
                                                   :roughness 1,
                                                   :metallic 0,
                                                   :type :text3D,
                                                   :size 0.2,
                                                   :position [-3.103299617767334 -1.179179310798645 -2.651867628097534],
                                                   :depth 0.01,
                                                   :delay 2000,
                                                   :visibility 1,
                                                   :emissive-intensity 1,
                                                   :text "_ 49 mm _"}}}
   {:id "84f572fe-b727-4f50-9c26-1ad59bb11269",
    :data {"77z4xe76-bb27-4904-9d30-360a40d8ab00" {:type :glb,
                                                   :asset-type :model,
                                                   :duration 2.5,
                                                   :path "https://firebasestorage.googleapis.com/v0/b/immersa-6d29f.appspot.com/o/models%2Fschaltbau%2FC310.glb?alt=media&token=af315c76-ea0b-4e8c-8931-48e6d9b17ba2",
                                                   :position [-0.25648826360702515 0.20000000298023224 2.3559212684631348],
                                                   :rotation [-0.062256842243092615
                                                              -2.975876331798779
                                                              -1.5788827136752608],
                                                   :scale [0.01 0.01 -0.01]},
           :skybox {:background {:color [500 500 500]}},
           "11z4xe26-bb27-4904-9d30-360a40d8ab00" {:type :glb,
                                                   :asset-type :model,
                                                   :duration 2.5,
                                                   :path "https://firebasestorage.googleapis.com/v0/b/immersa-6d29f.appspot.com/o/models%2Fschaltbau%2FC300.glb?alt=media&token=37f3680a-07be-439c-b082-7fdba1d288c2",
                                                   :position [-1.8939623832702637 1.7536447048187256 1.8161970376968384],
                                                   :rotation [0.016231638460728157
                                                              -0.8101900330503211
                                                              -0.06963859091267995],
                                                   :scale [0.01 0.01 0.01]},
           "42b6612b-4095-43ad-a707-d70b30674acb" {:delay 2000
                                                   :rotation [0 3.1407915916334312 0],
                                                   :color [0 0 0],
                                                   :scale [1 1 1],
                                                   :roughness 1,
                                                   :metallic 0,
                                                   :type :text3D,
                                                   :size 0.2,
                                                   :position [4.29054594039917 3.8934378623962402 -4.999948501586914],
                                                   :depth 0.01,
                                                   :visibility 1,
                                                   :emissive-intensity 1,
                                                   :text "Opsiyonel 4 adet yardımcı kontak S870 W1D1 t"},
           "87z4ee76-bb27-4904-9d30-360a40d8ab00" {:type :glb,
                                                   :asset-type :model,
                                                   :duration 2.5,
                                                   :path "https://firebasestorage.googleapis.com/v0/b/immersa-6d29f.appspot.com/o/models%2Fschaltbau%2FC320.glb?alt=media&token=2a2d7138-e5d8-4da1-bf4d-58ddedb192e5",
                                                   :position [1.5318732261657715 0.20000000298023224 1.8895998001098633],
                                                   :rotation [0.05889474987440875 0.7127098628248049 -0.07518093457971647],
                                                   :scale [0.01 0.01 0.01]},
           "9a81018b-2726-4fbf-a4d7-d5ccfeda9e05" {:delay 2000
                                                   :rotation [0 3.1407915916334312 0],
                                                   :color [255 0 0],
                                                   :scale [1 1 1],
                                                   :roughness 1,
                                                   :metallic 0,
                                                   :type :text3D,
                                                   :size 0.25,
                                                   :position [4.379096031188965 4.330342769622803 -4.999948501586914],
                                                   :depth 0.01,
                                                   :visibility 1,
                                                   :emissive-intensity 1,
                                                   :text "C320"},
           :camera {:delay 500, :duration 2, :position [0 1 5], :rotation [6.661337221303573e-17 -3.1382765280147797 0]},
           "00f4ee76-bb27-4904-9d30-360a40d8abc1" {:delay 2000
                                                   :type :image,
                                                   :asset-type :texture,
                                                   :visibility 1,
                                                   :path "https://firebasestorage.googleapis.com/v0/b/immersa-6d29f.appspot.com/o/images%2Fschaltbau%2Fellipse.png?alt=media&token=786423c2-ed2c-4eff-920a-ecda6e568760",
                                                   :transparent? true,
                                                   :position [1.0916571617126465 0.5780270099639893 2.5710933208465576],
                                                   :rotation [0 3.141592653589793 1.5707963267948966],
                                                   :scale [0.75 0.75 0.75]}
           "01f4ee76-bb27-4904-9d30-360a40d8abc1" {:delay 2000
                                                   :type :image,
                                                   :asset-type :texture,
                                                   :visibility 1,
                                                   :path "https://firebasestorage.googleapis.com/v0/b/immersa-6d29f.appspot.com/o/images%2Fschaltbau%2Fellipse.png?alt=media&token=786423c2-ed2c-4eff-920a-ecda6e568760",
                                                   :transparent? true,
                                                   :position [-0.19007129967212677 0.7587904334068298 2.8333399295806885]
                                                   :rotation [0 3.141592653589793 1.5707963267948966]
                                                   :scale [0.4 0.4 0.4]}

           "7a81018b-2726-4fbf-a4d7-d5ccfeda9e05" {:delay 2000
                                                   :rotation [0 3.1407915916334312 0], :color [255 0 0], :scale [1 1 1], :roughness 1, :metallic 0, :type :text3D, :size 0.25, :position [-5.8955979347229 1.2320771217346191 -4.999948501586914], :depth 0.01, :visibility 1, :emissive-intensity 1, :text "C300"}
           "8x81018b-2726-4fbf-a4d7-d5ccfeda9e05" {:delay 2000
                                                   :rotation [0 3.1407915916334312 0], :color [255 0 0], :scale [1 1 1], :roughness 1, :metallic 0, :type :text3D, :size 0.25, :position [-1.0127184391021729 2.574812412261963 -4.999948501586914], :depth 0.01, :visibility 1, :emissive-intensity 1, :text "C310"}
           "003457fd-3ae0-4e07-9396-70ba660ccbc7" {:delay 2000
                                                   :rotation [0 3.1407915916334312 0], :color [0 0 0], :scale [1 1 1], :roughness 1, :metallic 0, :type :text3D, :size 0.2, :position [-5.622723579406738 0.4926639199256897 -4.519429683685303], :depth 0.01, :visibility 1, :emissive-intensity 1, :text "Phoenix Contact MCV\n1,5/4-GF-3,5 Konnektör"}
           "02b6612b-4095-43ad-a707-d70b30674acb" {:delay 2000
                                                   :rotation [0 3.1407915916334312 0], :color [0 0 0], :scale [1 1 1], :roughness 1, :metallic 0, :type :text3D, :size 0.2, :position [-0.9920702576637268 1.996717929840088 -4.999948501586914], :depth 0.01, :visibility 1, :emissive-intensity 1, :text "Opsiyonel 2 adet yardımcı kontak S880 W1R6 k"}
           "02f4ee76-bb27-4904-9d30-360a40d8abc1" {:delay 2000
                                                   :type :image,
                                                   :asset-type :texture,
                                                   :visibility 1,
                                                   :path "https://firebasestorage.googleapis.com/v0/b/immersa-6d29f.appspot.com/o/images%2Fschaltbau%2Fellipse.png?alt=media&token=786423c2-ed2c-4eff-920a-ecda6e568760",
                                                   :transparent? true,
                                                   :position [-1.1780871152877808 1.2881109714508057 2.5710933208465576]
                                                   :rotation [0 3.141592653589793 0]
                                                   :scale [0.4 0.4 0.4]}}}
   {:id "0xf572fe-b727-4f50-9c26-1ad59bb11269",
    :data {"77z4xe76-bb27-4904-9d30-360a40d8ab00" {:type :glb,
                                                   :asset-type :model,
                                                   :duration 2.5,
                                                   :path "https://firebasestorage.googleapis.com/v0/b/immersa-6d29f.appspot.com/o/models%2Fschaltbau%2FC310.glb?alt=media&token=af315c76-ea0b-4e8c-8931-48e6d9b17ba2",
                                                   :position [0.013330033048987389 1.0394243001937866 1.0372164249420166],
                                                   :rotation [-1.5707963267948966 1.5715636607271457 0],
                                                   :scale [0.01 0.01 -0.01]},
           "81f4ee76-bb27-4904-9d44-360a40d8abc1" {:path "https://firebasestorage.googleapis.com/v0/b/immersa-6d29f.appspot.com/o/images%2Fschaltbau%2Fleft-arrow.png?alt=media&token=189c9307-1d79-4068-ae2a-2c698a965653",
                                                   :asset-type :texture,
                                                   :rotation [0 3.141592653589793 0],
                                                   :scale [0.5 0.2 0.2],
                                                   :transparent? true,
                                                   :type :image,
                                                   :position [0.1120314747095108 0.27269917726516724 2.5710933208465576],
                                                   :delay 2000,
                                                   :visibility 1},
           "ff306bfa-d514-48d3-97a5-ba747b2187b2" {:path "https://firebasestorage.googleapis.com/v0/b/immersa-6d29f.appspot.com/o/images%2Fschaltbau%2Fleft-arrow.png?alt=media&token=189c9307-1d79-4068-ae2a-2c698a965653",
                                                   :asset-type :texture,
                                                   :rotation [0 3.141592653589793 0],
                                                   :scale [0.5 0.2 0.2],
                                                   :transparent? true,
                                                   :type :image,
                                                   :position [0.1120314747095108 0.9130205512046814 2.5710933208465576],
                                                   :delay 2000,
                                                   :visibility 1},
           :skybox {:background {:color [500 500 500]}},
           "2f2a67f5-5c51-4fc9-9083-3ab6c1243429" {:path "https://firebasestorage.googleapis.com/v0/b/immersa-6d29f.appspot.com/o/images%2Fschaltbau%2Fright-arrow.png?alt=media&token=473da82f-5c61-4b4b-aafb-68500d389d30",
                                                   :asset-type :texture,
                                                   :rotation [0 3.141592653589793 0],
                                                   :scale [0.5 0.2 0.2],
                                                   :transparent? true,
                                                   :type :image,
                                                   :position [-0.16300225257873535 1.7718638181686401 2.5710933208465576],
                                                   :delay 2000,
                                                   :visibility 1},
           "11z4xe26-bb27-4904-9d30-360a40d8ab00" {:type :glb,
                                                   :asset-type :model,
                                                   :duration 2.5,
                                                   :path "https://firebasestorage.googleapis.com/v0/b/immersa-6d29f.appspot.com/o/models%2Fschaltbau%2FC300.glb?alt=media&token=37f3680a-07be-439c-b082-7fdba1d288c2",
                                                   :position [-0.01953240856528282 0.24044539034366608 1.8161970376968384],
                                                   :rotation [1.5707963267948966 0 0],
                                                   :scale [0.01 0.01 0.01]},
           "91f4ee76-bb27-4904-9d44-360a40d8abc1" {:path "https://firebasestorage.googleapis.com/v0/b/immersa-6d29f.appspot.com/o/images%2Fschaltbau%2Fright-arrow.png?alt=media&token=473da82f-5c61-4b4b-aafb-68500d389d30",
                                                   :asset-type :texture,
                                                   :rotation [0 3.141592653589793 0],
                                                   :scale [0.5 0.2 0.2],
                                                   :transparent? true,
                                                   :type :image,
                                                   :position [-0.15708379447460175 0.5304198861122131 2.5710933208465576],
                                                   :delay 2000,
                                                   :visibility 1},
           "87z4ee76-bb27-4904-9d30-360a40d8ab00" {:type :glb,
                                                   :asset-type :model,
                                                   :duration 2.5,
                                                   :path "https://firebasestorage.googleapis.com/v0/b/immersa-6d29f.appspot.com/o/models%2Fschaltbau%2FC320.glb?alt=media&token=2a2d7138-e5d8-4da1-bf4d-58ddedb192e5",
                                                   :position [0.0051579843275249004 2.1109797954559326 0.3701476752758026],
                                                   :rotation [1.413716694115407 -3.141592653589793 -3.141592653589793],
                                                   :scale [0.01 0.01 0.01]},
           "338421db-e14f-41ea-a211-1fd58293ef14" {:path "https://firebasestorage.googleapis.com/v0/b/immersa-6d29f.appspot.com/o/images%2Fschaltbau%2Fleft-arrow.png?alt=media&token=189c9307-1d79-4068-ae2a-2c698a965653",
                                                   :asset-type :texture,
                                                   :rotation [0 3.141592653589793 0],
                                                   :scale [0.5 0.2 0.2],
                                                   :transparent? true,
                                                   :type :image,
                                                   :position [0.09300604462623596 1.5089789628982544 2.5710933208465576],
                                                   :delay 2000,
                                                   :visibility 1},
           :camera {:delay 500, :duration 2, :position [0 1 5], :rotation [8.300780624074136E-4 -3.141145668655838 0]},
           "95d7ea64-7be5-45ec-bcf1-525333c04113" {:rotation [0 3.141592653589793 0],
                                                   :color [0 0 0],
                                                   :scale [1 1 1],
                                                   :roughness 1,
                                                   :metallic 0,
                                                   :type :text3D,
                                                   :size 0.4,
                                                   :position [-4.896994590759277 0.8312013149261475 -4.999945163726807],
                                                   :depth 0.01,
                                                   :delay 2000,
                                                   :visibility 1,
                                                   :emissive-intensity 1,
                                                   :text "DC akım: Çift Yönlü"},
           "d7d9c4a2-5842-4b35-95a4-3c6793dbf986" {:path "https://firebasestorage.googleapis.com/v0/b/immersa-6d29f.appspot.com/o/images%2Fschaltbau%2Fright-arrow.png?alt=media&token=473da82f-5c61-4b4b-aafb-68500d389d30",
                                                   :asset-type :texture,
                                                   :rotation [0 3.141592653589793 0],
                                                   :scale [0.5 0.2 0.2],
                                                   :transparent? true,
                                                   :type :image,
                                                   :position [-0.15708379447460175 1.132240891456604 2.5710933208465576],
                                                   :delay 2000,
                                                   :visibility 1}}}
   {:id "3xz572fe-b727-4f50-9c26-1ad59bb11269",
    :data {"77z4xe76-bb27-4904-9d30-360a40d8ab00" {:type :glb,
                                                   :asset-type :model,
                                                   :duration 2.5,
                                                   :path "https://firebasestorage.googleapis.com/v0/b/immersa-6d29f.appspot.com/o/models%2Fschaltbau%2FC310.glb?alt=media&token=af315c76-ea0b-4e8c-8931-48e6d9b17ba2",
                                                   :position [5 -1.0980945825576782 -4],
                                                   :rotation [0 -3.141592653589793 -1.5707963267948966],
                                                   :scale [0.01 0.01 -0.01]},
           "db0880c2-4d94-40da-9066-1ddfd9f44a04" {:delay 2000
                                                   :rotation [0 3.141767186519361 0],
                                                   :color [0 0 0],
                                                   :scale [1 1 1],
                                                   :roughness 1,
                                                   :metallic 0,
                                                   :type :text3D,
                                                   :size 0.3,
                                                   :position [1.0546008348464966 -0.7618218064308167 -5],
                                                   :depth 0.01,
                                                   :visibility 1,
                                                   :emissive-intensity 1,
                                                   :text "150 А / 300 А / 500 A\n"},
           "3f9580bc-6ca7-411e-ba14-59ca5c46cf68" {:delay 2000
                                                   :rotation [0 3.141767186519361 0],
                                                   :color [0 0 0],
                                                   :scale [1 1 1],
                                                   :roughness 1,
                                                   :metallic 0,
                                                   :type :text3D,
                                                   :size 0.3,
                                                   :position [1.0546008348464966 1.2276082038879395 -5],
                                                   :depth 0.01,
                                                   :visibility 1,
                                                   :emissive-intensity 1,
                                                   :text "1000 А"},
           :skybox {:background {:color [500 500 500]}},
           "04d9f1d0-54a0-4a20-ad88-f6df406ac08f" {:delay 2000
                                                   :rotation [0 3.141767186519361 0],
                                                   :color [0 0 0],
                                                   :scale [1 1 1],
                                                   :roughness 1,
                                                   :metallic 0,
                                                   :type :text3D,
                                                   :size 0.3,
                                                   :position [-4.216121196746826 -0.7366307973861694 -5],
                                                   :depth 0.01,
                                                   :visibility 1,
                                                   :emissive-intensity 1,
                                                   :text "60 В / 1000 V"},
           "11z4xe26-bb27-4904-9d30-360a40d8ab00" {:type :glb,
                                                   :asset-type :model,
                                                   :duration 2.5,
                                                   :path "https://firebasestorage.googleapis.com/v0/b/immersa-6d29f.appspot.com/o/models%2Fschaltbau%2FC300.glb?alt=media&token=37f3680a-07be-439c-b082-7fdba1d288c2",
                                                   :position [5 -2.204023838043213 -4],
                                                   :rotation [0 0 0],
                                                   :scale [0.01 0.01 0.01]},
           "dcb559df-cec6-4108-ad92-2db11855df8b" {:delay 2000
                                                   :rotation [0 3.141767186519361 0],
                                                   :color [0 0 0],
                                                   :scale [1 1 1],
                                                   :roughness 1,
                                                   :metallic 0,
                                                   :type :text3D,
                                                   :size 0.4,
                                                   :position [1.0546008348464966 2.886216163635254 -5],
                                                   :depth 0.01,
                                                   :visibility 1,
                                                   :emissive-intensity 1,
                                                   :text "Akım (Termal)"},
           "87z4ee76-bb27-4904-9d30-360a40d8ab00" {:type :glb,
                                                   :asset-type :model,
                                                   :duration 2.5,
                                                   :path "https://firebasestorage.googleapis.com/v0/b/immersa-6d29f.appspot.com/o/models%2Fschaltbau%2FC320.glb?alt=media&token=2a2d7138-e5d8-4da1-bf4d-58ddedb192e5",
                                                   :position [5 0.6375453472137451 -4],
                                                   :rotation [0 -0.11292280260403312 0],
                                                   :scale [0.01 0.01 0.01]},
           "6d64cb50-f840-4034-9498-16c5fe75b835" {:delay 2000
                                                   :rotation [0 3.141767186519361 0],
                                                   :color [0 0 0],
                                                   :scale [1 1 1],
                                                   :roughness 1,
                                                   :metallic 0,
                                                   :type :text3D,
                                                   :size 0.4,
                                                   :position [-4.121439456939697 2.886216163635254 -5],
                                                   :depth 0.01,
                                                   :visibility 1,
                                                   :emissive-intensity 1,
                                                   :text "Çalışma Gerilimi"},
           "5ed2d630-acbc-4f29-9dd4-45fce2228887" {:delay 2000
                                                   :rotation [0 3.141767186519361 0],
                                                   :color [0 0 0],
                                                   :scale [1 1 1],
                                                   :roughness 1,
                                                   :metallic 0,
                                                   :type :text3D,
                                                   :size 0.3,
                                                   :position [-4.13485050201416 1.2276082038879395 -5],
                                                   :depth 0.01,
                                                   :visibility 1,
                                                   :emissive-intensity 1,
                                                   :text "60 В / 1500 V"},
           :camera {:delay 500,
                    :duration 2,
                    :position [8.847089727481716E-16 5.412337245047638E-16 5.000000000000002],
                    :rotation [0.006580077802053155 -3.141126561471105 0]},
           "ecd8d6f3-7140-42d0-9f04-0e1c4fdf76a9" {:delay 2000
                                                   :rotation [0 3.141767186519361 0],
                                                   :color [0 0 0],
                                                   :scale [1 1 1],
                                                   :roughness 1,
                                                   :metallic 0,
                                                   :type :text3D,
                                                   :size 0.3,
                                                   :position [-4.13485050201416 -2.675144910812378 -5],
                                                   :depth 0.01,
                                                   :visibility 1,
                                                   :emissive-intensity 1,
                                                   :text "1000 V"},
           "5f963f9c-f67a-4f79-990b-3ffc183a217c" {:delay 2000
                                                   :rotation [0 3.141767186519361 0],
                                                   :color [0 0 0],
                                                   :scale [1 1 1],
                                                   :roughness 1,
                                                   :metallic 0,
                                                   :type :text3D,
                                                   :size 0.3,
                                                   :position [1.0546008348464966 -2.6763317584991455 -5],
                                                   :depth 0.01,
                                                   :visibility 1,
                                                   :emissive-intensity 1,
                                                   :text "500 A"}}}
   {:id "04g4ee76-bb27-4904-9d30-360a40d8abb1",
    :data {:camera {:position [0 0 50], :rotation [-0.001867187431616649 -3.1409754660685074 0]},
           :skybox {:background {:color [1000 1000 1000]}},
           "wave" {:type :wave},
           "33e4ee76-bb27-4904-9d30-360a40d8abc1" {:type :image,
                                                   :asset-type :texture,
                                                   :visibility 1,
                                                   :path "https://firebasestorage.googleapis.com/v0/b/immersa-6d29f.appspot.com/o/images%2Fschaltbau%2Flogo.png?alt=media&token=2afccb59-5489-4553-9a98-0425f0bac1db",
                                                   :transparent? true,
                                                   :position [-0.21233706176280975 5.199999809265137 35],
                                                   :rotation [0 3.141592653589793 0],
                                                   :scale [1 1 1]},
           "140edf72-4d92-4d1f-a824-e17545ca00f1" {:rotation [0 3.141592653589793 0],
                                                   :color [0 0 0],
                                                   :scale [1 1 1],
                                                   :roughness 1,
                                                   :metallic 0,
                                                   :type :text3D,
                                                   :size 0.35,
                                                   :position [-0.16265198588371277 1.316047191619873 40],
                                                   :depth 0.01,
                                                   :visibility 1,
                                                   :emissive-intensity 1,
                                                   :text "        Arda AVŞAR\nİş Geliştirme Müdürü"},
           "72ac1391-2cb7-4fc7-aeba-df6738070c6f" {:rotation [0 3.141592653589793 0],
                                                   :color [0 0 0],
                                                   :scale [1 1 1],
                                                   :roughness 1,
                                                   :metallic 0,
                                                   :type :text3D,
                                                   :size 0.3,
                                                   :position [-0.013500248081982136 -0.2740437090396881 40],
                                                   :depth 0.01,
                                                   :visibility 1,
                                                   :emissive-intensity 1,
                                                   :text "      +90 538 251 93 34\narda.avsar@schaltbau.de"}}}])
