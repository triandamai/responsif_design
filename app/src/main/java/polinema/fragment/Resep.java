package polinema.fragment;

/**
 * Created by HP on 9/18/2018.
 */

public class Resep {
    private String nama_makanan;
    private String detail_makanan;
    private String harga_makanan;
    private int gambar_makanan;

    public static final Resep[] resepmakanan = {
            new Resep("Paket 1", "ISI PAKET : Nasi Uduk, Ayam Goreng, Tempe Bacem, Sambel", "Harga : Rp.30.000,- / porsi", R.drawable.pic1 ),
            new Resep("Paket 2", "ISI PAKET : Nasi Goreng, Ayam Siur, Telur, Kerupuk","Harga : Rp.32.000,- / porsi", R.drawable.pic2 ),
            new Resep("Paket 3", "ISI PAKET : Bakso Telur, Bakso kecil, Mie Kuning, Sambel","Harga : Rp.28.000,- / porsi", R.drawable.pic3 ),
            new Resep("Paket 4", "ISI PAKET : Nasi Kuning, Ayam goreng, Orek Tempe, Telur Siur","Harga : Rp.100.000,- / 10 porsi", R.drawable.pic4 ),
            new Resep("Paket 5", "ISI PAKET : Nasi Padang, Daging, Daun Singkong, Bumbu Nangka, Sambel","Harga : Rp.28.000,- / porsi", R.drawable.pic5 ),
            new Resep("Paket 6", "ISI PAKET : Mie Goreng Jawa, Bakso kecil, Mie Kuning, Sambel","Harga : Rp.27.000,- / porsi", R.drawable.pic6 ),

    };
    public Resep(String nama, String detail, String harga,int gambar){
        this.nama_makanan = nama;
        this.detail_makanan = detail;
        this.harga_makanan = harga;
        this.gambar_makanan = gambar;
    }

    public String getDetail_makanan() {
        return detail_makanan;
    }

    public String getNama_makanan() {
        return nama_makanan;
    }

    public String getHarga_makanan() {
        return harga_makanan;
    }

    public int getGambar_makanan() { return gambar_makanan; }

    @Override
    public String toString() {
        return this.nama_makanan;
    }
}
