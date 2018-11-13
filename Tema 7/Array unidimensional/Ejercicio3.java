
package tema.pkg7;

import java.util.Scanner;

/**
 *
 * @author daniel
 */
public class Ejercicio3 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int[] numIntro;
    numIntro = new int[10];
    int x = 0;
    System.out.println("Introduzca diez numeros:");
    for (int i = 0; i < 10; i++){
      numIntro[x] = Integer.parseInt(s.nextLine()) ;
      x++;
    }System.out.println();
    for(int n = 9; n >= 0; n--){
      System.out.print(numIntro[n] + " ");
    }
  
  }
}
