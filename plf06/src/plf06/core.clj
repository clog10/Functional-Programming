(ns plf06.core
  (:gen-class))

(def diccionario 
  {\@ \7
   \` \3
   \! \.
   \A \K
   \a \k
   \Á \L
   \á \l
   \" \/
   \B \M
   \b \m
   \# \:
   \C \N
   \c \n
   \$ \;
   \D \Ñ
   \d \ñ
   \% \<
   \E \O
   \e \o
   \& \=
   \F \P
   \f \p
   \' \>
   \G \Q
   \g \q
   \( \?
   \H \R
   \h \r
   \) \@
   \I \S
   \i \s
   \É \Ó
   \é \ó
   \* \[
   \J \U
   \j \u
   \+ \\
   \K \Ú
   \k \ú
   \, \]
   \L \Ü
   \l \ü
   \- \^
   \M \V
   \m \v
   \Í \T
   \í \t
   \. \_
   \N \W
   \n \w
   \/ \`
   \O \Y
   \o \y
   \0 \)
   \P \a
   \p \0
   \1 \*
   \Q \á
   \q \1
   \Ñ \X
   \ñ \x
   \2 \+
   \R \b
   \r \2
   \3 \,
   \S \c
   \s \3
   \Ó \Z
   \ó \z
   \4 \-
   \T \d
   \t \4
   \5 \$
   \U \e
   \u \!
   \6 \%
   \V \g
   \v \$
   \7 \&
   \W \h
   \w \%
   \8 \'
   \X \i
   \x \&
   \9 \(
   \Y \í
   \y \'
   \: \{
   \Z \j
   \z \(
   \Ú \é
   \ú \"
   \; \|
   \[ \8
   \{ \4
   \< \}
   \\ \9
   \| \!
   \Ü \f
   \ü \#
   \= \~
   \] \0
   \} \"
   \> \5
   \^ \1
   \~ \#
   \? \6
   \_ \2})

(defn obtener-valor
 [c]
  (let [v (diccionario c)]
    (if (char? v) v c)))

(defn rot-13
  [s]
  (cond
    (= (first (rest s)) \space) (apply str (first s) (apply str (map obtener-valor (rest s))))
    (contains? (into #{} s) \space) (apply str (map obtener-valor s))
    :else
    (apply str (map obtener-valor (apply str (subs s 0 (- (count s) 3)) " " (subs s (- (count s) 3) (count s)))))))

(rot-13 "Canción #72")
(rot-13 (apply str "Canción" "#72"))
(rot-13 (apply str "Can" "ción" "#72"))
(rot-13 (apply str "Can" "ción" "#" "72"))
(rot-13 "c AN CIÓN # 7 2")

(defn -main
  [& args]
  (if (empty? args)
    (println "No ingresaste nada, Ingresa al menos un argumento")
    (println (rot-13 (apply str args)))))

