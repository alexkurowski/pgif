(ns pgif.components.table
  (:require [pgif.abstraction :as abstraction]))

(defn button [label]
  [:a
   {:class "btn"
    :on-click #(abstraction/invoke label)}
   label])

(defn component []
  [:div {:id "table"}
   (button "Suhar")
   (button "Revolver")
   (button "Flashlight")
   (button "Thingy thing with 10 legs")])
