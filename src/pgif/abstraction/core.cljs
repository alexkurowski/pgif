(ns pgif.abstraction
  (:require [pgif.abstraction.log :as log]
            [pgif.abstraction.things :as things]
            [pgif.abstraction.actions :as actions]))

(defn initialize []
  (reset! log/log [])
  (reset! things/things [])

  (things/create-thing
    "Thing name A"
    [(actions/new-action "Test action A")
     (actions/new-action "Test action B")])

  (things/create-thing
    "Thing name B"
    [(actions/new-action "Test action C")
     (actions/new-action "Test action D")]))
