class Node {
    private int nilai;
    private Node next;

    //inisialisasi Node
    public Node (int nilai){
        this.nilai = nilai;
    }
    //setter dan getter

    public int getNilai() {
        return nilai;
    }

    public void setNilai(int nilai) {
        this.nilai = nilai;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}


public class NodeMain {
    public static void main(String[] args) {
        // Membuat 2 buah node n1 & n2
        Node n1 = new Node(5);
        Node n2 = new Node(7);

        // Membuat relasi node n1 dan n2
        n1.setNext(n2);

        //menampilkan Node n1 dan n2 dengan pointer P
        Node p = n1;
        while(p != null) {
            System.out.printf("%d ", p.getNilai());
            p = p.getNext();
        }
    }
}
