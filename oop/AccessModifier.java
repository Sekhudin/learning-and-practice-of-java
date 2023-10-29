package oop;

import oop.myclass.Modifier;

public class AccessModifier {
  public static void main(String[] args) {
    Modifier mod = new Modifier();
    System.out.println(mod.publicModif);
    // System.out.println(mod.noModif); error
    // System.out.println(mod.protectedModif); error
    // System.out.println(mod.privateModif); error
  }
}
