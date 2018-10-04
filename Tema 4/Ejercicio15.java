public class Ejercicio15{
	public static void main(String[] arg){
		String posicion;
		System.out.println("Introduzca la dirección del vértice (arriba, abajo, derecha o izquierda): ");
		posicion = System.console().readLine().toUpperCase();
		if (posicion.equals("ARRIBA")){
		System.out.println("  *");
		System.out.println(" * *");
		System.out.println("* * *");
		}
		else if (posicion.equals("IZQUIERDA")){
		System.out.println("    *");
		System.out.println("  * *");
		System.out.println("* * *");
		System.out.println("  * *");
		System.out.println("    *");
		}
		else if (posicion.equals("DERECHA")){
		System.out.println("* ");
		System.out.println("* *");
		System.out.println("* * *");
		System.out.println("* *");
		System.out.println("* ");
		}
		if (posicion.equals("ABAJO")){
		System.out.println("* * *");
		System.out.println(" * *");
		System.out.println("  *");
		}
	}
}
