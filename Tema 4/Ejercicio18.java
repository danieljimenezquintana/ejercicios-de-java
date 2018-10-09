public class Ejercicio18 {
	public static void main(String[] args){
		int n;
		System.out.println("Introduzca un número de 5 cifras como máximo: ");
		n = Integer.parseInt(System.console().readLine());
		if (n < 10){
			System.out.println("La primera cifra es: 0");
			}
		if ((n >= 10) && (n < 100)){
			System.out.println("La primera cifra es: " + (n / 10));
			}
		if ((n >= 100) && (n < 1000)){
			System.out.println("La primera cifra es: " + (n / 100));
			} 
		if ((n >= 1000) && (n < 10000)){
			System.out.println("La primera cifra es: " + (n / 1000));
			} 
		if ((n >= 10000) && (n < 100000)){
			System.out.println("La primera cifra es: " + (n / 10000));
			} 
	}
}
