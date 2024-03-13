package exercices.exercise5;

import exercices.Pile;

import java.util.Stack;

public class Main {
  public static void main(String[] args) {
    Pile pile = new Pile();
    Vector vector = new Vector();
    Factorial factorial = new Factorial();

    int[] numbers = vector.fillVector(vector.getSize());
    vector.showVector(numbers);

    Stack<Integer> pileNumbers = factorial.calculateFactorial(numbers);
    pile.showPile(pileNumbers);
  }
}
