public class StrukturStack {
    private int[] array; // Array untuk menyimpan elemen stack
    private int capacity; // Kapasitas maksimum stack
    private int TOP; // Indeks dari elemen teratas stack
    public final int MIN = -1; // Nilai konstanta untuk menandakan stack kosong

    // Konstruktor untuk inisialisasi stack dengan kapasitas tertentu
    public StrukturStack(int capacity) {
        this.array = new int[capacity]; // Inisialisasi array dengan kapasitas yang diberikan
        this.capacity = capacity; // Simpan kapasitas stack
        this.TOP = MIN; // Atur TOP ke nilai konstanta MIN untuk menandakan stack kosong
    }

    // Metode untuk menambahkan elemen baru ke dalam stack
    public void push(int data) {
        if (isFull()) { // Periksa apakah stack penuh
            System.out.println("Stack Penuh"); // Cetak pesan kesalahan jika stack penuh
        } else {
            TOP++; // Naikkan indeks TOP
            array[TOP] = data; // Tambahkan elemen ke stack pada indeks TOP yang baru
        }
    }

    // Metode untuk menghapus dan mengembalikan elemen teratas dari stack
    public int pop() {
        if (isEmpty()) { // Periksa apakah stack kosong
            System.out.println("Stack Kosong"); // Cetak pesan kesalahan jika stack kosong
            return MIN; // Kembalikan nilai konstanta MIN untuk menandakan kegagalan operasi
        } else {
            int data = array[TOP]; // Simpan elemen teratas stack
            TOP--; // Turunkan indeks TOP
            return data; // Kembalikan elemen teratas stack
        }
    }

    // Metode untuk memeriksa apakah stack kosong
    public boolean isEmpty() {
        return (TOP == MIN); // Stack kosong jika TOP sama dengan nilai konstanta MIN
    }

    // Metode untuk memeriksa apakah stack penuh
    public boolean isFull() {
        return (TOP == capacity - 1); // Stack penuh jika TOP sama dengan kapasitas - 1
    }

    // Metode untuk mengembalikan jumlah elemen dalam stack
    public int size() {
        return TOP + 1; // Jumlah elemen dalam stack sama dengan TOP + 1
    }

    // Metode untuk mendapatkan nilai dari elemen teratas stack tanpa menghapusnya
    public int getTop() {
        if (isEmpty()) { // Periksa apakah stack kosong
            System.out.println("Stack Kosong"); // Cetak pesan kesalahan jika stack kosong
            return MIN; // Kembalikan nilai konstanta MIN untuk menandakan kegagalan operasi
        } else {
            return array[TOP]; // Kembalikan nilai dari elemen teratas stack
        }
    }

    // Metode untuk mencetak semua elemen dalam stack dari atas ke bawah
    public void printElements() {
        for (int i = TOP; i >= 0; i--) { // Iterasi dari indeks TOP hingga 0
            System.out.print(array[i] + " "); // Cetak elemen pada indeks saat ini
        }
        System.out.println(); // Cetak baris baru setelah mencetak semua elemen
    }
}
