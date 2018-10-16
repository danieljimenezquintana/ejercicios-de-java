public class Ejercicio23 {
  public static void main(String[] args) {
    System.out.println("Introduzca números, terminará cuando su suma sea mayor que 10000: ");
    int numIntro;
    int suma = 0;
    int numElementos = 0;
    do {
      numIntro = Integer.parseInt(System.console().readLine());
      suma += numIntro;
      numElementos++;
    } while (suma <= 10000);
      System.out.println("Ha introducido " + numElementos + " números.");
      System.out.println("La suma total es: " + suma);
      System.out.println("La media es " + suma / numElementos);
  }
}
