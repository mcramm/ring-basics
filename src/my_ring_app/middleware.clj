(ns my-ring-app.middleware
  (:require [clojure.string :as s]))

(defn translate-hello [body]
  (s/replace body "Hello" "Bonjour"))

(defn wrap-hello-translator [handler]
  (fn [request]
    (let [response (handler request)]
      (update-in response [:body] translate-hello))))
