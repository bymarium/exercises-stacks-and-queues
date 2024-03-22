package exercices.exercise15;

import javax.management.QueryEval;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Payroll {
  private final Scanner reader = new Scanner(System.in);
  public Stack<Employee> enterEmployees() {
    Stack<Employee> employees = new Stack<>();

    char answer;
    do {
      System.out.println("Ingrese el nombre del empleado: ");
      String name = reader.nextLine();
      System.out.println("Ingrese las horas trabajadas de " + name);
      int hours = reader.nextInt();

      reader.nextLine();

      employees.push(new Employee(name, hours));

      System.out.println("¿Desear ingresar otro empleado? S/N");
      answer = reader.nextLine().charAt(0);
    } while (answer == 's' || answer == 'S');

    return employees;
  }

  public Queue<Employee> calculaTotalPrice(Stack<Employee> employees) {
    System.out.println("Ingrese el valor de la hora: ");
    double hourValue = reader.nextInt();

    Queue<Employee> employeeQueue = new LinkedList<>();

    for (Employee employee : employees) {
      double totalPrice;
      int hours = employee.getHours();

      if (hours > 40) {
        int extraHours = hours - 40;

        if (extraHours < 9) {
          totalPrice = (40 * hourValue) + (extraHours * hourValue * 2);
        } else {
          totalPrice = (40 * hourValue) + (8 * hourValue * 2) + ((extraHours - 8) * hourValue * 3);
        }
      } else {
        totalPrice = hourValue * employee.getHours();
      }

      employeeQueue.offer(new Employee(employee.getName(), hours, totalPrice));
    }

    return employeeQueue;
  }

  public void showEmployees(Queue<Employee> employees) {
    System.out.println("\nNombre empleado | Horas trabajadas | Dinero a Pagar");
    for (Employee employee : employees) {
      System.out.println(employee.getName() + " | " + employee.getHours() + " | " + employee.getTotal());
    }
  }
}
