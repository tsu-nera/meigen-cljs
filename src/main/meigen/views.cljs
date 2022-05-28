(ns meigen.views
  (:require
   [clojure.string :as str]
   [reagent.core :as r]
   [meigen.events :as events]
   [re-frame.core :as re-frame]
   [meigen.subs :as subs]))

(defn meigen-item
  [{:keys [content author]}]
  [:li
   (str content " " author)
   #_[:input {:type      "checkbox"
              :class     "toggle"
              :checked   (and completed "checked")
              :on-change #(re-frame/dispatch [::events/toggle id])}]
   #_[:span {:class    "delete"
             :on-click #(re-frame/dispatch [::events/delete id])}
      "[x]"]])

#_(defn meigen-input
    []
    (let [val (r/atom "")]
      (fn []
        [:input {:type        "text"
                 :value       @val
                 :class       "new-meigen"
                 :placeholder "What needs to be done?"
                 :on-change   #(reset! val (-> % .-target .-value))
                 :on-key-down #(when (= (.-which %) 13)
                                 (let [title (-> @val str/trim)]
                                   (when (seq title)
                                     (re-frame/dispatch [::events/add-meigen title]))
                                   (reset! val "")))}])))

(defn meigen-list
  []
  (let [meigens @(re-frame/subscribe [::subs/meigens])]
    [:div
     #_[meigen-input]
     [:ul
      (for [meigen meigens]
        ^{:key (:id meigen)}
        [meigen-item meigen])]]))
