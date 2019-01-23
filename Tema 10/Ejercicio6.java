package tema.pkg10;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author daniel
 */
public class Ejercicio6 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    HashMap<String, String> usuario = new HashMap<>();
    
    usuario.put( "Alan Brito" , "entro1"); 
    String persona;
    String contrasena;
    boolean acceso = false;
    
    do{
      System.out.print("Usuario: ");
      persona = s.nextLine();
    }while(!usuario.containsKey(persona));
    for (int i = 0; i < 3; i++) {
      System.out.print("\nContraseña: ");
      contrasena = s.nextLine();
      if(contrasena.equals(usuario.get(persona))){
        System.out.println("\nHas conseguido entrar en la zona restringida.");
        i += 4;
        acceso = true;
      }
    }
    if(!acceso){
      System.out.println("\nLo siento no tienes acceso a la zona restringida.");
    }
  
  }
}
