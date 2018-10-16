public class Ejercicio27 {
  public static void main(String[] args) {
    System.out.print("Introduzca un número entero mayor que 1: ");
    int numIntro ;
    numIntro = Integer.parseInt(System.console().readLine());
    int cuenta = 0;
    int suma = 0;
    for (int i = 1; i < numIntro; i++) {
      if ((i % 3) == 0) {
        System.out.print(i + " ");
        cuenta++;
        suma += i;
      }
    }
    System.out.println("Desde 1 hasta " + numIntro + " hay " + cuenta);
    System.out.println("Los múltiplos de 3 suman " + suma);
  }
}
