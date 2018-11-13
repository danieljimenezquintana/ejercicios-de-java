package tema.pkg7;

import java.util.Scanner;

/**
 *
 * @author daniel
 */
public class Ejercicio5 {
  public static void main(String[] args){
    
    Scanner s = new Scanner(System.in);
    int[] numIntro;
    numIntro = new int[10];
    int x = 0;
    
    System.out.println("Introduzca diez numeros:");
    for (int i = 0; i < 10; i++){
      numIntro[i] = Integer.parseInt(s.nextLine()) ;
    }
    int maximo = numIntro[0];
    int minimo = numIntro[0];
      
    for (int i = 0; i < 10; i++){
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
