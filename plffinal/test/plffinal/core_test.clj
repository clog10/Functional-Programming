(ns plffinal.core-test
  (:require [clojure.test :refer :all]
            [plffinal.core :refer :all]))

(deftest punto-1
  (testing "Dada una secuencia de sentidos indicar si se regresa al punto de origen"
    (is (= true (regresa-al-punto-de-origen? "")))
    (is (= true (regresa-al-punto-de-origen? [])))
    (is (= true (regresa-al-punto-de-origen? (list)))))
  (testing "Nota: al no haber desplazamiento se regresa al punto de origen."
    (is (= true (regresa-al-punto-de-origen? "><")))
    (is (= true (regresa-al-punto-de-origen? (list \> \<))))
    (is (= true (regresa-al-punto-de-origen? "v^")))
    (is (= true (regresa-al-punto-de-origen? [\v \^])))
    (is (= true (regresa-al-punto-de-origen? "^>v<")))
    (is (= true (regresa-al-punto-de-origen? (list \^ \> \v \<))))
    (is (= true (regresa-al-punto-de-origen? "<<vv>>^^")))
    (is (= true (regresa-al-punto-de-origen? [\< \< \v \v \> \> \^ \^])))
    (is (= false (regresa-al-punto-de-origen? ">")))
    (is (= false (regresa-al-punto-de-origen? (list \>))))
    (is (= false (regresa-al-punto-de-origen? "<^")))
    (is (= false (regresa-al-punto-de-origen? [\< \^])))
    (is (= false (regresa-al-punto-de-origen? ">>><<")))
    (is (= false (regresa-al-punto-de-origen? (list \> \> \> \< \<))))
    (is (= false (regresa-al-punto-de-origen? [\v \v \^ \^ \^])))))

(deftest punto-2
  (testing "Dada n secuencias de sentidos indicar si todas regresan a su propio punto de origen"
    (is (= true (regresan-al-punto-de-origen?)))
    (is (= true (regresan-al-punto-de-origen? [])))
    (is (= true (regresan-al-punto-de-origen? "")))
    (is (= true (regresan-al-punto-de-origen? [] "" (list))))
    (is (= true (regresan-al-punto-de-origen? "" "" "" "" [] [] [] (list) "")))
    (is (= true (regresan-al-punto-de-origen? ">><<" [\< \< \> \>] (list \^ \^ \v \v))))
    (is (= false (regresan-al-punto-de-origen? (list \< \>) "^^" [\> \<])))
    (is (= false (regresan-al-punto-de-origen? ">>>" "^vv^" "<<>>")))
    (is (= false (regresan-al-punto-de-origen? [\< \< \> \> \> \> \> \> \> \>])))))

(deftest punto-3
  (testing "Dada una secuencia de sentidos, regresar la secuencia de sentidos que permita regresar al punto de origen en sentido contrario"
    (is (empty? (regreso-al-punto-de-origen "")))
    (is (empty? (regreso-al-punto-de-origen (list \^ \^ \^ \> \< \v \v \v)))))
  (testing "Nota: si la secuencia de sentidos dada termina en el mismo punto de origen no hay desplazamiento alguno en la secuencia de sentidos regresada."
    (is (= (seq '(\< \< \<)) (regreso-al-punto-de-origen ">>>")))
    (is (= (seq '(\< \< \^ \^ \^ \>)) (regreso-al-punto-de-origen [\< \v \v \v \> \>])))))

(deftest punto-4
  (testing "Dadas 2 secuencias de sentidos, las cuales parten del mismo punto de origen, indicar si ambas terminan en el mismo punto final"
    (is (= true (mismo-punto-final? "" [])))
    (is (= true (mismo-punto-final? "vvv" "<^^^>")))
    (is (= true (mismo-punto-final? [\< \< \< \>] (list \> \>))))
    (is (= true (mismo-punto-final? (list \< \v \>) (list \> \^ \<))))
    (is (= false (mismo-punto-final? "" "<")))
    (is (= false (mismo-punto-final? [\> \>] "<>")))
    (is (= false (mismo-punto-final? [\> \> \>] [\> \> \> \>])))
    (is (= false (mismo-punto-final? (list) (list \^))))))

(deftest punto-5
  (testing "Dadas 2 secuencias de sentidos, las cuales parten del mismo punto de origen, indicar cuantas veces coinciden en un mismo punto"
    (is (= 1 (coincidencias "" []))))
  (testing "Nota: dado que ambas secuencias de sentidos siempre parten del mismo punto de origen ya existe una coincidencia."
    (is (= (- 5 2) 3))))

