/**
*
*Calcular cuanto falta para media noche
*
*/
public class Ejercicio11 {
	public static void main(String[] args){
		int hora ;
		System.out.print("Introduzca la hora: ");
		hora = Integer.parseInt(System.console().readLine());
		int minutos;
		System.out.print("Introduzca los minutos: ");
		minutos = Integer.parseInt(System.console().readLine());
		int horaRestante;
		int minutosRestantes;
		if (((hora < 0) || (hora > 24)) || ((minutos < 0) || (minutos > 60))){
			System.out.print("Formato de fecha erróneo");
		}
		else {
		horaRestante = (24 - hora) * 3600;
		minutos = (60 - minutos) * 60;
		int segundosRestantes;
		segundosRestantes = horaRestante + minutos;
		System.out.print("Faltan: " + segundosRestantes + "segundos");
		}	
	}
}
