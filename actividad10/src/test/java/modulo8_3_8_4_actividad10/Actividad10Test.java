package modulo8_3_8_4_actividad10;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import org.junit.jupiter.api.Test;

class Actividad10Test {
  @Test
  void salidaEsperada() throws Exception {
    ByteArrayOutputStream buffer = new ByteArrayOutputStream();
    PrintStream originalOut = System.out;
    InputStream originalIn = System.in;
    System.setOut(new PrintStream(buffer, true, StandardCharsets.UTF_8));
    System.setIn(new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8)));
    try {
      Actividad10.main(new String[0]);
    } finally {
      System.setOut(originalOut);
      System.setIn(originalIn);
    }
    String output = buffer.toString(StandardCharsets.UTF_8).replace("\r\n", "\n").trim();
    assertEquals(
        "n=1, sum=1\n"
            + "n=2, sum=3\n"
            + "n=3, sum=6\n"
            + "n=4, sum=10\n"
            + "n=5, sum=15\n"
            + "n=6, sum=21\n"
            + "n=7, sum=28\n"
            + "n=8, sum=36\n"
            + "n=9, sum=45\n"
            + "n=10, sum=55\n"
            + "Total: 55",
        output);
  }
}
