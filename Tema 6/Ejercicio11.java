/**
 *
 * @author daniel
 */
public class Ejercicio11 {
  public static void main(String[] args) {
    int nota;
    int suspensos = 0;
    int suficientes = 0;
    int bienes = 0;
    int notables = 0;
    int sobresalientes = 0;
    for(int i = 0; i < 20; i++) {
      nota = (int)(Math.random() * 5);
      switch(nota) {
        case 0:
          System.out.print("suspenso ");
          suspensos++;
          break;
        case 1:
          System.out.print("suficiente ");
          suficientes++;
          break;
        case 2:
          System.out.print("bien ");
          bienes++;
          break;
        case 3:
          System.out.print("notable ");
          notables++;
          break;
        case 4:
          System.out.print("sobresaliente ");
          sobresalientes++;
          break;
        default:
      }
    }
    System.out.println("\nSuspensos: " + suspensos);
    System.out.println("Suficientes: " + suficientes);
    System.out.println("Bienes: " + bienes);
    System.out.println("Notables: " + notables);
    System.out.println("Sobresalientes: " + sobresalientes);
  }
}
