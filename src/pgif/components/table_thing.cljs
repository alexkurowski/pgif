(ns pgif.components.table-thing
  (:require [pgif.abstraction.things :as abstraction-things]))

(defn component [thing]
  (let [name (thing :name)]
    [:a
     {:class-name "btn"
      :on-click #(abstraction-things/set-current-thing thing)}
     name]))

