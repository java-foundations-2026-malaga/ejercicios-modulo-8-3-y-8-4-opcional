# JFo 8.3 y 8.4 - Actividad 13

## Detecta errores típicos de sintaxis y lógica

Corrige asignaciones, comparaciones, punto y coma sobrante y tipos de argumentos.

### Detalles

- Declara `int x = 1;` y muestra `"x vale " + x`.
- Quita el `;` que sigue al `if` y añade un `else` que muestre `x no es cero`.
- Muestra `"Suma: " + sum(2, 3)` (pasando números, no texto).

## Objetivo

- Leer el código base y corregirlo o completarlo.
- Ejecutar el programa y comprobar el resultado.
- Ejecutar los tests JUnit para confirmar la autocorrección.
- Hacer `git add`, `git commit` y `git push`.

## Salida esperada

```text
x vale 1
x no es cero
Suma: 5
```

## Instrucciones para Eclipse

1. Importa este proyecto como proyecto Maven.
2. Abre `src/main/java/modulo8_3_8_4_actividad13/Actividad13.java`.
3. Corrige o completa el código.
4. Ejecuta `Run As > Java Application`.
5. Ejecuta `Actividad13Test.java` con `Run As > JUnit Test`.
6. Haz commit y push cuando la actividad funcione.

## GitHub Actions

- Sube tu trabajo a **tu rama** (no a `main`): el workflow `Autocorrección` compila y ejecuta los tests de cada actividad que hayas modificado.
- En la pestaña **Actions** del repositorio verás ✅ si la actividad está aprobada o ❌ si hay errores de compilación o tests que fallan.
