public class StrukturList {
    private Node head;

    public StrukturList() {
        this.head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addTail(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
        } else {
            Node curNode = head;
            Node posNode = null;
            while (curNode != null) {
                posNode = curNode;
                curNode = curNode.getNext();
            }
            posNode.setNext(newNode);
        }
    }

    public void displayElement() {
        Node curNode = head;
        while (curNode != null) {
            System.out.print(curNode.getData() + " ");
            curNode = curNode.getNext();
        }
        System.out.println();
    }
}
