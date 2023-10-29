package oop.myclass;

public class Employee {
  public String name;
  public int age;
  public String position = "Employee";
  public String company = "PT DENSO Indonesia";

  public Employee(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void sayHello(String name) {
    System.out.printf("Hi %s, My name is Employee %s%n", name, this.name);
  };
}
