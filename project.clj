(defproject clojure-kuromoji "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :plugins [[lein-expand-resource-paths "0.0.1"]]
  :dependencies [[org.clojure/clojure "1.8.0"]
                 ; [com.atilika.kuromoji/kuromoji-ipadic "0.9.0"]
                 ; [com.atilika.kuromoji/kuromoji-unidic "0.9.0"]
                 ]
  :resource-paths ["resources/jars-1fad6cc5e27/*"]
  :main ^:skip-aot clojure-kuromoji.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
