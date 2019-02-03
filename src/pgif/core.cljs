(ns pgif.core
    (:require [reagent.core :as reagent]
              [pgif.app :as app :refer [app]]))

(enable-console-print!)

;; define your app data so that it doesn't get over-written on reload

(reagent/render-component
  [app]
  (.getElementById js/document "app"))

(defn on-js-reload []
  ;; optionally touch your app-state to force rerendering depending on
  ;; your application
  ;; (swap! app-state update-in [:__figwheel_counter] inc)
)
