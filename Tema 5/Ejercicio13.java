public class Ejercicio13 {
	 public static void main(String[] args) {
		   int negativos = 0;
		   int positivos = 0;
		   System.out.println("Por favor, introduzca 10 números enteros: ");
		   for (int i = 0; i < 10; i++) {
			    if (Integer.parseInt(System.console().readLine()) < 0) { 
					negativos++;
					} else { 
						positivos++; } 
						} 
					System.out.println("Ha introducido " + positivos + " positivos y " + negativos + " negativos");
	}
}
