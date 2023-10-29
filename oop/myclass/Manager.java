package oop.myclass;

public class Manager extends Employee {

  public Manager(String name, int age) {
    super(name, age);
    super.position = "Manager";
  }

  public void sayHello(String name) {
    System.out.printf("Hi %s, My name is Manager %s%n", name, this.name);
  };

  public void fromManager() {
    System.out.println(this.name + " is Manager");
  }
}
