(ns pgif.components.log-line
  (:require [reagent.core :as r]))

(defn component [line]
  (r/create-class
    {:display-name "log-line"

     :component-did-mount
     (fn [this]
       (let [parent (.getElementById js/document "log")
             last-p (.-lastChild parent)
             p-top (.-offsetTop last-p)
             rem 16
             scroll-to (- p-top (* rem 3))]
         (set! (.-scrollTop parent) scroll-to)))

     :reagent-render
     (fn [line]
       [:p line])}))
