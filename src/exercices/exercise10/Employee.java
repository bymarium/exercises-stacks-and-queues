package exercices.exercise10;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Employee {

  private final Scanner reader = new Scanner(System.in);
  public Queue<String> addMaterial() {
    Queue<String> materials = new LinkedList<>();

    char answer;
    do {
      System.out.println("Ingrese el tipo de material reciclable: ");
      String material = reader.nextLine().toLowerCase();
      materials.offer(material);

      System.out.println("¿Desear ingresar otro tipo de material? S/N");
      answer = reader.nextLine().charAt(0);
    } while (answer == 's' || answer == 'S');

    return materials;
  }

  public Queue<Integer> enterQuantity(Queue<String> matrials) {
    Queue<Integer> quantities = new LinkedList<>();

    for (String material : matrials) {
      System.out.println("\nIngrese la cantidad de toneladas del tipo de material " + material);
      int quantity = reader.nextInt();
      quantities.offer(quantity);
      reader.nextLine();
    }

    return quantities;
  }

  public void calculatePercentages(Queue<String> materials, Queue<Integer> quantites) {
    int total = 0;

    for (int quantity : quantites) {
      total += quantity;
    }

    System.out.println("\nEl total de elementos reciclabes es: " + total);
    System.out.println("\nMaterial | Cantidad | Porcentaje");
    for (int quantity: quantites) {
      String material = materials.poll();
      int porcentage = (quantity * 100) / total;
      System.out.println(material + " | " + quantity + " | " + porcentage + "%");
    }
  }

  public void majorIncome(Queue<String> materials, Queue<Integer> quantites){
    String materialMaxQuantity = "";
    int maxQuantity = 0;

    for (String material : materials) {
      int quantity = quantites.poll();

      if (quantity > maxQuantity) {
        maxQuantity = quantity;
        materialMaxQuantity = material;
      }
    }

    System.out.println("\nEl material con la mayor cantidad ingresada es: " + materialMaxQuantity);
    System.out.println("Cantidad ingresada: " + maxQuantity);
  }
}
