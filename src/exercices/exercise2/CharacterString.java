package exercices.exercise2;

import java.util.Scanner;

public class CharacterString {
  private final Scanner reader = new Scanner(System.in);
  public String getChain() {
    System.out.println("Ingrese una cadena de caracteres: ");
    return reader.nextLine();
  }
}
