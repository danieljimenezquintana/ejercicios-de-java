public class Ejercicio22{
	public static void main(String[] args){
		String dia;
		System.out.println("¿Qué día es? ");
		dia = System.console().readLine();
		int numDia;
		numDia = 0;
		switch(dia){
			case "lunes":
				numDia = 0;
				break;
			case "martes":
				numDia = 1;
				break;
			case "miércoles":
				numDia =2;
				break;
			case "jueves":
				numDia = 3;
				break;
			case "viernes":
				numDia = 4;
				break;
			}
		int hora;
		System.out.println("Introduzca la hora: ");
		hora = Integer.parseInt(System.console().readLine());
		int min;
		System.out.println("Introduzca los minutos: ");
		min = Integer.parseInt(System.console().readLine());
		int minTotales;
		minTotales = (4 * 24 * 60) + (15 * 60);
		int minActuales;
		minActuales = (numDia * 24 * 60) + (hora * 60) + min;
	System.out.println("Falta " + (minTotales - minActuales) + " para el fin de semana");
	}
}

