(ns interpreter.input.repl 
  (:require
    [clojure.string :as str]))

(defn one-line []
  (println)
  (println "> ")
  (str/trim (read-line)))