package exercices.exercise7;

import exercices.Pile;

import java.util.Stack;

public class Main {
  public static void main(String[] args) {
    Pile pile = new Pile();
    Validation validation = new Validation();
    Stack<Integer> numbers = pile.fillPile(pile.getSize());

    pile.showPile(numbers);

    validation.calculateCube(numbers);
    validation.calculateQuantity(numbers);
    validation.calculatePositiveAmount(numbers);
    validation.addNumbers(numbers);
  }
}
