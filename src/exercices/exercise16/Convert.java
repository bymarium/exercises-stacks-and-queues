package exercices.exercise16;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Convert {
  public Queue<Integer> convertStackToQueue(Stack<Integer> numbers) {
    Queue<Integer> numbersQueue = new LinkedList<>();

    for (int number : numbers) {
      numbersQueue.offer(number);
    }

    System.out.println("La cola es: " + numbersQueue);
    return numbersQueue;
  }
}
