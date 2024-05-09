import java.lang.reflect.Constructor;

class PemesananTiket {
   // Do your magic here...
   private String namaPemesanan;
   private TiketKonser tiket;
  
   //constructor untuk kelas PemesananTiket
   public PemesananTiket(String namaPemesanan, TiketKonser tiket){
    this.namaPemesanan = namaPemesanan;
    this.tiket = tiket;
 }

  //metod untuk menampilkan nota pemesanan
   public void nota(){
    System.out.println("----- Detail Pemesanan -----");//menampilkan header detail pemesanan
    System.out.println("Nama Pemesanan: " + this.namaPemesanan); //menampilkan nama pemesanan
    System.out.println("Kode Booking: " + Main.generateKodeBooking());//menampilkan kode booking dengan memanggil metod generateKodeBooking() dari kelas main
    System.out.println("Tanggal Pemesanan: " + Main.getCurrentDate());//menampilkan tanggal pemesanan dengan memanggil metod getCurrentDate() dari kelas main
    System.out.println("Tiket yang dipesan: " + tiket.getNamaTiket());//menampilkan jenis tiket yang dipesan dengan memanggil metod getNamaTiket() dari objek tiket
    System.out.println("Total Harga: " + tiket.getHarga() + " USD");//menampilkan total harga tiket dengan memanggil metod getHarga() dari objek tiket
  }
}