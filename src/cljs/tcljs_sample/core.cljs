(ns tcljs-sample.core
  (:require-macros [cljs.core.typed :refer [ann check-ns*]]))

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
                            [(cljs.core/ISeqable x) -> (Seq x)]))









(ann foo (All [x] [(cljs.core/ISeqable x) -> (U nil x)]))

(defn foo
  [xs]
  (first xs))
