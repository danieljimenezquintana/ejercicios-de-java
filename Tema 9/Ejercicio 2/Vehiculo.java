package tema.pkg9;

/**
 *
 * @author daniel
 */
public class Vehiculo {
  public static int vehiculosCreados = 0;
  public static int kilometrosTotales = 0;
  
  private int kilometrosRecorridos;

  public Vehiculo() {
    this.kilometrosRecorridos = 0;
  }

  public int getKilometrosRecorridos() {
    return this.kilometrosRecorridos;
  }
  
  public static int getKilometrosTotales() {
    return Vehiculo.kilometrosTotales;
  }
  
  void andar(int k){
    kilometrosRecorridos+=k;
    kilometrosTotales+=k;
  }

}
