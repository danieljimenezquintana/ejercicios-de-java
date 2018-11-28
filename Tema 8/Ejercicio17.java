
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
public class Ejercicio17 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int n = 0;
    int x  = 0;
    int sumpot = 0;
    long posicion = 0;
    
    System.out.print("Introduzca un número en binario para pasarlo a decimal: ");
    long num = Long.parseLong(s.nextLine());
   
    for (long i = num; i > 0 ; i /= 10) {
       sumpot += Math.pow(2, posicion)* (i%10);
       posicion++;
     }System.out.println(sumpot);
  }
}
