import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

class Main{
  public static void main(String[] arg) {
    int menu = 0;
    List<Mahasiswa> mahasiswas = new ArrayList<Mahasiswa>();
    Mahasiswa mahasiswa = new Mahasiswa();
    while(menu != 99) {
      if(menu == 0){
        menu = Main.printMenu();
      }else if(menu == 1){
        mahasiswa = mahasiswa.registrasi();
        mahasiswas.add(mahasiswa);
        menu = 0;
      }else if(menu == 2){
        mahasiswa.bayarRegistrasi();
        menu = 0;
      }else if(menu == 3){
        if(mahasiswa.ujian != null || mahasiswa.pembayaran != null){
          mahasiswa.ujianMasuk();
        }
        menu = 0;
      }else if(menu == 4){
        if(mahasiswa.ujian != null || mahasiswa.pembayaran != null){
          mahasiswa.hasilRegistrasi();
        }
        menu = 0;
      }else if(menu == 5){
        Mahasiswa mhs = mahasiswa.pilihanMahasiswa(mahasiswas);
        List<String> pilihanTrima = new ArrayList();
        pilihanTrima.add("Terima");
        pilihanTrima.add("Belum Terima");
        String pickTerima = Main.pilihan(pilihanTrima);
        if(pickTerima == "Terima"){
          int index = mahasiswas.indexOf(mhs);
          mhs.pembayaran.verifikasi = true;
          mahasiswas.add(index,mhs);
        }
        menu = 0;
      }else if(menu == 6){

        System.out.println("------------------------------------");
        System.out.println("Perwalian");
        System.out.println("------------------------------------");
        
        Perwalian perwalian = new Perwalian(mahasiswa);
        perwalian.addMatkul();
        menu = 0;
      }

      Main.clean(); 
    }
  }

  static int printMenu () {
    Scanner sc = new Scanner(System.in);
    System.out.println("------------------------------------");
    System.out.println("PMB (Penerimaan Mahasiswa Baru)");
    System.out.println("------------------------------------");
    System.out.println("Menu : Mahasiswa ");
    System.out.println("1. Daftar");
    System.out.println("2. Pembayaran");
    System.out.println("3. Ujian Masuk");
    System.out.println("4. Hasil Registrasi");
    System.out.println("------------------------------------");
    System.out.println("PMB (Penerimaan Mahasiswa Baru)");
    System.out.println("------------------------------------");
    System.out.println("Menu : Staff Tu ");
    System.out.println("5. Konfirmasi Pembayaran");
    System.out.println("------------------------------------");
    System.out.println("Perwalian");
    System.out.println("------------------------------------");
    System.out.println("Menu : Mahasiswa ");
    System.out.println("6. Request Perwalian");
    System.out.println("------------------------------------");
    System.out.print("Pilih Menu : ");
    int menu = sc.nextInt();
    System.out.println("------------------------------------");
    return menu;
  }

  static String pilihan (List<String> piliahan) {
    Scanner sc = new Scanner(System.in);
    System.out.println("");
    for (int i = 0; i < piliahan.size(); i++) {
      System.out.println((i + 1 ) +  " . " + piliahan.get(i) );
    } 
    System.out.println("------------------------------------");
    System.out.print("Pilih  : ");
    int menu = sc.nextInt();
    System.out.println("------------------------------------");
    return piliahan.get(menu - 1);
  }
  static void clean() {
    try
    {
        final String os = System.getProperty("os.name");
        if (os.contains("Windows"))
        {
            Runtime.getRuntime().exec("cls");
        }
        else
        {
          System.out.print("\033[H\033[2J");  
          System.out.flush();  
        }
    }
    catch (final Exception e)
    {
        //  Handle any exceptions.
        e.printStackTrace();
    }
  }
}