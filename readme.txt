Simulador de Evaluación de Estudiantes “CodeChads Academy”

Escenario del ejercicio
CodeChads Academy, una academia de programación en donde los estudiantes compiten para convertirse en el próximo Stone Chad del Backend. Cada estudiante rinde 5 pruebas diferentes a lo largo del curso, y recibe un puntaje entre 0 y 100 en cada una.
1era Parte

El estudiante debe rendir 5 exámenes. Los primeros 3 puntajes ya están disponibles, pero los dos últimos se deben calcular automáticamente:

Si la nota 2 fue menor a 60, la nota 4 será 100 (porque hizo un trabajo práctico extra). Si fue mayor a 60 entonces la nota 4 será igual a la nota 2.
Si la suma de las notas 1 y 3 supera 150, la nota 5 será 95, sino 70.



2da Parte
Teniendo ya precargados los valores de las primeros 5 examenes, continua el flujo :

✅ 1. Verificar si aprobó todas:

Una nota es aprobada si es mayor o igual a 60. Mostrar si el alumno aprobó todas, ninguna o algunas.
"Resultado: Aprobaste todas. ¡Backend Sensei!"
"Resultado: No aprobaste ninguna. ¡Sos un clon de frontend!"
"Resultado: Algunas aprobadas. Sos un refactor en progreso."





✅ 2. Prueba más inconsistente:
Detectar cuál fue la mayor variación entre dos pruebas consecutivas y en qué lugar ocurrió.
"Mayor salto fue de 35 puntos entre la prueba 2 y la prueba 3."

✅ 3. Bonus por progreso:
Si el alumno mejora su nota en cada prueba respecto a la anterior, mostrar:
"¡Nivel PROGRESIVO! Sos un Stone Chad en crecimiento 📈"


✅ 4. Mostrar notas ordenadas (sin usar sort):
Imprimí las notas ordenadas de mayor a menor sin usar Arrays.sort()

✅ 5. Evaluación final por nivel
Según el total acumulado, mostrar un rango personalizado:

Total < 250 → "Normie total 😢"
250–349 → "Soft Chad"
350–449 → "Chad"
450+ → "Stone Chad definitivo 💪"


✅ 6. (Desafío final) Ranking entre varios alumnos
Simulá una clase con 4 estudiantes, cada uno con sus 5 notas. Mostrá:

Qué estudiante obtuvo el promedio más alto
Cuál fue el más regular (menor desviación entre notas).
Quién tuvo el peor rendimiento en la tercera prueba.

Considera aplicar:
int[][]
Acumuladores
Arrays auxiliares
Bucles dobles
