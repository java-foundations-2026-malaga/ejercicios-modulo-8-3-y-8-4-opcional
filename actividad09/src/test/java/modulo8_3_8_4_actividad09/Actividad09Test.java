package modulo8_3_8_4_actividad09;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.jupiter.api.Test;

public class Actividad09Test {

    private static final String SALIDA_ESPERADA =
            "Vacío: 0\n"
            + "Tres: 6\n"
            + "Cinco: 15";

    private static final Pattern NUMERO = Pattern.compile("-?\\d+(?:[.,]\\d+)?");

    @Test
    void pruebaSalidaEsperada() throws Exception {
        String salida = ejecutarMain();
        comprobarSalida(SALIDA_ESPERADA, salida);
    }

    @Test
    void pruebaCodigoFuente() throws Exception {
        String codigo = leerCodigoFuente();
        assertTrue(contar(codigo, "\\bsumArray\\s*\\(") >= 2,
                "Usa el método sumArray.");
        assertTrue(contar(codigo, "<=\\s*\\w+\\s*\\.\\s*length\\b") == 0,
                "No accedas fuera de rango: usa i < values.length.");
    }

    private String ejecutarMain() throws Exception {
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(buffer, true, StandardCharsets.UTF_8));
        try {
            Actividad09.main(new String[0]);
        } finally {
            System.setOut(originalOut);
        }
        return buffer.toString(StandardCharsets.UTF_8);
    }

    // Compara línea a línea ignorando espacios al principio y al final de cada línea,
    // saltos de línea finales y pequeñas diferencias de redondeo en números decimales.
    private void comprobarSalida(String esperada, String real) {
        String[] lineasEsperadas = normalizar(esperada).split("\n", -1);
        String[] lineasReales = normalizar(real).split("\n", -1);
        boolean iguales = lineasEsperadas.length == lineasReales.length;
        for (int i = 0; iguales && i < lineasEsperadas.length; i++) {
            iguales = lineasIguales(lineasEsperadas[i], lineasReales[i]);
        }
        if (!iguales) {
            assertEquals(normalizar(esperada), normalizar(real));
        }
    }

    private String normalizar(String texto) {
        String[] lineas = texto.replace("\r\n", "\n").replace('\r', '\n').trim().split("\n", -1);
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < lineas.length; i++) {
            if (i > 0) {
                resultado.append('\n');
            }
            resultado.append(lineas[i].trim());
        }
        return resultado.toString();
    }

    private boolean lineasIguales(String esperada, String real) {
        if (esperada.equals(real)) {
            return true;
        }
        if (!NUMERO.matcher(esperada).replaceAll("#").equals(NUMERO.matcher(real).replaceAll("#"))) {
            return false;
        }
        Matcher numerosEsperados = NUMERO.matcher(esperada);
        Matcher numerosReales = NUMERO.matcher(real);
        while (numerosEsperados.find() && numerosReales.find()) {
            String numeroEsperado = numerosEsperados.group();
            String numeroReal = numerosReales.group();
            if (numeroEsperado.contains(".")) {
                if (!numeroReal.contains(".") && !numeroReal.contains(",")) {
                    return false;
                }
                double valorEsperado = Double.parseDouble(numeroEsperado);
                double valorReal = Double.parseDouble(numeroReal.replace(',', '.'));
                if (Math.abs(valorEsperado - valorReal) > 1e-6) {
                    return false;
                }
            } else if (!numeroEsperado.equals(numeroReal)) {
                return false;
            }
        }
        return true;
    }

    // Lee el código del alumno sin comentarios.
    private String leerCodigoFuente() throws Exception {
        String codigo = Files.readString(Path.of("src/main/java/modulo8_3_8_4_actividad09/Actividad09.java"), StandardCharsets.UTF_8);
        codigo = codigo.replaceAll("(?s)/\\*.*?\\*/", "");
        codigo = codigo.replaceAll("//[^\n]*", "");
        return codigo;
    }

    private int contar(String codigo, String regex) {
        Matcher matcher = Pattern.compile(regex).matcher(codigo);
        int total = 0;
        while (matcher.find()) {
            total++;
        }
        return total;
    }
}
