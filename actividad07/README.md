# JFo 8.3 y 8.4 - Actividad 07

## Crea una calculadora segura

Implementa divide y controla desde main un divisor igual a cero.

### Detalles

- Implementa en `Calculator` un método `int divide(int dividend, int divisor)` que lance `ArithmeticException("el divisor no puede ser cero")` si el divisor es 0.
- En `main` muestra `12 / 3 = 4` con `divide(12, 3)` y llama después a `divide(5, 0)` dentro de un `try/catch`, mostrando `"Error: " + e.getMessage()`.

## Objetivo

- Leer el código base y corregirlo o completarlo.
- Ejecutar el programa y comprobar el resultado.
- Ejecutar los tests JUnit para confirmar la autocorrección.
- Hacer `git add`, `git commit` y `git push`.

## Salida esperada

```text
12 / 3 = 4
Error: el divisor no puede ser cero
```

## Instrucciones para Eclipse

1. Importa este proyecto como proyecto Maven.
2. Abre `src/main/java/modulo8_3_8_4_actividad07/Actividad07.java`.
3. Corrige o completa el código.
4. Ejecuta `Run As > Java Application`.
5. Ejecuta `Actividad07Test.java` con `Run As > JUnit Test`.
6. Haz commit y push cuando la actividad funcione.

## GitHub Actions

- Sube tu trabajo a **tu rama** (no a `main`): el workflow `Autocorrección` compila y ejecuta los tests de cada actividad que hayas modificado.
- En la pestaña **Actions** del repositorio verás ✅ si la actividad está aprobada o ❌ si hay errores de compilación o tests que fallan.
