class Pembayaran{
  Double jumlah_bayar;
  Boolean verifikasi;
  Boolean sudah_upload_file;
  String atas_nama;

  Pembayaran(Double jumlah_bayar) {
    this.jumlah_bayar = jumlah_bayar;
    this.verifikasi = false;
    this.sudah_upload_file = false;
  }

}