(ns pgif.components.app
  (:require [pgif.components.log :as log]
            [pgif.components.table :as table]))

(defn component []
  [:main
   (log/component)
   (table/component)])
