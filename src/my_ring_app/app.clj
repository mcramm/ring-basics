(ns my-ring-app.app)

(defn handler [request]
  (let [subject (get-in request [:params "name"] "World")]
    {:status 200
     :headers  {"Content-Type" "text/html"}
     :body (format "Hello %s" subject)}))
