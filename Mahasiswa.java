import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
class Mahasiswa {
  String kode_registrasi;
  String nim;
  String nama;
  String alamat;
  String no_tlp;
  Jurusan jurusan;
  Pembayaran pembayaran;

  PendidikanTerakhir pendidikanTerakhir;

  Ujian ujian;
  Perwalian perwalian;

  public Mahasiswa registrasi() {

    
    List<Jurusan> jurusans = new ArrayList<Jurusan>();
    jurusans.add(new Jurusan("TIF", 10000D));
    jurusans.add(new Jurusan("TI", 12000D));
    Mahasiswa  mahasiswa = new Mahasiswa();
    System.out.println("------------------------------------");
    System.out.println("Registrasi Mahasiswa Baru");
    System.out.println("------------------------------------");
    Scanner sc = new Scanner(System.in);
    System.out.print("Nama : ");
    mahasiswa.nama = sc.nextLine();
    System.out.print("Alamat : ");
    mahasiswa.nama = sc.nextLine();
    System.out.print("No Telepon : ");
    mahasiswa.nama = sc.nextLine();
    mahasiswa.jurusan = Mahasiswa.pilihan(jurusans);
    mahasiswa.pendidikanTerakhir = PendidikanTerakhir.askPendidikanTerakhir();
    mahasiswa.pembayaran = new Pembayaran(mahasiswa.jurusan.harga_pendaftaran);
    mahasiswa.kode_registrasi = "MABA" + new SimpleDateFormat("MMddyyyy").format(new Date());
    System.out.println("------------------------------------");
    System.out.println("Kode Registrasi : " + mahasiswa.kode_registrasi);
    System.out.println("------------------------------------");
    System.out.println("Pendaftaran Pembayaran");
    System.out.println("Jumlah Yang Harus Di Bayarkan : ");
    System.out.println("Rp." + mahasiswa.jurusan.harga_pendaftaran);
    System.out.println("------------------------------------");
    return mahasiswa;
  }

  static Jurusan pilihan (List<Jurusan> piliahan) {
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

  public void bayarRegistrasi () {
    // this hard to do without GUI because we need to upload file
    System.out.println("------------------------------------");
    System.out.println("Pembayaran Biaya Pendaftaran");
    System.out.println("------------------------------------");
    System.out.println("------------------------------------");
    System.out.println("Jumlah Yang Harus Di Bayarkan :");
    System.out.println("Rp." + this.jurusan.harga_pendaftaran);
    System.out.println("------------------------------------");
    System.out.println("------------------------------------");
    System.out.println("Dibayarkan Ke Rek");
    System.out.println("Mandiri  Syariah ");
    System.out.println("No Rekening : 12312321312");
    System.out.println("A/N: PT ANU");
    System.out.println("------------------------------------");
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Atasnama : ");
    this.pembayaran.atas_nama = sc.nextLine();
    // this.pembayaran.verifikasi = true;
    this.pembayaran.sudah_upload_file = true;
    
  }

  public void ujianMasuk() {
    this.ujian = new Ujian();
    this.ujian.doUjian();
  }
  public void hasilRegistrasi() {
    System.out.println("------------------------------------");
    System.out.println("Pembayaran Biaya Pendaftaran");
    System.out.println("------------------------------------");
    System.out.println("Nama : " + this.nama);
    System.out.println("Jurusan : " + this.jurusan.nama);
    System.out.println("Pendidikan Terakhir : " + this.pendidikanTerakhir.nama);
    System.out.println("------------------------------------");
    System.out.println("Pembayaran : ");
    System.out.println("------------------------------------");
    System.out.println("Jumlah : " + this.pembayaran.jumlah_bayar);
    System.out.println("Atasnama : " + this.pembayaran.atas_nama);
    System.out.println("------------------------------------");
    System.out.println("Hasil Ujian : ");
    System.out.println("------------------------------------");
    System.out.println("Jawaban Benar : " + this.ujian.jumlah_benar);
    System.out.println("Total Soal  : " + this.ujian.jumlah_soal);
    System.out.println("Nilai  : " + this.ujian.nilai);

    this.nim = "MHS" + new SimpleDateFormat("MMddyyyy").format(new Date());
    System.out.println("NIM  : " + this.nim);
    System.out.println("Dengan Ini Dinyatakan: " + (this.ujian.nilai > 70D ? "LULUS" : "TIDAK LULUS"));
  
    Scanner sc = new Scanner(System.in);
    System.out.print("Silahkan Tekan Enter ");
    sc.nextLine();
  
  }


  static Mahasiswa pilihanMahasiswa (List<Mahasiswa> piliahan) {

    System.out.println("------------------------------------");
    System.out.println("Pilih Mahasiswa");
    System.out.println("------------------------------------");
    Scanner sc = new Scanner(System.in);
    System.out.println("");
    for (int i = 0; i < piliahan.size(); i++) {
      Mahasiswa mhs = piliahan.get(i);
      System.out.println((i + 1 ) +  " . " + (mhs.nim != null ? mhs.nim : mhs.kode_registrasi) + "  " + mhs.nama  );
    } 
    System.out.println("------------------------------------");
    System.out.print("Pilih  : ");
    int menu = sc.nextInt();
    System.out.println("------------------------------------");
    return piliahan.get(menu - 1);
  }

}