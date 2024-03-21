package exercices.exercise12;
import exercices.Matrix;

public class Main {
  public static void main(String[] args) {
    Matrix matrix = new Matrix();
    ParOdd parOdd = new ParOdd();
    int[][] numbers = matrix.fillMatrix(matrix.getSize());
    matrix.showMatrix(numbers);
    parOdd.fill(numbers);
  }
}
