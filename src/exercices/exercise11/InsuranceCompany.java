package exercices.exercise11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class InsuranceCompany {
  private final Scanner reader = new Scanner(System.in);
  private final Stack<Sinister> sinisters = new Stack<>();
  public Stack<Sinister> enterSinister() {
    System.out.println("Indique el tipo de sinisetro que desea ingresar: \n1. Choque \n2. Daño a tercero \n3. Perdida total \n4. Ninguno");
    int option = reader.nextInt();

    double price;
    switch (option) {
      case 1:
        System.out.println("Ingrese el valor: ");
        price = reader.nextDouble();
        sinisters.push(new Sinister("Choque", price));
        enterSinister();
        break;
      case 2:
        System.out.println("Ingrese el valor del siniestro de Daño a tercero: ");
        price = reader.nextDouble();
        sinisters.push(new Sinister("Daño a tercero", price));
        enterSinister();
        break;
      case 3:
        System.out.println("Ingrese el valor del siniestro de Pérdida total: ");
        price = reader.nextDouble();
        sinisters.push(new Sinister("Pérdida total", price));
        enterSinister();
        break;
      case 4:
        break;
      default:
        System.out.println("Opción no válida. Por favor, ingrese una opción válida.");
        enterSinister();
        break;
    }

    return sinisters;
  }

  public void showSinister(Stack<Sinister> sinisters) {
    Queue<Sinister> queue = new LinkedList<>();

    for (Sinister sinister : sinisters) {
      queue.offer(sinister);
    }

    System.out.println("\nSiniestros en la cola: \n");
    for (Sinister sinister : queue) {
      System.out.println("Tipo: " + sinister.getName() + ", Precio: $" + sinister.getPrice());
    }
  }
}
