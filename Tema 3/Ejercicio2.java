/**
 * 
 * Conversor de euros a pesetas
 * 
 * 
 */
 public class Ejercicio2 {
	public static void main(String[] args) {
	double euros;
	System.out.print("Introduzca la cantidad de euros: ");
	euros = Float.parseFloat(System.console().readLine());
	double pesetas;
	pesetas = euros * 166.386;
	System.out.print("la cantidad de euros introducida en peseta es : " + pesetas);
	}
}

