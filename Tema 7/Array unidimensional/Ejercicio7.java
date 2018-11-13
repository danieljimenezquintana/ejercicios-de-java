package tema.pkg7;

import java.util.Scanner;

/**
 *
 * @author daniel
 */
public class Ejercicio7 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int[] numeros;
    numeros = new int[100];
    int numCambiar;
    int numCambio;
    
    //Crear 100 números del 0 al 20 y mostrarlos
    
    for(int i = 0; i < 100; i++){
      numeros[i] = (int)(Math.random()*21);
      System.out.print(numeros[i] + " ");
    }

    //Cambiar los números

    System.out.print("\nEscriba el número que desee cambiar: ");
    numCambiar = Integer.parseInt(s.nextLine());
    System.out.print("\nIntroduzca el número por el que lo quieres cambiar: ");
    numCambio = Integer.parseInt(s.nextLine());
    
    //Mostrar array con los numeros cambiados
    
    for(int i = 0; i < 100; i++){
      for(int elemento : numeros){
        if(elemento == numCambiar){
        System.out.print("\"" + numCambio + "\" ");
        }else{
        System.out.print(elemento + " ");
        }
      }
    }
  }
}
