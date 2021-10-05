(ns plf08.core
  (:gen-class)
  (:require [plf08.tabla :as t]
            [plf08.io :as io]
            [plf08.transposicion :as tran]
            [clojure.string :as string]))

(defn cifrado-polibio
  [r s]
  (io/escribir s (string/join (map t/tabla-polibio (io/leer r)))))
(cifrado-polibio "resources/cifrar-polibio.txt" "resources/cifrado.txt")

(defn descifrado-polibio
  [r s]
  (io/escribir s (string/join (map t/tabla-polibio (vec (map (partial apply str)
                                                             (partition-all 2 (io/leer r))))))))
(descifrado-polibio "resources/descifrar-polibio.txt" "resources/descifrado.txt")

(defn cifrado-transposición
  [xs ys zs]
  (io/escribir zs (cond (or (empty? xs) (empty? (io/leer ys))) "Debe ingresar una clave y una cadena"
                        (some nil? (tran/comprobacion xs)) "Una caracter de la clave no fue encontrado"
                        :else (string/join (flatten (tran/ordenar xs (io/leer ys)))))))

(defn descifrado-transposición
  [xs ys zs]
  (io/escribir zs (string/join
                   (flatten
                    (apply
                     map
                     vector
                     (keys
                      (sort-by
                       val
                       <
                       (zipmap
                        (tran/comprobacion-matriz xs (inc (count xs)) (io/leer ys))
                        (tran/posiciones xs)))))))))

(cifrado-transposición "canción" "resources/cifrar-transposicion.txt" "resources/cifrado-t-a.txt")
(cifrado-transposición "CANCIÓN" "resources/cifrar-transposicion.txt" "resources/cifrado-t-b.txt")
(cifrado-transposición "cAnCiÓn" "resources/cifrar-transposicion.txt" "resources/cifrado-t-c.txt")

(descifrado-transposición "cat" "resources/descifrar-transposicion.txt" "resources/descifrado-t-a.txt")

(defn -main
  ([a b c] [(if (= a "cifrar")
              (cifrado-polibio b c)
              (descifrado-polibio b c))])
  ([a b c d] [(if (= a "cifrar")
                (cifrado-transposición b c d)
                (descifrado-transposición b c d))]))

(-main "descifrar" "resources/descifrar-polibio.txt" "resources/descifrado.txt")
(-main "descifrar" "cat" "resources/descifrar-transposicion.txt" "resources/descifrado-t-a.txt")