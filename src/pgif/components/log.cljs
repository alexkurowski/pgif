(ns pgif.components.log
  (:require [pgif.components.log-line :as log-line]
            [pgif.abstraction.log :as abstraction-log]))

(defn component []
  [:div {:id "log"}
   (map-indexed
     (fn [index line]
       ^{:key index} [log-line/component line])
     @abstraction-log/log)])
