(ns pgif.components.log-line
  (:require [reagent.core :as reagent]))

(defn component [line]
  (reagent/create-class
    {:display-name "log-line"

     :component-did-mount
     (fn [this]
       (let [element (.getElementById js/document "log")
             last-p (.-lastChild element)
             p-top (.-offsetTop last-p)
             rem 16
             scroll-to (- p-top (* rem 3))]
         (set! (.-scrollTop element) scroll-to)))

     :reagent-render
     (fn [line]
       [:p line])}))
