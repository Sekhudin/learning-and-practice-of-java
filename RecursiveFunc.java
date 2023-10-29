public class RecursiveFunc {
  public static void main(String[] args) {
    int fact5Normal = factorialNormal(5);
    int fact5Recu = factorialRecursive(5);
    System.out.println(1 * 2 * 3 * 4 * 5);
    System.out.println("factorial normal " + fact5Normal);
    System.out.println("factorial recursive " + fact5Recu);
  }

  static int factorialNormal(int value) {
    int result = 1;
    for (int counter = 1; counter <= value; counter++) {
      result = result * counter;
    }
    return result;
  }

  /*
   * Recursive function/method adalah function/method yang memanggil dirinya
   * sendiri.
   */

  // factorial with recursive function/method
  static int factorialRecursive(int value) {
    if (value == 1) {
      return 1;
    } else {
      return value * factorialRecursive(value - 1);
    }
  }
}