/**
 * 
 * Caja fuerte
 * 
 */
 public class Ejercicio7{ 
	public static void main(String[] args){
		int numCaja;
		int intento = 1;
		boolean respuesta = false;
		do {
		System.out.print("Introduzca la combinación de la caja: ");
		numCaja = Integer.parseInt(System.console().readLine());
			if(numCaja == 1938){
				System.out.print("La caja fuerte se ha abierto satisfactoriamente");
				respuesta = true;
				}else if (numCaja != 1938){
					System.out.println("Lo siento esa no es la combinación");
					intento++;
				}
		}while ((respuesta == false) && (intento < 5));
	}
}
