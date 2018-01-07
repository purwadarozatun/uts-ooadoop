import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
class MenuMahasiswa {
  MenuMahasiswa( ) {
    int menu = 0;
    List<Mahasiswa> mahasiswas = Main.mahasiswas;
    Mahasiswa mahasiswa = Main.mahasiswa;
    while(menu != 6) {
      if(menu == 0) {
        System.out.println("------------------------------------");
        System.out.println("PMB (Penerimaan Mahasiswa Baru)");
        System.out.println("------------------------------------");
        System.out.println("Menu : Mahasiswa ");
        System.out.println("1. Daftar");
        System.out.println("2. Pembayaran");
        System.out.println("3. Ujian Masuk");
        System.out.println("4. Hasil Registrasi");
        System.out.println("5. Request Perwalian");
        System.out.println("6. Keluar");

        Scanner sc = new Scanner(System.in);

        System.out.println("------------------------------------");
        System.out.print("Pilih Menu : ");
        menu = sc.nextInt();
        System.out.println("------------------------------------");
      }else {
        if(menu == 1){
          // MenuMahasiswa menuMhs = new MenuMahasiswa();
          mahasiswa = mahasiswa.registrasi();
          mahasiswas.add(mahasiswa);
          menu = 0;
        }else if(menu == 2){
          mahasiswa.bayarRegistrasi();
          menu = 0;
        }else if(menu == 3){
          if( mahasiswa.pembayaran != null){
            mahasiswa.ujianMasuk();
          }else {
            System.out.println("Silahkan Lakukan Pembayaran")
          }
          menu = 0;
        }else if(menu == 4){
          if(mahasiswa.ujian != null ){
            mahasiswa.hasilRegistrasi();
          }else {
            System.out.println("Silahkan Lakukan Ujian Masuk")
          }
          menu = 0;
        }else if(menu == 5){
          System.out.println("------------------------------------");
          System.out.println("Perwalian");
          System.out.println("------------------------------------");
          
          Perwalian perwalian = new Perwalian(mahasiswa);
          perwalian.addMatkul();
          menu = 0;
        }
      }
      
    }

  }
  public void bukaMenu () {
  }
}