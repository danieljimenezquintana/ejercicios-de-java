/**
*
*¿Es par y/o divisible entre 5?
*
*/
public class Ejercicio14 {
	public static void main(String[] arg){
		int num1;
		System.out.print("Introduzca un número entero: ");
		num1 = Integer.parseInt(System.console().readLine());
		
		if (num1%2 == 0) {
			System.out.println("El número es par");
			}
		else {
			System.out.println("El número es impar");
			}
		if (num1%5 == 0) {
			System.out.println("El número es divisible entre 5");
			}
		else {
			System.out.println("El número no es divisble entre 5");
		}
	}
}
