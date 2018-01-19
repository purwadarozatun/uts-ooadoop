import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
class MenuMahasiswa {
  MenuMahasiswa( ) {
    int menu = 0;
    List<Mahasiswa> mahasiswas = Main.mahasiswas;
    Mahasiswa mahasiswa = Main.mahasiswa;
    int indexMhs = 0;
    Boolean isExsisting;
    if(isExsisting = this.exsisting()) {
      mahasiswa = Mahasiswa.pilihanMahasiswa(mahasiswas);
      indexMhs = mahasiswas.indexOf(mahasiswa);
    }else {
      mahasiswa = new Mahasiswa();
    }
    while(menu < 7) {
      if(menu == 0) {
        System.out.println("------------------------------------");
        System.out.println("PMB (Penerimaan Mahasiswa Baru)");
        System.out.println("------------------------------------");
        System.out.println("Menu : Mahasiswa ");
        if(mahasiswa.nim == null){
          System.out.println("1. Daftar");
          System.out.println("2. Pembayaran");
          System.out.println("3. Ujian Masuk");
          System.out.println("4. Hasil Registrasi");
        }else {
          System.out.println("5. Request Perwalian");
        }
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
          menu = 0;
        }else if(menu == 2){
          mahasiswa.bayarRegistrasi();
          menu = 0;
        }else if(menu == 3){
          if( mahasiswa.pembayaran != null && mahasiswa.pembayaran.verifikasi ){
            mahasiswa.ujianMasuk();
          }else {
            System.out.println("Silahkan Lakukan Pembayaran");
          }
          menu = 0;
        }else if(menu == 4){
          if(mahasiswa.ujian != null ){
            mahasiswa.hasilRegistrasi();
          }else {
            System.out.println("Silahkan Lakukan Ujian Masuk");
          }
          menu = 0;
        }else if(menu == 5){
          System.out.println("------------------------------------");
          System.out.println("Perwalian");
          System.out.println("------------------------------------");
          
          Perwalian perwalian = new Perwalian(mahasiswa);
          perwalian.addMatkul();
          mahasiswa.perwalian = perwalian;
          menu = 0;
        }else if(menu == 6){
          if(isExsisting) {
            mahasiswas.set(indexMhs, mahasiswa);
          }else {

            mahasiswas.add(mahasiswa);
          }
          Main.mahasiswas = mahasiswas;
          menu = 7;
        }
      }
      
    }

  }

  private Boolean exsisting() {
    
        System.out.println("------------------------------------");
        System.out.println("PMB (Penerimaan Mahasiswa Baru)");
        System.out.println("------------------------------------");
        System.out.println("Menu : Mahasiswa ");
        System.out.println("1. Daftar");
        System.out.println("2. Lengkapi Berkas");
        
        Scanner sc = new Scanner(System.in);

        System.out.println("------------------------------------");
        System.out.print("Pilih Menu : ");
        int menu = sc.nextInt();
        return  menu == 2 ? true : false;
  }
}