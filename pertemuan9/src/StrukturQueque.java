public class StrukturQueque {
    private Node FRONT, REAR;
    private boolean curNode;

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            FRONT = newNode;
            REAR = newNode;
        } else {
            REAR.setNext(newNode);
            REAR = newNode;
        }
    }

    public boolean isEmpty() {
        return FRONT == null;
    }

//    public int dequeue() {
//        Node temp;
//        int dequeueItem = Integer.MIN_VALUE;
//        if (FRONT != null) {
//            if (FRONT == REAR) {
//                dequeueItem = FRONT.getData();
//                FRONT = null;
//                REAR = null;
//            } else {
//                temp = FRONT;
//                dequeueItem = temp.getData();
//                FRONT = FRONT.getNext();
//                temp = null;
//            }
//        }
//        return dequeueItem;
//    }

    public void dequeue(){
        if(isEmpty()){
            System.out.println("Data masih kosong");
        }else{
            Node tempFRONT = FRONT;
            FRONT = FRONT.getNext();
            REAR = null;
            tempFRONT = null;
        }
    }
    public int size() {
        int size = 0;
        Node curNode = FRONT;
        while (curNode != null) {
            size++;
            curNode = curNode.getNext();
        }
        return size;
    }

    public int front() {
        return FRONT != null ? FRONT.getData() : -1;
    }

    public void displayElement() {
        if (isEmpty()) {
            System.out.println("Elemen Queue: Queue kosong");
            return;
        }
        System.out.print("Elemen Queue: ");
        Node curNode = FRONT;
        while (curNode != null) {
            System.out.print(curNode.getData() + " ");
            curNode = curNode.getNext();
        }
        System.out.println();
    }

}






