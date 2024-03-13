package exercices.exercise3;

import exercices.Pile;

import java.util.Stack;

public class Main {
  public static void main(String[] args) {
    Pile pile = new Pile();
    Validation validation = new Validation();

    Stack<Integer> numbers = pile.fillPile(pile.getSize());
    pile.showPile(numbers);
    validation.validateNumbers(numbers);
  }
}
