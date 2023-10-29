package oop;

import oop.myclass.*;

public class PolymorphismClass {
  public static void main(String[] args) {
    /**
     * Class Employee, Manager, Secretary sama2 memilii method sayHello()
     * sayHello() bisa diakse, tetapi method/properti lain yang tidak tersedia pada
     * class Employee tidak dapat diakses. karena deklarasi tipenya menggunakan
     * Employee class.
     */
    Employee emp = new Employee("Sekhudin", 24);
    emp.sayHello("Jude"); // sayHello berasal dari Employee
    emp = new Manager("Sekhudin", 24);
    emp.sayHello("Jude"); // sayHello berasal dari Manager
    emp = new Secretary("Sekhudin", 24);
    emp.sayHello("Jude"); // sayHello berasal dari Secretary
  }
}
