(ns pgif.components.table-action
  (:require [pgif.abstraction.things :as abstraction-things]))

(defn component [action]
  (let [name (action :name)]
    [:a
     {:class-name "btn"
      :on-click #(abstraction-things/act action)}
     name]))
