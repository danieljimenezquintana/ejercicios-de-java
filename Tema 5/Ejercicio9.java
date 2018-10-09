/**
 * 
 * Programa que nos dice cuántos dígitos tiene un número 
 * 
 */
 public class Ejercicio9{ 
	public static void main(String[] args){
		int digitos = 1;
		int numIntro;
		int n;
		System.out.print("Introduce un número: ");
		numIntro = Integer.parseInt(System.console().readLine());
		n = numIntro;
		while (n > 10) {
			n /= 10;
			digitos++;
			}
		System.out.print("El número introducido tiene : " + digitos + " dígitos");
	}
}
