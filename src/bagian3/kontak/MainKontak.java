package bagian3.kontak;

public class MainKontak {
    public static void main(String[] args) {
        BukuKontak buku = new BukuKontak("kontak.txt");
        
        buku.tambahKontak(new Kontak("Andi", "0811111", "andi@mail.com"));
        buku.tambahKontak(new Kontak("Budi", "0822222", "budi@mail.com"));
        buku.tambahKontak(new Kontak("Citra", "0833333", "citra@mail.com"));

        buku.tampilkanSemua();
        buku.simpanKeBerkas();
        System.out.println();

        System.out.println(">> Menguji Fitur Cari Kontak:");
        buku.cariKontak("Budi");
        System.out.println();

        System.out.println(">> Menguji Fitur Hapus Kontak:");
        buku.hapusKontak("Andi");
        System.out.println();

        BukuKontak bukuLain = new BukuKontak("kontak.txt");
        bukuLain.muatDariBerkas();
        bukuLain.tampilkanSemua();
        System.out.println("Jumlah kontak di objek baru: " + bukuLain.jumlahKontak());
    }
}