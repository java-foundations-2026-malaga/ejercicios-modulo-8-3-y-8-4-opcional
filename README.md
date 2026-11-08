# JFo 8.3 y 8.4 - Manejo de excepciones, pruebas y depuración

Esta carpeta contiene 15 actividades autocorregibles.

## Actividades

01. Corrige una división por cero
02. Corrige una división por cero usando try/catch
03. Corrige un ArrayIndexOutOfBoundsException
04. Corrige un NullPointerException
05. Corrige una captura demasiado genérica
06. Clasifica errores
07. Crea una calculadora segura
08. Maneja entrada de usuario inválida
09. Suma segura de un array
10. Depura con print un acumulador incorrecto
11. Prueba el máximo de tres números con casos límite
12. Depura una fórmula de distancia
13. Detecta errores típicos de sintaxis y lógica
14. Diseña pruebas de condiciones límite
15. Validador robusto de fecha simple

Cada subcarpeta `actividadNN` es un proyecto Maven independiente con tests JUnit 5 y workflow de GitHub Actions.

## Cómo entregar las actividades

La rama `main` está protegida: contiene los enunciados originales y no se puede modificar.
Cada alumno trabaja en **su propia rama**, con su nombre.

1. Clona el repositorio:
   `git clone https://github.com/java-foundations-2026-malaga/REPOSITORIO.git`
2. Crea tu rama con tu nombre y apellido, en minúsculas y sin tildes ni espacios (por ejemplo `juan-perez`):
   `git checkout -b juan-perez`
   (En Eclipse: botón derecho sobre el proyecto > `Team > Switch To > New Branch...`).
3. Importa en Eclipse la carpeta `actividadNN` que vayas a hacer (`File > Import... > Maven > Existing Maven Projects`), resuélvela y comprueba los tests con `Run As > JUnit Test`.
4. Haz commit y sube **tu rama**:
   `git add .` → `git commit -m "Actividad NN"` → `git push -u origin juan-perez`
   (En Eclipse: `Git Staging` > `Commit and Push...`).
5. En la pestaña **Actions** del repositorio verás el resultado de la autocorrección de cada actividad que hayas modificado: ✅ aprobada o ❌ con los errores.

Si al hacer push te aparece un error sobre `main`, es que estás en la rama equivocada: cambia a tu rama con `git checkout juan-perez`.
