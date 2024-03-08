class Node {
    private int data; // Menyimpan data pada node
    private Node next; // Menyimpan referensi ke node selanjutnya dalam linked list
    // Konstruktor untuk membuat node baru dengan data yang diberikan
    public Node(int data) {
        this.data = data;
        this.next = null; // Awalnya tidak ada node selanjutnya
    }
    // Getter untuk mendapatkan data dari node
    public int getData() {
        return data;
    }
    // Setter untuk mengatur data pada node
    public void setData(int data) {
        this.data = data;
    }
    // Getter untuk mendapatkan node selanjutnya dalam linked list
    public Node getNext() {
        return next;
    }
    // Setter untuk mengatur node selanjutnya dalam linked list
    public void setNext(Node next) {
        this.next = next;
    }
}