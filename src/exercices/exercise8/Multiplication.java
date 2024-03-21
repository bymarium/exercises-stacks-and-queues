package exercices.exercise8;

import java.util.LinkedList;
import java.util.Queue;

public class Multiplication {
  private final Queue<Integer> multiply = new LinkedList();

  public Multiplication() {
  }

  public void multiplyMatrixes(int[][] oneMatrix, int[][] secondMatrix) {
    for(int i = 0; i < oneMatrix.length; ++i) {
      for(int j = 0; j < oneMatrix.length; ++j) {
        this.multiply.offer(oneMatrix[i][j] * secondMatrix[i][j]);
      }
    }

    System.out.println("\nLa cola resultante de la multiplicación de las matrices es: \n" + this.multiply);
  }
}
