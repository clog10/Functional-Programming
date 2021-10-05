(ns plf04.core)

;;stringE

(defn string-e-1
  [s]
  (letfn [(f [x y]
            (if (empty? x)
              (if (and (> y 0) (< y 4))
                true false)
              (if (= \e (first x))
                (f (rest x) (inc y))
                (f (rest x) y))))]
    (f s 0)))

(string-e-1 "Hello")
(string-e-1 "Heelle")
(string-e-1 "Heelele")
(string-e-1 "Hll")
(string-e-1 "e")
(string-e-1 "")

(defn string-e-2
  [s]
  (letfn [(f [x y acc]
            (if (empty? x)
              (if (and (> acc 0) (< acc 4))
                true false)
              (if (identical? y (first x))
                (f (subs x 1) y (inc acc))
                (f (subs x 1) y acc))))]
    (f s \e 0)))

(string-e-2 "Hello")
(string-e-2 "Heelle")
(string-e-2 "Heelele")
(string-e-2 "Hll")
(string-e-2 "e")
(string-e-2 "")

;;stringTimes

(defn string-times-1
  [s n]
  (letfn [(f [s n]
            (if (or (zero? n) (empty? s))
              ""
              (str s (f s (dec n)))))]
    (f s n)))

(string-times-1 "Hi" 2)
(string-times-1 "Hi" 3)
(string-times-1 "Hi" 1)
(string-times-1 "Hi" 0)
(string-times-1 "Hi" 5)
(string-times-1 "Oh Boy!" 2)
(string-times-1 "x" 4)
(string-times-1 "" 4)
(string-times-1 "code" 2)
(string-times-1 "code" 3)

(defn string-times-2
  [s n]
  (letfn [(f [s n acc]
            (if (or (zero? n) (empty? s))
              acc
              (str s (f s (dec n) (str acc)))))]
    (f s n "")))

(string-times-2 "Hi" 2)
(string-times-2 "Hi" 3)
(string-times-2 "Hi" 1)
(string-times-2 "Hi" 0)
(string-times-2 "Hi" 5)
(string-times-2 "Oh Boy!" 2)
(string-times-2 "x" 4)
(string-times-2 "" 4)
(string-times-2 "code" 2)
(string-times-2 "code" 3)

;;frontTimes

(defn front-times-1
  [s n]
  (letfn [(f [s n]
            (if (or (zero? n) (empty? s))
              ""
              (if (< (count s) 3)
                (str (subs s 0 (count s)) (f s (dec n)))
                (str (subs s 0 3) (f s (dec n))))))]
    (f s n)))

(front-times-1 "Chocolate" 2)
(front-times-1 "Chocolate" 3)
(front-times-1 "Ab" 4)
(front-times-1 "Abc" 3)
(front-times-1 "A" 4)
(front-times-1 "" 4)
(front-times-1 "Abc" 0)

(defn front-times-2
  [s n]
  (letfn [(f [s n acc]
            (if (or (zero? n) (empty? s))
              acc
              (if (< (count s) 3)
                (str (subs s 0 (count s)) (f s (dec n) (str acc)))
                (str (subs s 0 3) (f s (dec n) (str acc))))))]
    (f s n "")))

(front-times-2 "Chocolate" 2)
(front-times-2 "Chocolate" 3)
(front-times-2 "Ab" 4)
(front-times-2 "Abc" 3)
(front-times-2 "A" 4)
(front-times-2 "" 4)
(front-times-2 "Abc" 0)

;;countXX

(defn count-xx-1
  [s]
  (letfn [(f [a n]
            (if (empty? a)
              n
              (if (and (= \x (first a)) (= \x (first (rest a))))
                (f (rest a) (inc n))
                (f (rest a) n))))]
    (f s 0)))

(count-xx-1 "abcxx")
(count-xx-1 "xxx")
(count-xx-1 "xxxx")
(count-xx-1 "abc")
(count-xx-1 "Hello there")
(count-xx-1 "Hexxo thxxe")
(count-xx-1 "")
(count-xx-1 "Kittens")
(count-xx-1 "Kittensxxx")

(defn count-xx-2
  [s]
  (letfn [(f [a n acc]
            (if (empty? a)
              acc
              (if (and (= n (first a)) (= n (first (rest a))))
                (f (rest a) n (inc acc))
                (f (rest a) n acc))))]
    (f s \x 0)))

(count-xx-2 "abcxx")
(count-xx-2 "xxx")
(count-xx-2 "xxxx")
(count-xx-2 "abc")
(count-xx-2 "Hello there")
(count-xx-2 "Hexxo thxxe")
(count-xx-2 "")
(count-xx-2 "Kittens")
(count-xx-2 "Kittensxxx")

