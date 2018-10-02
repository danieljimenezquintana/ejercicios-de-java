/**
*
* 
*
*/
public class Ejercicio8 {
	public static void main(String[] arg){
		double nota1;
		System.out.print("Introduzca la primera nota: ");
		nota1 = Double.parseDouble(System.console().readLine());
		double nota2;
		System.out.print("Introduzca la segunda nota: ");
		nota2 = Double.parseDouble(System.console().readLine());
		double nota3;
		System.out.print("Introduzca la tercera nota: ");
		nota3 = Double.parseDouble(System.console().readLine());
		if ((nota1 > 10) || (nota2 > 10) || (nota3 > 10)) {
			System.out.print("Error, nota errónea");
		}
		else if ((nota1 < 10) || (nota2 < 10) || (nota3 < 10)) {
			double notaMedia;
			notaMedia = ((nota1 + nota2 + nota3) / 3);
			System.out.println("La nota media es: " + notaMedia);
			if (notaMedia < 5){
				System.out.print("Insuficiente");
			}
			if (notaMedia == 5){
				System.out.print("Suficiente");
			}
			else if ((notaMedia > 5) && (notaMedia <= 6)){
				System.out.print("Bien");
			}
			else if ((notaMedia >= 7) && (notaMedia <=8)){
				System.out.print("Notable");
			}
			else if (notaMedia >= 9){
				System.out.print("Sobresaliente");
			}
		}	
	}
}
