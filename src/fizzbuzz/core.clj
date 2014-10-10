(ns fizzbuzz.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(defn divides? [top bottom] (zero? (mod top bottom)))

(defn divisible-by-three? [number] (divides? number 3))

(defn divisible-by-five? [number] (divides? number 5))

(defn divisible-by-fifteen? [number] (divides? number 15))


(defn fizzbuzz [number] (cond
                          (divisible-by-fifteen? number) "Fizzbuzz"
                          (divisible-by-five? number) "Buzz"
                          (divisible-by-three? number) "Fizz"
                         :else number
                         ))