;;stringSplosion

(defn string-splosion-1
  [s]
  (letfn [(f [s]
            (if (= 0 (count s))
              s
              (apply str (f (subs s 0 (- (count s) 1))) s)))]
    (f s)))

(string-splosion-1 "Code")
(string-splosion-1 "abc")
(string-splosion-1 "ab")
(string-splosion-1 "x")
(string-splosion-1 "fade")
(string-splosion-1 "There")
(string-splosion-1 "Kitten")
(string-splosion-1 "Bye")
(string-splosion-1 "Good")
(string-splosion-1 "Bad")

(defn string-splosion-2
  [s]
  (letfn [(f [s acc]
            (if (= 0 (count s))
              acc
              (apply str (f (subs s 0 (- (count s) 1)) (str s acc)))))]
    (f s "")))

(string-splosion-2 "Code")
(string-splosion-2 "abc")
(string-splosion-2 "ab")
(string-splosion-2 "x")
(string-splosion-2 "fade")
(string-splosion-2 "There")
(string-splosion-2 "Kitten")
(string-splosion-2 "Bye")
(string-splosion-2 "Good")
(string-splosion-2 "Bad")

;;array123

(defn array-123-1
  [xs]
  (letfn [(f [ys]
            (if (and (= 1 (first ys))
                     (= 2 (first (rest ys)))
                     (= 3 (first (rest (rest ys)))))
              true
              (if (empty? ys)
                false
                (f (rest ys)))))]
    (f xs)))

(array-123-1 [1,1,2,3,1])
(array-123-1 [1,1,2,4,1])
(array-123-1 [1,1,2,1,2,3])
(array-123-1 [1,1,2,1,2,1])
(array-123-1 [1,2,3,1,2,3])
(array-123-1 [1,2,3])
(array-123-1 [1,1,1])
(array-123-1 [1,2])
(array-123-1 [1])
(array-123-1 [])

(defn array-123-2
  [xs]
  (letfn [(f [ys acc]
            (if (empty? ys)
              (and acc false)
              (if (>= (count ys) 3)
                (if (and (= 1 (first ys))
                         (= 2 (first (rest ys)))
                         (= 3 (first (rest (rest ys)))))
                  (and acc true)
                  (f (rest ys) acc))
                (f (empty ys) acc))))]
    (f xs "")))

(array-123-2 [1,1,2,3,1])
(array-123-2 [1,1,2,4,1])
(array-123-2 [1,1,2,1,2,3])
(array-123-2 [1,1,2,1,2,1])
(array-123-2 [1,2,3,1,2,3])
(array-123-2 [1,2,3])
(array-123-2 [1,1,1])
(array-123-2 [1,2])
(array-123-2 [1])
(array-123-2 [])

;;stringX

(defn string-x-1
  [s]
  (letfn [(f [x n]
            (if (empty? x)
              ""
              (if (= n 0)
                (str (first x) (f (rest x) (inc n)))
                (if (and (= \x (first x)) (> (count x) 1))
                  (f (rest x) (inc n))
                  (str (first x) (f (rest x) (inc n)))))))]
    (f s 0)))

(string-x-1 "xxHxix")
(string-x-1 "abxxxcd")
(string-x-1 "xabxxxcdx")
(string-x-1 "xKittenx")
(string-x-1 "Hello")
(string-x-1 "xx")
(string-x-1 "x")
(string-x-1 "")

(defn string-x-2
  [s]
  (letfn [(f [x n acc]
            (if (empty? x)
              acc
              (if (= n 0)
                (str (first x) (f (rest x) (inc n) (str acc)))
                (if (and (= \x (first x)) (> (count x) 1))
                  (f (rest x) (inc n) (str acc))
                  (str (first x) (f (rest x) (inc n) acc))))))]
    (f s 0 "")))

(string-x-2 "xxHxix")
(string-x-2 "abxxxcd")
(string-x-2 "xabxxxcdx")
(string-x-2 "xKittenx")
(string-x-2 "Hello")
(string-x-2 "xx")
(string-x-2 "x")
(string-x-2 "")

;;altPairs

(defn alt-pairs-1
  [s]
  (letfn [(f [x n]
            (if (= (count x) n)
              ""
              (if (or (= n 0) (= n 1) (= n 4) (= n 5) (= n 8) (= n 9) (= n 12) (= n 13))
                (str (subs x n (inc n)) (f x (inc n)))
                (f x (inc n)))))]
    (f s 0)))

(alt-pairs-1 "kitten")
(alt-pairs-1 "Chocolate")
(alt-pairs-1 "CodingHorror")
(alt-pairs-1 "yak")
(alt-pairs-1 "ya")
(alt-pairs-1 "y")
(alt-pairs-1 "")
(alt-pairs-1 "ThisThatTheOther")

