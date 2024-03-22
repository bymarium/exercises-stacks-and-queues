package exercices.exercise10;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
  public static void main(String[] args) {
    Employee employee = new Employee();

    Queue<String> materials = employee.addMaterial();
    Queue<Integer> quantities = employee.enterQuantity(new LinkedList<>(materials));

    employee.calculatePercentages(new LinkedList<>(materials), new LinkedList<>(quantities));
    employee.majorIncome(new LinkedList<>(materials), new LinkedList<>(quantities));
  }
}
