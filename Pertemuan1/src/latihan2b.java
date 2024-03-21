public class latihan2b {
    public static class Node {
        private final int nilai;
        private Node next;

        // Inisialisasi Node
        public Node (int nilai){
            this.nilai = nilai;
        }

        // Getter untuk nilai
        public int getNilai() {
            return this.nilai;
        }

        // Getter untuk next
        public Node getNext() {
            return this.next;
        }

        // Setter untuk next
        public void setNext(Node next) {
            this.next = next;
        }
    }

    public static class NodeMain {
        public static void main(String[] args) {
            // Membuat 5 buah node n1, n2, n3, n4, dan n5
            Node n1 = new Node(2);
            Node n2 = new Node(3);
            Node n3 = new Node(5);
            Node n4 = new Node(7);
            Node n5 = new Node(9);

            // Membuat relasi antara node n1, n2, n3, n4, dan n5
            n1.setNext(n2);
            n2.setNext(n3);
            n3.setNext(n4);
            n4.setNext(n5);

            // Menampilkan nilai dari setiap node
            Node p = n1;
            while(p != null) {
                System.out.printf("%d ", p.getNilai());
                p = p.getNext();
            }
        }
    }

}
