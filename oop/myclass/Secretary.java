package oop.myclass;

public class Secretary extends Employee {

  public Secretary(String name, int age) {
    super(name, age);
    super.position = "Secretary";
  }

  public void sayHello(String name) {
    System.out.printf("Hi %s, My name is Secretary %s%n", name, this.name);
  };

  public void fromSecretary() {
    System.out.println(this.name + " is Secretary");
  }
}
