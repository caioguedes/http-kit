(ns org.httpkit.test-server
  (:require [org.httpkit.server :as server]))

(defn handler [_req]
  {:status 200
   :body "hello"
   :headers {"Content-Type" "text/html"}})

(defn -main []
  (println "Server started at localhost:8080")
  (server/run-server handler {:port 8080}))