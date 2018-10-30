/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author daniel
 */
public class Ejercicio3 {
  public static void main(String[] args){
    String nombrePalo = "";
    String nombreFigura;
    int numeroPalo = (int)(Math.random() * 4);
    int numeroFigura = (int)(Math.random() * 11);
    switch (numeroPalo){
        case 0 :
           nombrePalo = "Copas";
           break;
        case 1 :
           nombrePalo = "Espadas";
           break;
        case 2 :
           nombrePalo = "Bastos";
           break;
        case 3 :
           nombrePalo = "Oro";
           break;
        default:
    }
    switch (numeroFigura){
      case 1:
        nombreFigura = "As";
        break;
      case 8:
        nombreFigura = "Sota";
        break;
      case 9:
        nombreFigura = "Caballo";
        break;
      case 10:
        nombreFigura = "Rey";
        break;
      default:
        nombreFigura = String.valueOf(numeroFigura);
    }
    System.out.println("La carta aleatoria es " + nombreFigura + " de " + nombrePalo);
  }
}
