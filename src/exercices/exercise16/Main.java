package exercices.exercise16;

import exercices.Pile;

import java.util.Queue;
import java.util.Stack;

public class Main {
  public static void main(String[] args) {
    Convert convert = new Convert();
    Pile pile = new Pile();
    Stack<Integer> numbers = pile.fillPile(pile.getSize());
    Queue<Integer> numbersQueue = convert.convertStackToQueue(numbers);

    Menu menu = new Menu();
    menu.selectOption(numbersQueue);
  }
}
