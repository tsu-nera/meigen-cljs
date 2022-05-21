(ns meigen.core
  (:require [reagent.core :as r]
            [reagent.dom :as rd]))

(def greeting "Hello World!")

(defn app []
  [:div greeting])

(defn stop []
  (js/console.log "Stopping..."))

(defn start []
  (js/console.log "Starting...")
  (rd/render [app]
             (.getElementById js/document "app")))

(defn ^:export init []
  (start))
