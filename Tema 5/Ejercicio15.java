public class Ejercicio15 { 
	public static void main(String[] args) {
		int base;
		int expIntro;
		System.out.print("Introduzca la base: ");
		base = Integer.parseInt(System.console().readLine());
		System.out.print("Introduzca el exponente: ");
		expIntro = Integer.parseInt(System.console().readLine());
		int exponente;
		for (int i = 1; i <= expIntro; i++) {
			exponente = i;
		    System.out.println(base + "^" + i);
		   }
	}
}
