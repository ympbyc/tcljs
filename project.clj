(defproject tcljs-sample "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/core.typed "0.2.48"]
                 [org.clojure/clojurescript "0.0-2202"]]
  :plugins [[lein-typed "0.3.1"]]
  :source-paths ["src/clj"
                 "src/cljs"]
  :repositories {"sonatype-oss-public" "https://oss.sonatype.org/content/groups/public/"}
  :core.typed {:check [tcljs-sample.clj]
               :check-cljs [tcljs-sample.core]})
