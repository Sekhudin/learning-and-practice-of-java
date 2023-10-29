public class OverloadingFunc {
  public static void main(String[] args) {
    overloadingMethod();
    overloadingMethod("Sekhudin");
    overloadingMethod("Sekhudin", "software engineer");
  }

  /*
   * Overidding method/function adalah membuat method/function dengan nama yang
   * sama akan tetapi memiliki parameter dan perilaku yang berbeda.
   * example: method overideMethod
   */
  static void overloadingMethod() {
    System.out.println("Hello");
  }

  static void overloadingMethod(String name) {
    System.out.println("Hello " + name);
  }

  static void overloadingMethod(String name, String workAs) {
    System.out.println("Hello " + name + ", ".concat(workAs));
  }
}
