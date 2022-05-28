(ns meigen.subs
  (:require [re-frame.core :as re-frame]))

(re-frame/reg-sub
 ::meigens
 (fn [db]
   (-> db :meigens)))
