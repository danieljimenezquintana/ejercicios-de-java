/**
*
*Calculo de la nota del segundo examen para sacar la nota final deseada del trimestre
*
*/
public class Ejercicio12 {
  public static void main(String[] args){
  double nota1;
  System.out.print("Introduzca la nota del primer examen: ");
  nota1 = Double.parseDouble(System.console().readLine());
  double notaTrimestral;
  System.out.print("Introduzca la nota deseada para el trimestre: ");
  notaTrimestral = Double.parseDouble(System.console().readLine());
  double nota2;
  nota2 = ( notaTrimestral - (0.4 * nota1 )) / 0.6;
  System.out.print("La nota que debes sacar en el segundo examen es: " + nota2);
  }
}


