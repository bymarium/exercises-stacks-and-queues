package exercices.exercise15;

public class Employee {
  public String name;
  public int hours;
  public double total;

  public Employee(String name, int hours) {
    this.name = name;
    this.hours = hours;
  }

  public Employee(String name, int hours, double total) {
    this.name = name;
    this.hours = hours;
    this.total = total;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getHours() {
    return hours;
  }

  public void setHours(int hours) {
    this.hours = hours;
  }

  public double getTotal() {
    return total;
  }

  public void setTotal(double total) {
    this.total = total;
  }
}
