(ns interpreter.scanning.handlers
  (:require [interpreter.execution.runner :as runner]))

(defn run-prompt []
  (runner/run "Running in interactive mode..."))

(defn run-file [file]
  (runner/run (str "Running the file " file)))
