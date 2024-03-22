package exercices.exercise14;

import exercices.Pile;

import java.util.Stack;

public class Main {
  public static void main(String[] args) {
    Pile pile = new Pile();
    Order order = new Order();
    SumStack sumStack = new SumStack();

    Stack<Integer> oneStack = pile.fillPile(pile.getSize());
    Stack<Integer> secondStack = pile.fillPile(pile.getSize());
    Stack<Integer> thirdStack = pile.fillPile(pile.getSize());

    pile.showPile(oneStack);
    pile.showPile(secondStack);
    pile.showPile(thirdStack);

    order.orderStacks(oneStack, secondStack, thirdStack);

    sumStack.sumMajorMinor(oneStack, secondStack, thirdStack);
  }
}
