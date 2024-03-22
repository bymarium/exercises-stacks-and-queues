package exercices.exercise16;

import java.util.Queue;

public class Fibonacci {
  public void findFibonacci(Queue<Integer> numbers) {
    for (int number : numbers) {
      System.out.print("\nFibonnaci de " + number + " es: ");

      int previous = 0;
      int current = 1;
      int next;

      for (int i = 2; i <= number; i++) {
        System.out.print(previous + " ");
        next = previous + current;
        previous = current;
        current = next;
      }
    }
  }
}
