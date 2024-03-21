package exercices.exercise9;

import exercices.Pile;

import java.util.Stack;

public class Main {
  public static void main(String[] args) {
    Pile pile = new Pile();
    ParOdd parOdd = new ParOdd();
    Stack<Integer> oneStack = pile.fillPile(pile.getSize());
    Stack<Integer> secondStack = pile.fillPile(pile.getSize());
    pile.showPile(oneStack);
    pile.showPile(secondStack);
    parOdd.fill(oneStack, secondStack);
  }
}
