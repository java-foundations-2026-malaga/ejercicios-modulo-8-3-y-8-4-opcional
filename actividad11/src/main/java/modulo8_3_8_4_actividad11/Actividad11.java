package modulo8_3_8_4_actividad11;

public class Actividad11 {
    static int maximum(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        }
        if (b > a && b > c) {
            return b;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(maximum(3, 3, 3));
    }
}
