/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author daniel
 */
public class Ejercicio2 {
  public static void main(String[] args){
    String nombrePalo = "";
    String nombreFigura;
    int numeroPalo = (int)(Math.random() * 4);
    int numeroFigura = (int)(Math.random() * 13);
    switch (numeroPalo){
        case 1 :
           nombrePalo = "Corazones";
           break;
        case 2 :
           nombrePalo = "Picas";
           break;
        case 3 :
           nombrePalo = "Tréboles";
           break;
        case 4 :
           nombrePalo = "Diamantes";
           break;
        default:
    }
    switch (numeroFigura){
      case 1:
        nombreFigura = "As";
        break;
      case 11:
        nombreFigura = "J";
        break;
      case 12:
        nombreFigura = "Q";
        break;
      case 13:
        nombreFigura = "K";
        break;
      default:
        nombreFigura = String.valueOf(numeroFigura);
    }
    System.out.println("La carta aleatoria es " + nombreFigura + " de " + nombrePalo);
  }
}
