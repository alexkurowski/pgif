(ns pgif.abstraction
  (:require [reagent.core :as reagent :refer [atom]]))

(def log
  (atom
    ["First line"
     "Second line"
     "Another line"
     "Another line"
     "Another line"
     "Another line"
     "Another line"
     "Another line"
     "Another line"
     "Another line"
     "Another line"
     "Another line"
     "Another line"]))

(defn add-log [log input]
  (conj log input))

(defn invoke [action]
  (println "Invoke action" action)
  (swap! log add-log action))
