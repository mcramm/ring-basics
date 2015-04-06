(ns my-ring-app.core
  (:require [ring.adapter.jetty :refer [run-jetty]]
            [my-ring-app.app :as app]
            [my-ring-app.middleware :refer [wrap-hello-translator]])
  (:gen-class))

(defn -main [& args]
  (run-jetty (-> app/handler
                 wrap-hello-translator) {:port 3000}))
