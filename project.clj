(defproject clojure-kuromoji "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.atilika.kuromoji/kuromoji "0.7.7"]
                 [com.atilika.kuromoji/kuromoji-ipadic "0.9.0"]
                 [com.atilika.kuromoji/kuromoji-unidic "0.9.0"]]
  :repositories [["Atilika Open Source repository"
                  "http://www.atilika.org/nexus/content/repositories/atilika"]]
  :main ^:skip-aot clojure-kuromoji.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
