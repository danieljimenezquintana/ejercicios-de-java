package tema.pkg7;

import java.util.Scanner;

/**
 *
 * @author daniel
 */
public class Ejercicio19 {
  public static void main(String[] args){
  
    Scanner s = new Scanner(System.in);
    
    int[][] numero;
    int columna = 5;
    int fila = 4;
    numero = new int[fila][columna];
    
    //Introducir 20 números
    System.out.print("introduzca 20 números: ");
      for(int i = 0; i < fila; i++){
        for(int j = 0;j < columna; j++){
          numero[i][j] = Integer.parseInt(s.nextLine());
        }
      }
    int[] sumaColumna;
    sumaColumna = new int[columna];
    int[] sumaFila;
    sumaFila = new int[fila];
    int sumaTotal = 0;
    
    //Suma Columna 
    for(int i = 0; i < fila; i++){
      for(int j = 0;j < columna; j++){
        sumaColumna[j] += numero[i][j];
        }
    } 
    //Suma Fila 
    for(int i = 0; i < fila; i++){
      for(int j = 0;j < columna; j++){
        sumaFila[i] += numero[i][j];
        }
    }   
    //Suma total
    for(int i = 0; i < fila; i++){
      for(int j = 0;j < columna; j++){
        sumaTotal = sumaColumna[j] + numero[i][j];
        }
    }
    //Mostrar array
    for(int i = 0 ; i < fila; i++){
      for(int j = 0; j < columna; j++){
      System.out.printf("%5d", numero[i][j]);
      }
      System.out.printf(" = "+ sumaFila[i]);
      System.out.println("");
    }System.out.println("----------------------------------------------------");
    
    for(int i = 0 ; i < columna; i++){
    System.out.printf("%5d", sumaColumna[i]);
    }System.out.println("");
  }
}
