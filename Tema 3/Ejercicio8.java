public class Ejercicio8 {
  public static void main(String[] args){
  float horasDeTrabajo;
  System.out.print("Introduzca las horas de trabajo: ");
  horasDeTrabajo = Float.parseFloat(System.console().readLine());
  float salariosemanal;
  salariosemanal = horasDeTrabajo * 12;
  System.out.println("El salario semanal es: " + salariosemanal );
  }
}
