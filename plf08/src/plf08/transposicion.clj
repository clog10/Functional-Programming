(ns plf08.transposicion
  (:require [plf08.tabla :as t]))

(defn posiciones
  [xs]
  (vec
   (map
    (fn [c]
      (if (> (t/tabla-columnar c) 75)
        (- (t/tabla-columnar c) 75)
        (t/tabla-columnar c)))
    xs)))

(defn comprobacion-matriz
  [xs acc ys]
  (if (int? (/ (count ys) (count xs)))
    (vec (map vec (partition-all acc ys)))
    (conj (vec (drop-last (partition-all acc ys)))
          (concat (last (partition-all acc ys)) (repeat (count xs) "")))))

(defn transpuesta
  [xs ys]
  (vec (apply map vector (comprobacion-matriz xs (count xs) ys))))

(defn ordenar
  [xs ys]
  (keys (sort-by val < (zipmap (transpuesta xs ys)
                               (posiciones xs)))))

(defn comprobacion
  [xs]
  (vec (map (fn [c] (t/tabla-columnar c)) xs)))