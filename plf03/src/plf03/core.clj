(ns plf03.core)

;;Funciones de Orden Superior

;;comp

(defn función-comp-1
  []
  (let [f (fn [x] (dec x))
        g (fn [x] (/ x 2))
        z (comp f g)]
    (z 6)))

(defn función-comp-2
  []
  (let [f (fn [xs] (filter odd? xs))
        g (fn [xs] (map dec xs))
        z (comp g f)]
    (z [11 2 3 4 5 8 9 6 3 2 7 4 5])))

(defn función-comp-3
  []
  (let [f (fn [xs] (drop 5 xs))
        g (fn [xs] (group-by even? xs))
        z (comp g f)]
    (z (range 0 10))))

(defn función-comp-4
  []
  (let [f (fn [xs] (not-any? odd? xs))
        g (fn [xs] (into #{} xs))
        z (comp f g)]
    (z (range 97 123))))

(defn función-comp-5
  []
  (let [f (fn [xs] (into [] (remove pos? xs)))
        g (fn [xs] (reverse xs))
        h (fn [xs] (map inc xs))
        z (comp f g h)]
    (z [1 2 -5 4 -9 -6 -8])))

(defn función-comp-6
  []
  (let [f (fn [x] (inc (inc (dec (inc x)))))
        g (fn [x] (* 10 x))
        z (comp g f)]
    (z 0)))

(defn función-comp-7
  []
  (let [f (fn [x] (inc (inc (dec (inc x)))))
        g (fn [x] (* 10 x))
        h (fn [x] (/ x 2))
        z (comp g h f)]
    (z 0)))

(defn función-comp-8
  []
  (let [f (fn [xs] (sort xs))
        g (fn [xs] (map inc xs))
        h (fn [xs] (into #{} xs))
        z (comp h g f)]
    (z [7 5 2 4 6 1 8 9 3 2 0])))

(defn función-comp-9
  []
  (let [f (fn [x] (str "letra: " x))
        g (fn [x] (char x))
        i (comp f g)]
    (i 99)))

(defn función-comp-10
  []
  (let [f (fn [xs] (map inc xs))
        g (fn [xs] (drop-last 5 xs))
        h (fn [xs] (apply * xs))
        z (comp h g f)]
    (z (range 10 20))))

(defn función-comp-11
  []
  (let [f (fn [xs] (filter even? xs))
        g (fn [xs] (map dec xs))
        z (comp g f)]
    (z '(10 15 20 25 30 35 40 45 50))))

(defn función-comp-12
  []
  (let [f (fn [xs] (map inc xs))
        g (fn [xs] (take (last xs) xs))
        h (fn [xs] (into #{} xs))
        z (comp h f g)]
    (z [10 8 6 7 8 9 5 2 1 4 4])))

(defn función-comp-13
  []
  (let [f (fn [x] (+ x x))
        g (fn [x] (/ x x))
        h (fn [x] (* x x))
        i (fn [x] (- x x))
        z (comp i h f g)]
    (z 2)))

(defn función-comp-14
  []
  (let [f (fn [x] (char x))
        g (fn [x] (+ 10 x))
        z (comp f g)]
    (z 87)))

(defn función-comp-15
  []
  (let [f (fn [xs] (apply + xs))
        g (fn [xs] (sort xs))
        h (fn [xs] (into #{} xs))
        z (comp f g h)]
    (z [10 5 8 9 6 1 2])))

(defn función-comp-16
  []
  (let [f (fn [x] (inc x))
        g (fn [x] (dec x))
        h (fn [x] (* x x))
        z (comp g h f)]
    (z 10)))

(defn función-comp-17
  []
  (let [f (fn [xs] (float? xs))
        g (fn [xs] (not xs))
        h (fn [xs] (list xs))
        z (comp  h g g f)]
    (z 10.3)))

(defn función-comp-18
  []
  (let [f (fn [xs] (not xs))
        g (fn [xs] (filterv false? xs))
        h (fn [xs] (list xs))
        z (comp  h f g)]
    (z '(true false))))

(defn función-comp-19
  []
  (let [f (fn [xs] (double? xs))
        g (fn [xs] (not xs))
        h (fn [xs] (vector xs))
        z (comp  h g f g)]
    (z 5.2)))

(defn función-comp-20
  []
  (let [f (fn [xs] (filter odd? xs))
        g (fn [xs] (map dec xs))
        z (comp g f)]
    (z [7 90 6 -5])))

(función-comp-1)
(función-comp-2)
(función-comp-3)
(función-comp-4)
(función-comp-5)
(función-comp-6)
(función-comp-7)
(función-comp-8)
(función-comp-9)
(función-comp-10)
(función-comp-11)
(función-comp-12)
(función-comp-13)
(función-comp-14)
(función-comp-15)
(función-comp-16)
(función-comp-17)
(función-comp-18)
(función-comp-19)
(función-comp-20)

;;complement

(defn función-complement-1
  []
  (let [f (fn [x] (even? x))
        z (complement f)]
    (z 10)))

(defn función-complement-2
  []
  (let [f (fn [x] (odd? x))
        z (complement f)]
    (z 10)))

(defn función-complement-3
  []
  (let [f (fn [xs] (zero? xs))
        z (complement f)]
    (z 0)))  

(defn función-complement-4
  []
  (let [f (fn [xs] (list? xs))
        z (complement f)]
    (z '(5 9 0 5 2 0 1 4 8 6))))

(defn función-complement-5
  []
  (let [f (fn [xs] (vector? xs))
        z (complement f)]
    (z [2 4 5 6 7 8])))

(defn función-complement-6
  []
  (let [f (fn [xs] (empty? xs))
        z (complement f)]
    (z [2 5 7 9 6 2])))

(defn función-complement-7
  []
  (let [f (fn [xs] (set? xs))
        z (complement f)]
    (z #{3 4 5 2 1 8 0})))

(defn función-complement-8
  []
  (let [f (fn [x] (boolean? x))
        z (complement f)]
    (z true)))

(defn función-complement-9
  []
  (let [f (fn [xs x] (contains? xs x))
        z (complement f)]
    (z #{:a :b :c :d} :a)))

(defn función-complement-10
  []
  (let [f (fn [x] (char? x))
        z (complement f)]
    (z \c)))

(defn función-complement-11
  []
  (let [f (fn [x] (pos? x))
        z (complement f)]
    (z 10)))

(defn función-complement-12
  []
  (let [f (fn [xs] (sorted? (sorted-set xs)))
        z (complement f)]
    (z [8 5 6 2 4 0]))) 

(defn función-complement-13
  []
  (let [f (fn [x] (keyword? x))
        z (complement f)]
    (z (first #{:a :b :c}))))

(defn función-complement-14
  []
  (let [f (fn [xs] (associative? xs))
        z (complement f)]
    (z [1 2 5 4 7 8 9 6 3 1])))

(defn función-complement-15
  []
  (let [f (fn [xs x] (contains? xs x))
        z (complement f)]
    (z {:a 1 :b 2} :b)))

(defn función-complement-16
  []
  (let [f (fn [x] (map-entry? x))
        z (complement f)]
    (z (first (hash-map :a 1 :b 2)))))

(defn función-complement-17
  []
  (let [f (fn [xs] (map? xs))
        z (complement f)]
    (z (conj {:a 1 :b 2} [:c 3] [:d 4]))))

(defn función-complement-18
  []
  (let [f (fn [x] (pos-int? x))
        z (complement f)]
    (z 20)))

(defn función-complement-19
  []
  (let [f (fn [xs] (seq? xs))
        z (complement f)]
    (z (list [1 2 3] [4 5 6]))))

(defn función-complement-20
  []
  (let [f (fn [x] (string? x))
        z (complement f)]
    (z "Carlos")))

(función-complement-1)
(función-complement-2)
(función-complement-3)
(función-complement-4)
(función-complement-5)
(función-complement-6)
(función-complement-7)
(función-complement-8)
(función-complement-9)
(función-complement-10)
(función-complement-11)
(función-complement-12)
(función-complement-13)
(función-complement-14)
(función-complement-15)
(función-complement-16)
(función-complement-17)
(función-complement-18)
(función-complement-19)
(función-complement-20)

;;constantly

(defn función-constantly-1
  []
  (let [xs [\a \b \c]
        z (constantly xs)]
    (z [1 2 3 4 5])))

(defn función-constantly-2
  []
  (let [xs [1 2 3 4 5]
        z (constantly xs)]
    (z 10)))

(defn función-constantly-3
  []
  (let [x 10
        z (constantly x)]
    (z '(1 2 3))))

(defn función-constantly-4
  []
  (let [xs #{10 20 30 40 50}
        z (constantly xs)]
    (z [true false])))

(defn función-constantly-5
  []
  (let [x "Carlos"
        z (constantly x)]
    (z [1 2 3 4 5 6])))

(defn función-constantly-6
  []
  (let [xs (disj #{1 2 3} 4)
        z (constantly xs)]
    (z "PLF")))

(defn función-constantly-7
  []
  (let [x "Programación funcional"
        z (constantly x)]
    (z #{1 2 3 4 5 6 7 8 9})))

(defn función-constantly-8
  []
  (let [xs (vector 1 2 3 4 5 6 7 8 9)
        z (constantly xs)]
    (z "Programación Lógica")))

(defn función-constantly-9
  []
  (let [x true
        z (constantly x)]
    (z [1 2 3 4 5 6])))

(defn función-constantly-10
  []
  (let [xs {:a 1 :b 2 :c 3}
        z (constantly xs)]
    (z "Clojure")))

(defn función-constantly-11
  []
  (let [x "Clojure"
        z (constantly x)]
    (z [8 5 4 1 0])))

(defn función-constantly-12
  []
  (let [x (+ 5 5)
        z (constantly x)]
    (z [1 2 3 4 5])))

(defn función-constantly-13
  []
  (let [f ((fn [xs] (sorted? (sorted-set xs))) [1 2 3 4 5])
        z (constantly f)]
    (z [1 2 3 4 5])))

(defn función-constantly-14
  []
  (let [f ((fn [xs] (into #{} xs)) [1 2 3 4 5 6 7 8 9])
        z (constantly f)]
    (z "Carlos")))

(defn función-constantly-15
  []
  (let [f ((fn [xs] (map dec xs)) '(10 20 30 40 50 60 70 80 90))
        z (constantly f)]
    (z [1 2 3 4 5])))

(defn función-constantly-16
  []
  (let [f ((fn [x] (even? x)) 10)
        z (constantly f)]
    (z [56 5 2 4 0 8])))

(defn función-constantly-17
  []
  (let [f ((fn [xs] (into [] (remove pos? xs))) [1 5 7 -9 -6 -8 -2 5 4 -9])
        z (constantly f)]
    (z [2 5 7 0 0])))

(defn función-constantly-18
  []
  (let [f ((fn [xs] (apply + xs)) [1 2 3 4 5 6 7 8 9])
        z (constantly f)]
    (z "Constantly")))

(defn función-constantly-19
  []
  (let [f ((fn [xs] (sort xs)) [9 5 4 2 1 4 7 8 9 6 5 4 7 8 9 2 1 0 2])
        z (constantly f)]
    (z '(1 2 3 4 5))))

(defn función-constantly-20
  []
  (let [f ((fn [xs] (group-by even? xs)) [1 2 4 6 5 7 9 8 6 3 2 1 5 4])
        z (constantly f)]
    (z 20)))

(función-constantly-1)
(función-constantly-2)
(función-constantly-3)
(función-constantly-4)
(función-constantly-5)
(función-constantly-6)
(función-constantly-7)
(función-constantly-8)
(función-constantly-9)
(función-constantly-10)
(función-constantly-11)
(función-constantly-12)
(función-constantly-13)
(función-constantly-14)
(función-constantly-15)
(función-constantly-16)
(función-constantly-17)
(función-constantly-18)
(función-constantly-19)
(función-constantly-20)

;;every-pred

(defn función-every-pred-1
  []
  (let [f (fn [x] (pos? x))
        z (every-pred f)]
    (z 20)))

(defn función-every-pred-2
  []
  (let [f (fn [xs] (empty? xs))
        z (every-pred f)]
    (z [])))

(defn función-every-pred-3
  []
  (let [f (fn [xs] (map? xs))
        z (every-pred f)]
    (z (conj {:a 1 :b 2} [:c 3] [:d 4]))))

(defn función-every-pred-4
  []
  (let [f (fn [xs] (sorted? (sorted-set xs)))
        z (every-pred f)]
    (z [8 5 6 2 4 0])))

(defn función-every-pred-5
  []
  (let [f (fn [xs] (map even? xs))
        g (fn [xs] (filter even? xs))
        z (every-pred f g)]
    (z [1 2 3 4 5 6 7 8 9])))

(defn función-every-pred-6
  []
  (let [f (fn [x] (pos? x))
        g (fn [x] (int? x))
        z (every-pred f g)]
    (z 10)))

(defn función-every-pred-7
  []
  (let [f (fn [x] (number? x))
        g (fn [x] (zero? x))
        h (fn [x] (double? x))
        i (fn [x] (int? x))
        z (every-pred f g h i)]
    (z 1)))

(defn función-every-pred-8
  []
  (let [f (fn [x] (keyword? x))
        g (fn [x] (char? x))
        z (every-pred g f)]
    (z \a)))

(defn función-every-pred-9
  []
  (let [f (fn [x] (true? x))
        g (fn [x] (some? x))
        z (every-pred f g)]
    (z true)))

(defn función-every-pred-10
  []
  (let [f (fn [xs] (sequential? xs))
        g (fn [xs] (associative? xs))
        h (fn [xs] (vector? xs))
        z (every-pred f g h)]
    (z [1 2 3 4 5 6 7 8 9])))

(defn función-every-pred-11
  []
  (let [f (fn [x] (string? x))
        g (fn [x] (some? x))
        z (every-pred f g)]
    (z "Carlos")))

(defn función-every-pred-12
  []
  (let [f (fn [x] (ident? x))
        g (fn [x] (keyword? x))
        z (every-pred f g)]
    (z (key (first {:a 1 :b 2})))))

(defn función-every-pred-13
  []
  (let [f (fn [x] (boolean? x))
        g (fn [x] (true? x))
        h (fn [x] (some? x))
        z (every-pred f g h)]
    (z true)))

(defn función-every-pred-14
  []
  (let [f (fn [xs] (map even? xs))
        g (fn [xs] (map boolean? xs))
        h (fn [xs] (map true? xs))
        z (every-pred f g h)]
    (z [1 2 3 4 5 6 7 8 9])))

(defn función-every-pred-15
  []
  (let [f (fn [xs] (associative? xs))
        g (fn [xs] (map? xs))
        h (fn [xs] (keyword? (key (first xs))))
        i (fn [xs x] (contains? xs x))
        z (every-pred f g h i)]
    (z {:a 1 :b 2 :c 3 :d 4 :e 5} :a)))

(defn función-every-pred-16
  []
  (let [f (fn [x] (pos? x))
        g (fn [x] (rational? x))
        h (fn [x] (ratio? x))
        z (every-pred f g h)]
    (z 22/7)))

(defn función-every-pred-17
  []
  (let [f (fn [xs] (empty? xs))
        g (fn [xs] (vector? xs))
        z (every-pred f g)]
    (z [])))

(defn función-every-pred-18
  []
  (let [f (fn [x] (symbol? x))
        z (every-pred f)]
    (z 'a)))

(defn función-every-pred-19
  []
  (let [f (fn [xs] (list? xs))
        g (fn [xs] (sequential? xs))
        z (every-pred f g)]
    (z '(1 2 3 4 5 6 7 8 9 0))))

(defn función-every-pred-20
  []
  (let [f (fn [xs] (seq? (seq xs)))
        g (fn [xs] (vector? xs))
        z (every-pred f g)]
    (z [1 2 3 4 5 6])))

(función-every-pred-1)
(función-every-pred-2)
(función-every-pred-3)
(función-every-pred-4)
(función-every-pred-5)
(función-every-pred-6)
(función-every-pred-7)
(función-every-pred-8)
(función-every-pred-9)
(función-every-pred-10)
(función-every-pred-11)
(función-every-pred-12)
(función-every-pred-13)
(función-every-pred-14)
(función-every-pred-15)
(función-every-pred-16)
(función-every-pred-17)
(función-every-pred-18)
(función-every-pred-19)
(función-every-pred-20)

;;fnil

(defn función-fnil-1
  []
  (let [f (fn [x] (inc x))
        z (fnil f 0)]
    (z nil)))

(defn función-fnil-2
  []
  (let [f (fn [x] (dec x))
        z (fnil f 1)]
    (z nil)))

(defn función-fnil-3
  []
  (let [f (fn [x y] (if (> x y) (+ x y) (- x y)))
        z (fnil f 7)]
    (z nil 6))) 

(defn función-fnil-4
  []
  (let [f (fn [xs ys] (conj [] xs ys))
        z (fnil f '(1 2 3 4))]
    (z nil '(5 6 7 8))))

(defn función-fnil-5
  []
  (let [f (fn [w x y] (+ w x y))
        z (fnil f 2 4)]
    (z nil nil 6)))

(defn función-fnil-6
  []
  (let [f (fn [xs] (keys xs))
        z (fnil f {:a 2 :b 3 :c 4})]
    (z nil)))

(defn función-fnil-7
  []
  (let [f (fn [x y] (- x y))
        z (fnil f 5)]
    (z nil 5)))

(defn función-fnil-8
  []
  (let [f (fn [xs ys] (map + xs ys))
        z (fnil f [1 2 3 4] [5 6 7 8])]
    (z nil nil)))

(defn función-fnil-9
  []
  (let [f (fn [x] (keyword? x))
        z (fnil f :a)]
    (z nil)))

(defn función-fnil-10
  []
  (let [f (fn [xs] (into [] (remove pos? xs)))
        z (fnil f [1 2 -5 4 -9 -6 -8])]
    (z nil)))

(defn función-fnil-11
  []
  (let [f (fn [x] (inc (inc (dec (inc x)))))
        z (fnil f 5)]
    (z nil)))

(defn función-fnil-12
  []
  (let [f (fn [xs x] (contains? xs x))
        z (fnil f {:a 1 :b 2})]
    (z nil :b)))

(defn función-fnil-13
  []
  (let [f (fn [xs x y] (conj xs x y))
        z (fnil f [1 2 3 4 5])]
    (z nil 6 7)))

(defn función-fnil-14
  []
  (let [f (fn [w x y] (if (> w y) (+ w x y) (- w x y)))
        z (fnil f 5)]
    (z nil 4 3)))

(defn función-fnil-15
  []
  (let [f (fn [xs ys] (filter pos? (map - xs ys)))
        z (fnil f [1 2 3 4] [6 1 8 9])]
    (z nil nil)))

(defn función-fnil-16
  []
  (let [f (fn [xs ys] (count (into xs ys)))
        z (fnil f [1 2 3 4 5])]
    (z nil [6 7 8 9 0]))) 

(defn función-fnil-17
  []
  (let [f (fn [xs] (map char xs))
        z (fnil f (range 97 123))]
    (z nil)))

(defn función-fnil-18
  []
  (let [f (fn [xs ys] (conj [] (map char xs) (map char ys)))
        z (fnil f (range 65 91))]
    (z (range 97 123) nil)))

(defn función-fnil-19
  []
  (let [f (fn [xs x] (and (>= x (first xs)) (<= x (last xs))))
        z (fnil f #{6 11 7 20 1 15 12 9 13})]
    (z nil 10)))

(defn función-fnil-20
  []
  (let [f (fn [x] (string? x))
        z (fnil f "Carlos")]
    (z nil)))

(función-fnil-1)
(función-fnil-2)
(función-fnil-3)
(función-fnil-4)
(función-fnil-5)
(función-fnil-6)
(función-fnil-7)
(función-fnil-8)
(función-fnil-9)
(función-fnil-10)
(función-fnil-11)
(función-fnil-12)
(función-fnil-13)
(función-fnil-14)
(función-fnil-15)
(función-fnil-16)
(función-fnil-17)
(función-fnil-18)
(función-fnil-19)
(función-fnil-20)

;;juxt

(defn función-juxt-1
  []
  (let [f (fn [x] (count x))
        z (juxt f)]
    (z "Clojure is a functional language")))

(defn función-juxt-2
  []
  (let [f (fn [x] (first x))
        z (juxt f)]
    (z "Carlos")))

(defn función-juxt-3
  []
  (let [f (fn [xs] (map boolean? xs))
        g (fn [xs] (filterv false? xs))
        h (fn [xs] (list xs))
        z (juxt h f g)]
    (z '(true false)))) 

(defn función-juxt-4
  []
  (let [f (fn [xs] (empty? xs))
        g (fn [xs] (vector? xs))
        z (juxt f g)]
    (z [])))

(defn función-juxt-5
  []
  (let [f (fn [xs] (filter odd? xs))
        g (fn [xs] (map dec xs))
        z (juxt g f)]
    (z [11 2 3 4 5 8 9 6 3 2 7 4 5])))

(defn función-juxt-6
  []
  (let [f (fn [xs] (associative? xs))
        g (fn [xs] (map? xs))
        h (fn [xs] (keyword? (key (first xs))))
        z (juxt h g f)]
    (z {:a 1 :b 2 :c 3 :d 4 :e 5})))

(defn función-juxt-7
  []
  (let [f (fn [xs] (coll? xs))
        g (fn [xs] (empty? xs))
        h (fn [xs] (vector? xs))
        z (juxt h g f)] 
    (z [2 5 4 6 3]))) 

(defn función-juxt-8
  []
  (let [f (fn [x] (inc x))
        g (fn [x] (dec x))
        h (fn [x] (* x x))
        z (juxt g h f)]
    (z 10)))

(defn función-juxt-9
  []
  (let [f (fn [x] (pos? x))
        g (fn [x] (rational? x))
        h (fn [x] (ratio? x))
        z (juxt f g h)]
    (z 22/7)))

(defn función-juxt-10
  []
  (let [f (fn [x] (number? x))
        g (fn [x] (zero? x))
        h (fn [x] (double? x))
        i (fn [x] (int? x))
        z (juxt f g h i)]
    (z 1)))

(defn función-juxt-11
  []
  (let [f (fn [x] (+ x x))
        g (fn [x] (/ x x))
        h (fn [x] (* x x))
        i (fn [x] (- x x))
        z (juxt h f i g)]
    (z 2)))

(defn función-juxt-12
  []
  (let [f (fn [xs] (filter odd? xs))
        g (fn [xs] (map dec xs))
        z (juxt g f)]
    (z [7 90 6 -5])))

(defn función-juxt-13
  []
  (let [f (fn [xs] (map inc xs))
        g (fn [xs] (take (last xs) xs))
        h (fn [xs] (into #{} xs))
        z (juxt f g h)]
    (z [10 8 6 7 8 9 5 2 1 4 4])))

(defn función-juxt-14
  []
  (let [f (fn [x] (pos? x))
        g (fn [x] (int? x))
        z (juxt f g)]
    (z 10)))

(defn función-juxt-15
  []
  (let [f (fn [xs] (sequential? xs))
        g (fn [xs] (associative? xs))
        h (fn [xs] (vector? xs))
        z (juxt f g h)]
    (z [1 2 3 4 5 6 7 8 9])))

(defn función-juxt-16
  []
  (let [f (fn [xs] (apply + xs))
        g (fn [xs] (sort xs))
        h (fn [xs] (into #{} xs))
        z (juxt f g h)]
    (z [10 5 8 9 6 1 2])))

(defn función-juxt-17
  []
  (let [f (fn [xs] (drop 5 xs))
        g (fn [xs] (group-by even? xs))
        z (juxt g f)]
    (z (range 0 10))))

(defn función-juxt-18
  []
  (let [f (fn [x] (inc (inc (dec (inc x)))))
        g (fn [x] (* 10 x))
        h (fn [x] (/ x 2))
        z (juxt f g h)]
    (z 1)))

(defn función-juxt-19
  []
  (let [f (fn [xs] (into [] (remove pos? xs)))
        g (fn [xs] (reverse xs))
        h (fn [xs] (map inc xs))
        z (juxt f g h)]
    (z [1 2 -5 4 -9 -6 -8])))

(defn función-juxt-20
  []
  (let [f (fn [xs] (list? xs))
        z (juxt f)]
    (z '(5 9 0 5 2 0 1 4 8 6))))

(función-juxt-1)
(función-juxt-2)
(función-juxt-3)
(función-juxt-4)
(función-juxt-5)
(función-juxt-6)
(función-juxt-7)
(función-juxt-8)
(función-juxt-9)
(función-juxt-10)
(función-juxt-11)
(función-juxt-12)
(función-juxt-13)
(función-juxt-14)
(función-juxt-15)
(función-juxt-16)
(función-juxt-17)
(función-juxt-18)
(función-juxt-19)
(función-juxt-20)

;;partial

(defn función-partial-1
  []
  (let [f (fn [w x y] (hash-set w x y))
        z (partial f)]
    (z 10 20 30)))

(defn función-partial-2
  []
  (let [f (fn [x y] (if (> x y) (+ x y) (- x y)))
        z (partial f 10)]
    (z 20)))

(defn función-partial-3
  []
  (let [f (fn [x] (inc x))
        z (partial f)]
    (z 10)))

(defn función-partial-4
  []
  (let [f (fn [xs x] (contains? xs x))
        z (partial f {:a 1 :b 2})]
    (z :b)))

(defn función-partial-5
  []
  (let [f (fn [v w x y] (+ v w x y))
        z (partial f 5 4 2)]
    (z 1)))

(defn función-partial-6
  []
  (let [f (fn [xs ys zs] (conj [] xs ys zs))
        z (partial f [1 2 3])]
    (z [4 5 6] [7 8 9])))

(defn función-partial-7
  []
  (let [f (fn [xs ys] (into xs ys))
        z (partial f [])]
    (z [3 4])))

(defn función-partial-8
  []
  (let [f (fn [xs] (map char xs))
        z (partial f)]
    (z (range 97 123))))

(defn función-partial-9
  []
  (let [f (fn [xs ys] (conj [] (map char xs) (map char ys)))
        z (partial f (range 97 123))]
    (z (range 65 91))))

(defn función-partial-10
  []
  (let [f (fn [xs ys] (map + xs ys))
        z (partial f)]
    (z [1 2 3 4 5] [6 7 8 9 0])))

(defn función-partial-11
  []
  (let [f (fn [w x y] (if (> w y) (+ w x y) (- w x y)))
        z (partial f 5)]
    (z 8 4)))

(defn función-partial-12
  []
  (let [f (fn [v w x y] (if (> w y) (* v w x y) (/ v w x y)))
        z (partial f 20 4)]
    (z 1 2)))

(defn función-partial-13
  []
  (let [f (fn [xs ys] (map + xs ys))
        z (partial f)]
    (z '(10 20 30 40) '(50 60 70 80))))

(defn función-partial-14
  []
  (let [f (fn [ws xs ys] (filter pos? (map + ws (map - xs ys))))
        z (partial f [4 2 3])]
    (z [7 8 9] [4 5 6])))

(defn función-partial-15
  []
  (let [f (fn [xs] (keys xs))
        z (partial f {:a 1 :b 2 :c 3})]
    (z)))

(defn función-partial-16
  []
  (let [f (fn [xs] (vals xs))
        z (partial f)]
    (z {:a 1 :b 2 :c 3})))

(defn función-partial-17
  []
  (let [f (fn [ws xs ys] (concat ws xs ys))
        z (partial f #{10 20 30})]
    (z [40 50 60] '(70 80 90))))

(defn función-partial-18
  []
  (let [f (fn [xs x] (and (>= x (first xs)) (<= x (last xs))))
        z (partial f #{10 20 30 40 50 60})]
    (z 10)))

(defn función-partial-19
  []
  (let [f (fn [xs ys] (shuffle (map + xs ys)))
        z (partial f [10 20 30 40])]
    (z [50 60 70 80])))

(defn función-partial-20
  []
  (let [f (fn [xs ys w x y] (cons w (cons x (cons y (into xs ys)))))
        z (partial f [1 2 3 4] [5 6 7 8])]
    (z 10 20 30)))

(función-partial-1)
(función-partial-2)
(función-partial-3)
(función-partial-4)
(función-partial-5)
(función-partial-6)
(función-partial-7)
(función-partial-8)
(función-partial-9)
(función-partial-10)
(función-partial-11)
(función-partial-12)
(función-partial-13)
(función-partial-14)
(función-partial-15)
(función-partial-16)
(función-partial-17)
(función-partial-18)
(función-partial-19)
(función-partial-20)

;;some-fn

(defn función-some-fn-1
  []
  (let [f (fn [x] (even? x))
        z (some-fn f)]
    (z 2)))

(defn función-some-fn-2
  []
  (let [f (fn [x] (number? x))
        g (fn [x] (pos? x))
        h (fn [x] (even? x))
        z (some-fn f g h)]
    (z 6)))

(defn función-some-fn-3
  []
  (let [f (fn [x] (number? x))
        g (fn [x] (zero? x))
        h (fn [x] (double? x))
        i (fn [x] (int? x))
        z (some-fn f g h i)]
(z 2)))

(defn función-some-fn-4
  []
  (let [f (fn [xs] (sequential? xs))
        g (fn [xs] (associative? xs))
        h (fn [xs] (vector? xs))
        z (some-fn f g h)]
    (z [1 2 3 4 5 6 7 8 9])))

(defn función-some-fn-5
  []
  (let [f (fn [xs] (list? xs))
        g (fn [xs] (sequential? xs))
        z (some-fn f g)]
    (z '(1 2 3 4 5 6 7 8 9 0))))

(defn función-some-fn-6
  []
  (let [f (fn [x] (keyword? x))
        g (fn [x] (char? x))
        z (some-fn g f)]
    (z \a)))

(defn función-some-fn-7
  []
  (let [f (fn [xs] (associative? xs))
        g (fn [xs] (map? xs))
        h (fn [xs] (keyword? (key (first xs))))
        i (fn [xs x] (contains? xs x))
        z (some-fn f g h i)]
    (z {:a 1 :b 2 :c 3 :d 4 :e 5} :a)))

(defn función-some-fn-8
 []
  (let [f (fn [x] (boolean? x))
        g (fn [x] (true? x))
        h (fn [x] (some? x))
        z (some-fn f g h)]
    (z true)))

(defn función-some-fn-9
  []
  (let [f (fn [xs] (seq? (seq xs)))
        g (fn [xs] (vector? xs))
        z (some-fn f g)]
    (z [1 2 3 4 5 6])))

(defn función-some-fn-10
[]
  (let [f (fn [xs] (map even? xs))
        g (fn [xs] (map boolean? xs))
        h (fn [xs] (map true? xs))
        z (some-fn f g h)]
    (z [1 2 3 4 5 6 7 8 9])))

(defn función-some-fn-11
  []
  (let [f (fn [xs] (sorted? (sorted-set xs)))
        z (some-fn f)]
    (z [8 5 6 2 4 0])))

(defn función-some-fn-12
  []
  (let [f (fn [x] (pos? x))
        g (fn [x] (rational? x))
        h (fn [x] (ratio? x))
        z (some-fn f g h)]
    (z 22/7)))

(defn función-some-fn-13
  []
   (let [f (fn [xs] (map even? xs))
         g (fn [xs] (filter even? xs))
         z (some-fn f g)]
     (z [1 2 3 4 5 6 7 8 9])))

(defn función-some-fn-14
  []
  (let [f (fn [xs] (empty? xs))
        g (fn [xs] (vector? xs))
        z (some-fn f g)]
    (z [])))

(defn función-some-fn-15
  []
  (let [f (fn [x] (pos? x))
        z (some-fn f)]
    (z 20)))

(defn función-some-fn-16
  []
  (let [f (fn [x] (string? x))
        g (fn [x] (char? x))
        z (some-fn f g)]
(z "Carlos de Jesus")))

(defn función-some-fn-17
  []
  (let [f (fn [xs] (map char? (map char xs)))
        z (some-fn f)]
    (z (range 97 123))))

(defn función-some-fn-18
  []
  (let [f (fn [xs] (map neg-int? xs))
        z (some-fn f)]
    (z '(-8 5 4 -1 2 3 -8 4 9 -3 -8 -7 1 -3 -8 8 9))))

(defn función-some-fn-19
[]
  (let [f (fn [xs] (filter pos? xs))
        g (fn [xs] (map int? xs))
        z (some-fn g f)]
 (z [-1 1 -2 2 3 -3 4 -4 5 -5 6 -6 7 -7 8 -8 9 -9]))) 

(defn función-some-fn-20
  []
  (let [f (fn [xs] (map number? xs))
        z (some-fn f)] 
    (z [5 8 4 3 6 7])))  

(función-some-fn-1)
(función-some-fn-2)
(función-some-fn-3)
(función-some-fn-4)
(función-some-fn-5)
(función-some-fn-6)
(función-some-fn-7)
(función-some-fn-8)
(función-some-fn-9)
(función-some-fn-10)
(función-some-fn-11)
(función-some-fn-12)
(función-some-fn-13)
(función-some-fn-14)
(función-some-fn-15)
(función-some-fn-16)
(función-some-fn-17)
(función-some-fn-18) 
(función-some-fn-19)
(función-some-fn-20)

