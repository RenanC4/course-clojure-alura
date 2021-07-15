(ns loj.core)


(defn conta
  ([elementos]
   (conta 0 elementos))

  ([total-ate-agora elementos]
   (if (seq elementos)
     (recur (+ 1 total-ate-agora) (rest elementos))
     total-ate-agora)))

(def nomes ["Renan" "Hernandes" "Lorena"])

(println nomes)

(conta nomes)
(conta [])

