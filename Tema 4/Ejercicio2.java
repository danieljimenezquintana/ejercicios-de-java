/**
*
*Mensaje dependiendo de la hora
*
*/
public class Ejercicio2 {
	public static void main(String[] args){
		int hora;
		System.out.print("Introduzca la hora: ");
		hora = Integer.parseInt(System.console().readLine());
		if ((hora >= 6) && (hora <= 12)){
		System.out.print("Buenos dias");
		}
		else if ((hora >= 13) && (hora <= 20)){
		System.out.print("Buenas tardes");
		}
		else if ((hora >= 6) && (hora <= 5)){
		System.out.print("Pro-Pro-Pro-BDD-BDD-BDD");
		}
	}
}
