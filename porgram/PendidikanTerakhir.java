import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
class PendidikanTerakhir {

  String jenis_pendidikan_terakhir;
  String nama;
  String alamat;
  String jurusan;
  
  public static PendidikanTerakhir askPendidikanTerakhir(){
    PendidikanTerakhir pendidikanTerakhir = new PendidikanTerakhir();
    System.out.println("------------------------------------");
    System.out.println("Pendidikan Terkahir");
    System.out.println("------------------------------------");
    List<String> pilihan = new ArrayList<>();
    pilihan.add("SMK");
    pilihan.add("SMA");
    pilihan.add("MA");
    pendidikanTerakhir.jenis_pendidikan_terakhir =  Main.pilihan(pilihan);
    Scanner sc = new Scanner(System.in);
    System.out.print("Nama : ");
    pendidikanTerakhir.nama = sc.nextLine();
    System.out.print("Alamat : ");
    pendidikanTerakhir.alamat = sc.nextLine();
    System.out.print("Jurusan : ");
    pendidikanTerakhir.jurusan = sc.nextLine();

    return pendidikanTerakhir;
  }

}