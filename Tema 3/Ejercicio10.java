/**
*
*Conversor de Mb a Kb
*
*/
public class Ejercicio10 {
  public static void main(String[] args){
  float mb;
  System.out.print("Introduzca la cantidad en MB: ");
  mb = Float.parseFloat(System.console().readLine());
  float kb;
  kb = mb * 1024;
  System.out.print("La cantidad en KB es: " + kb);
  }
}
