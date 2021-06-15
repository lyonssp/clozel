(ns resource.test
  (:require
    [clojure.test :refer [deftest testing is]]
    [clojure.edn :as edn]
    [clojure.java.io :as io]))

(deftest test-read-from-file
  (testing "read message from file"
    (let [data (:message (edn/read-string (slurp (io/resource "data.edn"))))]
      (is (= data "Hello, World!")))))
