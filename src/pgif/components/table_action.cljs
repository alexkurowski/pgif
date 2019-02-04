(ns pgif.components.table-action
  (:require [pgif.abstraction :as abstraction]))

(defn component [action]
  (let [name (action :name)]
    [:a
     {:class-name "btn"
      :on-click #(abstraction/invoke action)}
     name]))
