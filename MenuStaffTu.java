import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
class MenuStaffTu {
  MenuStaffTu() {
    int menu = 0;
    List<Mahasiswa> mahasiswas = Main.mahasiswas;
    Mahasiswa mahasiswa = Main.mahasiswa;
    while(menu != 6) {
      if(menu == 0) {
        System.out.println("------------------------------------");
        System.out.println("PMB (Penerimaan Mahasiswa Baru)");
        System.out.println("------------------------------------");
        System.out.println("Menu : Staff Tu ");
        System.out.println("1. Konfirmasi Pembayaran");

        Scanner sc = new Scanner(System.in);

        System.out.println("------------------------------------");
        System.out.print("Pilih Menu : ");
        menu = sc.nextInt();
        System.out.println("------------------------------------");
      }else {
        if(menu == 1){
          Mahasiswa mhs = Main.mahasiswa.pilihanMahasiswa(mahasiswas);
          List<String> pilihanTrima = new ArrayList();
          pilihanTrima.add("Terima");
          pilihanTrima.add("Belum Terima");
          String pickTerima = Main.pilihan(pilihanTrima);
          if(pickTerima == "Terima"){
            int index = Main.mahasiswas.indexOf(mhs);
            mhs.pembayaran.verifikasi = true;
            Main.mahasiswas.add(index,mhs);
          }
          menu = 0;
        }
      }
      
    }

  }
  public void bukaMenu () {
  }
}