public class Ejercicio16 {
	public static void main(String[] args){
		int num;
		boolean primo = true;
		System.out.print("Introduzca un número: ");
		num = Integer.parseInt(System.console().readLine());
		for (int i = 2; i < num; i++){
			if ((num % i )== 0){
		primo = false;
			}
		}
		if (primo = false){
		System.out.print("El número es primo");
		}else {
		System.out.print("El número no es primo");
		}
	}
}
