(ns interpreter.execution.runner)

(defn -execute [lines]
  (doseq [line lines]
    (println line)))

(defn run [source]
  (-execute source))
