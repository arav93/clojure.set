(ns test.subset
  (:require [clojure.core.typed :as t]
                [clojure.set :as set]
                [test.core]))

(set/subset? #{1} #{2})
(set/superset? #{1} #{2})
(set/join #{ {:a 1} {:a 2} }  #{ {:b 1} {:b 2} })
(set/index #{ {:a 1 :b 2} {:a 3 :b 4} {:a 1 :b 5} {:a 2 :b 6} } [:a])
(set/map-invert {:a 1, :b 2})
(set/project #{  {:a "b" :c 1} {:a "d" :c 2} } [:a])
(set/rename #{  {:a 1, :b 1}  {:a 2, :b 2} } {:a :new-a})
(set/rename-keys {:a 1, :b 2} {:a :new-a, :b :new-b})
(set/select odd? #{1 2 3} )
