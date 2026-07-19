package modulo8_3_8_4_actividad15;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import org.junit.jupiter.api.Test;

class Actividad15Test {
  @Test
  void salidaEsperada() throws Exception {
    ByteArrayOutputStream buffer = new ByteArrayOutputStream();
    PrintStream originalOut = System.out;
    InputStream originalIn = System.in;
    System.setOut(new PrintStream(buffer, true, StandardCharsets.UTF_8));
    System.setIn(new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8)));
    try {
      Actividad15.main(new String[0]);
    } finally {
      System.setOut(originalOut);
      System.setIn(originalIn);
    }
    String output = buffer.toString(StandardCharsets.UTF_8).replace("\r\n", "\n").trim();
    assertEquals(
        "1582, 2: año no válido\n"
            + "1583, 0: mes no válido\n"
            + "1583, 13: mes no válido\n"
            + "1583, 1: fecha válida\n"
            + "1583, 12: fecha válida\n"
            + "texto: entrada no numérica",
        output);
  }
}
