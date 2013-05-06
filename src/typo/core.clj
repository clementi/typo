(ns typo.core
  (:use clojure.string))

(defn dashify [text]
  "Replace '---' and '--' with Unicode HTML entities"
  (let [dashified-text (replace text #"---" "&#8212;")
        dashified-text (replace dashified-text #"--" "&#8211;")]
    dashified-text))

(defn quotify [text]
  "Converts straight quotes into the proper 'curly' ones."
  ; TODO
  text
)

(defn typogrify [text]
  "Runs all transformations on text."
  (quotify (dashify text)))
