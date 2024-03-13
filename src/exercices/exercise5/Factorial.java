package exercices.exercise5;

import java.util.Stack;

public class Factorial {
  private final Stack<Integer> pile = new Stack<>();
  public Stack<Integer> calculateFactorial(int[] numbers) {
    for (int number: numbers) {
      int factorial = 1;
      for (int i = 1; i <= number; i++) {
        factorial *= i;
      }
      pile.push(factorial);
    }
    return pile;
  }
}
