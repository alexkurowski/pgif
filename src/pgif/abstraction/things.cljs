(ns pgif.abstraction.things
  (:require [reagent.core :as r]
            [pgif.abstraction.log :as log]))

(def things (r/atom []))

(def current-thing (r/atom nil))

(defn add-thing [thing]
  (println "adding" thing)
  (reset! things (conj @things thing)))

(defn new-thing [name actions]
  {:name name
   :actions actions})

(defn create-thing [name actions]
  (add-thing (new-thing name actions)))

(defn set-current-thing [thing]
  (println "Setting current thing to" thing)
  (reset! current-thing thing))

(defn act [action]
  (println "Invoke action" action "on" @current-thing)
  (log/add-log @current-thing action)
  (reset! current-thing nil))
