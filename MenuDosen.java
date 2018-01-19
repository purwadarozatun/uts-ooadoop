import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
class MenuDosen {
  MenuDosen() {
    int menu = 0;
    List<Mahasiswa> mahasiswas = Main.mahasiswas;
    Mahasiswa mahasiswa = Main.mahasiswa;
    while(menu != 2) {
      if(menu == 0) {
        System.out.println("------------------------------------");
        System.out.println("Perwalian");
        System.out.println("------------------------------------");
        System.out.println("Menu : Staff Tu ");
        System.out.println("1. Konfirmasi Perwalian");
        System.out.println("2. Keluar");

        Scanner sc = new Scanner(System.in);

        System.out.println("------------------------------------");
        System.out.print("Pilih Menu : ");
        menu = sc.nextInt();
        System.out.println("------------------------------------");
      }else {
        if(menu == 1){
          Mahasiswa mhs = Main.mahasiswa.pilihanMahasiswa(mahasiswas);
          int indexMhs = mahasiswas.indexOf(mhs);
          if(mhs.perwalian != null) {
            if(mhs.perwalian.verifikasiPerwalian()){
              mahasiswas.set(indexMhs, mahasiswa);
              Main.mahasiswas = mahasiswas;
            }
          }else {
            System.out.println("Mahasiswa Belum Melakuakn Perwalian");
          }
          menu = 0;
        }
      }
      
    }

  }
}