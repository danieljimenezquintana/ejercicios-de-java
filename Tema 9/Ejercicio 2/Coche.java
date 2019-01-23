package tema.pkg9;

/**
 *
 * @author daniel
 */
public class Coche extends Vehiculo{
  
  public void quemarrueda(){
      System.out.println("Creaste una nube de humo y te multaron con 1000€");
  }

  public Coche() {
    vehiculosCreados++;
  }
}
