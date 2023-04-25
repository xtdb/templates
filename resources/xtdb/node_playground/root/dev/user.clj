(ns user
  (:require [xtdb.datalog :as xt]
            [xtdb.node :as node]))

(defonce node
  (node/start-node {}))
