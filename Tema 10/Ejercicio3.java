package tema.pkg10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author daniel
 */
public class Ejercicio3 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    ArrayList <Integer> n = new ArrayList<>();
    
    System.out.print("Introduzca números hasta que no te pida más: ");
    for (int i = 0; i < 10; i++) {
      System.out.print("\nIntroduzca un número (te quedan " + (10 - i) + " números): ");
      n.add(Integer.parseInt(s.nextLine()));
    }
    System.out.println("");
    Collections.sort(n);
    System.out.println(n);
  
  
  }
}
