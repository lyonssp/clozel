(ns db.test
  (:require
    [clojure.test :refer [deftest testing]]
    [clozel.db :as db]))

(deftest use-db
  (testing "create table against db"
    (db/create)
    true))
