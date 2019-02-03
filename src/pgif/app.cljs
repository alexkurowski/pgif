(ns pgif.app
  (:require [pgif.abstraction :as abstraction]
            [pgif.components.log :as log]
            [pgif.components.table :as table]))

(defn app []
  [:main
   (log/component @abstraction/log)
   (table/component)])
