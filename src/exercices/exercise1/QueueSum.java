package exercices.exercise1;
import java.util.LinkedList;
import java.util.Queue;

public class QueueSum {
  public java.util.Queue<Integer> addColumns(int[][] numbers) {
    Queue<Integer> cola = new LinkedList<>();

    for (int i = 0; i < numbers[0].length; i++) {
      int add = 0;
      for (int j = 0; j < numbers.length; j++) {
        add += numbers[j][i];
      }
      cola.offer(add);
    }

    System.out.println("\nLa cola resultante de la suma de las columnas es: " + cola);
    return cola;
  }
}
