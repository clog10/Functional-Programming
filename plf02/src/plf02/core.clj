(ns plf02.core)

;;Predicados

;;associative?
(defn función-associative?-1
  [a]
  (associative? a))

(defn función-associative?-2
  [a]
  (associative? a))

(defn función-associative?-3
  [a]
  (associative? a))

(función-associative?-1 [1 2 3 4 5 6])
(función-associative?-2 {:a 1 :b 2 :c 3})
(función-associative?-1 [[1 2] [3 4]])

;;boolean?

(defn función-boolean?-1
  [a]
  (boolean? a))

(defn función-boolean?-2
  [a]
  (boolean? a))

(defn función-boolean?-3
  [a]
  (boolean? a))

(función-boolean?-1 true)
(función-boolean?-2 false)
(función-boolean?-3 (> 5 4))

;;char?

(defn función-char?-1
  [a]
  (char? a))

(defn función-char?-2
  [a]
  (char? a))

(defn función-char?-3
  [a]
  (char? a))

(función-char?-1 \a)
(función-char?-2 \♔)
(función-char?-3 (first "Carlos"))

;;coll?

(defn función-coll?-1
  [a]
  (coll? a))

(defn función-coll?-2
  [a]
  (coll? a))

(defn función-coll?-3
  [a]
  (coll? a))

(función-coll?-1 [1 2 3 4 5 6 7])
(función-coll?-2 {:a 1 :b 2 :c 3})
(función-coll?-3 (conj [1 2 3 4 5] 5 4))

;;decimal?

(defn función-decimal?-1
  [a]
  (decimal? a))

(defn función-decimal?-2
  [a]
  (decimal? a))

(defn función-decimal?-3
  [a]
  (decimal? a))

(función-decimal?-1 0.5M)
(función-decimal?-2 (/ 5 2M))
(función-decimal?-3 1.0)

;;double?

(defn función-double?-1
  [a]
  (double? a))

(defn función-double?-2
  [a]
  (double? a))

(defn función-double?-3
  [a]
  (double? a))

(función-double?-1 10.5)
(función-double?-2 (double (/ 10 4)))
(función-double?-3 5.000000000002)

;;float?

(defn función-float?-1
  [a]
  (float? a))

(defn función-float?-2
  [a]
  (float? a))

(defn función-float?-3
  [a]
  (float? a))

(función-float?-1 2.0)
(función-float?-2 (float (/ 5 2)))
(función-float?-3 4.0000000000000001)

;;ident?

(defn función-ident?-1
  [a]
  (ident? a))

(defn función-ident?-2
  [a]
  (ident? a))

(defn función-ident?-3
  [a]
  (ident? a))

