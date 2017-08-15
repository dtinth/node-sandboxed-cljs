(defproject codebotsandbox "1.2.3"
  :plugins [[lein-cljsbuild "1.1.7"]]
  :dependencies [[org.clojure/clojure "1.9.0-alpha17"]
                 [org.clojure/clojurescript "1.9.854"]
                 [com.cognitect/transit-cljs "0.8.239"]
                 [replumb "0.2.4"]]
  :cljsbuild {:builds [{:source-paths ["src-cljs"]
                        :compiler {:main "codebotsandbox.main"
                                   :output-to "runtime.js"
                                   :optimizations :whitespace
                                   :pretty-print true}}]})
