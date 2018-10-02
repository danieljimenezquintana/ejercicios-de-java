/**
 * 
 * Cálculo del tiempo que tarda en caer un objeto
 * 
 */
public class Ejercicio6 {
	public static void main(String[] args) {
		double altura;
		System.out.print("Introduzca la altura de la que cae el objeto: ");
		altura = Double.parseDouble(System.console().readLine());
		double tiempo;
		double g = 9.81;
		tiempo = Math.sqrt((2 * altura) / g);
		System.out.print("El tiempo que tarda en caer el objeto es: ");
	}
}
