package tema.pkg9;

import java.util.Scanner;

public class Ejercicio2 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int km = 0;
    int opcion = 0;
    
    Bicicleta orbea = new Bicicleta();
    Coche bmw = new Coche();
    
    while(opcion != 8){
    System.out.println("VEHÍCULOS");
    System.out.println("==========");
    System.out.println("1.Anda con la bicicleta");
    System.out.println("2.Haz el caballito con la bicicleta");
    System.out.println("3.Anda con el coche");
    System.out.println("4.Quema rueda con el coche");
    System.out.println("5.Ver kilometraje de la bicicleta");
    System.out.println("6.Ver kilometraje del coche");
    System.out.println("7.Ver kilometraje total");
    System.out.println("8.Salir");
    System.out.print("Elige una opcion (1-8): ");
    
    opcion = Integer.parseInt(s.nextLine());
    
      System.out.println("------------------------------------------------------");

      switch (opcion) {
          case 1:
            System.out.print("¿Cuántos kilómetros quiere recorrer? ");
            km = Integer.parseInt(System.console().readLine());
            orbea.andar(km);
            break;
          case 2:
            orbea.caballito();
            break;
          case 3:
            System.out.print("¿Cuántos kilómetros quiere recorrer? ");
            km = Integer.parseInt(System.console().readLine());
            bmw.andar(km);
            break;
          case 4:
            bmw.quemarrueda();
            break;
          case 5:
            System.out.println("La bicicleta lleva recorridos ");
            System.out.println(orbea.getKilometrosRecorridos() + " Km");
            break;
          case 6:
            System.out.println("El coche lleva recorridos ");
            System.out.println(bmw.getKilometrosRecorridos() + " Km");
            break;
          case 7:
            System.out.println("Los vehículos llevan recorridos ");
            System.out.println(Vehiculo.getKilometrosTotales() + " Km");
          default:
        }
      System.out.println("------------------------------------------------------");
      }
  }
}
