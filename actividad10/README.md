# JFo 8.3 y 8.4 - Actividad 10

## Depura con print un acumulador incorrecto

Rastrea n y sum, corrige la inicialización y suma del 1 al 10.

### Detalles

- Dentro del bucle, después de sumar, muestra `"n=" + n + ", sum=" + sum` para rastrear los valores. Al final muestra el total.

## Objetivo

- Leer el código base y corregirlo o completarlo.
- Ejecutar el programa y comprobar el resultado.
- Ejecutar los tests JUnit para confirmar la autocorrección.
- Hacer `git add`, `git commit` y `git push`.

## Salida esperada

```text
n=1, sum=1
n=2, sum=3
n=3, sum=6
n=4, sum=10
n=5, sum=15
n=6, sum=21
n=7, sum=28
n=8, sum=36
n=9, sum=45
n=10, sum=55
Total: 55
```

## Instrucciones para Eclipse

1. Importa este proyecto como proyecto Maven.
2. Abre `src/main/java/modulo8_3_8_4_actividad10/Actividad10.java`.
3. Corrige o completa el código.
4. Ejecuta `Run As > Java Application`.
5. Ejecuta `Actividad10Test.java` con `Run As > JUnit Test`.
6. Haz commit y push cuando la actividad funcione.

## GitHub Actions

- Sube tu trabajo a **tu rama** (no a `main`): el workflow `Autocorrección` compila y ejecuta los tests de cada actividad que hayas modificado.
- En la pestaña **Actions** del repositorio verás ✅ si la actividad está aprobada o ❌ si hay errores de compilación o tests que fallan.
