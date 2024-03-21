package exercices.exercise8;

import exercices.Matrix;

public class Change {
  Matrix matrix = new Matrix();

  public Change() {
  }

  public void changeNumber(int[][] numbers) {
    int[][] changeNumbers = new int[numbers.length][numbers.length];

    for(int i = 0; i < numbers.length; ++i) {
      for(int j = 0; j < numbers[i].length; ++j) {
        if (numbers[i][j] < 0) {
          changeNumbers[i][j] = 0;
        } else {
          changeNumbers[i][j] = numbers[i][j];
        }
      }
    }

    this.matrix.showMatrix(changeNumbers);
  }
}