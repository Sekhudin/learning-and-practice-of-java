package oop.myinterface;

public interface Car {
  void drive();

  int getSpeed();

  // default - mencegah agar class yang idak menginmplementasikan method dg
  // modifier ini agar tidak error
  default String machine() {
    return "Honda";
  }
}
