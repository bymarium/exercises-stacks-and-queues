package exercices.matriz;

import java.util.Scanner;

public class Matrix {
  private final Scanner reader = new Scanner(System.in);

  public int getSize() {
    System.out.println("\nIngrese la dimensión de la matriz cuadrada: ");
    return reader.nextInt();
  }

  public int[][] fillMatrix(int size) {
    int[][] numbers = new int[size][size];

    for (int i = 0; i < numbers.length; i++) {
      for (int j = 0; j < numbers[i].length; j++) {
        numbers[i][j] = (int) (Math.random() * 50 - 10);
      }
    }

    return numbers;
  }

  public int[][] showMatrix(int[][] matrix) {
    System.out.println("\nMatriz: ");

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(" | " + matrix[i][j] + "\t");
      }
      System.out.println(" | ");
    }

    return matrix;
  }


}
