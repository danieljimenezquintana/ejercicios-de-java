public class Ejercicio29 {
  public static void main(String[] args) {
    System.out.print("Introduzca un número entero positivo grande: ");
    int numGrande = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca otro número pequeño: ");
    int numPequeno = Integer.parseInt(System.console().readLine());
    for (int i = 1; i < numGrande; i++) {
        if (numGrande % 2 != 0){
        if ((i % numPequeno) != 0) {
        System.out.print(i + " ");
        }
      }
    }
  }
}
