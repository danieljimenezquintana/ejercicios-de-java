public class Ejercicio17 {
	public static void main(String[] args){
		int num;
		int repeticion = 0;
		int suma = 0;
		System.out.print("Introduzca un número entero y positivo: ");
		num = Integer.parseInt(System.console().readLine());
			if (num >= 0){
				for (int i = num + 1; repeticion < 101 ; repeticion++){
          suma += num + i;
          i++;
				}
				System.out.print(suma);
			}else{
				System.out.print("El número introducido no es positivo");
			}		
	}
}
