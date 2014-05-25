(ns tcljs-sample.core
  (:require [clojure.core.typed :refer [ann check-ns typed-deps def-alias ann-datatype
                                        for> fn> ann-form AnyInteger doseq> cf inst
                                        letfn> override-method dotimes>]
             :as t]))

(ann foo [Number -> String])

(defn foo
  [x]
  (str x))
