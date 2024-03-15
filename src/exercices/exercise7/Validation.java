package exercices.exercise7;

import java.util.Stack;

public class Validation {
  public void calculateCube(Stack<Integer> numbers) {
    for (int number: numbers) {
      if (number < 0) {
        int cube = (int) (Math.pow(number, 2));
        System.out.println("El cubo del " + number + " es: " + cube);
      }
    }
  }

  public void calculateQuantity(Stack<Integer> numbers) {
    int acount = 0;
    for (int number : numbers) {
      if (number > 19 && number < 81) {
        acount++;
      }
    }
    System.out.println("La cantidad de número entre 20 y 80 en la pila es: " + acount);
  }

  public void calculatePositiveAmount(Stack<Integer> numbers) {
    int acount = 0;
    for (int number : numbers) {
      if (number > 0) {
        acount++;
      }
    }
    System.out.println("La cantidad de números positivos en la pila es: " + acount);
  }
  public void addNumbers(Stack<Integer> numbers) {
    int add = 0;
    for (int number : numbers) {
      if (number > 79 && number < 201) {
        add += number;
      }
    }
    System.out.println("La suma de los números entre 80 y 200 en la pila es: " + add);
  }
}
