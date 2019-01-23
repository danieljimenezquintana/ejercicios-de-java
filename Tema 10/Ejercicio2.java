package tema.pkg10;

import java.util.ArrayList;

/**
 *
 * @author daniel
 */
public class Ejercicio2 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    ArrayList<Integer> n = new ArrayList<>();
    int tamaño = aleatorio(10,20);
    
    //Genera ArrayList
    for (int i = 0; i < tamaño; i++) {
      int numero = aleatorio(0,100);
      n.add(numero);
    }
    //Calcula la suma, mínimo y máximo
    int suma = 0;
    int min = n.get(0);
    int max = n.get(0);
      
    for (Integer numero : n) {
      suma += numero;
//      if(numero > max){
//        max = numero;
//      }
      max = numero > max ? numero : max;//Misma función que el if comentado
      
//      if(numero < min){
//        min = numero;
//      }
      min = numero < min ? numero : min;//Misma función que el if comentado
    }
    //Pinta el ArrayList y los valores obtenidos
    System.out.println(n);
    System.out.println("La suma es: " + suma);
    System.out.println("El máximo es: " + max);
    System.out.println("El mínimo es: " + min);
  
  }
  public static int aleatorio(int min,int max){
    return (int)(int)(Math.random()* (max - min + 1) + min);
  }
}
