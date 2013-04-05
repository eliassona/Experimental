(ns Experimental.core
  (:require [clojure.core.reducers :as r]))



(defn mymap [f c]
  (loop [acc []
         coll c]
    (if (empty? coll)
      acc
      (recur (conj acc (f (first coll))) (rest coll)))))


(defn mapping [f]
  (fn [f1]
    (fn [result input]
      (f1 result (f input)))))