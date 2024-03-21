package exercices.exercise12;

import java.util.LinkedList;
import java.util.Queue;

public class ParOdd {
  private final Queue<Integer> par = new LinkedList();
  private final Queue<Integer> odd = new LinkedList();

  public void fill(int[][] numbers) {
    for(int i = 0; i < numbers.length; ++i) {
      for(int j = 0; j < numbers[i].length; ++j) {
        if ((i + j) % 2 == 0) {
          par.offer(numbers[i][j]);
        } else {
          odd.offer(numbers[i][j]);
        }
      }
    }

    System.out.println("\nLa cola con las posiciones pares de la matriz es: \n" + par);
    System.out.println("\nLa cola con las posiciones impares de la matriz es: \n" + odd);
  }
}
