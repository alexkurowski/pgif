(ns pgif.components.table
  (:require [pgif.components.table-thing :as table-thing]
            [pgif.components.table-action :as table-action]
            [pgif.abstraction.things :as abstraction-things]))

(defn display-things []
  (map-indexed
    (fn [index thing]
      ^{:key index} [table-thing/component thing])
    @abstraction-things/things))

(defn display-actions []
  (map-indexed
    (fn [index action]
      (println action)
      ^{:key index} [table-action/component action])
    (@abstraction-things/current-thing :actions)))

(defn component []
  [:div {:id "table"}
   (if (= @abstraction-things/current-thing nil)
     (display-things)
     (display-actions))])
