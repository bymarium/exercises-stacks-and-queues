package exercices.exercise1;

import exercices.Matrix;

public class Main {
  public static void main(String[] args) {
    Matrix matrix = new Matrix();
    Menu menu = new Menu();
    int[][] numbers = matrix.fillMatrix(matrix.getSize());
    matrix.showMatrix(numbers);
    menu.selectOption(numbers);
  }
}
