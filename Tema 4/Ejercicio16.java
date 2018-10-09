/**
*
*
*
*/
public class Ejercicio16 {
	public static void main(String[] args) {
		System.out.println("Responde con V o F");
		int nota;
		nota = 0;
		String pregunta1;
		System.out.println("Tu pareja está mas inquieta de lo habitual sin ningún motivo aparente: ");
		pregunta1 = System.console().readLine().toUpperCase();
		if (pregunta1.equals("V")){
			nota++;}
		String pregunta2;
		System.out.println("Ha aumentado los gastos de su vestuario: ");
		pregunta2 = System.console().readLine().toUpperCase();
		if (pregunta2.equals("V")){
			nota++;}
		String pregunta3;
		System.out.println("Ha perdido el interés que mostraba por ti anteriormente: ");
		pregunta3 = System.console().readLine().toUpperCase();
		if (pregunta3.equals("V")){
			nota++;}
		String pregunta4;
		System.out.println("Se afeita y se asea con más frecuencia (si es hombre) o se arregla el pelo o se asea con más frecuencia (si es mujer) ");
		pregunta4 = System.console().readLine().toUpperCase();
		if (pregunta4.equals("V")){
			nota++;}
		String pregunta5;
		System.out.println("No te deja que mires la agenda de su teléfono móvil: ");
		pregunta5 = System.console().readLine().toUpperCase();
		if (pregunta5.equals("V")){
			nota++;}
		String pregunta6;
		System.out.println("A veces tiene llamadas que dice no querer contestar cuando tú estas delante: ");
		pregunta6 = System.console().readLine().toUpperCase();
		if (pregunta6.equals("V")){
			nota++;}
		String pregunta7;
		System.out.println("Últimamente se preocuoa más en cuidar la línea y/o estar broncead@: ");
		pregunta7 = System.console().readLine().toUpperCase();
		if (pregunta7.equals("V")){
			nota++;}
		String pregunta8;
		System.out.println("Muchos días viene tarde después de trabajar porque dice tener mucho más trabao: ");
		pregunta8 = System.console().readLine().toUpperCase();
		if (pregunta8.equals("V")){
			nota++;}
		String pregunta9;
		System.out.println("Has notado que últimamente se perfuma más:");
		pregunta9 = System.console().readLine().toUpperCase();
		if (pregunta9.equals("V")){
			nota++;}
		String pregunta10;
		System.out.println("Se confunde y te dice que ha estado en sitios donde no ha ido contigo: ");
		pregunta10 = System.console().readLine().toUpperCase();
		if (pregunta10.equals("V")){
			nota++;}
		int notaF;
		notaF = nota * 3;
		if ((notaF <= 30) && (nota > 22)){
		System.out.println("Tu pareja tiene todo los ingredientes para estar viviendo un romance con otra persona. Te aconsejamosque indagues un poco más y averigües que es lo que está pasando por su cabeza");
		}
		if ((notaF <= 22) && (nota > 11)){
		System.out.println("Quizás exista peligro de otra persona ens u vida o en su mente, aunque seguramente será algo sin importancia.No bajes la guardia.");
		}
		if ((notaF <= 10) && (nota >= 0)){
		System.out.println("¡Enhorabuena! tu pareja parece ser totalmente fiel");
		}
	}	

}
  
