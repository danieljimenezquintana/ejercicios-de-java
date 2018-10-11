/**
 * 
 * Programa que nos dice cuántos dígitos tiene un número 
 * 
 */
 public class Ejercicio9{ 
	public static void main(String[] args){
		int digitos = 1;
		int numIntro;
		System.out.print("Introduce un número: ");
		numIntro = Integer.parseInt(System.console().readLine());
		while (numIntro > 10) {
			numIntro /= 10;
			digitos++;
			}
		System.out.print("El número introducido tiene : " + digitos + " dígitos");
	}
}
