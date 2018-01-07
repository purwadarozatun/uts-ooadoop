public class Main{
  public static void main(String []args) {
    LakiLaki laki = new LakiLaki();
    laki.walk();
    Perempuan perempuan = new Perempuan();
    perempuan.walk();

    Calculator calc = new Calculator();
    System.out.println(calc.tambah(10, 10));
    System.out.println(calc.kurang(10, 10));
  }
}