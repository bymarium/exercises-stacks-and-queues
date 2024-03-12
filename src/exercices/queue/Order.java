package exercices.queue;

import java.util.Collections;
import java.util.Queue;
import java.util.Stack;

public class Order {
  public void orderQueue(Queue<Integer> numerosFila) {
    Stack<Integer> pila = new Stack<Integer>();

    for (int numero : numerosFila) {
      pila.push(numero);
    }

    Collections.sort(pila);

    System.out.println("La cola ordenada es: " + pila);
  }
}
