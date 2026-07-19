# JFo 8.3 y 8.4 - Actividad 08

## Maneja entrada de usuario inválida

Captura InputMismatchException al leer dos números enteros.

## Objetivo

- Leer el código base y corregirlo o completarlo.
- Ejecutar el programa y comprobar el resultado.
- Ejecutar los tests JUnit para confirmar la autocorrección.
- Hacer `git add`, `git commit` y `git push`.

## Entrada usada por el test

```text
10 texto
```

## Salida esperada

```text
Entrada no válida: escribe números enteros
```

## Instrucciones para Eclipse

1. Importa este proyecto como proyecto Maven.
2. Abre `src/main/java/modulo8_3_8_4_actividad08/Actividad08.java`.
3. Corrige o completa el código.
4. Ejecuta `Run As > Java Application`.
5. Ejecuta `Actividad08Test.java` con `Run As > JUnit Test`.
6. Haz commit y push cuando la actividad funcione.

## GitHub Actions

- El workflow `Java CI` ejecuta automáticamente `mvn test` en cada push.
