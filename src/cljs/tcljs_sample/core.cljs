(ns tcljs-sample.core
  (:require-macros [cljs.core.typed :refer [ann check-ns*]]))

(ann str [Any -> String])

(ann foo [Number -> String])

(defn foo
  [x]
  (str x))
