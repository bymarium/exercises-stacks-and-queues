package exercices;

import java.util.*;

public class Queue {
  private final java.util.Queue<Integer> cola = new LinkedList<>();

  public int getSize() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("\nIngrese la dimesion de la cola: ");
    return scanner.nextInt();
  }

  public java.util.Queue<Integer> createQueue(int size){
    for (int i = 0; i < size; i++) {
      cola.offer((int)(Math.random() * 50 + 1));
    }
    return cola;
  }

  public void showQueue(Queue numbers) {
    System.out.println("\nLa cola obtenida es: " + numbers);
  }
}
