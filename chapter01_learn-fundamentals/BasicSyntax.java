public class BasicSyntax {
  /**
   * @param comment String
   * @return String
   */
  private static String comment(String comment) {
    System.out.println("This method use comment for docs > ".concat(comment));
    return comment;
  }

  public static void main(String[] args) {
    // 1. Komentar
    // BasicSyntax.comment("comment for docs"); - single line comment

    // multiple line comment
    /*
     * BasicSyntax.comment("comment for docs");
     * BasicSyntax.comment("comment for docs");
     */

    // method dengan komentar dokumentasi
    BasicSyntax.comment("comment for docs");
  }
}