package exercices.exercise6;

import java.util.Stack;

public class Average {
  public void calculateAverage(Stack<Integer> numbers){
    int add = 0;

    for (int number: numbers) {
      add += number;
    }

    int average = add/numbers.size();

    System.out.println("El promedio de la suma de las filas es: " + average);
  }
}
