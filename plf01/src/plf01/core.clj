(ns plf01.core)
;;<
(defn función-<-1
  [a]
  (< a))

(defn función-<-2
  [a b]
  (< a b))

(defn función-<-3
  [a b c]
  (< a b c))

(función-<-1 5)
(función-<-2 2 4)
(función-<-3 2 4 5)

;;<=
(defn función-<=-1
  [a]
  (<= a))

(defn función-<=-2
  [a b]
  (<= a b))

(defn función-<=-3
  [a b c]
  (<= a b c))

(función-<=-1 5)
(función-<=-2 2 2)
(función-<=-3 5 8 8)

;;==
(defn función-==-1
  [a]
  (== a))

(defn función-==-2
  [a b]
  (== a b))

(defn función-==-3
  [a b c]
  (== a b c))

(función-==-1 5)
(función-==-2 4 4)
(función-==-3 5 5 5)

;;>
(defn función->-1
  [a]
  (> a))

(defn función->-2
  [a b]
  (> a b))

(defn función->-3
  [a b c]
  (> a b c))

(función->-1 5)
(función->-2 4 2)
(función->-3 5 4 2)

;;>=
(defn función->=-1
  [a]
  (>= a))

(defn función->=-2
  [a b]
  (>= a b))

(defn función->=-3
  [a b c]
  (>= a b c))

(función->=-1 5)
(función->=-2 2 2)
(función->=-3 8 8 5)

;;assoc
(defn función-asocc-1
  [a b c]
  (assoc a b c))

(defn función-asocc-2
  [a b c d e]
  (assoc a b c d e))

(defn función-asocc-3
  [a b c d e f g]
  (assoc a b c d e f g))

(función-asocc-1 {} :key1 "Carlos")
(función-asocc-2 {:key1 "Nombre" :key2 "Apellidos"} :key1 "Carlos" :key2 "Loaeza")
(función-asocc-3 {:key1 "Nombre" :key2 "Apellidos"} :key1 "Carlos" :key2 "Loaeza" :key3 "PLF")

;;assoc-in
(defn función-asocc-in-1
  [a b c]
  (assoc-in a b c))

(defn función-asocc-in-2
  [a b c]
  (assoc-in a b c))

(defn función-asocc-in-3
  [a b c]
  (assoc-in a b c))

(función-asocc-in-1 {:nombre "nombre" :apellido "apellido"} [:nombre] "Carlos")
(función-asocc-in-2 {:nombre "nombre" :apellido "apellido"} [2] {:nombre "Carlos" :apellido "Loaeza"})
(función-asocc-in-3 {:nombre "nombre" :apellido "apellido"} [3] {:nombre "Carlos" :apellido "Loaeza" :materia "PLF"})

;;concat
(defn función-concat-1
  []
  (concat))

(defn función-concat-2
  [a]
  (concat a))

(defn función-concat-3
  [a b]
  (concat a b))

(función-concat-1)
(función-concat-2 "Carlos")
(función-concat-3 "Carlos" "Loaeza")

;;conj

(defn función-conj-1
  []
  (conj))

(defn función-conj-2
  [a b]
  (conj a b))

(defn función-conj-3
  [a b c]
  (conj a b c))

(función-conj-1)
(función-conj-2 [2 3 4 5 6 7] 5)
(función-conj-3 [2 3 4 5 6 7] 5 8)

;;cons 

(defn función-cons-1
  [a b]
  (cons a b))

(defn función-cons-2
  [a b]
  (cons a b))

(defn función-cons-3
  [a b]
  (cons a b))

