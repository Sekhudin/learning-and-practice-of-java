package oop;

import oop.myclass.AbstractAnimal;

class Bird extends AbstractAnimal {
  @Override
  public void voice() {
    System.out.println("Mpuk jeruu");
  }
}

class AbstarctClass {
  public static void main(String[] args) {
    // AbstractAnimal an = new AbstractAnimal(); error

    Bird bird = new Bird();
    bird.name = "Nuri";
    bird.age = 12;
    System.out.println(bird.name);
    bird.voice();
  }
}
