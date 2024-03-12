package exercices;

import java.util.*;

public class Queue {
  private final java.util.Queue<Integer> cola = new LinkedList<>();

  public int getSize() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingrese la dimesion de la cola: ");
    return scanner.nextInt();
  }

  public java.util.Queue<Integer> createQueue(int size){
    for (int i = 0; i < size; i++) {
      cola.offer((int)(Math.random() * 50 + 1));
    }
    return cola;
  }

  public void showQueue(java.util.Queue<Integer> numbers) {
    System.out.println("La cola obtenida es: " + numbers);
  }
}
