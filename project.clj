(defproject kuromoji-front-end "0.1.0-SNAPSHOT"
  :description "Make Kuromoji a Clojure microservice. Japanese morphological analysis and part-of-speech tagging for everyone!"
  :url "https://github.com/fasiha/clj-kuromoji-front-end"
  :license {:name "Unlicense"
            :url "http://unlicense.org/"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [compojure "1.4.0"]
                 [ring "1.4.0"]
                 [com.cognitect/transit-clj "0.8.288"]
                 [ring/ring-defaults "0.2.0"]
                 [ring-middleware-format "0.7.0"]
                 [ring/ring-mock "0.3.0"]
                 [cheshire "5.5.0"]
                 [clj-time "0.12.0"]
                 [clj-http "2.2.0"]
                 [ring-cors "0.1.8"]
                 ]
  :plugins [[lein-ring "0.10.0"]
            [lein-expand-resource-paths "0.0.1"]]
  :ring {:handler kuromoji-front-end.handler/app
         :port 3600}
  :resource-paths ["resources/jars-cc64f5fdda8/*"]
  :main ^:skip-aot kuromoji-front-end.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
