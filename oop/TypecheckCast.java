package oop;

import oop.myclass.*;

public class TypecheckCast {
  public static void main(String[] args) {
    sayHello(new Employee("Sekhudin", 24));
    sayHello(new Manager("Andi", 30));
    sayHello(new Secretary("Anita", 23));
  };

  /**
   * typecheck bisa menggunakan instanceof,
   * sementara casting menggunakan ({NamaClass})
   */
  static void sayHello(Employee emp) {
    if (emp instanceof Manager) {
      Manager mgr = (Manager) emp;
      mgr.fromManager();
    } else if (emp instanceof Secretary) {
      Secretary src = (Secretary) emp;
      src.fromSecretary();
    } else {
      emp.sayHello("Manda");
    }
  }

}
