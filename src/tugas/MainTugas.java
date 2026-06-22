// Nama: Muhammad Reynaldy Abhista Putra
// NPM: 2410010010
package tugas;

public class MainTugas {
    public static void main(String[] args) {
        String[] kategori = {"Elektronik", "Pakaian", "Makanan"};
        System.out.println("=== KATEGORI BARANG TOKO ===");
        for (String kat : kategori) {
            System.out.println("- " + kat);
        }
        System.out.println();

        Gudang gudangUtama = new Gudang();
        
        gudangUtama.tambahBarang(new Barang("Laptop Mandiri", 8500000, 10));
        gudangUtama.tambahBarang(new Barang("Mouse Wireless", 150000, 50));
        gudangUtama.tambahBarang(new Barang("Keyboard Mekanik", 450000, 25));
        gudangUtama.tambahBarang(new Barang("Monitor LED", 1800000, 12));
        gudangUtama.tambahBarang(new Barang("Printer Inkjet", 1200000, 8));

        gudangUtama.tampilkanSemua();
        gudangUtama.simpanKeBerkas();
        System.out.println();

        System.out.println(">> Membuat Objek Gudang Baru Baru Untuk Memuat File...");
        Gudang gudangBaru = new Gudang();
        gudangBaru.muatDariBerkas();
        gudangBaru.tampilkanSemua();
        
        System.out.println("\nTotal Nilai Persediaan Barang: Rp " + gudangBaru.totalNilai());
    }
}