package exercices.exercise13;

import java.util.Queue;

public class Average {
  public void showAverage(Queue<Integer> numbers) {
    int add = 0;

    for (int number: numbers) {
      add += number;
    }

    System.out.println("\nEl promedio de la cola es: " + add / numbers.size());
  }
}
