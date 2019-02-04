(ns pgif.components.table-thing
  (:require [pgif.abstraction :as abstraction]))

(defn component [thing]
  (let [name (thing :name)]
    [:a
     {:class-name "btn"
      :on-click #(abstraction/set-current-thing thing)}
     name]))

