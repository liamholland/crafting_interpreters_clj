(ns interpreter.scanning.handlers
  (:require [interpreter.execution.runner :as runner]
            [interpreter.input.repl :as repl]))

(defn run-prompt []
  (runner/run (repl/one-line)))

(defn run-file [file]
  (runner/run (str "Running the file " file)))
