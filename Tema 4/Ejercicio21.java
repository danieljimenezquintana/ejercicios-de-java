public class Ejercicio21 {
	public static void main(String[] args){
		double nota1;
		System.out.println("Introduzca la nota del primer examen: ");
		nota1 = Double.parseDouble(System.console().readLine());
		double nota2;
		System.out.println("Introduzca la nota del segundo examen: ");
		nota2 = Double.parseDouble(System.console().readLine());
		double notamedia;
		notamedia = ((nota1 + nota2) / 2);
		if (notamedia > 5){
			System.out.println("Tu nota media es: " + notamedia);
		}else{
			String recuperacion;
			System.out.println("Has pasado la recuperación: ");
			recuperacion =System.console().readLine().toUpperCase();
			if (recuperacion.equals("SI")){
				System.out.println("Tu nota media es: 5");
			}
		}
		
	}
}
