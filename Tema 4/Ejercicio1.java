/**
*
*Horario
*
*/
public class Ejercicio1 {
	public static void main(String[] args){
		String dia;
		System.out.print("Introduzca un día de la semana: ");
		dia = System.console().readLine();
		if (dia.equals("Lunes")){
		System.out.print("EDD-LM-LM-BDD-BDD-BDD");
		}
		else if (dia.equals("Martes")){
		System.out.print("S.Inf-S.Inf-S.Inf-Pro-Pro-Pro");
		}
		else if (dia.equals("Miercoles")){
		System.out.print("Pro-Pro-Pro-BDD-BDD-BDD");
		}
		else if (dia.equals("Jueves")){
		System.out.print("Pro-Pro-EED-EED-LM-LM");
		}
		else if (dia.equals("Viernes")){
		System.out.print("S.Inf-S.Inf-S.Inf-Fol-Fol-Fol");
		}
	}
}
