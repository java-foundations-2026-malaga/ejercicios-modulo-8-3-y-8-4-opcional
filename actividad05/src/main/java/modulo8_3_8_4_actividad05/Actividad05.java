package modulo8_3_8_4_actividad05;

public class Actividad05 {
    static void readFile() throws java.io.IOException {
        throw new java.io.IOException("archivo no disponible");
    }

    public static void main(String[] args) {
        try {
            readFile();
        } catch (Exception exception) {
            System.out.println("Error");
        }
    }
}
