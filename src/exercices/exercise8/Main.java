package exercices.exercise8;

import exercices.Matrix;
public class Main {
  public static void main(String[] args) {
    Matrix matrix = new Matrix();
    int size = matrix.getSize();
    int[][] oneMatrix = matrix.fillMatrix(size);
    int[][] secondMatrix = matrix.fillMatrix(size);
    System.out.println("\nMatrix A: ");
    matrix.showMatrix(oneMatrix);
    System.out.println("\nMatrix B: ");
    matrix.showMatrix(secondMatrix);
    Menu menu = new Menu();
    menu.selectOption(oneMatrix, secondMatrix);
  }
}