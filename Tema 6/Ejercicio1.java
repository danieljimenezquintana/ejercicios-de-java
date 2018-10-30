
package tema.pkg6;

/**
 *
 * @author daniel
 */
public class Ejercicio1 {
  public static void main(String[] args) {
    int total = 0;
    int num = 0;
    for(int i = 0; i < 3; i++){
      num = (int) (((Math.random() * 6) + 1));
      System.out.println(num);
      total = total + num;
    }
    System.out.println("El total es :" + total);
  }
  
}
