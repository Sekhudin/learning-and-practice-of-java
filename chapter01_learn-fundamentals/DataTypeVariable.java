class DataTypeVariable {
  // Variabel dengan tipe data Non-primitive
  String name = "John Doe";

  // Variabel dengan tipe data Primitive
  // 1. Boolean
  boolean isHuman = true; // tidak memiliki method dan properti tertentu
  Boolean isLive = true; // karena Boolean adalah kelas, maka dapat memiliki method dan properti tertentu

  // 2. Numeric
  // 2.1 Numeric Character
  char A = 'A';
  char A_Unicode = '\u0041'; // deklarasi 'A' menggunakan karakter UNICODE
  char A_Ascii = 65; // deklarasi 'A' menggunakan nilai ASCII
  Character letterA = 'A';

  // 2.2 Numberic byte
  byte byte_min = -128;
  Byte byte_max = 127;

  // 2.3 Numeric short
  short short_min = -32768;
  Short short_max = 32767;

  // 2.4 Numeric int
  int int_min = -2147483648;
  Integer int_max = 2147483647;

  // 2.5 Numeric long
  long long_min = -9223372036854775808L;
  Long long_max = 9223372036854775807L;

  // 2.6 Numeric float - rentang nilai float tidak terbatas
  float float_a = -3.8F;
  Float float_b = 3.4F;

  // 2.7 Numeric double
  double double_a = 3.33;
  Double double_b = 3.14;
}
