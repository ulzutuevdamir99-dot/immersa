(ns immersa.ui.editor.components.scroll-area
  (:require
    ["@radix-ui/react-scroll-area" :as ScrollArea]
    [spade.core :refer [defclass defattrs]]))

(def scroll-size "6px")

(defclass viewport []
  {:width "100%"
   :height "100%"
   :border-radius :inherit})

(defclass scrollbar []
  {:display :flex
   :user-select :none
   :touch-action :none
   :padding "2px"
   :background "transparent"
   :transition "background 160ms ease-out"}
  [:&:hover
   {:background "rgba(0, 0, 0, 0.6)"}]
  ["&[data-orientation='vertical']"
   {:width scroll-size}]
  ["&[data-orientation='horizontal']"
   {:flex-direction :column
    :height scroll-size}])

(defclass thumb []
  {:flex 1
   :background "rgba(0, 0, 0, 0.3)"
   :border-radius scroll-size
   :position :relative}
  [:&:before
   {:content ""
    :position :absolute
    :top "50%"
    :left "50%"
    :transform "translate(-50%, -50%)"
    :width "100%"
    :height "100%"
    :min-width "44px"
    :min-height "44px"}])

(defclass corner []
  {:background "rgba(0, 0, 0, 0.6)"})

(defn scroll-area [{:keys [children class]}]
  [:> ScrollArea/Root
   {:class class}
   [:> ScrollArea/Viewport
    {:class (viewport)}
    children]
   [:> ScrollArea/Scrollbar
    {:class (scrollbar)
     :orientation "vertical"}
    [:> ScrollArea/Thumb {:class (thumb)}]]
   [:> ScrollArea/Corner {:class (corner)}]])
