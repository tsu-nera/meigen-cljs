(ns meigen.views
  (:require
   [clojure.string :as str]
   [reagent.core :as r]
   [meigen.events :as events]
   [re-frame.core :as re-frame]
   [meigen.subs :as subs]))

(defn todo-item
  [{:keys [id completed] :as todo}]
  [:li
   [:input {:type      "checkbox"
            :class     "toggle"
            :checked   (and completed "checked")
            :on-change #(re-frame/dispatch [::events/toggle id])}]
   [:span {:class (when completed "completed")}
    (:title todo)]

   ;; 追加
   [:span {:class    "delete"
           :on-click #(re-frame/dispatch [::events/delete id])}
    "[x]"]])

(defn todo-input
  []
  (let [val (r/atom "")]
    (fn []
      [:input {:type        "text"
               :value       @val
               :class       "new-todo"
               :placeholder "What needs to be done?"
               :on-change   #(reset! val (-> % .-target .-value))
               :on-key-down #(when (= (.-which %) 13)
                               (let [title (-> @val str/trim)]
                                 (when (seq title)
                                   (re-frame/dispatch [::events/add-todo title]))
                                 (reset! val "")))}])))

(defn todo-list
  []
  (let [todos @(re-frame/subscribe [::subs/todos])]
    [:div
     [todo-input]
     [:ul
      (for [todo todos]
        ^{:key (:id todo)}
        [todo-item todo])]]))
