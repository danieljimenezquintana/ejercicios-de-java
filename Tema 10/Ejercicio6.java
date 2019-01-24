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

    usuario.put("Alan Brito", "entro1");
    usuario.put("admin", "1234");
    String persona;
    String contrasena;
    boolean acceso = false;

    for (int i = 0; i < 3 && !acceso; i++) {
      System.out.print("Usuario: ");
      persona = s.nextLine();

      System.out.print("\nContraseña: ");
      contrasena = s.nextLine();

      if (!usuario.containsKey(persona)) {
        System.out.println("Lo siento el usuario es incorrecto.");
      } else if (contrasena.equals(usuario.get(persona))) {
        System.out.println("\nHas conseguido entrar en la zona restringida.");
        i += 4;
        acceso = true;
      }else {
        System.out.println("\nContraseña incorrecta.");
      }
    }if (!acceso){
      System.out.println("Lo siento no has conseguido entrar en la zona restringida.");
    }
  }
}
