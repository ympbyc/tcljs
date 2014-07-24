(ns tcljs-sample.core
  (:require [cljs.core.typed :refer [Option Any Seqable Map Vec]]
            [castorocauda.dom :refer [gendom]]
            [castorocauda.util :refer [dom-ready q-select]])
  (:require-macros [cljs.core.typed :refer [ann]]))


(ann todos (Atom (Vec (Map Keyword Any)) (Vec (Map Keyword Any))))
(def todos (atom [{:memo "create sample project using tcljs"}]))

(ann vdom (Atom Any Any))
(def vdom (atom []))


(ann render-todo-list [(Vec (Map Keyword Any)) -> Any])
(defn render-todo-list [todos]
  [:div
   (map (fn [todo]
          [:div.todo-item [:span (:memo todo)]])
        todos)])

(dom-ready
 (fn []
   (swap! vdom gendom
          (render-todo-list @todos)
          (q-select "#todos")
          true)

   (.addEventListener
    (q-select "#todo-in") "keydown"
    (fn [e] (when (= (.-which e) 13)
             (swap! todos conj {:memo (.-value (.-target e))})
             (set! (.-value (.-target e)) "")
             (swap! vdom gendom
                    (render-todo-list @todos)
                    (q-select "#todos")
                    true))))))
