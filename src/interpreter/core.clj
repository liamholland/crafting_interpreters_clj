(ns interpreter.core
  (:require [interpreter.scanning.handlers :as handlers]))

(defn -main [& args]
  (if (> (count args) 1)
    (System/exit 64)
    (if (= (count args) 1)
      (handlers/run-file (first args))
      (handlers/run-prompt))))