(función-cons-1 100 '(1 2 3 4 5 6 7 8 9))
(función-cons-2 [1 2 3 4 5] [1 2 3 4 5 6 7 8 9])
(función-cons-3 [1 4 5] (cons '(1 8 9) [1 2 3 4 5 6 7 8 9]))

;;conains?

(defn función-contains?-1
  [a b]
  (contains? a b))

(defn función-contains?-2
  [a b]
  (contains? a b))

(defn función-contains?-3
  [a b]
  (contains? a b))

(función-contains?-1 [1 2 3 4 5 6 7 8] 5)
(función-contains?-2 {:nombre "Carlos" :apellido "Loaeza"} :nombre)
(función-contains?-3 "a" 0)

;;count

(defn función-count-1
  [a]
  (count a))

(defn función-count-2
  [a]
  (count a))

(defn función-count-3
  [a]
  (count a))

(función-count-1 nil)
(función-count-2 [1 2 3 4 5 6 7 8 9 0])
(función-count-3 {:nombre "Carlos" :apellido "Loaeza" :materia "plf"})

;;disj

(defn función-disj-1
  [a]
  (disj a))

(defn función-disj-2
  [a b]
  (disj a b))

(defn función-disj-3
  [a b c]
  (disj a b c))

(función-disj-1 (hash-set 1 2 3))
(función-disj-2 (hash-set 1 2 3) 3)
(función-disj-3 (hash-set 1 2 3) 1 3)

;;dissoc

(defn función-dissoc-1
  [a]
  (dissoc a))

(defn función-dissoc-2
  [a b]
  (dissoc a b))

(defn función-dissoc-3
  [a b c]
  (dissoc a b c))

(función-dissoc-1 {:a 1 :b 2 :c 3})
(función-dissoc-2 {:a 1 :b 2 :c 3} :b)
(función-dissoc-3 {:a 1 :b 2 :c 3} :b :c)

;;distinct

(defn función-distinct-1
  []
  (distinct))

(defn función-distinct-2
  [a]
  (distinct a))

(defn función-distinct-3
  [a]
  (distinct a))

(función-distinct-1)
(función-distinct-2 [1 2 3 1 2 3 4 5 6 1 2 3 8 9 5 6 7 8])
(función-distinct-3 [2/2 1 2 3 6/3 4 5 6])

;;distinct?

(defn función-distinct?-1
  [a]
  (distinct? a))

(defn función-distinct?-2
  [a b]
  (distinct? a b))

(defn función-distinct?-3
  [a b c]
  (distinct? a b c))

(función-distinct?-1 [1 2 3])
(función-distinct?-2 [1 2 3] [4 5 6])
(función-distinct?-3 [1 2 3] [4 5 6] [7 8 9])

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

(función-drop-last-1 [1 2 3 4 5 6 7 8 9])
(función-drop-last-2 2 [1 2 3 4 5 6])
(función-drop-last-3 2 {:nombre "Carlos" :apellido1 "Gutierrez" :apellido2 "Loaeza"})

;;empty

(defn función-empty-1
  [a]
  (empty a))

(defn función-empty-2
  [a]
  (empty a))

(defn función-empty-3
  [a]
  (empty a))

(función-empty-1 '(1 2 3 4 5 6))
(función-empty-2 [1 2 3 4 5 6])
(función-empty-3 {:a 10 :b 20 :c 30})

;;empty?

(defn función-empty?-1
  [a]
  (empty? a))

(defn función-empty?-2
  [a]
  (empty? a))

(defn función-empty?-3
  [a]
  (empty? a))

(función-empty?-1 [1 2 3 4 5 6])
(función-empty?-2 ['() [] {} #{}])
(función-empty?-3 [])

;;even?

(defn función-even?-1
  [a]
  (even? a))

(defn función-even?-2
  [a]
  (even? a))

(defn función-even?-3
  [a]
  (even? a))

(función-even?-1 1)
(función-even?-2 2)
(función-even?-3 12200255520)

;;false?

(defn función-false?-1
  [a]
  (false? a))

(defn función-false?-2
  [a]
  (false? a))

(defn función-false?-3
  [a]
  (false? a))

(función-false?-1 false)
(función-false?-2 true)
(función-false?-3 nil)

;;find

(defn función-find-1
  [a b]
  (find a b))

(defn función-find-2
  [a b]
  (find a b))

(defn función-find-3
  [a b]
  (find a b))

(función-find-1 {:a 10 :b 20 :c 30} :c)
(función-find-2 [10 20 30] 2)
(función-find-3 [1 2 3] 5)

;;first

(defn función-first-1
  [a]
  (first a))

(defn función-first-2
  [a]
  (first a))

(defn función-first-3
  [a]
  (first a))

(función-first-1 [1 2 3 4 5 6 7 8 8 90])
(función-first-2 [[1 2 3 4] [100 200 300 400]])
(función-first-3 '(1 2 3 4 5 6))

;;flatten

(defn función-flatten-1
  [a]
  (flatten a))

(defn función-flatten-2
  [a]
  (flatten a))

(defn función-flatten-3
  [a]
  (flatten a))

(función-flatten-1 [[10 20 30 40 50 60] 2 3 4 5])
(función-flatten-2 [[1 2 3] 5 6 7 [10 20 30]])
(función-flatten-3 [[[[[1 2 3] 100 200 300] 2 3 4 5]] 5 6 7 [10 20 30]])

;;frequencies

(defn función-frequencies-1
  [a]
  (frequencies a))

(defn función-frequencies-2
  [a]
  (frequencies a))

(defn función-frequencies-3
  [a]
  (frequencies a))

(función-frequencies-1 '(1 2 3 1 2 3 1 2 3 1 2 3))
(función-frequencies-2 '([1 2] [1 2] [1 2]))
(función-frequencies-3 [\a \b \a \c \e \a \b \c \b \b \a \c])

;;get

(defn función-get-1
  [a b]
  (get a b))

(defn función-get-2
  [a b]
  (get a b))

(defn función-get-3
  [a b c]
  (get a b c))

(función-get-1 [1 2 3 4 5 6] 3)
(función-get-2 {:a 10 :b 20 :c 30 :d 40} :b)
(función-get-3 '(1 2 3 4) 5 10)

;;get-in

(defn función-get-in-1
  [a b]
  (get-in a b))

(defn función-get-in-2
  [a b]
  (get-in a b))

(defn función-get-in-3
  [a b c]
  (get-in a b c))


(función-get-in-1 {:profesor "Blas" :asignatura {:nombre "plf"}} [:asignatura :nombre])
(función-get-in-2 [[1 2 3] [4 5 6] [7 8 9]] [2 2])
(función-get-in-3 {:profesor "Blas" :asignatura {:nombre "plf"}} [:asinatura :codigo] "No Existe")

;;into

(defn función-into-1
  []
  (into))

(defn función-into-2
  [a b]
  (into a b))

(defn función-into-3
  [a b]
  (into a b))

(función-into-1)
(función-into-2 () [1 2 3 4 5])
(función-into-3 {:a 10} {:b 20 :c 30 :d 40})

;;key

(defn función-key-1
  [a]
  (key a))

(defn función-key-2
  [a]
  (key a))

(defn función-key-3
  [a]
  (key a))

(función-key-1 (first{:a 1 :b 2 :c 3 :d 4 :e 5 :f 6}))
(función-key-2 (first {:a 10}))
(función-key-3 (last {:b 10 :a 50 :c 20})) 

;;keys

(defn función-keys-1
  [a]
  (keys a))

(defn función-keys-2
  [a]
  (keys a))

(defn función-keys-3
  [a]
  (keys a))

(función-keys-1 {:a 10 :b 20})
(función-keys-2 {:a 20 :b {:c 40 :d {:e 10}}})
(función-keys-3 {:1 \a :2 \e :3 \i :4 \o :5 \u})

;;max

(defn función-max-1
  [a]
  (max a))

(defn función-max-2
  [a b]
  (max a b))

(defn función-max-3
  [a b c]
  (max a b c))

(función-max-1 5)
(función-max-2 6 7)
(función-max-3 5 8 4)

;;merge

(defn función-merge-1
  [a]
  (merge a))

(defn función-merge-2
  [a b]
  (merge a b))

(defn función-merge-3
  [a b c]
  (merge a b c))

(función-merge-1 {:a 10 :b 10})
(función-merge-2 {:a 10 :b 20} {:c 30 :d 40})
(función-merge-3 {:a 10} {:b 20} {:c 30})

;;min

(defn función-min-1
  [a]
  (min a))

(defn función-min-2
  [a b]
  (min a b))

(defn función-min-3
  [a b c]
  (min a b c))

(función-min-1 5)
(función-min-2 5 8)
(función-min-3 5 4 2)

;;neg?

(defn función-neg?-1
  [a]
  (neg? a))

(defn función-neg?-2
  [a]
  (neg? a))

(defn función-neg?-3
  [a]
  (neg? a))

(función-neg?-1 -5)
(función-neg?-2 5)
(función-neg?-3 0)

;;nil?

(defn función-nil?-1
  [a]
  (nil? a))

(defn función-nil?-2
  [a]
  (nil? a))

(defn función-nil?-3
  [a]
  (nil? a))

(función-nil?-1 nil)
(función-nil?-2 {:indicadores {:poblacion {:homres 500}}})
(función-nil?-3 0)

;;not-empty

(defn función-not-empty-1
  [a]
  (not-empty a))

(defn función-not-empty-2
  [a]
  (not-empty a))

(defn función-not-empty-3
  [a]
  (not-empty a))

(función-not-empty-1 [1 2 3])
(función-not-empty-2 [])
(función-not-empty-3 '(4 8 5 4 7 4))

;;nth

(defn función-nth-1
  [a b]
  (nth a b))

(defn función-nth-2
  [a b]
  (nth a b))

(defn función-nth-3
  [a b c]
  (nth a b c))


(función-nth-1 [1 2 3 4 5 6] 5)
(función-nth-1 '(1 2 3 4 5 8 2 1 4) 2)
(función-nth-3 [1 2 3 4 5 6] 10 "No encontrado")

;;odd?

(defn función-odd?-1
  [a]
  (odd? a))

(defn función-odd?-2
  [a]
  (odd? a))

(defn función-odd?-3
  [a]
  (odd? a))

(función-odd?-1 111111)
(función-odd?-2 101201)
(función-odd?-3 1)

;;partition

(defn función-partition-1
  [a b]
  (partition a b))

(defn función-partition-2
  [a b c]
  (partition a b c))

(defn función-partition-3
  [a b c d]
  (partition a b c d))

(función-partition-1 2 [1 2 3 4 5 6 7 8 9 0])
(función-partition-2 2 3 [1 2 3 4 5 6 7 8 9 0 4])
(función-partition-3 3 5 ["c"] [1 2 3 4 5 6 7 8 9 0 4 2])

;;partition-all

(defn función-partition-all-1
  [a]
  (partition-all a))

(defn función-partition-all-2
  [a b]
  (partition-all a b))

(defn función-partition-all-3
  [a b c]
  (partition-all a b c))

(función-partition-all-1 4)
(función-partition-all-2 2 [1 2 3 4 5 6 7 8 9 0])
(función-partition-all-3 2 3 [1 2 3 4 5 6 7 8 9 0 4])

;;peek

(defn función-peek-1
  [a]
  (peek a))

(defn función-peek-2
  [a]
  (peek a))

(defn función-peek-3
  [a]
  (peek a))

(función-peek-1 [1 2 3 4 5])
(función-peek-2 '(1 2 3 4 5))
(función-peek-3 [])

;;pop

(defn función-pop-1
  [a]
  (pop a))

(defn función-pop-2
  [a]
  (pop a))

(defn función-pop-3
  [a]
  (pop a))

(función-pop-1 [1 2 3 4 5])
(función-pop-2 '(1 2 3 4 5))
(función-pop-3 ['(1 2 3)])

;;pos?

(defn función-pos?-1
  [a]
  (pos? a))

(defn función-pos?-2
  [a]
  (pos? a))

(defn función-pos?-3
  [a]
  (pos? a))

(función-pos?-1 1)
(función-pos?-2 0)
(función-pos?-3 -1)

;;quot

(defn función-quot-1
  [a b]
  (quot a b))

(defn función-quot-2
  [a b]
  (quot a b))

(defn función-quot-3
  [a b]
  (quot a b))

(función-quot-1 10.0 3)
(función-quot-2 4 2)
(función-quot-3 50.0 4)

;;range

(defn función-range-1
  [a]
  (range a))

(defn función-range-2
  [a b]
  (range a b))

(defn función-range-3
  [a b c]
  (range a b c))

(función-range-1 10)
(función-range-2 5 10)
(función-range-3 0 100 5)

;;rem

(defn función-rem-1
  [a b]
  (rem a b))

(defn función-rem-2
  [a b]
  (rem a b))

(defn función-rem-3
  [a b]
  (rem a b))

(función-rem-1 2 4)
(función-rem-2 8 16)
(función-rem-3 5 20)

;;repeat

(defn función-repeat-1
  [a]
  (repeat a))

(defn función-repeat-2
  [a b]
  (repeat a b))

(defn función-repeat-3
  [a b]
  (repeat a b))

(función-repeat-1 5)
(función-repeat-2 5 "c")
(función-repeat-2 10 "l")

;;replace
(defn función-replace-1
  [a b]
  (replace a b))

(defn función-replace-2
  [a b]
  (replace a b))

(defn función-replace-3
  [a b]
  (replace a b))

(función-replace-1 [1 2 5 1] [])
(función-replace-2 [1 2 3] [0])
(función-replace-3 [1 2 3 0 4 \a \b] [0 2 1])

;;rest
(defn función-rest-1
  [a]
  (rest a))

(defn función-rest-2
  [a]
  (rest a))

(defn función-rest-3
  [a]
  (rest a))

(función-rest-1 [1 2 3 4 5 6])
(función-rest-2 '(1 2 3 4 5 6 7 8 9))
(función-rest-3 #{:a :b :c :d})

;;select-keys

(defn función-select-keys-1
  [a b]
  (select-keys a b))

(defn función-select-keys-2
  [a b]
  (select-keys a b))

(defn función-select-keys-3
  [a b]
  (select-keys a b))

(función-select-keys-1 {:a 1 :b 2 :c 3} [:a])
(función-select-keys-2 [1 2 3 4 5 6 7] [0 2 4])
(función-select-keys-3 [1 2 3 4 0] [0 4])

;;shuffle

(defn función-shuffle-1
  [a]
  (shuffle a))

(defn función-shuffle-2
  [a]
  (shuffle a))

(defn función-shuffle-3
  [a]
  (shuffle a))

(función-shuffle-1 '(1 2 3 4 5))
(función-shuffle-2 #{:a :b :c})
(función-shuffle-3 (list 1 2 3 4 5 6 7 8 9))

;;sort

(defn función-sort-1
  [a]
  (sort a))

(defn función-sort-2
  [a]
  (sort a))

(defn función-sort-3
  [a]
  (sort compare a))

(función-sort-1 [9 5 1 8 5 6 9 9 4 3 0 1 1 2 4 7])
(función-sort-2 '(10 5 9 7 8 6 4 1 0 1 1 5 7 8 9 5))
(función-sort-3 [1000 2 4 2 522 1 4 9 3 201 0 2])

;;split-at

(defn función-split-at-1
  [a b]
  (split-at a b))

(defn función-split-at-2
  [a b]
  (split-at a b))

(defn función-split-at-3
  [a b]
  (split-at a b))

(función-split-at-1 4 [1 2 3 4 5 6 7 8 9])
(función-split-at-2 3 '(1 2 3 4 5))
(función-split-at-3 2 {:a 10 :b 20 :c 30 :d 40 :e 50})

;;str 

(defn función-str-1
  []
  (str))

(defn función-str-2
  [a]
  (str a))

(defn función-str-3
  [a b]
  (str a b))

(función-str-1)
(función-str-2 1200)
(función-str-3 1200 5000)

;;subs

(defn función-subs-1
  [a b]
  (subs a b))

(defn función-subs-2
  [a b]
  (subs a b))

(defn función-subs-3
  [a b c]
  (subs a b c))

(función-subs-1 "Carlos" 1)
(función-subs-2 "Loaeza" 3)
(función-subs-3 "Programacion" 3 8)

;;subvec

(defn función-subvec-1
  [a b]
  (subvec a b))

(defn función-subvec-2
  [a b]
  (subvec a b))

(defn función-subvec-3
  [a b c]
  (subvec a b c))

(función-subvec-1 [1 2 3 4 5 6 7 8 9] 5)
(función-subvec-1 [\a \e \i \o \u] 2)
(función-subvec-3 [9 8 7 6 5 4 3 2 1] 2 4)

;;take

(defn función-take-1
  [a b]
  (take a b))

(defn función-take-2
  [a b]
  (take a b))

(defn función-take-3
  [a b]
  (take a b))

(función-take-1 2 [5 4 7 8 5 0])
(función-take-2 3 '(1 2 3 4 5))
(función-take-3 2 #{:a :b :c :d :e :f :g})

;;true?

(defn función-true?-1
  [a]
  (true? a))

(defn función-true?-2
  [a]
  (true? a))

(defn función-true?-3
  [a]
  (true? a))

(función-true?-1 true)
(función-true?-2 (= [1 2 3] [1 2 3]))
(función-true?-3 (== 5 5))

;;val

(defn función-val-1
  [a]
  (val a))

(defn función-val-2
  [a]
  (val a))

(defn función-val-3
  [a]
  (val a))

(función-val-1 (first {:a 10 :b 20 :c 30}))
(función-val-2 (first {:one :two}))
(función-val-3 (last {:a [1 2 3] :b [4 5 6] :c [7 8 9]}))

;;vals

(defn función-vals-1
  [a]
  (vals a))

(defn función-vals-2
  [a]
  (vals a))

(defn función-vals-3
  [a]
  (vals a))

(función-vals-1 {:a 10 :b 20 :c 30})
(función-vals-2 {:one :two})
(función-vals-3 {:a [1 2 3] :b [4 5 6] :c [7 8 9]})

;;zero?

(defn función-zero?-1
  [a]
  (zero? a))

(defn función-zero?-2
  [a]
  (zero? a))

(defn función-zero?-3
  [a]
(zero? a))

(función-zero?-1 0)
(función-zero?-2 (- 5 5))
(función-zero?-3 (- (+ 8 2) (- 15 5)))

;;zipmap

(defn función-zipmap-1
  [a b]
  (zipmap a b))

(defn función-zipmap-2
  [a b]
  (zipmap a b))

(defn función-zipmap-3
  [a b]
  (zipmap a b))

(función-zipmap-1 [:a :b :c] [10 20 30])
(función-zipmap-2 '(:a :b :c) '(10 20 30))
(función-zipmap-3 #{:a :b :c} #{10 20 30})



