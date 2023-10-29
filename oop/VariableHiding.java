package oop;

import oop.myclass.*;

public class VariableHiding {
  public static void main(String[] args) {
    // Class Child sudah extends dengan Parent class
    Child cld = new Child();
    System.out.println(cld.name); // berasal dari child, karena instance dari Child
    cld.doIt(); // berasal dari child (terjadi method overidding)

    // cast to Parent
    Parent prt = (Parent) cld;
    System.out.println(prt.name); //
    prt.doIt(); //

    /**
     * Catatan : sanagt disaranakn antara class Parent dan Turunanya memiliki nama
     * properti yang berbeda, daam kasus ini properti name pada Child dan Parent
     */
  }
}
