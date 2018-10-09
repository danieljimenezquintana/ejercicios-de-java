/**
 * 
 * Tabla de multiplicar
 * 
 */
 public class Ejercicio8{ 
	public static void main(String[] args){
		int numMult;
		System.out.print("Introduce un número: ");
		numMult = Integer.parseInt(System.console().readLine());
		for (int i = 0; i < 11; i++){
			System.out.println(numMult * i);
		}
	}
}
