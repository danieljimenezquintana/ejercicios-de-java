/**
*
*
*
*/
public class Ejercicio13 {
	public static void main(String[] args) {
	int num1;
	System.out.println("Introduce un número: ");
    num1 = Integer.parseInt(System.console().readLine());
    int num2;
    System.out.println("Introduce el segundo número: ");
    num2 = Integer.parseInt(System.console().readLine());
    int num3;
    System.out.println("Introduce el tercer número: ");
    num3 = Integer.parseInt(System.console().readLine());
    if ((num1 > num2) && (num1 > num3) && (num2 > num3)){
      System.out.println("El numero más grande es: " + num1 );
      System.out.println("El número mediano es: " + num2);
      System.out.println("El número más pequeño es: " + num3 );
    } else if ((num2 > num3) && (num2 > num1) && (num1 > num3)){       
        System.out.println("El numero más grande es: " + num2 );
        System.out.println("El número mediano es: " + num1);
        System.out.println("El número más pequeño es: " + num3 );
    } else if ((num3 > num1) && (num3 > num2) && (num1 > num2)) {
        System.out.println("El numero más grande es: " + num3 );
        System.out.println("El número mediano es: " + num1);
        System.out.println("El más pequeño es: " + num2 );
    } else if ((num3 > num1) && (num3 > num2) && (num2 > num1)){
        System.out.println("El número más grande es: " + num3 );
        System.out.println("El número mediano es: " + num2);
        System.out.println("El número mas pequeño es: " + num1 );
    } else if ((num1 > num3) && (num1 > num2) && (num3 > num2)) {
        System.out.println("El número más grade es: " + num1 );
        System.out.println("El número mediano es: " + num3);
        System.out.println("El número más pequeño es: " + num2 );
    } else if ((num2 > num1) && (num2 > num1) && (num3 > num1)) {
        System.out.println("El número más grande es: " + num2 );
        System.out.println("El número mediano es: " + num3);
        System.out.println("El número más pequeño es: " + num1 );
    }
  }
}
