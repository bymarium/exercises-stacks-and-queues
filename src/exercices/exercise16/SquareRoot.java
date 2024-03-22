package exercices.exercise16;

import java.util.LinkedList;
import java.util.Queue;

public class SquareRoot {
  public void calculateSquareRoot(Queue<Integer> numbers){
    Queue<Integer> numbersSquareRoot = new LinkedList<>();
    for (int number: numbers) {
      numbersSquareRoot.offer((int)(Math.sqrt(number)));
    }

    System.out.println("La cola con las raices cuadradas de cada elemento es: " + numbersSquareRoot);
  }
}
