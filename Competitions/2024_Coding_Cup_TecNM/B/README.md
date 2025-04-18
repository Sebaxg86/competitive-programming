# Problem B - Evitando dañar sorvomotores
  
**Time Limit:** 1 second
  
---
 
## Description
En este problema, tu trabajo es ayudar a ITSURIN quien ahora anda queriendo realizar un robot que camine más específicamente un robot humanoide, pero tuvo un gran problema en su primer intento de realizar este proyecto, lo primero que hizo fue dañar un par de servomotores, dado un análisis él se dio cuenta que el daño fue causado por que mecánicamente se forzaron dos servomotores que al realizar un movimiento que estaba más allá de lo que mecánicamente se podía debido a su construcción lo que ocasiono que se forzaron los servomotores dañando los engranes internos, es por esto que ITSURIN, te pide que para controlar el movimiento de sus articulaciones, hagas un código que permita verificar los ángulos de cada servomotor y ver si el movimiento es seguro, esto se describe a continuación: Recuerda que cada servomotor del robot solo puede moverse de 0 a 180 grados, tu tarea será, dado un conjunto de ángulos finales previstos para los servomotores, tu tarea será checar si el movimiento de los servomotores será seguro. Si algún par consecutivo de los servomotores tiene una diferencia angular mayor que un número entero d, se considera que los movimientos no son seguros y lo debes indicar.  
  
---
  
## Input
La primera línea contiene un entero n (2 ≤ n ≤ 100), que representa el número de servomotores.

La segunda línea contiene n enteros a₁, a₂, …, aₙ (0 ≤ aᵢ ≤ 180), donde cada entero aᵢ representa el ángulo final previsto para el servomotor anterior.

La tercera línea contiene un entero d (1 ≤ d ≤ 180), que es la diferencia máxima permitida entre los ángulos de dos servomotores consecutivos para que los movimientos sean seguros.
  
## Output
Imprime "Seguro" si la diferencia entre los ángulos finales de todos los servomotores consecutivos es menor o igual a d. En caso contrario, imprime "Inseguro".
  
## Sample Input
```
4
30 40 75
100
50
```

## Sample Output
```
Seguro
```