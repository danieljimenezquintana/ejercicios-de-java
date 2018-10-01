/**
*
*
*Calculo total de una factura a partir de su base imponible
*
*/
public class Ejercicio7 {
	public static void main(String[] args){
	double baseImponible;
	System.out.print("Introduzca la base imponible: ");
	baseImponible = Double.parseDouble(System.console().readLine());
	double total;
	total = baseImponible * 1.21;
	System.out.print("El total es: " + total);
	}
}
