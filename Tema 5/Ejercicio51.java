public class Ejercicio51{
  public static void main(String[] args){
    long volteado = 0;
    long numIntro;
    System.out.println("Introduzca un número: ");
    numIntro = Long.parseLong(System.console().readLine());
    long num = numIntro;
    long numComido = 0;
    int aux = 0;
    while (num > 0) {
      volteado = (volteado * 10) + (num % 10);
      num /= 10;
    }
    
    while (volteado > 0){
      aux = (int)(volteado % 10);
      if((aux != 8) && (aux != 0)){
        numComido *= 10;
        numComido += aux;
      }
        volteado /= 10;
    }
    if(numIntro == numComido){
      System.out.print("El gusano no se ha comido ningun número.");
    }else{
      System.out.print("El número comido: " +numComido);
        }
  }
}
