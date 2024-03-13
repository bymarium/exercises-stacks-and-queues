package exercices.exercise6;

import java.util.Stack;

public class SquareRoot {
  private final Stack<Integer> pile = new Stack<>();
  public void calculateSquareRoot(Stack<Integer> numbers){
    for (int number: numbers) {
      pile.push((int)(Math.sqrt(number)));
    }

    System.out.println("La pila con las raices cuadradas de cada numero es: " + pile);
  }
}
