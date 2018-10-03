/**
*
*Cálculo de una ecuación de segundo grado
*
*/
public class Ejercicio9 {
	public static void main(String[] arg){
		double a;
		System.out.print("Introduzca el valor de a: ");
		a = Double.parseDouble(System.console().readLine());
		double b;
		System.out.print("Introduzca el valor de b: ");
		b = Double.parseDouble(System.console().readLine());
		double c;
		System.out.print("Introduzca el valor de c: ");
		c = Double.parseDouble(System.console().readLine());
		double x1;
		double x2;
		x1 = (-b + (Math.sqrt(Math.pow(b, 2) - (4 * a * c)))) / (2 * a) ;
		x2 = (-b - (Math.sqrt(Math.pow(b, 2) - (4 * a * c)))) / (2 * a);
		if ((Math.pow(b, 2) - (4 *a *c)) < 0){
			System.out.println("Lo sentimos el resultado no es un número real");
		}
		else {
		System.out.print("Las soluciones son: " + x1 + " y " + x2 );
		}
	}
}
