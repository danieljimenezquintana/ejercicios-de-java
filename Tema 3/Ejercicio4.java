/**
 * 
 * Suma, resta, división, multiplicación de dos números
 * 
 * 
 */
 public class Ejercicio4 {
	public static void main(String[] args) {
	double x;
	System.out.print("Introduzca un número: ");
	x = Double.parseDouble(System.console().readLine());
	double y;
	System.out.print("Introduzca otro número: ");
	y = Double.parseDouble(System.console().readLine());
	System.out.println("El resultado de la suma de ambos número es: " + (x + y));
	System.out.println("El resultado de la resta de ambos números es: " + (x - y));
	System.out.println("El resultado de la división de ambos números es: " + (x / y));
	System.out.println("El resultado de la multiplicación de ambos números es: " + (x * y));
	}
}

