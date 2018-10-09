public class Ejercicio17 {
	public static void main(String[] args){
		int n;
		System.out.println("Introduzca un número:");
		n = Integer.parseInt(System.console().readLine());
		System.out.println("La última cifra del número introducido es: " + (n % 10));
	}
}
