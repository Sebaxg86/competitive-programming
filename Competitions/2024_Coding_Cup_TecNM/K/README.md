# Problem K - Los puzzles de Chatito
  
**Time Limit:** 1 second
  
---
 
## Description
Chatito es un crack de los puzzles matemáticos. Ha resuelto todos los problemas que existen… y los que no existen también. Ahora, aburrido de lo que ya conoce, ha decidido ponerse un desafío mayor que ni siquiera ChatGPT puede resolver.

Chatito tiene una matriz cuadrada de tamaño N × N y quiere llenarla con números que cumplan las siguientes condiciones:
- Cada número debe estar dentro del rango de L y R.
- Un número no puede aparecer más de una vez en la matriz.
- La suma de los dígitos de cada número debe ser un múltiplo de 3.
- Cada par de dígitos adyacentes en el número debe formar un número primo.

Por ejemplo, 117 es válido porque 11 y 17 son primos, además 1 + 1 + 7 = 9, y 9 es múltiplo de 3.
Pero 107 no lo es, ya que 10 no es primo.

Chatito ya logró resolver este problema con números de hasta 9 dígitos, pero ahora quiere que tú vayas más allá y lo resuelvas con números aún más grandes.
  
---
  
## Input
La primera línea contiene un entero N, el tamaño de la matriz.
La segunda línea contiene dos enteros L y R, que representan el rango de números que pueden aparecer en las celdas de la matriz.
  
## Output
Imprime un entero: el número de matrices válidas que se pueden formar, cumpliendo las condiciones.
Una matriz A se considera diferente a una matriz B si al menos en una de sus celdas Aᵢⱼ ≠ Bᵢⱼ.
Como el resultado puede ser muy grande, imprime el resultado módulo 10⁹ + 7.
  
## Sample Input
```
1
10 1000
```

## Sample Output
```
17
```