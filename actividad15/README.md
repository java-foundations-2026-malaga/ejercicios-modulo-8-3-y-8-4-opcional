# JFo 8.3 y 8.4 - Actividad 15

## Validador robusto de fecha simple

Valida año y mes, prueba los límites indicados y controla entradas no numéricas.

### Detalles

- Escribe `static String validateDate(int year, int month)`: si el año es menor que 1583 devuelve `año no válido`; si el mes no está entre 1 y 12, `mes no válido`; si no, `fecha válida`.
- Muestra los casos (1582, 2), (1583, 0), (1583, 13), (1583, 1) y (1583, 12) con el formato `año, mes: resultado`.
- Por último intenta convertir el texto `"texto"` con `Integer.parseInt` y captura `NumberFormatException` para mostrar `texto: entrada no numérica`.

## Objetivo

- Leer el código base y corregirlo o completarlo.
- Ejecutar el programa y comprobar el resultado.
- Ejecutar los tests JUnit para confirmar la autocorrección.
- Hacer `git add`, `git commit` y `git push`.

## Salida esperada

```text
1582, 2: año no válido
1583, 0: mes no válido
1583, 13: mes no válido
1583, 1: fecha válida
1583, 12: fecha válida
texto: entrada no numérica
```

## Instrucciones para Eclipse

1. Importa este proyecto como proyecto Maven.
2. Abre `src/main/java/modulo8_3_8_4_actividad15/Actividad15.java`.
3. Corrige o completa el código.
4. Ejecuta `Run As > Java Application`.
5. Ejecuta `Actividad15Test.java` con `Run As > JUnit Test`.
6. Haz commit y push cuando la actividad funcione.

## GitHub Actions

- Sube tu trabajo a **tu rama** (no a `main`): el workflow `Autocorrección` compila y ejecuta los tests de cada actividad que hayas modificado.
- En la pestaña **Actions** del repositorio verás ✅ si la actividad está aprobada o ❌ si hay errores de compilación o tests que fallan.
