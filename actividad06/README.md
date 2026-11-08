# JFo 8.3 y 8.4 - Actividad 06

## Clasifica errores

Clasifica y corrige ejemplos de error de compilación, lógica y ejecución.

### Detalles

- Error de compilación: imagina que la declaración era `int x == 1;`; ya corregida, muestra `"Compilación: declaración corregida, x = " + x`.
- Error de lógica: la comparación `2 == 3` no comprueba lo que queremos; corrígela para comparar `x == 1` y muestra `"Lógica: comparación corregida, iguales = " + iguales`.
- Error de ejecución: `10 / 0` lanza `ArithmeticException`; guarda el divisor en una variable y, si es cero, muestra `Ejecución: divisor validado` en lugar de dividir.

## Objetivo

- Leer el código base y corregirlo o completarlo.
- Ejecutar el programa y comprobar el resultado.
- Ejecutar los tests JUnit para confirmar la autocorrección.
- Hacer `git add`, `git commit` y `git push`.

## Salida esperada

```text
Compilación: declaración corregida, x = 1
Lógica: comparación corregida, iguales = true
Ejecución: divisor validado
```

## Instrucciones para Eclipse

1. Importa este proyecto como proyecto Maven.
2. Abre `src/main/java/modulo8_3_8_4_actividad06/Actividad06.java`.
3. Corrige o completa el código.
4. Ejecuta `Run As > Java Application`.
5. Ejecuta `Actividad06Test.java` con `Run As > JUnit Test`.
6. Haz commit y push cuando la actividad funcione.

## GitHub Actions

- Sube tu trabajo a **tu rama** (no a `main`): el workflow `Autocorrección` compila y ejecuta los tests de cada actividad que hayas modificado.
- En la pestaña **Actions** del repositorio verás ✅ si la actividad está aprobada o ❌ si hay errores de compilación o tests que fallan.
