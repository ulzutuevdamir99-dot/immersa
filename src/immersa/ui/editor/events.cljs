(ns immersa.ui.editor.events
  (:require
    [re-frame.core :refer [reg-event-db reg-event-fx reg-fx]]))

(reg-event-db
  ::set-canvas-wrapper-dimensions
  (fn [db [_ width height]]
    (-> db
        (assoc-in [:editor :canvas-wrapper :width] width)
        (assoc-in [:editor :canvas-wrapper :height] height))))
