package exercices.exercise13;

import exercices.Matrix;
import exercices.Pile;

import java.util.Queue;
import java.util.Stack;

public class Main {
  public static void main(String[] args) {
    Matrix matrix = new Matrix();
    Pile pile = new Pile();
    Multiplication multiplication = new Multiplication();
    Average average = new Average();
    Change change = new Change();

    int rows = matrix.getRows();
    int columns = matrix.getColumns();

    int[][] numbersMatrix = matrix.fillMatrix(rows, columns);
    Stack<Integer> numbersStack = pile.fillPile(rows);

    matrix.showMatrix(numbersMatrix);
    pile.showPile(numbersStack);

    Queue<Integer> numbersQueue = multiplication.multiply(numbersMatrix, numbersStack);
    average.showAverage(numbersQueue);

    Queue<Integer> numbersChanged = change.changeNumber(numbersQueue);
    average.showAverage(numbersChanged);

  }
}
