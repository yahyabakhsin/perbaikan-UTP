import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //Do your magic here...
        Scanner main = new Scanner(System.in);

        System.out.println("Selamat datang di Pemesanan Tiket!"); //menampilkan pesan selamat datang <3
        System.out.print("Masukkan nama pemesan: "); //meminta pengguna memasukkan nama
        String namaPemesanan = main.nextLine();

        //menampilkan pilihan jenis tiket 
        System.out.println("Pilih jenis tiket:");
        System.out.println("1. CAT 8");
        System.out.println("2. CAT 1");
        System.out.println("3. FESTIVAL");
        System.out.println("4. VIP");
        System.out.println("5. UNLIMITED EXPERIENCE");

        //meminta pengguna memasukkan pilihan dan menyimpannya dalam variabel pilihan
        System.out.print("Masukan pilihan: ");
        int pilihan = main.nextInt(); 

        //mendeklarasikan variabel tiketKonser untuk menyimpan objek tiket yang akan dipilih
        TiketKonser tiket;

        //memproses pilihan tiket yang dimasukkan oleh pengguna menggunakan switchcase
        switch(pilihan){
            case 1:
                tiket = new CAT8(200, "CAT 8");
                break;
            case 2:
                tiket = new CAT1(500, "CAT 1");
                break;
            case 3:
                tiket = new FESTIVAL(1000, "FESTIVAL");
                break;
            case 4:
                tiket = new VIP(1500, "VIP");
                break;
            case 5:
                tiket = new VVIP(2500, "UNLIMITED EXPERIENCE");
                break;
            default:
                System.out.println("\nPilihan tidak valid!");
                return;
        }
        //membuat objek PemesananTiket dengan menggunakan nama pemesan dan tiket yang dipilih
        PemesananTiket pesanan = new PemesananTiket(namaPemesanan, tiket);
        pesanan.nota();
        main.close();//menutup objek Scanner main
       
    }
    /*
     * Jangan ubah isi method dibawah ini, nama method boleh diubah
     * Method ini dipanggil untuk mendapatkan kode pesanan atau kode booking
     * Panggil method ini untuk kelengkapan mencetak output nota pesanan
     */
    public static String generateKodeBooking() {
        StringBuilder sb = new StringBuilder();
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        int length = 8;

        for (int i = 0; i < length; i++) {
            int index = (int) (Math.random() * characters.length());
            sb.append(characters.charAt(index));
        }

        return sb.toString();
    }

    /*
     * Jangan ubah isi method dibawah ini, nama method boleh diubah
     * Method ini dipanggil untuk mendapatkan waktu terkini
     * Panggil method ini untuk kelengkapan mencetak output nota pesanan
     */
    public static String getCurrentDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date currentDate = new Date();
        return dateFormat.format(currentDate);
    }    
}