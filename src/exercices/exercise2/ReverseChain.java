package exercices.exercise2;

import java.util.Stack;

public class ReverseChain {
  private final Stack<Character> pile = new Stack<>();
  private final Stack<Character> inversePile = new Stack<>();

  public Stack<Character> fillPile (String chain) {
    for (int i = 0; i < chain.length(); i++) {
      char character = chain.charAt(i);
      pile.push(character);
    }
    System.out.println("\nLa pila con la palabra ingresada es: " + pile);
    return pile;
  }

  public void reversePile (Stack<Character> chain) {
    while (!chain.isEmpty()) {
      inversePile.push(chain.pop());
    }

    System.out.println("La pila con la palabra invertida es: " + inversePile);
  }
}
