package oop.myclass;

public class Secretary extends Employee {
  public String fromSecretary = "from secretary";

  public Secretary(String name, int age) {
    super(name, age);
    super.position = "Secretary";
  }

  public void sayHello(String name) {
    System.out.printf("Hi %s Saya, My name is Secretary %s%n", name, this.name);
  };
}
