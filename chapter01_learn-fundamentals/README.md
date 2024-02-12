# Chapter 01 - Java Dasar

### Daftar Isi
- [Terminologi Umum](#terminologi-umum-pada-java)
  - [Class](#1-class)
  - [Object](#2-object)
  - [Method](#3-method)
  - [Instance Variables](#4-instance-variables)
- [A. Sintaks Dasar](#terminologi-umum-pada-java)
  - [1. Komentar pada Java](#1-komentar-pada-java)
  - [2. Penamaan *File*](#2-penamaan-file)
  - [3. *Case Sensitivity*](#3-case-sensitivity)
  - [4. Penamaan Kelas (*Class Names*)](#4-penamaan-kelas-class-names)
  - [5. *public static void main(String [] args)*](#5-public-static-void-mainstring--args)
  - [6. Penamaan Method (*Method Names*)](#6-penamaan-method-method-names)
  - [7. *Identifiers*](#7-identifiers)
  - [8. *White Spaces*](#8-white-spaces)
  - [9. *Access Modifiers*](#9-access-modifiers)
  - [10. Memahami *Access Modifiers*](#10-memahami-access-modifiers)
  - [11. *Keywords*](#11-keywords)


## Terminologi umum pada Java
Ada beberapa terminologi atau istilah umum pada Java, antara lain:
### 1. Class
  Class adalah cetak biru (*blueprint*) dari Object (*instance of class*). Secara sederhananya, Class bisa diartikan **cetakan** dari Object.<br>
  **Contoh:**
  * Cetakan (*Blueprint*) dari rumah adalah sebuah **Class.**
  * Pada dunia nyata, misalkan Kamu memiliki kawan bernama Samsul. Maka,  Kamu dan Samsul adalah Object (*instance of class*) dari Class yang  bernama **Manusia.**<br>

### 2. Object
  Object adalah hasil cetakan dari Class (*instance of class*). Object adalah entitas yang dihasilkan dari Class sehingga memiliki kondisi (*state*) dan perilaku (*behavior*) sesuai dengan Class yang menjadi *instance*-nya.<br>
  * **Contoh:** Saya, Kamu dan Semua orang adalah Object yang dihasilkan oleh **Class Manusia.**
  * **Behavior:** Mengucapkan selamat ulang tahun.<br>

### 3. Method
  Perilaku yang dimiliki oleh sebuah Object disebut **Method.**<br>
  * **Contoh:** Indikator bahan bakar menunjukan jumlah bahan bakar yang tersisa.

### 4. Instance variables
  Instance variables adalah kumpulan variabel unik yang dimiliki oeh Object.</br>
  * **Contoh:** Nama, usia, tinggi badan, berat badan dll.

[top ↑](#daftar-isi)<br><br>

## A. Sintaks Dasar

### 1. Komentar pada Java
  Komentar biasanaya berupa penjelasan pada kode program. komentar akan diabaikan (tidak dikompilasi) sehingga tidak akan mengganggu jalanya program. setidaknya ada 3 tipe komentar pada Java, diantaranya:
  - *Single-line Comment*
  ```Java
  // System.out.println("This is single comment.");

  ```
  - *Multi-line Comment*
  ```Java
  /*
    System.out.println("This is the first line comment.");
    komentar lain
    System.out.println("This is the second line comment.");
  */
  ```
  - *Documentation Comment*
  ```Java
  /** documentation */
  ```

### 2. Penamaan *File*
  Penamaan *file* tidak bisa sembarangan. Jika sebuah *file* memiliki kelas publik (***public class name***) maka nama *file* harus sama dengan nama *public class* tersebut. jika tidak memiliki kelas publik, maka nama *file* boleh berbeda dengan nama *class*. <br>
  Asumsikan kamu memiliki sebuah kelas publik bernama **BasicSyntax**.
  ```
  BasicSyntax.java // valid

  Basic-Syntax.java // invalid

  basicsyntax.java // invalid
  ```

### 3. *Case Sensitivity*
  Java adalah bahasa yang memperhatikan huruf besar kecil (*case-sensitive*), artinya deklarasi AB tidak sama dengan Ab.
  ```Java
  System.out.println("GeeksforGeeks"); // valid

  system.out.println("GeeksforGeeks"); // invalid karena huruf pertama pada keyword System seharusnya kapital. 
  ```

### 4. Penamaan Kelas (*Class Names*)
  Sama seperti penamaan *file*, penamaan kelas pada java juga memiliki aturan.<br>
  - Kata pertama pada nama kelas disarankan kapital. huruf kecil sebenernya valid akan tetapi tidak diasarankan.
  - Jika nama kelas terdiri dari 2 kata atau lebih, maka kata pertama setiap kata harus kapital (**PascalCase** - [casings](https://medium.com/@code.ceeker/naming-conventions-camel-case-pascal-case-kebab-case-and-more-dc4e515b9652)).
  - Tanda **underscore** diperbolehkan, tapi tidak disarankan.
  - Angka dan simbol **currency** diperboehkan, tapi tidak disarankan.
  ```Java
  class MyJavaProgram    // valid
  class 1Program         // invalid
  class My1Program       // valid
  class $Program         // valid, tapi tidak disarankan
  class My$Program       // valid, tapi tidak disarankan (biasanya penamaan kelas seperti ini hanya untuk tujuan khusus)
  class myJavaProgram    // valid, tapi tidak disarankan
  ```

### 5. *public static void main(String [] args)*
  Method main adalah pintu masuk utama ke dalam program Java yang dibuat. Di sinilah pemrosesan dimulai. method main juga bisa ditulis seperti ini:
  ```Java
  public static void main(String… args){
    // ...
  };
  ```

### 6. Penamaan Method (*Method Names*)
 Berbeda degan penamaan kelas yang mengikuti *casing PascalCase*, penamaan method pada Java mengikuti *casing camelCase*. <br>
 jika nama method terdiri dari 1 kata saja maka nama method ditulis dengan huruf kecil.
 ```java
 public void run() // valid
 public void Eat() // valid, tapi tidak disarankan
 ```
 Jika nama method terdiri dari 2 kata ataun lebih, maka huruf pertama pada kata pertama ditulis kecil, sementara huruf pertama pada kata kedua dan seterusnya ditulis kapital.
 ```Java
 public void createProfile() // valid
 public void CreateProfile() // valid, tapi tidak disarankan.
 ```

### 7. *Identifiers*
  *Identifiers* adalah segala nama variabel lokal, variabel *instance*, variabel kelas, labels, juga termasuk nama kelas, paket (*packages*), modul, method. *Identifiers* memiliki beberapa aturan:
  - Semua *identifier* bisa diawali dengan huruf, simbol *currency*, atau tanda **underscore**. Penamaan vaiabel hendaknya huruf kecil.
  - *Identifier* juga bisa kombinasi antara huruf, simbol dan **underscore**. walaupun demikian, variabel tidak disarankan menggunakan **underscore**, dan untuk variabel yang merupakan konstanta (**constant**) disarankan menggunakan huruf kapital seluruhnya.
  - *Identifier* adalah *case-sensitive*, artinya AB tidak sama dengan dengan Ab, tidak sama dengan aB, tidak sama dengan ab.
  - *keyword* bawaan Java tidak bisa digunakan sebagai *identifier*. artinya *keyword* seperti (*class, public, void, final, etc*) tidak bisa digunakan untuk *identifier*.
  ```Java
  // legal
  MinNumber, total, ak74, hello_world, $amount, _under_value

  // illegal
  74ak, -amount
  ```

### 8. *White Spaces*
  *white space* semisal spasi dan tab akan diabaikan oleh kompiler.
### 9. *Access Modifiers*
  *Modifier* atau pengubah adalah pengontrol yang mengontrol ruang lingkup (*scope*) dari kelas dan *method*.
  * ***Access Modifiers:*** default, public, protected, private.
  * ***Non-access Modifiers:*** final, abstract, static, transient, synchronized, volatile, native.

### 10. Memahami *Access Modifiers*
  | ***Access Modifier*** | **Whitin Class** | **Whitin Package** | **Outside Package by subclass only** | Outside Package |
  | --------------------- | ---------------- | ------------------ | ------------------------------------ | --------------- |
  | **Private**           | Yes              | No                 | No                                   | No              |
  | **Default**           | Yes              | Yes                | No                                   | No              |
  | **Protected**         | Yes              | Yes                | Yes                                  | No              |
  | **Public**            | Yes              | Yes                | Yes                                  | Yes             |

### 11. *Keywords*
  *Keywords* atau *Reserved words* adalah kata-kata pada bahasa pemrograman yang digunakan untuk menjalankan beberapa proses internal atau mewakili beberapa tindakan. Kata-kata ini **tidak boeh digunakan** untuk deklarasi variabel taua Object. <br>
  | - | - | - | - | - | - | - | - |
  | - | - | - | - | - | - | - | - |
  | abstract | assert |
  | boolean | break | byte |
  | case | catch | char | class | const | continue |
  | default | do | double |
  | else | enum | extends |
  | final | finally | float | floor |
  | goto |
  | if | implements | imort | instanceof | int | interface |
  | long |
  | native | new |
  | package | private | protected | public |
  | return |
  | short | static | strictfp | super | switch | synchronized |
  | this | throw | throws | transient | try |
  | void | volatile | while |


[top ↑](#daftar-isi)<br><br>