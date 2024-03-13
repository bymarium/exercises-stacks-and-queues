package exercices.exercise6;

import java.util.Stack;

public class SumColumns {
  private final Stack<Integer> pile = new Stack<>();
  public Stack<Integer> addColumns(int[][] numbers){
    for (int i = 0; i < numbers[0].length; i++) {
      int add = 0;
      for (int j = 0; j < numbers.length; j++) {
        add += numbers[j][i];
      }
      pile.push(add);
    }
    System.out.println("\nLa suma de las columnas es: " + pile);
    return pile;
  }
}
