package exercices.exercise11;

import java.util.Stack;

public class Quantity {
  public void majorSinister(Stack<Sinister> sinisters) {
    String majorType = null;
    int maxCount = 0;

    for (Sinister sinister : sinisters) {
      int count = 0;
      for (Sinister s : sinisters) {
        if (s.getName().equals(sinister.getName())) {
          count++;
        }
      }
      if (count > maxCount) {
        maxCount = count;
        majorType = sinister.getName();
      }
    }

    System.out.println("\nEl tipo de siniestro con mayor cantidad de ingresos totales es: " + majorType + ", con un total de ingresos de " + maxCount);
  }

  public void findMajorPrice(Stack<Sinister> sinisters) {
    String majorType = null;
    double maxTotalPrice = 0;

    for (Sinister sinister : sinisters) {
      double totalPrice = 0;
      for (Sinister s : sinisters) {
        if (s.getName().equals(sinister.getName())) {
          totalPrice += s.getPrice();
        }
      }
      if (totalPrice > maxTotalPrice) {
        maxTotalPrice = totalPrice;
        majorType = sinister.getName();
      }
    }

    System.out.println("\nEl tipo de siniestro con mayor total de precio ingresado es: " + majorType + ", con un total de: " + maxTotalPrice);
  }
}
