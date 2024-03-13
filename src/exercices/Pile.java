package exercices;

import java.util.Scanner;
import java.util.Stack;

public class Pile {

  private final Stack<Integer> pile = new Stack<>();

  public int getSize(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingrese el número de datos que desea tenga la pila: ");
    return scanner.nextInt();
  }
  public Stack<Integer> fillPile(int size){

    for (int i = 0; i < size; i++) {
      pile.push((int) (Math.random() * 50 + 1));
    }

    return pile;
  }

  public void showPile(Stack<Integer> numbers) {
    System.out.println("La pila obtenida es: " + numbers);
  }


}