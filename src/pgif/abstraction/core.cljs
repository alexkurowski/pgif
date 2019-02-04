(ns pgif.abstraction
  (:require [reagent.core :as r]))

(def log
  (r/atom
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

(def things
  (r/atom
    [{:name "Thing"
      :actions
      [{:name "Action"}]}
     {:name "Another thing"
      :actions
      [{:name "Action 1"}
       {:name "Action 2"}
       {:name "Action 3"}]}]))

(def current-thing (r/atom nil))

(defn add-log [log thing action]
  (let [thing-name (thing :name)
        action-name (action :name)]
  (conj log (str thing-name " - " action-name))))

(defn set-current-thing [thing]
  (println "Set current thing" thing)
  (reset! current-thing thing))

(defn invoke [action]
  (println "Invoke action" action "on" @current-thing)
  (swap! log add-log @current-thing action)
  (reset! current-thing nil))
