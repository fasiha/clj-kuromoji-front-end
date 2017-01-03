(ns kuromoji-front-end.handler
  (:import java.net.URLEncoder)
  (:require [compojure.core :refer [GET POST defroutes]]
            [compojure.route :as route]
            [ring.util.response :refer [file-response]]
            [ring.middleware.format :refer [wrap-restful-format]]
            [kuromoji-front-end.kuromoji :as kuromoji]))

(defroutes handler
  (GET
    "/parse-nbest/:text"
    [text]
    (do (println "Parsing text:" text)
        {:body (kuromoji/parse-nbest text 10)}))
  (GET
    "/parse/:text"
    [text]
    (do (println "Parsing text:" text)
        {:body (kuromoji/parse text)}))
  (route/not-found "Not found.")
  )

(def app (-> #'handler
             (wrap-restful-format)))
