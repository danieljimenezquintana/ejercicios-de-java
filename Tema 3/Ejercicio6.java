/**
 * 
 * Cálculo del área de un triángulo
 * 
 * 
 */
 public class Ejercicio6 {
	public static void main(String[] args) {
	double base;
	System.out.print("Introduzca la base del triángulo: ");
	base = Double.parseDouble(System.console().readLine());
	double altura;
	System.out.print("Introduzca la altura del triángulo: ");
	altura = Double.parseDouble(System.console().readLine());
	double area;
	area = ((base * altura) / 2);
	System.out.println("El área del triángulo es: " + area);
	
	}
}

