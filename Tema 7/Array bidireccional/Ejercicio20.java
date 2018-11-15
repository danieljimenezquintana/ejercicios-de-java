package tema.pkg7;
/**
 *
 * @author daniel
 */
public class Ejercicio20 {
   public static void main(String[] args){
    
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
    for(int i = 0; i < columna; i++){
      sumaTotal += sumaColumna[i];
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
    }
    //Mostrar suma total
    System.out.printf(" = " + sumaTotal);
    System.out.println("");
  }
}