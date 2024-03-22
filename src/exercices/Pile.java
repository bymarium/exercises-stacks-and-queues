package exercices;

import java.util.Scanner;
import java.util.Stack;

public class Pile {
  public int getSize(){
    Scanner reader = new Scanner(System.in);
    System.out.println("Ingrese el número de datos que desea tenga la pila: ");
    return reader.nextInt();
  }
  public Stack<Integer> fillPile(int size){
    Stack<Integer> pile = new Stack<>();

    for (int i = 0; i < size; i++) {
      pile.push((int) (Math.random() * 50 + 1));
    }

    return pile;
  }

  public void showPile(Stack<Integer> numbers) {
    System.out.println("La pila obtenida es: " + numbers);
  }
}