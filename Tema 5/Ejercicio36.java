public class Ejercicio36 {
  public static void main(String[] args) {
    long volteado = 0;
    long numIntro;
    System.out.println("Introduzca un número: ");
    numIntro = Long.parseLong(System.console().readLine());
    long num = numIntro;
    while (num > 0) {
      volteado = (volteado * 10) + (num % 10);   
      num /= 10;
    } 
    if (volteado == numIntro) {
        System.out.println("El " + numIntro + " es capicúo");
      } else {
      System.out.println("El " + numIntro + " no es capicúo");
    }
  }
}
