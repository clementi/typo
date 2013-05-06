(ns typo.core-test
  (:use clojure.test
        typo.core))

;; Dashify tests

(deftest emdash-gets-dashified
  (testing "Em-dash gets dashified."
    (is (= (dashify "I---I don't know")
           "I&#8212;I don't know"))))

(deftest endash-gets-dashified
  (testing "En-dash gets dashified."
    (is (= (dashify "pages 15--18")
           "pages 15&#8211;18"))))

(deftest emdash-and-endash-get-dashified
  (testing "Em-dash and en-dash get dashified."
    (is (= (dashify "I can't tell you---but I can say that it's in the period 1800--1850.")
           "I can't tell you&#8212;but I can say that it's in the period 1800&#8211;1850."))))

;; Quotify tests

(deftest empty-double-quotes-get-quotified
  (testing "Empty double quotes get quotified. FIXME: I fail."
    (is false)))
