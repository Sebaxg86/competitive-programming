# Problem C - Virus informaticos conflictivos
  
**Time Limit:** 1 second
  
---
 
## Description
Bob es un estudiante de informática que se pasó todas las vacaciones descargando música y películas de sitios poco confiables de internet. Por lo mismo, la computadora de Bob terminó infectada con muchos virus y a veces crashea. Los virus se la viven paseando en la memoria de la computadora de Bob, la cual es como una tabla compuesta por L celdas, en donde cada celda puede estar ocupada únicamente por un virus a la vez. Cada virus se identifica con un número entero positivo. Además, hay dos tipos de virus, aquellos cuyo identificador es un número par, y aquellos que son impar. Inicialmente, cuando la computadora está apagada, los virus están en el disco duro. Una vez la computadora enciende, inmediatamente los virus se forman en una fila y comienzan a ingresar a la memoria, se van moviendo de celda en celda durante cada segundo.
Por ejemplo, si la memoria tiene 3 celdas y los virus están formados como 7, 1, 3, 5, entonces:

---

Segundo 1. El virus 5 entrará a la primera celda de la memoria.
Segundo 2. El virus 5 se moverá a la segunda celda y el virus 3 entrará a la primera celda.
Segundo 3. El virus 5 a la tercera celda, el virus 3 se moverá a la segunda celda, y el virus 1 entrará a la primera celda.

---

Y así sucesivamente. Cuando un virus está en la última celda de la memoria, entonces pasará a salir de la memoria y se pierde (ver figuras de ejemplo). Además, como los virus son muy conflictivos, si un virus par se encuentra con un virus impar dentro de la memoria, entonces estos virus comienzan a pelear y hacen crashear a la computadora de Bob. Bob quiere saber si su computadora crasheará o no, por lo que te pide ayuda para hacer un programa que dado el tamaño de la memoria y la secuencia de virus que entran a la memoria, determine si la computadora crasheará o no en algún momento.
  
---
  
## Input
La primera línea contiene dos enteros L, N ∈ ℕ⁺ que representan el tamaño de la memoria y la cantidad de virus que entran a la memoria, respectivamente. La segunda línea contiene N enteros v₁, v₂, …, vₙ que representan la secuencia de virus que entran a la memoria. Se garantiza que en dicha secuencia, todos los números son diferentes.
  
## Output
Imprime “Do not worry Bob” si la computadora de Bob no crasheará en ningún momento. En caso contrario, imprime el segundo exacto en el que la computadora de Bob crasheará.
  
## Sample Input
```
3 4
7 1 3 5
```

## Sample Output
```
Do not worry Bob
```