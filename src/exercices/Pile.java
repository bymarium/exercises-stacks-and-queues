package exercices;

import java.util.Scanner;
import java.util.Stack;

public class Pile {

  private final Stack<Integer> pila = new Stack<>();

  public int obtenerNumeroDatos(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("\nIngrese el número de datos que desea tenga la pila: ");
    return scanner.nextInt();
  }
  public Stack<Integer> llenarPila(int numeroDatos){

    for (int i = 0; i < numeroDatos; i++) {
      pila.push((int) (Math.random() * 50 + 1));
    }

    return pila;
  }

  public void mostrarPila(Stack<Integer> numeros) {
    System.out.println("\nLa pila obtenida es: " + numeros);
  }
}