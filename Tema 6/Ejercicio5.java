/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author daniel
 */
public class Ejercicio5 {
  public static void main(String[] args){
    int minimo = 199;
    int maximo = 100;
    int numero;
    int suma = 0;
    for(int i = 0;i < 50;i++){
      numero = (int)((Math.random()*100) + 100);
      System.out.print(numero + " ");
      suma += numero;
        if (numero < minimo){
         minimo = numero;
        }
        if (numero > maximo){
        maximo = numero;
        }
    }
    System.out.print("\nEl mínimo es: " + minimo + ", el máximo es: " + maximo + " y la media es: " + (suma / 50));
    System.out.println("");
       
  }
}
