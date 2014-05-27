(ns tcljs-sample.clj
  (:require [clojure.core.typed :refer [ann] :as ct]))


(ann xs (ct/Seqable int))
(def xs [1 2 3 4 5])

(ann t-first (ct/Option int))
(def t-first (first xs))




(ann ys (ct/NonEmptySeqable int))
(def ys [1 2 3 4 5])

(ann t-first' int)
(def t-first' (first ys))




(ann zs (All [x] (ct/Vec x)))
(def zs [])

(ann t-first'' (All [x] (U nil x)))
(def t-first'' (first zs))
