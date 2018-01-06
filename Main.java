import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

class Main{
  static List<Mahasiswa> mahasiswas = new ArrayList<Mahasiswa>();
  static Mahasiswa mahasiswa = new Mahasiswa();
  public static void main(String[] arg) {
    int menu = 0;
    while(menu != 99) {
      if(menu == 0){
        menu = Main.printMenu();
      }else if(menu == 1){
        MenuMahasiswa menuMhs = new MenuMahasiswa();
        menu = 0;
      }else if(menu == 2){
        MenuStaffTu menuStaffTu = new MenuStaffTu();
        menu = 0;
      }

      Main.clean(); 
    }
  }

  static int printMenu () {
    Scanner sc = new Scanner(System.in);
    System.out.println("------------------------------------");
    System.out.println("Pilih User Yang Akan Menggunakan");
    System.out.println("------------------------------------");
    System.out.println("1. Mahasiswa ");
    // System.out.println("1. Daftar");
    // System.out.println("2. Pembayaran");
    // System.out.println("3. Ujian Masuk");
    // System.out.println("4. Hasil Registrasi");
    // System.out.println("------------------------------------");
    // System.out.println("PMB (Penerimaan Mahasiswa Baru)");
    // System.out.println("------------------------------------");
    System.out.println("2. Staff Tu ");
    // System.out.println("5. Konfirmasi Pembayaran");
    // System.out.println("------------------------------------");
    // System.out.println("Perwalian");
    // System.out.println("------------------------------------");
    // System.out.println("Menu : Mahasiswa ");
    // System.out.println("6. Request Perwalian");
    System.out.println("------------------------------------");
    System.out.print("Pilih Pengguna : ");
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