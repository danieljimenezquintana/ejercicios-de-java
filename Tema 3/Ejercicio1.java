/**
 * 
 * Multiplicación de dos números
 * 
 * 
 */
 public class Ejercicio1 {
	public static void main(String[] args) {
	float x;
	System.out.print("Introduzca un número: ");
	x = Float.parseFloat(System.console().readLine());
	float y;
	System.out.print("Introduzca otro número: ");
	y = Float.parseFloat(System.console().readLine());
	System.out.print("la multiplicación de dichos números son: " + (x * y));
	}
}
