/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.tema.pkg5;

import java.util.Scanner;

/**
 *
 * @author daniel
 */
public class Ejercicio37 {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    int numIntro;
    do {
    System.out.print("Introduce un número entero positivo: ");
    numIntro = Integer.parseInt(s.nextLine());
    } while (numIntro < 1);
    System.out.print(numIntro + " = ");
    int num = numIntro;
    int numDig = 0;
    int numReves = 0;
    while num > 0){
    numReves = ((numReves*10) + (num % 10));
    num /=10;
    numDig++;
    }
    int cifra = 0;
    for (int i = 0; i < numDig; i++){
    cifra = numReves%10;
    numReves /= 10;
    for (int j = 0; j < cifra; j++){
    System.out.print("|");
    }
    if (i < numDig-1){
    System.out.print("-");
    }
    }
  }
}
  

