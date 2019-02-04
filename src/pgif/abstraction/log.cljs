(ns pgif.abstraction.log
  (:require [reagent.core :as r]))

(def log (r/atom []))

(defn add-log [thing action]
  (let [thing-name (thing :name)
        action-name (action :name)
        line (str thing-name " - " action-name)]
    (reset! log (conj @log line))))
