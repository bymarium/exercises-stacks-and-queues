package exercices.exercise9;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ParOdd {
  private final Queue<Integer> par = new LinkedList();
  private final Queue<Integer> odd = new LinkedList();

  public void fill(Stack<Integer> oneStack, Stack<Integer> secondStack) {
    for (int number : oneStack) {
      if (number % 2 == 0) {
        par.offer(number);
      } else {
        odd.offer(number);
      }
    }

    for (int number : secondStack) {
      if (number % 2 == 0) {
        par.offer(number);
      } else {
        odd.offer(number);
      }
    }

    System.out.println("\nLa cola con los numeros pares es: \n" + par);
    System.out.println("\nLa cola con los numeros impares es: \n" + odd);
  }
}
