/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author daniel
 */
public class Ejercicio7 {
  public static void main(String[] args) {
    int resultadoPartido;
    int columnas = 3;
    for (int fila = 1; fila <= 15; fila++) {
      System.out.printf("%4d. |", fila);
      if (fila == 15) {
        columnas = 1;
      }
      for (int apuesta = 1; apuesta <= columnas; apuesta++) {
        resultadoPartido = (int)(Math.random() * 3) + 1;
        switch(resultadoPartido) {
          case 1:
            System.out.print("1  |");
            break;
          case 2:
            System.out.print("  2|");
            break;
          case 3:
            System.out.print(" X |");
          default:
        }
      }
      System.out.println();
    }
  }
}