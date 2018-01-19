import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
class Ujian {
  Date tanggal_ujian;
  int jumlah_soal;
  int jumlah_benar;
  Double nilai = 0D;
  String grade;
  
  List<Soal> soal;
  List<String> jawaban;

  public Ujian () {
    this.soal = new ArrayList<Soal>();
    for(Integer i =01; i < 4 ; i ++){
      this.soal.add(new Soal(
        "Ini Soal " +  i.toString() + " dan jawaban nya pasti A",
        "A " + i.toString(),
        "B " + i.toString(),
        "C " + i.toString(),
        "D " + i.toString(),
        "E " + i.toString(),
        "A"
      ));
    }
  }

  public void doUjian() {
    List<String> jawabans = new ArrayList<>();
    for (int i = 0; i < this.soal.size(); i++) {
      Soal soal = this.soal.get(i);
      System.out.println((i + 1 ) +  " . " + soal.soal );
      System.out.println("Pilihan : ");
      System.out.println("A . " + soal.getJawabanA() );
      System.out.println("B . " + soal.jawabanB );
      System.out.println("C . " + soal.jawabanC );
      System.out.println("D . " + soal.jawabanD );
      System.out.println("E . " + soal.jawabanE );
      Scanner sc = new Scanner(System.in);
      System.out.print("Jawaban : ");
      String jawaban = sc.nextLine();
      this.jumlah_benar = this.jumlah_benar + (soal.isJawabanBenar(jawaban) ? 1 : 0);
      System.out.print("");
      jawabans.add(jawaban);
    } 
    this.jumlah_soal = jawabans.size();
    this.nilai = (this.jumlah_benar / this.jumlah_soal) * 100D;
    this.jawaban = jawabans;
  }
}