public class Ejercicio15{
	public static void main(String[] arg){
		String posicion;
		System.out.println("Introduzca la dirección del vértice (arriba, abajo, derecha o izquierda): ");
		posicion = System.console().readLine().toUpperCase();
		String caracter;
		System.out.print("Introduzca un caracter: ");
		caracter = System.console().readLine();
		if (posicion.equals("ARRIBA")){
		System.out.println("  " + caracter);
		System.out.println(" " + caracter +" " + caracter);
		System.out.println(caracter + " " + caracter + " " + caracter);
		}
		else if (posicion.equals("IZQUIERDA")){
		System.out.println("    " + caracter);
		System.out.println("  " + caracter + " " + caracter);
		System.out.println(caracter + " " + caracter + " " + caracter);
		System.out.println("  " + caracter + " " + caracter);
		System.out.println("    " + caracter);
		}
		else if (posicion.equals("DERECHA")){
		System.out.println(caracter + " ");
		System.out.println(caracter + " " + caracter);
		System.out.println(caracter + " " + caracter + " " + caracter);
		System.out.println(caracter + " " + caracter);
		System.out.println(caracter + " ");
		}
		if (posicion.equals("ABAJO")){
		System.out.println(caracter + " " + caracter + " " + caracter);
		System.out.println(" " + caracter + " " +caracter);
		System.out.println("  " + caracter);
		}
	}
}
