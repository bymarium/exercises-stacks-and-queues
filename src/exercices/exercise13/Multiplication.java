package exercices.exercise13;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Multiplication {
  public Queue<Integer> multiply(int[][] numbersMatrix, Stack<Integer> numbersStack) {
    Queue<Integer> numbersQueue = new LinkedList<>();

    for (int[] numberI : numbersMatrix) {
      for (int numberJ : numberI) {
        for (int number : numbersStack) {
          numbersQueue.offer(numberJ * number);
        }
      }
    }

    System.out.println("\nLa cola resultante de la multiplicacion de la matriz y la pila es: " + "\n" + numbersQueue);
    return numbersQueue;
  }
}
