package exercices.exercise13;

import java.util.LinkedList;
import java.util.Queue;

public class Change {
  public Queue<Integer> changeNumber(Queue<Integer> numbers) {
    Queue<Integer> numbersChanged = new LinkedList<>();

    for (int number : numbers) {
      if (number > 1000) {
        numbersChanged.offer(1000);
      } else if (number < 500 && number > 490) {
        numbersChanged.offer(500);
      } else {
        numbersChanged.offer(number);
      }
    }

    System.out.println("\nLa cola con los numeros cambiados es: " + "\n" + numbersChanged);
    return numbersChanged;
  }
}
