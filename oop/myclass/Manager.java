package oop.myclass;

public class Manager extends Employee {
  public String fromManager = "from manager";

  public Manager(String name, int age) {
    super(name, age);
    super.position = "Manager";
  }

  public void sayHello(String name) {
    System.out.printf("Hi %s Saya, My name is Manager %s%n", name, this.name);
  };
}