(función-ident?-1 :a)
(función-ident?-2 (first (keys {:a 4 :b 5})))
(función-ident?-3 'a)

;;indexed?

(defn función-indexed?-1
  [a]
  (indexed? a))

(defn función-indexed?-2
  [a]
  (indexed? a))

(defn función-indexed?-3
  [a]
  (indexed? a))

(función-indexed?-1 [1 2 3 4 5 6])
(función-indexed?-2 '(1 2 3 4 5))
(función-indexed?-3 {:a 1 :b 2})

;;int?

(defn función-int?-1
  [a]
  (int? a))


(defn función-int?-2
  [a]
  (int? a))

(defn función-int?-3
  [a]
  (int? a))

(función-int?-1 2)
(función-int?-2 (+ 5 6))
(función-int?-3 4020)

;;integer?

(defn función-integer?-1
  [a]
  (integer? a))

(defn función-integer?-2
  [a]
  (integer? a))

(defn función-integer?-3
  [a]
  (integer? a))

(función-integer?-1 10)
(función-integer?-2 (bigint 10))
(función-integer?-3 (first (vals {:a 1 :b 2})))

;;keyword?

(defn función-keyword?-1
  [a]
  (keyword? a))

(defn función-keyword?-2
  [a]
  (keyword? a))

(defn función-keyword?-3
  [a]
  (keyword? a))

(función-keyword?-1 :A)
(función-keyword?-2 :carlos_loaeza)
(función-keyword?-3 (first (keys {:a 4 :b 5})))

;;list?

(defn función-list?-1
  [a]
  (list? a))

(defn función-list?-2
  [a]
  (list? a))

(defn función-list?-3
  [a]
  (list? a))

(función-list?-1 '(1 2 3 4 5 6))
(función-list?-2 (conj '() [1 2 3 4 #{:a :b}]))
(función-list?-3 (first ['(1 2 3) 2 3 4]))

;;map-entry?

(defn función-map-entry?-1
  [a]
  (map-entry? a))

(defn función-map-entry?-2
  [a]
  (map-entry? a))

(defn función-map-entry?-3
  [a]
  (map-entry? a))

(función-map-entry?-1 (first {:a 1 :b 2 :c 3}))
(función-map-entry?-2 (last {:a 1 :b 2 :c 3}))
(función-map-entry?-3 (first (hash-map :a 1 :b 2)))

;;map?

(defn función-map?-1
  [a]
  (map? a))

(defn función-map?-2
  [a]
  (map? a))

(defn función-map?-3
  [a]
  (map? a))

(función-map?-1 {:a 1 :b 2 :c 3})
(función-map?-2 (hash-map :a 1 :b 2))
(función-map?-3 (conj {:a 1 :b 2} [:c 3] [:d 4]))

;;nat-int?

(defn función-nat-int?-1
  [a]
  (nat-int? a))

(defn función-nat-int?-2
  [a]
  (nat-int? a))

(defn función-nat-int?-3
  [a]
  (nat-int? a))

(función-nat-int?-1 0)
(función-nat-int?-2 (+ 5 -5 2 6 4 -10 -8 6))
(función-nat-int?-3 (eval '(+ 5 2 5 1 2)))

;;number?

(defn función-number?-1
  [a]
  (number? a))

(defn función-number?-2
  [a]
  (number? a))

(defn función-number?-3
  [a]
  (number? a))

(función-number?-1 2)
(función-number?-2 (eval '(+ 5 2 5 1 2)))
(función-number?-3 (Integer/parseInt "123"))

;;pos-int?

(defn función-pos-int?-1
  [a]
  (pos-int? a))

(defn función-pos-int?-2
  [a]
  (pos-int? a))

(defn función-pos-int?-3
  [a]
  (pos-int? a))

(función-pos-int?-1 4)
(función-pos-int?-2 (first [10000 5 0 4 0 5]))
(función-pos-int?-3 1040)

;;ratio?

(defn función-ratio?-1
  [a]
  (ratio? a))

(defn función-ratio?-2
  [a]
  (ratio? a))

(defn función-ratio?-3
  [a]
  (ratio? a))

(función-ratio?-1 5/2)
(función-ratio?-2 (/ 5 2))
(función-ratio?-3 (/ (* 5 2) (* 2 3)))

;;rational?

(defn función-rational?-1
  [a]
  (rational? a))

(defn función-rational?-2
  [a]
  (rational? a))

(defn función-rational?-3
  [a]
  (rational? a))

(función-rational?-1 1)
(función-rational?-2 (/ 5 2))
(función-rational?-3 (eval '(+ 5 2 5 1 2)))

;;seq?

(defn función-seq?-1
  [a]
  (seq? a))

(defn función-seq?-2
  [a]
  (seq? a))

(defn función-seq?-3
  [a]
  (seq? a))

(función-seq?-1 (range 4))
(función-seq?-2 '(1 2 3 4 5 6))
(función-seq?-3 (list [1 2 3] [4 5 6]))

;;seqable?

(defn función-seqable?-1
  [a]
  (seqable? a))

(defn función-seqable?-2
  [a]
  (seqable? a))

(defn función-seqable?-3
  [a]
  (seqable? a))

(función-seqable?-1 [1 2 3 4 5 6 7 8])
(función-seqable?-2 "Carlos")
(función-seqable?-3 '())

;;sequential?

(defn función-sequential?-1
  [a]
  (sequential? a))

(defn función-sequential?-2
  [a]
  (sequential? a))

(defn función-sequential?-3
  [a]
  (sequential? a))

(función-sequential?-1 [1 2 3 4 5 6])
(función-sequential?-2 (range 1 10 2))
(función-sequential?-3 '())

;;set?

(defn función-set?-1
  [a]
  (set? a))

(defn función-set?-2
  [a]
  (set? a))

(defn función-set?-3
  [a]
  (set? a))

(función-set?-1 #{:a :b :c})
(función-set?-2 (hash-set :a :b :c))
(función-set?-3 (conj #{} [1 2 3 4 5]))

;;some?

(defn función-some?-1
  [a]
  (some? a))

(defn función-some?-2
  [a]
  (some? a))

(defn función-some?-3
  [a]
  (some? a))

(función-some?-1 4)
(función-some?-2 true)
(función-some?-3 [])

;;string?

(defn función-string?-1
  [a]
  (string? a))

(defn función-string?-2
  [a]
  (string? a))

(defn función-string?-3
  [a]
  (string? a))

(función-string?-1 "Carlos")
(función-string?-2 "")
(función-string?-3 "Programación Funcional")

;;symbol?

(defn función-symbol?-1
  [a]
  (symbol? a))

(defn función-symbol?-2
  [a]
  (symbol? a))

(defn función-symbol?-3
  [a]
  (symbol? a))

(función-symbol?-1 'a)
(función-symbol?-2 'carlos)
(función-symbol?-3 'symbol)

;;vector?

(defn función-vector?-1
  [a]
  (vector? a))

(defn función-vector?-2
  [a]
  (vector? a))

(defn función-vector?-3
  [a]
  (vector? a))

(función-vector?-1 [1 2 3 4])
(función-vector?-2 (vector 1 2 3 4 5 6 7 8 9))
(función-vector?-3 (conj [] #{:a :b :c}))

;;Funciones de Orden Superior

;;drop

(defn función-drop-1
  [a]
  (drop a))

(defn función-drop-2
  [a b]
  (drop a b))

(defn función-drop-3
  [a b]
  (drop a b))

(función-drop-1 (+ 2 1))
(función-drop-2 (+ 5 7) (range 4 25))
(función-drop-3 (- 5 2) [1 2 3 4 5 6 7 8 9])

;;drop-last

(defn función-drop-last-1
  [a]
  (drop-last a))

(defn función-drop-last-2
  [a b]
  (drop-last a b))

(defn función-drop-last-3
  [a b]
  (drop-last a b))

(función-drop-last-1 [1 2 3 4 5 6])
(función-drop-last-2 (- 6 3) '(1 2 3 4 5 6 7 8 9))
(función-drop-last-3 (if (> 5 4) 4 9) (range 1 10))

;;drop-while

(defn función-drop-while-1
  [a]
  (drop-while a))

(defn función-drop-while-2
  [a b]
  (drop-while a b))

(defn función-drop-while-3
  [a b]
  (drop-while a b))


(función-drop-while-1 char?)
(función-drop-while-2 (if (< 9 8) neg? pos?) [1 2 -1 -2 6 8])
(función-drop-while-3 neg? [1 7 9 -3 -5 4 -9 -6 5 -8])

;;every?

(defn función-every?-1
  [a b]
  (every? a b))

(defn función-every?-2
  [a b]
  (every? a b))

(defn función-every?-3
  [a b]
  (every? a b))

(función-every?-1 even? [2 4 6 8 10])
(función-every?-2 int? [5 2 0 7 1 2])
(función-every?-3 (let [r1 (+ 5 3) r2 (- 10 2)] (if (== r1 r2) pos? neg?)) [1 2 3 5 8 5 2])

;;filterv

(defn función-filterv-1
  [a b]
  (filterv a b))

(defn función-filterv-2
  [a b]
  (filterv a b))

(defn función-filterv-3
  [a b]
  (filterv a b))

(función-filterv-2 odd? (range 0 15))
(función-filterv-3 keyword? (keys {:a 1 :b 2}))
(función-filterv-3 (fn [x] (= (count x) 1)) ["a" "aa" "b" "n" "f" "lisp" "clojure" "q" ""])

;;group-by

(defn función-group-by-1
  [a b]
  (group-by a b))

(defn función-group-by-2
  [a b]
  (group-by a b))

(defn función-group-by-3
  [a b]
  (group-by a b))

(función-group-by-1 count ["carlos" "loaeza" "a" "b"])
(función-group-by-2 (juxt first count) ["carlos" "carros" "auto" "armo"])
(función-group-by-3 pos? [5 1 4 7 -2 -9 5 -7 -8 8 -6 -1 0])

;;iterate

(defn función-iterate-1
  [a b]
  (iterate a b))

(defn función-iterate-2
  [a b]
  (iterate a b))

(defn función-iterate-3
  [a b]
  (iterate a b))

(función-iterate-1 (partial + 2) 0)
(función-iterate-2 (partial * 2) 1)
(función-iterate-3 (fn [[a b]] [b (+ a b)]) [1 1])

;;keep

(defn función-keep-1
  [a]
  (keep a))

(defn función-keep-2
  [a b]
  (keep a b))

(defn función-keep-3
  [a b]
  (keep a b))

(función-keep-1 (fn [[a b]] (+ a b)))
(función-keep-2 even? (range 1 10))
(función-keep-3 (fn [[k]] (#{:a :b} k)) {:a 1 :b 2 :c 3})


;;keep-indexed

(defn función-keep-indexed-1
  [a]
  (keep-indexed a))

(defn función-keep-indexed-2
  [a b]
  (keep-indexed a b))

(defn función-keep-indexed-3
  [a b]
  (keep-indexed a b))

(función-keep-indexed-1 #(if (odd? %1) %2))
(función-keep-indexed-2 #(if (odd? %1) %2) [:a :b :c :d :e])
(función-keep-indexed-3 (fn [idx v] (if (pos? v) idx)) [-9 0 29 -7 45 3 -8])

;;map-indexed

(defn función-map-indexed-1
  [a]
  (map-indexed a))

(defn función-map-indexed-2
  [a b]
  (map-indexed a b))

(defn función-map-indexed-3
  [a b]
  (map-indexed a b))

(función-map-indexed-1 hash-map)
(función-map-indexed-2 hash-map "Carlos")
(función-map-indexed-3 (fn [x y] (vector (inc x) y)) ["Carlos" "Gutierrez" "Loaeza"])

;;mapcat

(defn función-mapcat-1
  [a]
  (mapcat a))

(defn función-mapcat-2
  [a b]
  (mapcat a b))

(defn función-mapcat-3
  [a b]
  (mapcat a b))

(función-mapcat-1 (fn [x] [(- x 1) x (+ x 1)]))
(función-mapcat-2 (fn [x] [(- x 1) x (+ x 1)]) [1 2 3 4 5 6 7 8])
(función-mapcat-3 (fn [x] (vector ((juxt inc dec) x))) [1 2 3 4 5 6])

;;mapv

(defn función-mapv-1
  [a b]
  (mapv a b))

(defn función-mapv-2
  [a b c]
  (mapv a b c))

(defn función-mapv-3
  [a b c d]
  (mapv a b c d))

(función-mapv-1 inc [5 6 7 8])
(función-mapv-2 (let [r1 (+ 5 3) r2 (- 10 2)] (if (== r1 r2) + -)) [1 2 3 5 8 5 2] [1 2 3 4 5 8 5 2])
(función-mapv-3 (fn [x y z] [(char x) (char y) (char z)]) (range 97 123) (range 65 91) (range 38 65))

;;merge-with

(defn función-merge-with-1
  [a b c]
  (merge-with a b c))

(defn función-merge-with-2
  [a b c]
  (merge-with a b c))

(defn función-merge-with-3
  [a b c]
  (merge-with a b c))

(función-merge-with-1 + {:a 5 :b 4 :c 8} {:a 5 :b 6 :c 2}) 
(función-merge-with-2 ((fn [x y] (if (< (first (vals x)) (first (vals y))) + -)) {:a 4 :b 5} {:a 1 :c 4}) {:a 4 :b 5 :c 1 :d 3 :x 1 :y 2 :e 3 :f 4} {:a 1 :b 4 :c 2 :d 4 :x 9 :y 3 :e 100})
(función-merge-with-3 into {:a #{1 2 3},   :b #{4 5 6}} {:a #{2 3 7 8}, :c #{1 2 3}}) 

;;not-any?

(defn función-not-any?-1
  [a b]
  (not-any? a b))

(defn función-not-any?-2
  [a b]
  (not-any? a b))

(defn función-not-any?-3
  [a b]
  (not-any? a b))

(función-not-any?-1 odd? [2 4 6])
(función-not-any?-2 not-empty [])
(función-not-any?-3 nil? [true false])

;;not-every?

(defn función-not-every?-1
  [a b]
  (not-every? a b))

(defn función-not-every?-2
  [a b]
  (not-every? a b))

(defn función-not-every?-3
  [a b]
  (not-every? a b))

(función-not-every?-1 odd? [1 2 3])
(función-not-every?-2 even? [1 2 3])
(función-not-every?-3 integer? [1.0 2.0 3.0])

;;partition-by

(defn función-partition-by-1
  [a]
  (partition-by a))

(defn función-partition-by-2
  [a b]
  (partition-by a b))

(defn función-partition-by-3
  [a b]
  (partition-by a b))

(función-partition-by-1 identity)
(función-partition-by-2 identity "Carloss")
(función-partition-by-3 char? "carloss")

;;reduce-kv

(defn función-reduce-kv-1
  [a b c]
  (reduce-kv a b c))

(defn función-reduce-kv-2
  [a b c]
  (reduce-kv a b c))

(defn función-reduce-kv-3
  [a b c]
  (reduce-kv a b c))

(función-reduce-kv-1 (fn [x y z] (assoc x y z)) {} ["Carlos" "Loaeza" "PLF"])
(función-reduce-kv-2 (fn [x y z] (assoc x y z)) {} [10 20 30])
(función-reduce-kv-3 (fn [x y z] (assoc  x y z)) {:a 1 :b 2 :c 3} {:a 5 :b 9})

;;remove

(defn función-remove-1
  [a]
  (remove a))

(defn función-remove-2
  [a b]
  (remove a b))

(defn función-remove-3
  [a b]
  (remove a b))

(función-remove-1 pos?)
(función-remove-2 pos? [1 2 -5 4 -9 -6 -8])
(función-remove-3 even? (range 1 20))

;;reverse

(defn función-reverse-1
  [a]
  (reverse a))

(defn función-reverse-2
  [a]
  (reverse a))

(defn función-reverse-3
  [a]
  (reverse a))

(función-reverse-1 "Carlos")
(función-reverse-2 (range 1 15))
(función-reverse-3 (map (fn [x] [(char x)]) (range 97 123)))

;;some

(defn función-some-1  
  [a b]
  (some a b))

(defn función-some-2
  [a b]
  (some a b))

(defn función-some-3
  [a b]
  (some a b))

(función-some-1 pos? '(1 2 6 -9))
(función-some-2 (let [r1 (+ 5 3) r2 (- 10 2)] (if (== r1 r2) pos? neg?)) [1 2 3 5 8 5 2])
(función-some-3 (fn [x] (even? x)) [1 2 3 4])

;;sort-by

(defn función-sort-by-1
[a b]
  (sort-by a b))

(defn función-sort-by-2
  [a b c]
  (sort-by a b c))

(defn función-sort-by-3
  [a b c]
  (sort-by a b c))

(función-sort-by-1 first [[8 3 4] [1 5 7] [3 2 3]]) 
(función-sort-by-2 val > {:u1 70, :u2 80, :u3 73 :u4 86 :u5 90})
(función-sort-by-3 val ((fn [x y] (if (< (first (vals x)) (first (vals y))) < >)) {:a 4 :b 5} {:a 6 :c 4}) {:u1 70, :u2 80, :u3 73 :u4 86 :u5 90})
 
;;split-with

(defn función-split-with-1
  [a b]
  (split-with a b))

(defn función-split-with-2
  [a b]
  (split-with a b))

(defn función-split-with-3
  [a b]
  (split-with a b))

(función-split-with-1 odd? [5 1 3 5 6 8 10])
(función-split-with-2 map? {:a 5 :b 5})
(función-split-with-3 (partial >= 3) [1 2 3 4 5 7 8])

;;take

(defn función-take-1
  [a]
 (take a))

(defn función-take-2
  [a b]
  (take a b))

(defn función-take-3
  [a b]
  (take a b))

(función-take-1 4)
(función-take-2 5 (range 20))
(función-take-3 6 (drop 5 (range 1 20)))

;;take-last

(defn función-take-last-1
  [a b]
  (take-last a b))

(defn función-take-last-2
  [a b]
  (take-last a b))

(defn función-take-last-3
  [a b]
  (take-last a b))

(función-take-last-1 5 (range 20))
(función-take-last-2 6 (drop 5 (range 1 20)))
(función-take-last-3 5 [1 2 3 4 5 6 7 8 9])

;;take-nth

(defn función-take-nth-1
  [a]
  (take-nth a))

(defn función-take-nth-2
  [a b]
  (take-nth a b))

(defn función-take-nth-3
  [a b]
(take-nth a b))

(función-take-nth-1 5)
(función-take-nth-2 5 (range 21))
(función-take-nth-3 10 (drop-last 20 (range 100)))

;;take-while

(defn función-take-while-1
  [a]
  (take-while a))

(defn función-take-while-2
  [a b]
  (take-while a b))

(defn función-take-while-3
  [a b]
  (take-while a b))

(función-take-while-1 neg?)
(función-take-while-2 neg? [-1 -5 8 -9 -6 9 -2 4 7 -8])
(función-take-while-3 pos-int? [1 5 7 -6])

;;update

(defn función-update-1
  [a b c]
(update a b c))

(defn función-update-2
  [a b c d]
  (update a b c d))

(defn función-update-3
  [a b c d e]
  (update a b c d e))

(función-update-1 [9 2 3 7 6 0 1] 0 inc)
(función-update-2 [9 5 2] 1 + 4)
(función-update-3 [9 5 2 2 4 6] 3 - 4 5)

;;update-in

(defn función-update-in-1
  [a b c]
  (update-in a b c))

(defn función-update-in-2
  [a b c d]
  (update-in a b c d))

(defn función-update-in-3
  [a b c d e]
  (update-in a b c d e))

(función-update-in-1 [{:name "Carlos" :age 22}  {:name "Jesus" :age 13}] [1 :age] inc)
(función-update-in-2 [9 5 2] [1] + 4)
(función-update-in-3 {:name "Carlos" :age 22} [:age] + 5 5)

