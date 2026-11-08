# JFo 8.3 y 8.4 - Actividad 14

## Diseña pruebas de condiciones límite

Valida el intervalo inclusivo 50..100 con valores cercanos a ambos límites.

### Detalles

- Corrige `isValid` para que acepte el intervalo **inclusivo** 50..100 y muestra el resultado para 49, 50, 51, 99, 100 y 101 con el formato `valor: resultado`.

## Objetivo

- Leer el código base y corregirlo o completarlo.
- Ejecutar el programa y comprobar el resultado.
- Ejecutar los tests JUnit para confirmar la autocorrección.
- Hacer `git add`, `git commit` y `git push`.

## Salida esperada

```text
49: false
50: true
51: true
99: true
100: true
101: false
```

## Instrucciones para Eclipse

1. Importa este proyecto como proyecto Maven.
2. Abre `src/main/java/modulo8_3_8_4_actividad14/Actividad14.java`.
3. Corrige o completa el código.
4. Ejecuta `Run As > Java Application`.
5. Ejecuta `Actividad14Test.java` con `Run As > JUnit Test`.
6. Haz commit y push cuando la actividad funcione.

## GitHub Actions

- Sube tu trabajo a **tu rama** (no a `main`): el workflow `Autocorrección` compila y ejecuta los tests de cada actividad que hayas modificado.
- En la pestaña **Actions** del repositorio verás ✅ si la actividad está aprobada o ❌ si hay errores de compilación o tests que fallan.
