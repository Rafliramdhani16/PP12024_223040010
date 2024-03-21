public class StrukturList {
    private Node HEAD;

    public boolean isEmpty() {
        return HEAD == null;
    }

    public void addHead(Matakuliah data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            HEAD = newNode;
        } else {
            newNode.setNext(HEAD);
            HEAD = newNode;
        }
    }

    public void addTail(Matakuliah data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            HEAD = newNode;
        } else {
            Node temp = HEAD;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(newNode);
        }
    }

    public void addMid(Matakuliah data, int position) {
        Node newNode = new Node(data);
        if (isEmpty() || position == 1) {
            addHead(data);
            return;
        }

        Node prevNode = null;
        Node curNode = HEAD;
        int count = 1;

        while (curNode != null && count < position) {
            prevNode = curNode;
            curNode = curNode.getNext();
            count++;
        }

        if (curNode == null && count < position) {
            System.out.println("Invalid position");
            return;
        }

        prevNode.setNext(newNode);
        newNode.setNext(curNode);
    }

    public void displayElements() {
        Node curNode = HEAD;
        if(curNode != null){
        while (curNode != null) {
            System.out.println("Matakuliah: " + curNode.getData().getKode()+", " + curNode.getData().getNama() + ", " +curNode.getData().getSks());
            curNode = curNode.getNext();
            }
            System.out.println();
        }else{
            System.out.println("list kosong");
        }

    }
}
