# Problem L - Las piramides de Ra
  
**Time Limit:** 2 seconds
  
---
 
## Description
¡Te has quedado dormido!

Acabas de despertar de una siesta un poco larga… y despertaste en Egipto!!!! No te quieres quedar aquí por el resto de tu vida y tampoco tienes suficiente dinero egipcio para un vuelo así que tendrás que esperar a que algún familiar venga por ti, este te ha comentado que llegará en Q días.

Mientras tanto en la lejanía localizas una secuencia de N pirámides una después de otra y varios trabajadores ¿Demoliendo? Te extraña bastante esto por lo cual te acercas para tratar de comprender y te explica uno de los trabajadores que el Dios Ra es muy caprichoso y detesta las pirámides altas, más específicamente detesta aquellas cuya altura es mayor a Dᵢ, donde i es el número de día, y ordena que sean destruidas. Aparte, como si eso fuera poco, obliga a que al final del día restauren todas las pirámides que quedaron en mal estado ese día.

Se te hace muy raro esto pero tú estás tan fascinado con todo lo que ves por lo que decides tomar fotos de las pirámides, pero las pirámides en mal estado se ven feas y no quieres que arruinen tu foto, por lo que si considerarás una foto chida si tiene solo pirámides en buen estado. Cada foto la tomarás a una secuencia contigua de pirámides, aparte tus ganas de caminar el día i son pocas por lo que solamente le tomarás fotos a las pirámides cuyos índices estén entre Lᵢ y Rᵢ, por cada día calcula la cantidad de fotos chidas que tomarás ese día.
  
---
  
## Input
- En la primera línea dos números enteros N y Q, indicando la cantidad de pirámides y la cantidad de días que estarás en Egipto.
- La segunda línea contiene N elementos h₁, h₂, …, hₙ, donde el i-ésimo elemento indica la altura de la i-ésima pirámide.
- Las siguientes Q líneas vendrán con 3 enteros Lᵢ, Rᵢ y Dᵢ, indicando los límites de los índices de pirámides a las que les tomarás fotos el día i-ésimo y el valor que el Dios Ra tiene de límite.

  
## Output
Q enteros, donde el i-ésimo entero indica la cantidad de fotos que tomarás el i-ésimo día.

---

### Notas
Así es puedes llegar a estar hasta 2 × 10⁵ días en Egipto!!
Pero eso no es problema, nunca te aburrirás de tomar fotos.
  
## Sample Input
```
6 2
1 2 5 3 4
1
2 5 4
1 6 3
```

## Sample Output
```
4
5
```