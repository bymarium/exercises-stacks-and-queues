package exercices.exercise5;

import java.util.Arrays;
import java.util.Scanner;

public class Vector {
  private final Scanner reader = new Scanner(System.in);

  public int getSize() {
    System.out.println("\nIngrese la dimensión del vector: ");
    return reader.nextInt();
  }

  public int[] fillVector(int size) {
    int[] numbers = new int[size];

    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = (int) (Math.random() * 50 - 10);
    }

    return numbers;
  }

  public void showVector(int[] vector) {
    System.out.println("\nVector: " + Arrays.toString(vector));
  }
}
