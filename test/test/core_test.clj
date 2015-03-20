(ns test.core-test
 (:use clojure.test)
 (:require [clojure.core.typed :as t])
 (:require test.core) 
)

(deftest subset-test
  (is (t/check-ns 'test.subset)))
