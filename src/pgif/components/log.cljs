(ns pgif.components.log
  (:require [pgif.components.log-line :as log-line]))

(defn component [lines]
  [:div {:id "log"}
   (map-indexed
     (fn [index line]
       ^{:key index} [log-line/component line])
     lines)])
