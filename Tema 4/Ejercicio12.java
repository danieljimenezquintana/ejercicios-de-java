/**
*
*Test
* 
*/
public class Ejercicio12 {
	public static void main(String[] args){
		String preg1;
		System.out.print("¿Cómo se ha de empezar? a)Public b)public c)publis: ");
		preg1 = System.console().readLine();
		String preg2;
		System.out.print("¿Cual no es un lenguaje de programación? a)JAVA b)C++ c)HTML: ");
		preg2 = System.console().readLine();
		String preg3;
		System.out.print("¿Para qué se creó el primer inter? a)calculadoras b)ordenadores c)telar: ");
		preg3 = System.console().readLine();
		String preg4;
		System.out.print("¿Para qué sirve Int? a)Números enteros b)Decimales c)Palabras: ");
		preg4 = System.console().readLine();
		String preg5;
		System.out.print("¿Para qué sirve String? a)Números enteros b)Decimales c)Palabras: ");
		preg5 = System.console().readLine();
		String preg6;
		System.out.print("¿Para qué sirve Double? a)Números enteros b)Decimales c)Palabras: ");
		preg6 = System.console().readLine();
		String preg7;
		System.out.print("¿Para qué sirve float? a)Números enteros b)Decimales c)Palabras: ");
		preg7 = System.console().readLine();
		String preg8;
		System.out.print("¿Cómo se escribe  X mayor o igual que 3? a)x>=3 b) x >= 3 c)x <= 3: ");
		preg8 = System.console().readLine();
		String preg9;
		System.out.print("¿Cómo se escribe  3 mayor o igual que X? a)3 >= x b) 3 <= x c)3>=x: ");
		preg9 = System.console().readLine();
		String preg10;
		System.out.print("¿Cómo se escribe? a)if else b)ifelse c)else if: ");
		preg10 = System.console().readLine();
		int notaFinal;
			notaFinal = 0;
		if (preg1.equals("b")){
			notaFinal = notaFinal + 1;
		}
		if (preg2.equals("c")){
			notaFinal = notaFinal + 1;
		}
		if (preg3.equals("a")){
			notaFinal = notaFinal + 1;
		}
		if (preg4.equals("a")){
			notaFinal = notaFinal + 1;
		}
		if (preg5.equals("c")){
			notaFinal = notaFinal + 1;
		}
		if (preg6.equals("b")){
			notaFinal = notaFinal + 1;
		}
		if (preg7.equals("b")){
			notaFinal = notaFinal + 1;
		}
		if (preg8.equals("b")){
			notaFinal = notaFinal + 1;
		}
		if (preg9.equals("a")){
			notaFinal = notaFinal + 1;
		}
		if (preg10.equals("c")){
			notaFinal = notaFinal + 1;
	System.out.print("Tu nota es: " + notaFinal);
		}	
	}
}
