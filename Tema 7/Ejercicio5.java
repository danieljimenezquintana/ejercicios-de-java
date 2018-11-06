package tema.pkg7;

import java.util.Scanner;

/**
 *
 * @author daniel
 */
public class Ejercicio5 {
  public static void main(String[] args){
    int maximo = 0;
    Scanner s = new Scanner(System.in);
    int[] numIntro;
    numIntro = new int[10];
    int x = 0;
    int minimo = 2147483647;
    System.out.println("Introduzca diez numeros:");
    for (int i = 0; i < 10; i++){
      numIntro[x] = Integer.parseInt(s.nextLine()) ;
      if (numIntro[x] > maximo){
        maximo = numIntro[x];
      }
      if (numIntro[x] < minimo){
        minimo = numIntro[x];
      }
      x++;
    }
    System.out.println("El máximo es: " + maximo);
    System.out.println("El mínimo es: " + minimo);
  }
}
