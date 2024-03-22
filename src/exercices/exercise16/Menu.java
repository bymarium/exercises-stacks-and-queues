package exercices.exercise16;

import java.util.Queue;
import java.util.Scanner;

public class Menu {
  private final Scanner reader;

  public Menu() {
    reader = new Scanner(System.in);
  }

  public int showOptions() {
    System.out.println("\nMenu de opciones: " +
            "\n1. Mostrar factorial de los numeros de la cola. " +
            "\n2. Ordenar numeros de mayor a menor de la cola. " +
            "\n3. Hallar el fibonacci de cada elemento de la cola. " +
            "\n4. Calcular la raiz cuadrada de cada elemento de la cola. " +
            "\n5. Multiplicar el numero al cubo si es negativo. " +
            "\n6. Salir");
    return reader.nextInt();
  }

  public void selectOption(Queue<Integer> numbers) {
    Factorial factorial = new Factorial();
    Order order = new Order();
    Fibonacci fibonacci = new Fibonacci();
    SquareRoot squareRoot = new SquareRoot();
    Cube cube = new Cube();

    int option = showOptions();
    switch (option) {
      case 1:
        factorial.calculateFactorial(numbers);
        selectOption(numbers);
        break;
      case 2:
        order.orderNumbers(numbers);
        selectOption(numbers);
        break;
      case 3:
        fibonacci.findFibonacci(numbers);
        selectOption(numbers);
        break;
      case 4:
        squareRoot.calculateSquareRoot(numbers);
        selectOption(numbers);
        break;
      case 5:
        cube.calculateCube(numbers);
        selectOption(numbers);
        break;
      case 6:
        break;
      default:
        System.out.println("\nOpción invalida");
        selectOption(numbers);
    }

  }
}
