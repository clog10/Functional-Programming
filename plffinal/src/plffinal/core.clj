(ns plffinal.core
  (:gen-class)
  (:require [plffinal.tabla :as t]
            [clojure.string :as str]))

(defn convierte-a-vector
  [& args]
  (vec (map char (str/join (concat args)))))

(defn regresa-valores
  [s]
  (let [y (fn [x] (map t/diccionario (convierte-a-vector x)))]
    (y s)))

(defn filtra
  [pred & args]
  (count (filter pred (map char (convierte-a-vector (vec args))))))

(defn sustituye
  [x]
  (reverse (map t/diccionario-sustitucion (map char x))))

(defn cuenta
  ([] [])
  ([k & args]
   (let [arr (fn [p] (= p \^))
         aba (fn [p] (= p \v))
         izq (fn [p] (= p \<))
         der (fn [p] (= p \>))
         norte (filtra arr (vec args))
         sur (filtra aba (vec args))
         este (filtra der (vec args))
         oeste (filtra izq (vec args))]
     ({\^ norte \v sur \< oeste \> este} k))))

;;regresa-al-punto-de-origen?
(defn regresa-al-punto-de-origen?
  [s]
  (cond
    (and (= (cuenta \< s) (cuenta \> s))
         (= (cuenta \^ s) (cuenta \v s)))
    true
    :else false))

(defn regresan-al-punto-de-origen?
  [& args]
  (cond
    (and (= (cuenta \< args) (cuenta \> args))
         (= (cuenta \^ args) (cuenta \v args)))
    true
    :else false))

(defn regreso-al-punto-de-origen
  [xs]
  (cond
    (and (= (cuenta \< xs) (cuenta \> xs))
         (= (cuenta \^ xs) (cuenta \v xs)))
    '()
    :else
    (sustituye xs)))

(defn mismo-punto-final?
  [xs ys]
  (cond
    (and (= (cuenta \< xs ys) (cuenta \> xs ys))
         (= (cuenta \^ xs ys) (cuenta \v xs ys)))
    true
    :else false))

(defn coincidencias
  [xs ys]
  (cond
    (= (cuenta \< xs ys) (cuenta \> xs ys))
    (inc (cuenta \< xs ys))
    (= (cuenta \^ xs ys) (cuenta \v xs ys))
    (inc (cuenta \v xs ys))
    :else false))

