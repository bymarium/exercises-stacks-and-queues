package exercices.exercise4;

import java.util.Scanner;
import java.util.Stack;

public class Search {
  public int indicateValue() {
    Scanner reader = new Scanner(System.in);
    System.out.println("Ingrese el numero que desea buscar en la pila: ");
   return reader.nextInt();
  }
  public void searchValue(Stack<Integer> numbers, int value){
    int position = 0;
    for (int i = 0; i < numbers.size(); i++) {
      if (numbers.get(i) == value) {
        position = i;
      }
    }

    if (position > 0) {
      System.out.println("El numero que deseas buscar en la pila esta en la posicion " + (position + 1));
    } else {
      System.out.println("El numero que desea buscar en la pila no existe");
    }
  }
}
