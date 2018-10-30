public class Ejercicio41 {
  public static void main(String[] arg){
    System.out.print("Introduzca un número: ");
    long num = Long.parseLong(System.console().readLine());
    long n = num;
    int numPar = 0;
    int numImp = 0;
    while (n > 0){
      if(((n % 2) == 0)){
        numPar++;
        n /= 10;
      }else{
        numImp++;
        n /= 10;
      }
    }
    System.out.print("El número " + num + " tiene " + numPar + " números pares y " + numImp + " impares.");
  }
}
