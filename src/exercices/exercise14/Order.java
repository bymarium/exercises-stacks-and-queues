package exercices.exercise14;

import java.util.*;

public class Order {
  public void orderStacks(Stack<Integer> oneStack, Stack<Integer> secondStack, Stack<Integer> thirdStack) {
    Queue<Integer> numbers = new LinkedList<>();

    for (int number : oneStack) {
      if (!numbers.contains(number)) {
        numbers.offer(number);
      }
    }

    for (int number : secondStack) {
      if (!numbers.contains(number)) {
        numbers.offer(number);
      }
    }

    for (int number : thirdStack) {
      if (!numbers.contains(number)) {
        numbers.offer(number);
      }
    }

    List<Integer> elements = new ArrayList<>(numbers);
    Collections.sort(elements);
    numbers.clear();
    numbers.addAll(elements);

    System.out.println("\nLa cola ordenada con las tres pilas es: " + numbers + "\n");
  }
}
