abstract class TiketKonser implements HargaTiket {
    // Do your magic here...
    private double harga;
    private String namaTiket;

    //constructor untuk kelas TiketKonser
    public TiketKonser(double harga, String namaTiket){
        this.harga = harga;
        this.namaTiket = namaTiket;
    }

    //mengimplementasi metod getHarga() dari interface HargaTiket untuk mengembalikan harga tiket
    public double getHarga(){
        return harga;
    }

    //mengimmplementasi metod getNamaTiket() untuk mengembalikan nama tiket
    public String getNamaTiket(){
        return namaTiket;
    }
}