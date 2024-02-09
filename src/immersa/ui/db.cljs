(ns immersa.ui.db)

(def default-db
  {:name "re-frame"
   :mode :editor
   :editor {:slides {:current-index 0
                     :all [{:id  "14e4ee76-bb27-4904-9d30-360a40d8abb7"
                            :data {:camera {:position [0 0 -10]
                                            :rotation [0 0 0]}
                                   :skybox {:background {:color [80 157 105]}}}}
                           {:id "3bc5da96-f729-4ca1-a5e4-ab22fecd29b7"
                            :data {:camera {:position [0 5 -10]
                                            :rotation [0 0 0]}
                                   :skybox {:background {:color [255 157 0]}}}}]}}
   :present {:show-arrow-keys-text? true
             :show-pre-warm-text? false
             :background-color "rgb(0,0,0)"}})
