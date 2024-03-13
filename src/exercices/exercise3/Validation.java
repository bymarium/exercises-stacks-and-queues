package exercices.exercise3;

import java.util.Stack;

public class Validation {
  private final Stack<Integer> newNumbers = new Stack<>();
  public void validateNumbers(Stack<Integer> numbers){
    for (int number: numbers) {
      if (number < 0) {
        newNumbers.push(0);
      } else if (number > 7 && number < 21) {
        newNumbers.push(50);
      } else if (number == 61) {
        newNumbers.push(100);
      } else {
        newNumbers.push(number);
      }
    }

    System.out.println("La nueva pila con las validaciones es: " + newNumbers);
  }
}
