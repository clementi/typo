(ns typo.core
  (:use clojure.string))

(defn dashify [text]
  "Replace '---' and '--' with Unicode HTML entities"
  (replace (replace text #"---" "&#8212;") #"--" "&#8211;"))

(defn quotify [text]
  "Converts straight quotes into the proper 'curly' ones."
  ; TODO
  text
)

(defn typogrify [text]
  "Runs all transformations on text."
  (quotify (dashify text)))
