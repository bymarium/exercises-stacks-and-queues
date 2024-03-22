package exercices;

import java.util.Scanner;

public class Matrix {
  private final Scanner reader = new Scanner(System.in);

  public int getRows() {
    System.out.println("Ingrese la cantidad de filas de la matriz: ");
    return reader.nextInt();
  }

  public int getColumns() {
    System.out.println("Ingrese la cantidad de columnas de la matriz: ");
    return reader.nextInt();
  }

  public int[][] fillMatrix(int rows, int columns) {
    int[][] numbers = new int[rows][columns];

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
