/**
 * 
 * Cálculo del área de un cono
 * 
 */
 public class Ejercicio9 {
  public static void main(String[] args){
  double radio;
  System.out.print("Introduzca el radio del cono: ");
  radio = Double.parseDouble(System.console().readLine());
  double altura;
  System.out.print("Introduzca la altura del cono: ");
  altura = Double.parseDouble(System.console().readLine());
  double area;
  area = (1.0 / 3.0) * Math.PI * radio * radio * altura;
  System.out.print("El área del cono es: " + area);
  }
}
