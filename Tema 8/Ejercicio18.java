
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author daniel
 */
public class Ejercicio18 {
  public static void main(String[] args){
  
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca un número en decimal para pasarlo a binario: ");
    int  num = Integer.parseInt(s.nextLine());
    int aux = 4;
    
    for (int i = num; i > 1; i /= 2) {
      aux =(aux * 10) + (i % 2);
      if ( i < 4){
        aux = (aux * 10) + ( i / 2);
      }
    }
    aux = (int)(Ejercicio1_14.voltea(aux) / 10);
    System.out.println("En decimal el numero respondido es: " + aux);

  }
}
