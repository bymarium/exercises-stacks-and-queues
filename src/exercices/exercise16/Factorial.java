package exercices.exercise16;

import java.util.LinkedList;
import java.util.Queue;

public class Factorial {
  public void calculateFactorial(Queue<Integer> numbers) {
    Queue<Integer> factorialQueue = new LinkedList<>();
    for (int number : numbers) {
      int factorial = 1;
      for (int i = 1; i <= number; i++) {
        factorial *= i;
      }
      factorialQueue.offer(factorial);
    }

    System.out.println("La cola con el factorial de los numeros de la pila es: " + factorialQueue);
  }
}
