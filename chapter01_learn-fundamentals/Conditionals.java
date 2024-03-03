public class Conditionals {
  public static void forIf() {
    int umur = 12;
    if (umur < 18) {
      // dieksekusi
      System.out.println("Anak-anak");
    }
  }

  public static void forIfElse() {
    int num = 3;
    if (num % 2 == 0) {
      System.out.println("Genap");
    } else {
      // dieksekusi
      System.out.println("Ganjil");
    }
  }

  public static void forIfElseIf() {
    int num = 10;
    if (num >= 0) {
      // dieksekusi
      System.out.println("angka positif");
    } else if (num == 10) {
      // biarpun bernilai benar tapi tidak dieksekusi
      System.out.println("== 10");
    } else {
      System.out.println("angka negatif");
    }
  }

  public static void forNestedIf() {
    int age = 20;
    int weight = 70;

    if (age > 18) {
      if (weight >= 50) {
        // dieksekusi
        System.out.println("Boleh donor darah");
      } else {
        System.out.println("BB Kurang");
      }
    } else {
      System.out.println("Umur kurang");
    }
  }

  public static void forSwitchCase(){
    int num = 20;
    switch (num) {
      case 10:
        System.out.println("Sepuluh");
        break;

      case 15:
        System.out.println("Limabelas");
        break;

      case 20:
        System.out.println("Duapuluh");
        break;
    
      default:
        System.out.println("Tidak tahu");
        break;
    }
  }

  public static void main(String[] args) {
    Conditionals.forIf();
    Conditionals.forIfElse();
    Conditionals.forIfElseIf();
    Conditionals.forNestedIf();
    Conditionals.forSwitchCase();
  }
}
