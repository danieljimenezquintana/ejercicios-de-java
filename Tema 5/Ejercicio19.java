public class Ejercicio19 {
  public static void main(String[] args) {
    int planta = 1;
    int longitudDeLinea = 1;
    int altura = 1;
    System.out.print("Introduzca la altura de la pirámide: ");
    altura = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca el carácter para hacer la pirámide: ");
    String caracter = System.console().readLine();
    int espacios = altura - 1;
    while (planta <= altura) {
      for (int i = 1; i <= espacios; i++) {
          System.out.print(" ");
      }
      for (int i = 1; i <= longitudDeLinea; i++) {
      System.out.print(caracter);
      }
      System.out.println();
      planta++;
      espacios--;
      longitudDeLinea += 2;
    }
  }
}
