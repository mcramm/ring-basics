(ns my-ring-app.app)

(defn handler [request]
  {:status 200
   :headers  {"Content-Type" "text/html"}
   :body "Hello World"})
