// Deklarasi kelas ContohFungsi
public class ContohFungsi {

    // Definisi fungsi penjumlahan
    public static int tambah(int a, int b){
        return a + b;
    }

    // Definisi fungsi perkalian
    public static int kali(int a, int b){
        return a * b;
    }

     //Main Program
    public static void main(String[] args){
        // Memanggil fungsi tambah dan menyimpan hasilnya di dalam variabel hasilPenjumlahan
        int hasilPenjumlahan = tambah(5, 3);
        System.out.println("Hasil penjumlahan: " + hasilPenjumlahan);

        // Memanggil fungsi kali dan menyimpan hasilnya di dalam variabel hasilPerkalian
        int hasilPerkalian = kali(4, 6);
        System.out.println("Hasil perkalian: " + hasilPerkalian);
    }
}
