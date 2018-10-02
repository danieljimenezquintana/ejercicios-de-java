/**
 * 
 * Ecuación de primer grado del tipo ax+b=0
 * 
 */
public class Ejercicio5 {
	public static void main(String[] args) {
		double a;
		double b;
		System.out.print("Introduzca el valor de a en la ecuación de tipo ax+b=0: ");
		a = Double.parseDouble(System.console().readLine());
		System.out.print("Introduzca el valor de b: ");
		b = Double.parseDouble(System.console().readLine());
		double x;
		x = -b / a;
		System.out.print("El valor de x es: " + x);
	}
}
