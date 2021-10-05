
# Nombre del proyecto
## Cifrados
Cuadrado de Polibio - Transposición columnar simple

## Forma de ejecutar.
Desde la consola del sistema operativo
lein run "tipo-cifrado" "cifrar ó descifrar" "archivo-leer" "archivo-escribir"

## Opciones para su ejecución.
Se puede ejecutar desde la terminal desde el sistema operativo o desde la terminal del editor de texto
Si se desea cifrar o descifrar por el Cuadrado de Polibio se le tiene que otorgar 3 argumentos
    1.- Operación a realizar (cifrado o descifrado)
    2.- Archivo a leer
    3.- Archivo en el que se escribirá el resultado
Si se desea cifrar o descifrar por Transposición Columnar se le tiene que otorgar 4 argumentos
    1.- Operación a realizar (cifrado o descifrado)
    2.- Palabra clave de cifrado o descifrado
    3.- Archivo a leer
    4.- Archivo en el que se escribirá el resultado

## Ejemplos de uso o ejecución.
### Polibio
$ lein run "cifrar" "resources/cifrar-polibio.txt" "resources/cifrado.txt"
$ lein run "descifrar" "resources/descifrar-polibio.txt" "resources/descifrado.txt"

### Transposición Columnar
$ lein run "cifrar" "canción" "resources/cifrar-transposicion.txt" "resources/cifrado-t-a.txt"
$ lein run "cifrar" "CANCIÓN" "resources/cifrar-transposicion.txt" "resources/cifrado-t-b.txt"
$ lein run "cifrar" "cAnCiÓn" "resources/cifrar-transposicion.txt" "resources/cifrado-t-c.txt"
$ lein run "descifrar" "cat" "resources/descifrar-transposicion.txt" "resources/descifrado-t-a.txt"

## Errores, limitantes, situaciones no consideradas o particularidades de tu solución.

