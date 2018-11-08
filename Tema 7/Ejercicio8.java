/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema.pkg7;

import java.util.Scanner;

/**
 *
 * @author daniel
 */
public class Ejercicio8 {
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      int[] numMes;
      numMes = new int[12];
      String[] stringMes = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
      System.out.println("Introduce la temperatura media de cada mes");
      for( int i = 0; i < 12; i++){
        System.out.print("El mes de " + stringMes[i] + ": ");
        numMes[i] = Integer.parseInt(s.nextLine());
      }
      System.out.println("");
      for(int i = 0; i < 12; i++){
        System.out.printf("%14s: ", stringMes[i]);
        for(int j = 1; j <= numMes[i]; j++){
          System.out.print("[]");
        }
        System.out.println("");
      }
  }
}
