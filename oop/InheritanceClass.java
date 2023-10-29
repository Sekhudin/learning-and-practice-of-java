package oop;

import oop.myclass.*;

public class InheritanceClass {
  public static void main(String[] args) {
    /**
     * Class Manager dan Secretary akan mewarisi property/method/function yang
     * tesedia pada Employee.
     */
    Manager em1 = new Manager("Sekhudin", 25);
    Secretary em2 = new Secretary("Amelia", 24);
    System.out.printf("-----%n");
    System.out.printf("name: %s%numur: %d%nposisi: %s%n", em1.name, em1.age, em1.position);
    System.out.printf("-----%n");
    System.out.printf("name: %s%numur: %d%nposisi: %s%n", em2.name, em2.age, em2.position);
    System.out.printf("-----%n");
  }
}
