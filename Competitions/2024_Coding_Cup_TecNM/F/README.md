# Problem F - Recuperando la base de datos
  
**Time Limit:** 1.5 seconds
  
---
 
## Description
Se acerca el Coding Cup y parte de la preparación de los participantes es elegir un buen nombre de equipo. Sabiendo lo importante que es esto, el comité del concurso ha decidido permitir a todos los equipos que una vez hayan recibido su nombre de usuario original, estos podrán cambiarlos las veces que quieran antes que termine la fecha de registro, siempre y cuando el nuevo nombre de usuario no haya sido usado anteriormente por ningún equipo.

Más temprano que tarde las solicitudes de cambio de nombre empiezan a llegar ya que todo mundo quiere tener un usuario cool. Al llegar la fecha de registro y tener los nombres de usuario finales un miembro del equipo técnico accidentalmente ejecuta un script a la base de datos y borra parte de los registros hechos al cambiar los nombres de usuario de varios equipos por lo que la data ahora ya no es confiable. Para la buena suerte de todos tú llegaste a hacer un respaldo de la base de datos minutos antes de la tragedia y ahora debes ayudar a recuperar los nombres de usuario para los que se perdieron los registros.

El equipo técnico cuenta con ciertos registros de usuarios que ocurrieron después que el equipo correspondiente pidiera hacer un cambio (es posible que el mismo equipo haya hecho cambios antes y/o después de este mismo) y quieren saber por cada usuario cuál fue el primer nombre asignado (antes de que el equipo hiciera algún cambio) y el último nombre asignado (después de que el equipo hiciera todos los cambios).
  
---
  
## Input
Un entero n indicando el número de solicitudes de cambio de nombre. Después en las siguientes n líneas dos cadenas user1 y user2 indicando que algún equipo solicitó cambiar su usuario de user1 por user2.

En la siguiente línea un entero q representando el número de consultas que te hará el equipo técnico. Posteriormente en las siguientes q líneas una cadena user1 para la cual tendrás que hacer la búsqueda.

Las cadenas pueden contener letras mayúsculas y minúsculas (las cuales se consideran diferentes) del alfabeto latino.
  
## Output
Por cada consulta deberás imprimir dos cadenas en la misma línea: El primer y último usuarios asociados a user1. Debes imprimir un salto de línea entre cada respuesta.

## Sample Input
```
3
losjaveros
javadabadu
losAccs
losTLEs
```

## Sample Output
```
losjaveros
trycatch
losAccs
losTLEs
```