(ns loj.aula1)

;["Renan" "Lorena" "Hernandes"]
;{"Renan" 24 "Lorena" 1 "Hernandes" 11}
;'(1 2 3 4 5)
;[[0 1]]
;#{}

;map
;reduce
;filter

(def nomes ["Renan" "Lorena" "Hernandes"])

(first nomes)
(rest nomes)
(next nomes)
(rest [])
(next [])
(seq [])
(seq [1 2 3 4])

;recursao de cauda
(defn meu-mapa
  [funcao sequencia]
  (let [primeiro (first sequencia)]
    (funcao primeiro)
    (if (next sequencia)
      (recur funcao (rest sequencia))
      )))

(meu-mapa println nomes)
