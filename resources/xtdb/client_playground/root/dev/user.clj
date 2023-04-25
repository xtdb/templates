(ns user
  (:require [xtdb.datalog :as xt]
            [xtdb.client :as client]))

(defonce client
  (client/start-client "http://localhost:3000"))
