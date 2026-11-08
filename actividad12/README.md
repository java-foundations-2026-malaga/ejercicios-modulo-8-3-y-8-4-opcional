# JFo 8.3 y 8.4 - Actividad 12

## Depura una fórmula de distancia

Corrige la distancia entre dos puntos y calcula el tiempo según la velocidad.

### Detalles

- La firma correcta es `getDistance(double x1, double y1, double x2, double y2)` y la fórmula `Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1))`.
- Calcula la distancia entre (0, 0) y (3, 4) y el tiempo con un método `getTime(double distance, double speed)` = distancia / velocidad, con velocidad 10.

## Objetivo

- Leer el código base y corregirlo o completarlo.
- Ejecutar el programa y comprobar el resultado.
- Ejecutar los tests JUnit para confirmar la autocorrección.
- Hacer `git add`, `git commit` y `git push`.

## Salida esperada

```text
Distancia: 5.0
Tiempo: 0.5
```

## Instrucciones para Eclipse

1. Importa este proyecto como proyecto Maven.
2. Abre `src/main/java/modulo8_3_8_4_actividad12/Actividad12.java`.
3. Corrige o completa el código.
4. Ejecuta `Run As > Java Application`.
5. Ejecuta `Actividad12Test.java` con `Run As > JUnit Test`.
6. Haz commit y push cuando la actividad funcione.

## GitHub Actions

- Sube tu trabajo a **tu rama** (no a `main`): el workflow `Autocorrección` compila y ejecuta los tests de cada actividad que hayas modificado.
- En la pestaña **Actions** del repositorio verás ✅ si la actividad está aprobada o ❌ si hay errores de compilación o tests que fallan.
