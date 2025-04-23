# Problem D - Las Recetas de la Abuela
  
**Time Limit:** 1 second
  
---
 
## Description
Gracias a entrenar muy duro para el Coding Cup pudiste pasar las entrevistas de Google: te nos vas como Software Engineer a la Ciudad de México. ¡Felicidades!

Aunque, la verdad, estuviste a punto de rechazar la oferta cuando te diste cuenta que ya no podrías tener los deliciosos platillos de tu abuela estando tan lejos. Afortunadamente a tu abue se le ocurrió una solución muy práctica: darte su recetario y que te cocines tú (iya era hora!).

Así bien, con el recetario bajo el brazo, tu maleta con tus tiliches y los mejores deseos de tu familia empiezas esta aventura en la ciudad.

Ya en la ciudad seguido te pasa que empiezas recetas cuando no tienes todos los ingredientes y el platillo no sabe cómo debería saber. Esto no está nada bien y piensas que puedes hacer un programa para resolver este problema.

Crea un programa que reciba el recetario de la abuela, un inventario de ingredientes disponibles y un platillo deseado. El programa debe decir si ese platillo deseado se puede hacer o no.  
  
---
  
## Input
- Un entero `N` indicando la cantidad de platillos en el recetario
- `N` renglones representando el recetario. Cada renglón seguira el formato PLATILLO INGREDIENTE INGREDIENTE ... INGREDIENTE donde:
    - PLATILLO representa el identificador unico del platillo
    - La lista de ingredientes representa los identificadores de los ingredientes necesarios para hacer el platillo
- Un entero `M` indicando la cantidad de ingredientes disponibles
- `M` renglones representando el inventario. Cada renglón seguira el formato INGREDIENTE
- El ultimo renglón tiene el formato PLATILLO, que indica el platillo deseado

## Output
`OK` si se puede hacer el platillo o `NO` si no se puede

---

### Notas
- 1 <= N, M <= 2048
- Un platillo puede requerir de otro platillo
- Los ingredientes pueden ser usados sin que se agoten, es decir con saber que tienes azúcar disponible ya puedes hacer todos los platillos que lleven azúcar
- Los identificadores de los platillos e ingredientes usan sólo letras y números (A-Z, a-z, 0-9)
- Los identificadores de platillos son únicos en el recetario
- Los identificadores de ingredientes son únicos en el inventario
- Se garantiza que ningún platillo requerirá de sí mismo como ingrediente, directa o indirectamente (i.e. no hay ciclos)

---

## Sample Input
```
2
pastel leche harina azucar chocolate
chocolate cacao azucar
4
leche
harina
azucar
chocolate
pastel
```

## Sample Output
```
OK
```