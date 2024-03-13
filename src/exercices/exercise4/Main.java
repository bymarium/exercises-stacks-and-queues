package exercices.exercise4;

import exercices.Pile;

import java.util.Stack;

public class Main {
  public static void main(String[] args) {
    Pile pile = new Pile();
    Search search = new Search();

    Stack<Integer> numbers = pile.fillPile(pile.getSize());
    pile.showPile(numbers);

    int value = search.indicateValue();
    search.searchValue(numbers, value);
  }
}
