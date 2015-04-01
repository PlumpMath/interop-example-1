(ns interop.core
  (:gen-class))

(defn sum-array [x]
  (reduce + x))

(defn map-func-java-array [f x]
  (into-array (map f x)))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
