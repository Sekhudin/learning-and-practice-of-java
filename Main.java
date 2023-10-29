public class Main {
  public static void main(String[] args) {
    String name = "Saya";
    name = name + " Sekhudin";
    String name1 = "Saya Sekhudin";
    String name2 = "Saya Sekhudin";
    System.out.println(name);
    System.out.println(name2);
    
    // true
    System.out.println(name == "Saya Sekhudin");

    // false -> karena lokasi memori berbeda
    System.out.println(name == name2);

    // true -> karena lokasi sama (sama karena melalui ioptimize memori)
    System.out.println(name1 == name2);

    System.out.println("-----");
    // gunakan equals, untuk membandingkan isi kontent, nilai saja
    System.out.println(name.equals(name1));
    System.out.println(name.equals(name2));
    System.out.println(name.equals("Saya Sekhudin"));
  }
}
