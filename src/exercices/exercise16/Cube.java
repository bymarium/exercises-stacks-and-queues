package exercices.exercise16;

import java.util.Queue;

public class Cube {
  public void calculateCube(Queue<Integer> numbers) {
    for (int number : numbers) {
      if (number < 0) {
        int cube = (int) (Math.pow(number, 2));
        System.out.println("El cubo del " + number + " es: " + cube);
      }
    }
  }
}
