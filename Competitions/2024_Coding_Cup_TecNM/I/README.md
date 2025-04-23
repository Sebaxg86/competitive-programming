# Problem I - Atsa y Ocelotl
  
**Time Limit:** 2.5 seconds
  
---
 
## Description
Atsa está aprendiendo a utilizar Ocelotl, un nuevo IDE que tiene soporte para ciertos “atajos” de teclado para mover el cursor más eficientemente en un archivo de texto.

Ocelotl cuenta con un sistema de tutoriales interactivos para asegurarse que los usuarios aprendan los atajos de manera progresiva.

En el nivel actual, Atsa puede utilizar las teclas con flechas con su mano derecha para mover el cursor una posición en la dirección correspondiente a la tecla seleccionada.

Pero además puede utilizar los siguientes atajos con la mano izquierda:

- Presionar “a”: Mueve el cursor a la anterior primera letra de una palabra.
- Presionar “s”: Mueve el cursor a la anterior última letra de una palabra.
- Presionar “d”: Mueve el cursor a la siguiente primera letra de una palabra.
- Presionar “f”: Mueve el cursor a la siguiente última letra de una palabra.

Considera que presionar una tecla no moverá el cursor si la acción correspondiente es inválida (presionar “↑” en el primer renglón, presionar “←” en la primera columna, presionar “d” cuando no hay una palabra siguiente, etc).

En cada ejercicio del nivel se presenta un archivo de texto de ejemplo, y el usuario tiene que mover el cursor de su posición inicial hacia otra posición final dada.

Además, en cada ejercicio se le asigna un costo a las acciones de cada mano I y D. Dicho costo se va acumulando cada que una tecla es presionada, y al completar el ejercicio el costo total funciona como puntaje.

Ayuda a Atsa a encontrar cuál es el menor puntaje que puede obtener en cada ejercicio.
  
---
  
## Input
- Dos enteros R y C, que indican el número de renglones y columnas en el texto dado.
- Cuatro enteros rinI, cinI, rfin y cfin, que indican las coordenadas de las posiciones inicial y final.
- Dos enteros I y D, que indican el costo de presionar un atajo de mano izquierda y derecha respectivamente.
  
## Output
Un solo entero que representa el menor puntaje posible para mover el cursor de las coordenadas iniciales a las finales.
  
## Sample Input
```
1 22
0 2 0 20
1 1
este editor es ocelotl
```

## Sample Output
```
5
```