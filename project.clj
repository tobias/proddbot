(defproject proddbot "2.0.0-SNAPSHOT"
  :description "Yet another IRC bot"
  :url "https://github.com/tobias/proddbot"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0-alpha10"]
                 [irclj "0.5.0-alpha4"]
                 [org.immutant/web "2.1.4"]
                 [org.immutant/scheduling "2.1.4"]
                 [cheshire "5.6.1"]
                 [ring/ring-core "1.4.0"]
                 [com.taoensso/timbre "4.3.1"]
                 [clj-http-lite "0.3.0"]]
  :main proddbot.main
  :profiles {:dev {:source-paths ["dev"]}
             :uberjar {:aot :all}})
