package modulo8_3_8_4_actividad12;

public class Actividad12 {
    static double getDistance(double x1, double x2, double y1, double y2) {
        return Math.sqrt((x1 - x1) * (x2 - x2) + (y1 - y1) * (y2 - y2));
    }

    public static void main(String[] args) {
        System.out.println(getDistance(0, 3, 0, 4));
    }
}
