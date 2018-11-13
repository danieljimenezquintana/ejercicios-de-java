package tema.pkg7;

/**
 *
 * @author daniel
 */
public class Ejercicio4 {
  public static void main(String[] args){
    int x = 0;
    int[] numero;
    numero = new int[20];
    int[] cuadrado;
    cuadrado = new int[101];
    int[] cubo;
    cubo = new int[101];
    for (int i = 0; i < 20; i++){
      numero[x] = (int)((Math.random())* 100);
      cuadrado[x] = (numero[x] * numero[x]);
      cubo[x] = (cuadrado[x] * numero[x]);
      x++;
    }
    for(int n = 19; n >= 0; n--){
      System.out.print(numero[n] + " ");
      System.out.print(cuadrado[n] + " ");
      System.out.print(cubo[n] + " ");
      System.out.println();
    }
  }
}
