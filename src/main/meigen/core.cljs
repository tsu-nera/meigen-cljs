(ns meigen.core
  (:require
   [reagent.dom :as rd]
   [re-frame.core :as re-frame]
   [meigen.events :as events]
   [meigen.views :as views]
   [meigen.config :as config]))

(defn dev-setup []
  (when config/debug?
    (enable-console-print!)
    (println "dev mode")))

(defn mount-root []
  (re-frame/clear-subscription-cache!)
  (rd/render [views/todo-list]
             (.getElementById js/document "app")))

(defn ^:export init []
  (re-frame/dispatch-sync [::events/initialize-db])
  (dev-setup)
  (mount-root))
