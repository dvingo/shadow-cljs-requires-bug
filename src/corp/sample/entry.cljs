(ns corp.sample.entry
  (:require
    ["@emotion/styled" :default styled]))

(. js/console log "styled: " styled)

(defn ^:export init []
  (. js/console log "init app."))
