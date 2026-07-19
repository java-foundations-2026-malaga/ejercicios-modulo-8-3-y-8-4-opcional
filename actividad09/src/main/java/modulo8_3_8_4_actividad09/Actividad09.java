package modulo8_3_8_4_actividad09;

public class Actividad09 {
  static int sumArray(int[] values) {
    int sum = 0;
    for (int i = 0; i <= values.length; i++) sum += values[i];
    return sum;
  }

  public static void main(String[] args) {
    System.out.println(sumArray(new int[] {1, 2, 3}));
  }
}
