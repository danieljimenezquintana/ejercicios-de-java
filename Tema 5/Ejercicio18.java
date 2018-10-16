public class Ejercicio18 {
	public static void main(String[] args){
		int num1;
		int num2;
    System.out.print("Introduzca un número entero: ");
    num1 = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca otro número entero mayor que el anterior: ");
		num2 = Integer.parseInt(System.console().readLine());
    for (int i = num1; i < num2 ;i += 7){
        System.out.print(i + " ");
			}		
	}
}
