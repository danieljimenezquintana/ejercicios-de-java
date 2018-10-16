public class Ejercicio22 {
  public static void main(String[] args) {
    System.out.print("Los números primos comprendidos entre 2 y 100 son: ");
    boolean esPrimo = true;
    for (int j = 2; j <= 100; j++) {
      esPrimo = true;
      for (int i = 2; i < j; i++) {
        if (j % i == 0) {
        esPrimo = false;
        }
      }
      if (esPrimo) {
        System.out.print(j + "-");
      }
    }
  }
}
