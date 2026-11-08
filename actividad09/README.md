# JFo 8.3 y 8.4 - Actividad 09

## Suma segura de un array

Implementa sumArray sin acceder fuera de rango y prueba varios tamaños.

### Detalles

- Corrige `sumArray` y muestra `"Vacío: " + sumArray(new int[0])`, `"Tres: " + sumArray(new int[] {1, 2, 3})` y `"Cinco: " + sumArray(new int[] {1, 2, 3, 4, 5})`.

## Objetivo

- Leer el código base y corregirlo o completarlo.
- Ejecutar el programa y comprobar el resultado.
- Ejecutar los tests JUnit para confirmar la autocorrección.
- Hacer `git add`, `git commit` y `git push`.

## Salida esperada

```text
Vacío: 0
Tres: 6
Cinco: 15
```

## Instrucciones para Eclipse

1. Importa este proyecto como proyecto Maven.
2. Abre `src/main/java/modulo8_3_8_4_actividad09/Actividad09.java`.
3. Corrige o completa el código.
4. Ejecuta `Run As > Java Application`.
5. Ejecuta `Actividad09Test.java` con `Run As > JUnit Test`.
6. Haz commit y push cuando la actividad funcione.

## GitHub Actions

- Sube tu trabajo a **tu rama** (no a `main`): el workflow `Autocorrección` compila y ejecuta los tests de cada actividad que hayas modificado.
- En la pestaña **Actions** del repositorio verás ✅ si la actividad está aprobada o ❌ si hay errores de compilación o tests que fallan.
