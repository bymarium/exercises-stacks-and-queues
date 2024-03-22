package exercices.exercise14;

import java.util.Stack;

public class SumStack {
  private final String SUM_MAJOR = "\nLa suma mayor es: ";
  private final String SUM_MINOR = "\nLa suma menor es: ";

  public int addStack(Stack<Integer> numbers) {
    int add = 0;

    for (int number : numbers) {
      add += number;
    }

    System.out.println("La suma de la pila " + numbers + " es: " + add);
    return add;
  }

  private void sumResult(String message, int sum, Stack<Integer> stack) {
    System.out.println(message + sum + "\nPila: " + stack);
  }

  public void sumMajorMinor(Stack<Integer> oneStack, Stack<Integer> secondStack, Stack<Integer> thirdStack) {
    int sumOne = addStack(oneStack);
    int sumSecond = addStack(secondStack);
    int sumThird = addStack(thirdStack);

    int maxSum = Math.max(Math.max(sumOne, sumSecond), sumThird);
    int minSum = Math.min(Math.min(sumOne, sumSecond), sumThird);

    if (sumOne == maxSum) {
      sumResult(SUM_MAJOR, maxSum, oneStack);
    } else if (sumSecond == maxSum) {
      sumResult(SUM_MAJOR, maxSum, secondStack);
    } else {
      sumResult(SUM_MAJOR, maxSum, thirdStack);
    }

    if (sumOne == minSum) {
      sumResult(SUM_MINOR, minSum, oneStack);
    } else if (sumSecond == minSum) {
      sumResult(SUM_MINOR, minSum, secondStack);
    } else {
      sumResult(SUM_MINOR, minSum, thirdStack);
    }
  }
}
