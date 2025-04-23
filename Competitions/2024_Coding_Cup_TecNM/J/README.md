# Problem J - Detectando tramposos
  
**Time Limit:** 1 second
  
---
 
## Description
Por fin te graduaste de un Tecnológico Nacional de México, culminando años de esfuerzo recibiendo la mejor educación, y estás cumpliendo tu sueño de trabajar en una de las empresas de videojuegos más famosas del mundo.

Ahora en tu primera chamba, justamente tu tarea inicial es apoyar al campeonato mundial del juego más vendido de la empresa. Sin embargo, hay sospechas de que algunos de los participantes que avanzaron a la final mundial han hecho trampa, por lo que te toca analizar cada uno de ellos y determinar si efectivamente hicieron trampa, o si no lo hicieron y son finalistas legítimos.

Para determinar si un participante hizo trampa o no, necesitas determinar si su puntaje final es realista y pudo haber sido obtenido jugando el juego de manera regular. El videojuego básicamente consiste en distintos objetos que recolectas y te dan puntos, y de enemigos que te los quitan. Los objetos solo los puedes tomar una vez, pero son opcionales, así como los enemigos que solo te pueden atacar una vez, aunque puedes esquivarlos.

Nota que es válido terminar con un puntaje en ceros, o incluso negativo, ya que los puntajes no determinan a los ganadores (un poco extraño tal vez, lo sabemos). Tu labor sólo es determinar si un puntaje es conseguible por medios normales de juego, o si se hizo trampa usando algún hack que altera cómo el juego fue diseñado.

---
  
## Input
En la primera línea habrá tres enteros O, E y P, indicando el número O de objetos y de E enemigos que se pueden encontrar en el juego, así como de P participantes a analizar.
En la segunda línea habrá O enteros, determinando el valor de cada objeto objᵢ.
En la tercera línea habrá E enteros, determinando el valor que cada enemigo eneᵢ te puede quitar.
En la última línea habrá P enteros, determinando el puntaje final punⱼ de cada participante a analizar.
  
## Output
Por cada participante, imprime una línea que diga:
- Hizo trampa si dicho participante tiene un puntaje que es imposible de conseguir en el juego,
- o que diga Merece ser finalista si su puntaje puede ser conseguido jugando legalmente.
  
## Sample Input
```
1 1 3
100
10
101 100
90
```

## Sample Output
```
Hizo trampa
Merece ser finalista
Merece ser finalista
```