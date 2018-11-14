/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema.pkg7;

/**
 *
 * @author daniel
 */
public class Ejercicio21 {
  public static void main(String[] args) throws InterruptedException{
    
    int[][] numero;
    int columna = 5;
    int fila = 4;
    numero = new int[fila][columna];
    
    //Generar 20 números aleatorios
      for(int i = 0; i < fila; i++){
        for(int j = 0;j < columna; j++){
          numero[i][j] = (int)((Math.random()* 999) + 100);
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
      }//Mostrar suma de la fila
      Thread.sleep(1000); 
      System.out.printf(" = "+ sumaFila[i]);
      System.out.println("");
    }System.out.println("----------------------------------------------------");
    
    //Mostrar suma de la columna
    Thread.sleep(1000); 
    for(int i = 0 ; i < columna; i++){
      System.out.printf("%5d", sumaColumna[i]);
    }System.out.println("");
  }
}

