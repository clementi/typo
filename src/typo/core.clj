(ns typo.core
  (:use clojure.string))

(defn dashify [text]
  "Replace '---' with '&mdash;' and '--' with '&ndash;'"
  (replace (replace text #"---" "&mdash;") #"--" "&ndash;"))

(defn quotify [text]
  "Converts straight quotes into the proper 'curly' ones."
  ; TODO
  text
)

(defn typogrify [text]
  "Runs all transformations on text."
  (quotify (dashify text)))

