public class Ejercicio10{ 
	public static void main(String[] args){
		int num = 0;
		int numIntro = 0;
		int total = 0;
		System.out.print("Introduce un número: ");
		while (numIntro >= 0) {
			numIntro = Integer.parseInt(System.console().readLine());
			num++;
			total += numIntro;
			}
		System.out.print("La media de los números es: " + ((total - numIntro) / (num - 1)));
	}
}
