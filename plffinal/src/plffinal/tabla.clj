(ns plffinal.tabla)

(def diccionario
  {\^ "hacía el norte"
   \> "hacía el este"
   \v "hacía el sur"
   \< "hacía el oeste"})

(def diccionario-sustitucion
  {\^ \v
   \v \^
   \< \>
   \> \<})