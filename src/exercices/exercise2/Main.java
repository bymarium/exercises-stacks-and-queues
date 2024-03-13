package exercices.exercise2;

public class Main {
  public static void main(String[] args) {
    CharacterString characterString = new CharacterString();
    ReverseChain reverseChain = new ReverseChain();
    String chain = characterString.getChain();
    reverseChain.reversePile(reverseChain.fillPile(chain));
  }
}
