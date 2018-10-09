public class Ejercicio19 {
	public static void main(String[] args){
		int n;
		System.out.println("Introduzca un número entero(hasta 5 dígitos): ");
		n = Math.abs(Integer.parseInt(System.console().readLine()));
		if (n < 10){
			System.out.println("El número de cifas es: 1");
			}
		if ((n >= 10) && (n < 100)){
			System.out.println("El número de cifras es: 2");
			}
		if ((n >= 100) && (n < 1000)){
			System.out.println("El número de cifras es: 3");
			} 
		if ((n >= 1000) && (n < 10000)){
			System.out.println("El número de cifras es: 4");
			} 
		if ((n >= 10000) && (n < 100000)){
			System.out.println("El número de cifras es: 5");
			} 
	}
}
