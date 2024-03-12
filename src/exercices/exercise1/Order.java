package exercices.exercise1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Queue;

public class Order {
  public void orderQueue(Queue<Integer> columnNumbers) {
    List<Integer> list = new ArrayList<>(columnNumbers);

    Collections.sort(list);
    columnNumbers.clear();

    columnNumbers.addAll(list);

    System.out.println("\nLa cola ordenada de la suma de las columnas es: " + columnNumbers);
  }
}
