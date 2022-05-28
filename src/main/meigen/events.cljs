(ns meigen.events
  (:require [re-frame.core :as re-frame]
            [meigen.db :as db]))

(re-frame/reg-event-db
 ::initialize-db
 (fn [_ _]
   db/default-db))

(defn- allocate-next-id
  [meigens]
  (-> meigens
      keys
      last
      ((fnil inc 0))))

(re-frame/reg-event-db
 ::add-meigen
 (fn [db [event title]]
   (let [id         (allocate-next-id (:meigens db))
         new-meigen {:id id :title title :completed false}]
     (update db :meigens #(assoc % id {:id id :title title})))))

(re-frame/reg-event-db
 ::toggle
 (fn [db [event id]]
   (update-in db [:meigens id :completed] not)))

(re-frame/reg-event-db
 ::delete
 (fn [db [event id]]
   (update db :meigens dissoc id)))
