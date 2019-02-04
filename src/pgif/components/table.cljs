(ns pgif.components.table
  (:require [pgif.components.table-thing :as table-thing]
            [pgif.components.table-action :as table-action]
            [pgif.abstraction :as abstraction]))

(defn display-things []
  (map-indexed
    (fn [index thing]
      ^{:key index} [table-thing/component thing])
    @abstraction/things))

(defn display-actions []
  (map-indexed
    (fn [index action]
      ^{:key index} [table-action/component action])
    (@abstraction/current-thing :actions)))

(defn component []
  [:div {:id "table"}
   (if (= @abstraction/current-thing nil)
     (display-things)
     (display-actions))])
