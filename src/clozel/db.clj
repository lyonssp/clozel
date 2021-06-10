(ns clozel.db
  (:require
    [next.jdbc :as jdbc]
    [next.jdbc.sql :as sql]))

(defn create
  []
  (let [sqlite (jdbc/get-datasource {:dbtype "sqlite" :dbname "foo"})]
    (jdbc/execute! sqlite ["
      CREATE TABLE foo (
        bar TEXT
      )"])))

