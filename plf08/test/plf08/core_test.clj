(ns plf08.core-test
  (:require [clojure.test :refer :all]
            [plf08.core :refer :all]
            [plf08.io :refer :all]))

(deftest impresion
  (testing "No imprime nada, solo en el archivo de texto"
    (is (= nil (cifrado-polibio "resources/cifrar-polibio.txt" "resources/cifrado.txt")))
    (is (= nil (descifrado-polibio "resources/descifrar-polibio.txt" "resources/descifrado.txt")))
    (is (= nil (cifrado-transposición "canción" "resources/cifrar-transposicion.txt" "resources/cifrado-t-a.txt")))
    (is (= nil (descifrado-transposición "cat" "resources/descifrar-transposicion.txt" "resources/descifrado-t-a.txt")))))

(deftest contenido
  (testing "Comprobando contenido de los archivos"
    (is (= (leer "resources/cifrado.txt") "♜♛♜♜♝♜♞♝♞♘♝♞"))
    (is (= (leer "resources/descifrado.txt") "Carlos"))
    (is (= (leer "resources/cifrado-t-a.txt") "aepsanfdraaro"))
    (is (= (leer "resources/cifrado-t-b.txt") "aepsanfdraaro"))
    (is (= (leer "resources/cifrado-t-b.txt") "aepsanfdraaro"))
    (is (= (leer "resources/descifrado-t-a.txt") "Hola a todos"))))

(deftest no-vacios
  (testing "Comprobando que no estén vacios los archivos a leer"
    (is (= false (empty? "resources/cifrar-polibio.txt")))
    (is (= false (empty? "resources/descifrar-polibio.txt")))
    (is (= false (empty? "resources/cifrar-transpocision.txt")))
    (is (= false (empty? "resources/descifrar-transposicion.txt")))))