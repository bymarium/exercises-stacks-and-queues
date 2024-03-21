package exercices.exercise8;

import exercices.Matrix;

public class Average {
  Matrix matrix = new Matrix();

  public Average() {
  }

  public int calculateAverage(int[][] numbers) {
    int add = 0;

    for(int i = 0; i < numbers.length; ++i) {
      for(int j = 0; j < numbers[i].length; ++j) {
        add += numbers[i][j];
      }
    }

    return add / (numbers.length * numbers.length);
  }

  public void calculateMajorAverage(int averageA, int averageB, int[][] oneMatrix, int[][] secondMatrix) {
    System.out.println("Promedio de la matriz A: " + averageA);
    System.out.println("Promedio de la matriz B: " + averageB);
    if (averageA > averageB) {
      System.out.println("La matriz con el mayor promedio es " + averageA + " de la matriz: ");
      matrix.showMatrix(oneMatrix);
    }

  }
}