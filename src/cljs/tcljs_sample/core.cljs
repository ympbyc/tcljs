(ns tcljs-sample.core
  (:require-macros [cljs.core.typed :refer [ann] :as ct]))

(ann cljs.core/str [Any -> string])


(ann cljs.core/+ (Fn [int * -> int]
                     [number * -> number]))
(ann cljs.core/- (Fn [int * -> int]
                     [number * -> number]))
(ann cljs.core/* (Fn [int * -> int]
                     [number * -> number]))

(ann cljs.core/symbol? [Any -> boolean])
(ann cljs.core/compare-symbols [Symbol Symbol -> int])

(ann cljs.core/first (All [x]
                          [(cljs.core/ISeqable x) -> (U nil x)]))

;;(ann cljs.core/second )

(ann cljs.core/rest (All [x]
                         [(cljs.core/ISeqable x) -> (U nil x)]))

(ann cljs.core/last (All [x]
                         [(cljs.core/ISeqable x) -> (U nil x)]))

(ann cljs.core/butlast (All [x]
                            [(cljs.core/ISeqable x) -> (cljs.core/ISeqable x)]))






(ann xs (cljs.core/ISeqable int))
(def xs [1 2 3 4 5])

(ann t-first (U nil int))
(def t-first (first xs))
