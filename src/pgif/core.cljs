(ns pgif.core
    (:require [reagent.core :as reagent]
              [pgif.components.app :as app]))

(enable-console-print!)

;; (println {:msg "message"})
;; (js* "debugger;")

(reagent/render-component
  [app/component]
  (.getElementById js/document "app"))

(defn on-js-reload []
  ;; optionally touch your app-state to force rerendering depending on
  ;; your application
  ;; (swap! app-state update-in [:__figwheel_counter] inc)
)
