package exercices.exercise6;

import java.util.Stack;

public class SumRows {
  private final Stack<Integer> pile = new Stack<>();
  public Stack<Integer> addRows(int[][] numbers){
    for (int i = 0; i < numbers.length; i++) {
      int add = 0;
      for (int j = 0; j < numbers[i].length; j++) {
        add += numbers[i][j];
      }
      pile.push(add);
    }

    System.out.println("\nLa suma de las filas es: " + pile);
    return pile;
  }
}
