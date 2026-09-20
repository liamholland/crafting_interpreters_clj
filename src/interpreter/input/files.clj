(ns interpreter.input.files 
  (:require
    [clojure.java.io :as io]))

(defn read-all [file]
  (with-open [rdr (io/reader file)]
    (reduce conj [] (line-seq rdr))))