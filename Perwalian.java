import java.util.List;
import java.util.ArrayList;

import java.util.Scanner;

class Perwalian {
  List<String> matakuliah;
  Dosen dosen;
  Mahasiswa mahasiswa;

  Boolean statusPerwalian = true;

  List<Dosen> listDosen;

  Perwalian (Mahasiswa mahasiswa) {
    this.listDosen = new ArrayList<>();
    this.listDosen.add(new Dosen("Frencius ", "Disnii"));
    this.listDosen.add(new Dosen("Muhammad Sabar ", "Disnii"));
    this.mahasiswa = mahasiswa;
  }

  public void addMatkul () {
    this.matakuliah = new ArrayList<>();
    for(int i = 0; i < 5; i ++) {
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Matakuliah : ");
      String matakuliah = sc.nextLine();
      this.matakuliah.add(matakuliah);
    }
    System.out.println("Pilih Dosen");
    this.dosen = Perwalian.piliahanDosen(listDosen);

    
  }

  static Dosen piliahanDosen (List<Dosen> piliahan) {

    System.out.println("------------------------------------");
    System.out.println("Piliah Dosen");
    System.out.println("------------------------------------");
    Scanner sc = new Scanner(System.in);
    System.out.println("");
    for (int i = 0; i < piliahan.size(); i++) {
      System.out.println((i + 1 ) +  " . " + piliahan.get(i).nama );
    } 
    System.out.println("------------------------------------");
    System.out.print("Pilih  : ");
    int menu = sc.nextInt();
    System.out.println("------------------------------------");
    return piliahan.get(menu - 1);
  }


}