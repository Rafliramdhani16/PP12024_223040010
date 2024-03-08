public class Node {
    private double data;
    private Node next;

    public Node(double dataValue) {
        this.data = dataValue;
    }

    public Node getNext() {
        return next;
    }

    public double getData() {
        return data;
    }

    public void setData(double newData) {
        this.data = newData;
    }

    public void setNext(Node nextNode) {
        this.next = nextNode;
    }
}
