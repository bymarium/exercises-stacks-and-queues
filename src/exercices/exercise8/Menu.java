package exercices.exercise8;

import java.util.Scanner;

public class Menu {
  private final Scanner reader;

  public Menu() {
    reader = new Scanner(System.in);
  }

  public int showOptions() {
    System.out.println("\nMenu de opciones: \n1. Multiplicar dos matrices nxn. \n2. Mostrar cual es la media mayor entre la matriz a y la matriz b. \n3. Hallar el factorial de la media de la matriz a y la matriz b. \n4. Cambiar los numeros negativos de la matriz a y la matriz b por 0. \n5. Salir. ");
    return reader.nextInt();
  }

  public void selectOption(int[][] oneMatrix, int[][] secondMatrix) {
    Multiplication multiplication = new Multiplication();
    Average average = new Average();
    Factorial factorial = new Factorial();
    Change change = new Change();
    int averageA = average.calculateAverage(oneMatrix);
    int averageB = average.calculateAverage(secondMatrix);
    int option = showOptions();
    switch (option) {
      case 1:
        multiplication.multiplyMatrixes(oneMatrix, secondMatrix);
        selectOption(oneMatrix, secondMatrix);
        break;
      case 2:
        average.calculateMajorAverage(averageA, averageB, oneMatrix, secondMatrix);
        selectOption(oneMatrix, secondMatrix);
        break;
      case 3:
        factorial.calculateFactorial(averageA);
        factorial.calculateFactorial(averageB);
        selectOption(oneMatrix, secondMatrix);
        break;
      case 4:
        System.out.println("\nNueva matriz A: ");
        change.changeNumber(oneMatrix);
        System.out.println("\nNueva matriz B: ");
        change.changeNumber(secondMatrix);
       selectOption(oneMatrix, secondMatrix);
      case 5:
        break;
      default:
        System.out.println("\nOpción invalida");
        selectOption(oneMatrix, secondMatrix);
    }

  }
}
