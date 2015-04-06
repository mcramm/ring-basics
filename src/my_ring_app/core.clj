(ns my-ring-app.core
  (:require [ring.adapter.jetty :refer [run-jetty]]
            [my-ring-app.app :as app])
  (:gen-class))

(defn -main [& args]
  (run-jetty app/handler {:port 3000}))
