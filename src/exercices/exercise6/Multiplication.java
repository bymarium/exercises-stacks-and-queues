package exercices.exercise6;

import java.util.Stack;

public class Multiplication {
  public void multiplyMatrixes(int[][] oneMatrix, int[][] secondMatrix) {
    Stack<Integer> numbers = new Stack<>();

    for (int i = 0; i < oneMatrix.length; i++) {
      for (int j = 0; j < oneMatrix.length; j++) {
        numbers.push(oneMatrix[i][j] * secondMatrix[i][j]);
      }
    }

    System.out.println("La multiplicacion entres ambas matrices es: " + numbers);
  }
}
