package oop.myclass;

/**
 * no modier class (ex: class Human {}) tidak bisa diakses diluar package.
 * public class modifier (ex: public class Human{}) bisa diakses diluar package,
 * nama file dg nama class harus sama.
 */
public class Modifier {
  String noModif = "no modifier"; // darimana saja asal masih satu package
  public String publicModif = "public modifier"; // darimana saja walaupun beda package
  protected String protectedModif = "protected modifier"; // dari class sendiri dan turunannaya, walaupun beda package
  private String privateModif = "private modifier"; // hanya bisa diakses dari kelas itu sendiri.
}
