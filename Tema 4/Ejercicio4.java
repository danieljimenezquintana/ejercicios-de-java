/**
*
*Averiguar día de la semana
*
*/
public class Ejercicio4 {
	public static void main(String[] args){
		float horasDeTrabajo;
		System.out.print("Introduzca las horas de trabajo: ");
		horasDeTrabajo = Float.parseFloat(System.console().readLine());
		float salarioSemanal;
		if (horasDeTrabajo <= 40){
		salarioSemanal = horasDeTrabajo * 12;
		System.out.println("El salario semanal es: " + salarioSemanal );
		}
		else if (horasDeTrabajo >= 41) {
		salarioSemanal = (horasDeTrabajo - 40) * 16 + 480;
		System.out.println("El salario semanal es: " + salarioSemanal );
		}
	}
}
