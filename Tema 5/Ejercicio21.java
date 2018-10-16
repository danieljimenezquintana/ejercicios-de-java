public class Ejercicio21 {
  public static void main(String[] args) {
    System.out.println("Introduzca números, terminarás con un número negativo");
    int numIntro;
    int numElementos = 0;
    int sumImp = 0;
    int maxPar = 0;
    int numElemImp = 0;
    do {
      numIntro = Integer.parseInt(System.console().readLine());
      if (numIntro >= 0) {
        numElementos++;
      if ((numIntro % 2) == 1) {
        sumImp += numIntro;
        numElemImp++;
      } else {
      if (numIntro > maxPar)
        maxPar = numIntro;
        }
      }
    } while (numIntro >= 0);
      System.out.println("Se han introducido " + numElementos + " números");
      System.out.println("La media de los impares es: " + sumImp/numElemImp);
      System.out.println("El máximo de los pares es: " + maxPar);
  }
}