(defn alt-pairs-2
  [s]
  (letfn [(f [x n acc]
            (if (== (count x) n)
              acc
              (if (or (= n 0) (= n 1) (= n 4) (= n 5) (= n 8) (= n 9) (= n 12) (= n 13))
                (f x (inc n) (str acc (subs x n (+ n 1))))
                (f x (inc n) acc))))]
    (f s 0 "")))

(alt-pairs-2 "kitten")
(alt-pairs-2 "Chocolate")
(alt-pairs-2 "CodingHorror")
(alt-pairs-2 "yak")
(alt-pairs-2 "ya")
(alt-pairs-2 "y")
(alt-pairs-2 "")
(alt-pairs-2 "ThisThatTheOTher")

;;stringYak

(defn string-yak-1
  [s]
  (letfn [(f [x n]
            (if (empty? x)
              ""
              (if (and (= (first x) \y)
                       (= (first (rest x)) \a)
                       (= (first (rest (rest x))) \k)
                       (> (count x) 1))
                (f (rest (rest (rest x))) (inc n))
                (str (first x) (f (rest x) (inc n))))))]
    (f s 0)))

(string-yak-1 "yakpak")
(string-yak-1 "pakyak")
(string-yak-1 "yak123ya")
(string-yak-1 "yak")
(string-yak-1 "yakxxxyak")
(string-yak-1 "HiyakHi")
(string-yak-1 "xxxyakyyyakzzz")

(defn string-yak-2
  [s]
  (letfn [(f [x n acc]
            (if (empty? x)
              acc
              (if (and (= (first x) \y)
                       (= (first (rest x)) \a)
                       (= (first (rest (rest x))) \k)
                       (> (count x) 1))
                (f (rest (rest (rest x))) (inc n) acc)
                (f (rest x) (inc n) (str acc (first x))))))]
    (f s 0 "")))

(string-yak-2 "yakpak")
(string-yak-2 "pakyak")
(string-yak-2 "yak123ya")
(string-yak-2 "yak")
(string-yak-2 "yakxxxyak")
(string-yak-2 "HiyakHi")
(string-yak-2 "xxxyakyyyakzzz")

;;has271

(defn has-271-1
  [xs]
  (letfn [(f [ys]
            (if (or (<= (count ys) 2) (empty? ys))
              false
              (if (and
                   (== (first (rest ys)) (+ (first ys) 5))
                   (<= (if (pos? (- (first (rest (rest ys))) (dec (first ys))))
                         (- (first (rest (rest ys))) (dec (first ys)))
                         (* -1 (- (first (rest (rest ys))) (dec (first ys))))) 2))
                true
                (f (rest ys)))))]
    (f xs)))

(has-271-1 [1 2 7 1])
(has-271-1 [1 2 8 1])
(has-271-1 [2 7 1])
(has-271-1 [3 8 2])
(has-271-1 [2 7 3])
(has-271-1 [2 7 4])
(has-271-1 [2 7 -1])
(has-271-1 [2 7 -2])
(has-271-1 [4 5 3 8 0])
(has-271-1 [2 7 5 10 4])
(has-271-1 [2 7 -2 4 9 3])
(has-271-1 [2 7 5 10 1])
(has-271-1 [2 7 -2 4 10 2])
(has-271-1 [1 1 4 9 0])
(has-271-1 [1 1 4 9 4 9 2])

(defn has-271-2
  [xs]
  (letfn [(f [ys acc]
            (if (empty? ys)
              false
              (if (>= (count ys) 3)
                (if (and (== (- (first (rest ys)) (first ys)) 5)
                         (>= 2 (if (neg? (- (first (rest (rest ys))) (- (first ys) 1)))
                                 (* -1 (- (first (rest (rest ys))) (- (first ys) 1)))
                                 (* 1 (- (first (rest (rest ys))) (- (first ys) 1))))))
                  true
                  (f (rest ys) acc))
                (f (empty ys) acc))))]
    (f xs "")))

(has-271-2 [1 2 7 1])
(has-271-2 [1 2 8 1])
(has-271-2 [2 7 1])
(has-271-2 [3 8 2])
(has-271-2 [2 7 3])
(has-271-2 [2 7 4])
(has-271-2 [2 7 -1])
(has-271-2 [2 7 -2])
(has-271-2 [4 5 3 8 0])
(has-271-2 [2 7 5 10 4])
(has-271-2 [2 7 -2 4 9 3])
(has-271-2 [2 7 5 10 1])
(has-271-2 [2 7 -2 4 10 2])
(has-271-2 [1 1 4 9 0])
(has-271-2 [1 1 4 9 4 9 2])

