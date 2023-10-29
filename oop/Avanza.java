package oop;

import oop.myinterface.Car;

public class Avanza implements Car {

  public void drive() {
    System.out.println("Avanza berjalan");
  }

  public int getSpeed() {
    return 400;
  }

}
