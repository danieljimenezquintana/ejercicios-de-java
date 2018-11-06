/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author daniel
 */
public class Ejercicio9 {
  public static void main(String[] args) {
    
    int num = 0;
    int cuentaNumeros = 0;
    
    while (num != 24) {
      num = (int)(Math.random() * 51) * 2;
      System.out.print(num + " ");
      cuentaNumeros++;
    }
    System.out.println("");
    System.out.println("Se han generado " + cuentaNumeros + " números.");
  }
}
