(ns immersa.common.firebase
  (:require
    ["firebase/app" :refer [initializeApp]]
    ["firebase/storage" :refer [getStorage ref getDownloadURL]]
    [applied-science.js-interop :as j]))

(defonce app nil)
(defonce storage nil)

(defn get-download-url [path]
  (-> (getDownloadURL (ref storage path))
      (j/call :then (fn [url]
                      (println "Url: " url)))
      (j/call :catch (fn [e]
                       (println "Firebase download URL error")
                       (js/console.error e)))))

(defn init-app []
  (set! app (initializeApp #js {:apiKey "AIzaSyDVBneQ2EVdElUSdSU1xBQYsk5AaOZo2Uc"
                                :authDomain "immersa-6d29f.firebaseapp.com"
                                :projectId "immersa-6d29f"
                                :storageBucket "immersa-6d29f.appspot.com"
                                :messagingSenderId "673288914536"
                                :appId "1:673288914536:web:d8fab9505ffc63b0a65ddd"
                                :measurementId "G-T62SN00GF8"}))
  (set! storage (getStorage)))

(comment
  (init-app)
  (get-download-url "images/schaltbau/logo.png")
  )
