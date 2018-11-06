/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author daniel
 */
public class Ejercicio6 {
  public static void main(String[] args){
    int oportunidades;
    int numIntro ;
    int mayor;
    int menor;
    for (oportunidades = 1 ; oportunidades < 5; oportunidades--){
      int numRandom = (int)(Math.random()*100);
      System.out.println("introduzca un número: ");
      numIntro = Integer.parseInt(System.console().readLine());
      if (numIntro != numRandom){
      System.out.print("\n ¡Enhorabuena has acertado!");
      }else {
         System.out.print("\n ¡Oh has fallado! \n Inténtalo de nuevo: ");
         oportunidades--;
      }
       if ( (numIntro > numRandom) && (oportunidades > 0) ){
        System.out.println("El número que estoy pensando es menor que " + numIntro);
        System.out.println("Te quedan " + oportunidades + " oportunidades.");
      }
      
      if ( (numIntro < numRandom) && (oportunidades > 0) ){
        System.out.println("El número que estoy pensando es mayor que " + numIntro);
        System.out.println("Te quedan " + oportunidades + " oportunidades.");
      }
    }
  }
}
