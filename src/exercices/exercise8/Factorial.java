package exercices.exercise8;

public class Factorial {
  public Factorial() {
  }

  public void calculateFactorial(int number) {
    int factorial = 1;

    for(int i = 1; i <= number; ++i) {
      factorial *= i;
    }

    System.out.println("\nEl factorial de " + number + " es: " + factorial);
  }
}