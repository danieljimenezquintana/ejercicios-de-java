/**
 * 
 * Cálculo del área de un triángulo
 * 
 * 
 */
 public class Ejercicio5 {
	public static void main(String[] args) {
	double lado1;
	System.out.print("Introduzca un lado del rectángulo: ");
	lado1 = Double.parseDouble(System.console().readLine());
	double lado2;
	System.out.print("Introduzca el otro lado del rectángulo: ");
	lado2 = Double.parseDouble(System.console().readLine());
	double area;
	area = (lado1 * lado2);
	System.out.println("El área del rectángulo es: " + area);
	
	}
}

