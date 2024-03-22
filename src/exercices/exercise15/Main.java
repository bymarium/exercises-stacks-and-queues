package exercices.exercise15;

import java.util.Queue;
import java.util.Stack;

public class Main {
  public static void main(String[] args) {
    Payroll payroll = new Payroll();

    Stack<Employee> employees = payroll.enterEmployees();
    Queue<Employee> employeeQueue = payroll.calculaTotalPrice(employees);
    payroll.showEmployees(employeeQueue);
  }
}
