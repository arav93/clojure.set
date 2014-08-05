(ns test.core)

( require '[clojure.core.typed :as t])
(t/ann ^:no-check clojure.data/diff [( clojure.lang.PersistentVector clojure.lang.PersistentVector) -> clojure.lang.PersistentVector])

