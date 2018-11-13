package tema.pkg7;

import java.util.Scanner;

/**
 *
 * @author daniel
 */
public class Ejercicio6 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int[] numeros;
    numeros = new int[15];
    int[] cambioorden;
    cambioorden = new int[15];
    int ultimoNumero = 0;
    
    //Introducir números
    
    for (int i = 0; i < 15; i++){
      System.out.print("Introduzca un número: ");
      numeros[i] = Integer.parseInt(s.nextLine());
    }
    numeros[15] = ultimoNumero;
    
    //Cambio de orden del array
    
    for (int i = 1; i < 15; i++) {
      int x = 0;
      cambioorden[i] = numeros[x];
      x++;
    }

     //Mostrar arrays
     
     for (int elemento : numeros){
       System.out.println(numeros[elemento]);
    }
     for (int elemento : cambioorden){
       System.out.println(numeros[elemento]);
    }

//    for (int i = 0; i < 15; i++){
//      int x = -1;
//      if((i != 14) && (i != 0)){
//        System.out.print(numeros [x] + "\n ");
//      }if(i == 14){
//        System.out.println(numeros[0]);
//      }if(i == 0){
//        System.out.print(numero[14]);
//      }
//    }
  }
}
