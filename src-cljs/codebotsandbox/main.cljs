(ns codebotsandbox.main
  (:require [replumb.core :as replumb]))

(enable-console-print!)

(defn run [code callback]
  (replumb/read-eval-call {}
                          (fn handle-result [result]
                            (callback (replumb/result->string false true result)))
                          code))

; (run (.-__input js/global) println)
(set! (.-run (.-environment js/global)) run)
