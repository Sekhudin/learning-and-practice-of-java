package oop;

import oop.myclass.Profile;

public class Encapsulation {
  public static void main(String[] args) {
    Profile prof = new Profile();
    System.out.println(prof.getName());
    prof.setName("Amiruddin");
    System.out.println(prof.getName());
  }
}
