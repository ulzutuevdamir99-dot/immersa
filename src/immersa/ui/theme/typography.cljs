(ns immersa.ui.theme.typography
  (:require
    [clojure.string :as str]))

(def font
  (str/join "," ["\"Inter UI\""
                 "\"SF Pro Display\""
                 "-apple-system"
                 "BlinkMacSystemFont"
                 "\"Segoe UI\""
                 "Roboto"
                 "Oxygen"
                 "Ubuntu"
                 "Cantarell"
                 "\"Open Sans\""
                 "\"Helvetica Neue\""
                 "sans-serif"]))

(def xs "10px")
(def s "12px")
(def m "13px")
(def l "14px")
(def xl "15px")
(def xxl "18px")

(def regular 400)
(def medium 500)
(def semi-bold 600)
(def bold 700)
