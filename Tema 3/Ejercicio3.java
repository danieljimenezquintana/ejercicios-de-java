/**
 * 
 * Conversor de pesetas a euros
 * 
 * 
 */
 public class Ejercicio3 {
	public static void main(String[] args) {
	double pesetas;
	System.out.print("Introduzca la cantidad de pesetas: ");
	pesetas = Float.parseFloat(System.console().readLine());
	double euros;
	euros = pesetas / 166.386;
	System.out.print("la cantidad de pesetas introducida en euros son : " + euros);
	}
}

