package tema.pkg9;

/**
 *
 * @author daniel
 */
public class Caballo {
  private String nombre;
  private String raza;
  private int edad;
  private int altura;
  private int velocidadmax;
  private int peso;

  public Caballo(String nombre, String raza) {
    this.nombre = nombre;
    this.raza = raza;
  }
  
  void crecer (int n){
    edad+=n;
  }
  void bufar (){
    System.out.println("Brrrrffffff");
  }
}
