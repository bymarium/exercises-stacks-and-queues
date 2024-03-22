package exercices.exercise11;

import java.util.Stack;

public class Main {
  public static void main(String[] args) {
    InsuranceCompany insuranceCompany = new InsuranceCompany();
    Quantity quantity = new Quantity();

    Stack<Sinister> sinisters = insuranceCompany.enterSinister();
    insuranceCompany.showSinister(sinisters);

    quantity.majorSinister(sinisters);
    quantity.findMajorPrice(sinisters);
  }

}
