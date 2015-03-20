(ns test.subset
  (:require [clojure.core.typed :as t]
                [clojure.set :as set])
  (:require test.core))

(set/subset? #{1} #{2})
