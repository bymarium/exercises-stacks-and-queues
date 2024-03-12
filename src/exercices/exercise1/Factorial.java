package exercices.exercise1;

public class Factorial {
  public void calculateFactorial(int size) {
    int factorial = 1;

    for (int i = 1; i <= size; i++) {
      factorial *= i;
    }

    System.out.println("\nEl factorial de la dimension de la matriz es: " + size + " = " + factorial);
  }
}
