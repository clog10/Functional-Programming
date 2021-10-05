(ns plf08.io)

(defn leer
  [r]
  (let [s (slurp r)]
    s))

(defn escribir
  [r s]
  (spit r s))

