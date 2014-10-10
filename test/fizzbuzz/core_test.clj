(ns fizzbuzz.core-test
  (:require [clojure.test :refer :all]
            [fizzbuzz.core :refer :all]))

(deftest a-test
  (testing "FIXME, I fail."
    (is (= 1 1))))

(deftest knows-three-is-divisible-by-three
  (testing "Three is divisible by three"
    (is (= true (divisible-by-three? 3)))))

(deftest knows-one-is-not-divisible-by-three
  (testing "One is not divisible by three"
    (is (= false (divisible-by-three? 1)))))

(deftest knows-five-is-divisible-by-five
  (testing "Five is divisible by five"
   (is (= true (divisible-by-five? 5)))))

(deftest knows-three-is-not-divisible-by-five
  (testing "Three is not divisible by 5"
   (is (= false (divisible-by-five? 3)))))

(deftest knows-fifteen-is-divisible-by-fifteen
  (testing "Fifteen is divisible by fifteen"
   (is (= true (divisible-by-fifteen? 15)))))

(deftest knows-five-is-not-divisible-by-fifteen
  (testing "Five is not divisible by fifteen"
   (is (= false (divisible-by-fifteen? 5)))))

(deftest returns-two-for-two
  (testing "Fizzbuzz returns two for two"
   (is (= 2 (fizzbuzz 2)))))

(deftest returns-fizz-for-three
  (testing "Fizzbuzz returns 'Fizz' for three"
    (is (= "Fizz" (fizzbuzz 3)))))

(deftest returns-buzz-for-three
  (testing "Fizzbuzz returns 'Buzz' for five"
    (is (= "Buzz" (fizzbuzz 5)))))

(deftest returns-Fizzbuzz-for-fifteeen
  (testing "Fizzbuzz returns 'Fizzbuzz' for fifteen"
    (is (= "Fizzbuzz" (fizzbuzz 15)))))

(deftest divides?-works
  (testing "Divides method works"
    (is (= true (divides? 5 5)))))
