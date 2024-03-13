package exercices.exercise6;

import exercices.Matrix;

import java.util.Stack;

public class Main {
  public static void main(String[] args) {
    Matrix matrix = new Matrix();
    SumRows sumRows = new SumRows();
    SumColumns sumColumns = new SumColumns();
    Average average = new Average();
    SquareRoot squareRoot = new SquareRoot();
    Multiplication multiplication = new Multiplication();

    int[][] matrixNumbers = matrix.fillMatrix(matrix.getRows(), matrix.getColumns());
    matrix.showMatrix(matrixNumbers);

    Stack<Integer> pileRows = sumRows.addRows(matrixNumbers);
    average.calculateAverage(pileRows);

    Stack<Integer> pileColumns = sumColumns.addColumns(matrixNumbers);
    squareRoot.calculateSquareRoot(pileColumns);

    int[][] oneMatrix = matrix.fillMatrix(matrix.getRows(), matrix.getColumns());
    int[][] secondMatrix = matrix.fillMatrix(matrix.getRows(), matrix.getColumns());
    matrix.showMatrix(oneMatrix);
    matrix.showMatrix(secondMatrix);
    multiplication.multiplyMatrixes(oneMatrix, secondMatrix);
  }
}
