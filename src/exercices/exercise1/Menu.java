package exercices.exercise1;

import java.util.Scanner;

public class Menu {
  private final Scanner reader = new Scanner(System.in);
  public int showOptions() {
    System.out.println("\nMenu de opciones: " +
            "\n1. Sumar las filas de una matriz en una pila. " +
            "\n2. Sumar las columnas de una matriz en una cola. " +
            "\n3. Hallar el factorial de n. " +
            "\n4. Ordenar la cola del metodo 2. " +
            "\n5. Salir. ");
    return reader.nextInt();
  }

  public void selectOption(int[][] numbers) {
    PileSum pileSum = new PileSum();
    QueueSum queueSum = new QueueSum();
    Factorial factorial = new Factorial();
    Order order = new Order();

    int option = showOptions();

    switch (option) {
      case 1:
        pileSum.addRows(numbers);
        selectOption(numbers);
        break;
      case 2:
        queueSum.addColumns(numbers);
        selectOption(numbers);
        break;
      case 3:
        int size = numbers.length;
        factorial.calculateFactorial(size);
        selectOption(numbers);
        break;
      case 4:
        order.orderQueue(queueSum.addColumns(numbers));
        selectOption(numbers);
        break;
      case 5:
        break;
      default:
        System.out.println("\nOpción invalida");
        selectOption(numbers);
    }
  }
}
