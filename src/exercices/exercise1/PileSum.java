package exercices.exercise1;
import java.util.Stack;

public class PileSum {
  public void addRows(int[][] numbers) {
    Stack<Integer> pila = new Stack<>();

    for (int i = 0; i < numbers.length; i++) {
      int add = 0;
      for (int j = 0; j < numbers[i].length; j++) {
        add += numbers[i][j];
      }
      pila.push(add);
    }

    System.out.println("\nLa pila resultante de la suma de las filas es: " + pila);
  }
}
