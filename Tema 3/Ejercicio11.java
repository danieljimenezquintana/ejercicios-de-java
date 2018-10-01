/**
*
*Conversor de Kb a Mb
*
*/
public class Ejercicio11 {
  public static void main(String[] args){
  float kb;
  System.out.print("Introduzca la cantidad en KB: ");
  kb = Float.parseFloat(System.console().readLine());
  float mb;
  mb = kb / 1024;
  System.out.print("La cantidad en MB es: " + kb);
  }
}
