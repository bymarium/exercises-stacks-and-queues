package exercices.exercise16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Queue;

public class Order {
  public void orderNumbers (Queue<Integer> numbers) {
    List<Integer> listNumbers = new ArrayList<>(numbers);
    Collections.sort(listNumbers, Collections.reverseOrder());
    numbers.clear();
    numbers.addAll(listNumbers);

    System.out.println("Cola ordenada: " + numbers);
  }
}
