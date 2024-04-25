public class QueueMain {
    public static void main(String[] args) {
        StrukturQueque queue = new StrukturQueque();

        // Latihan 4
        System.out.println("### Sebelum Enqueue 3x ###");
        System.out.println("Size: " + queue.size());
        System.out.println("isEmpty: " + queue.isEmpty());

        for (int i = 0; i < 3; i++) {
            queue.enqueue(i + 1);
        }
        System.out.println("\n### Enqueue 3x ###");
        System.out.println("Size: " + queue.size());
        System.out.println("isEmpty: " + queue.isEmpty());
        System.out.println("Front: " + queue.front());

        // Latihan 5
        System.out.println("\n### Sebelum Enqueue 4x ###");
        StrukturQueque queue1 = new StrukturQueque();
        System.out.println("Size: " + queue1.size());
        System.out.println("isEmpty: " + queue1.isEmpty());
        queue1.displayElement();

        for (int i = 0; i < 4; i++) {
            queue1.enqueue(i + 1);
        }
        System.out.println("\n### Enqueue 4x ###");
        System.out.println("Size: " + queue1.size());
        System.out.println("isEmpty: " + queue1.isEmpty());
        queue1.displayElement();
        System.out.println("Front: " + queue1.front());

        // Tugas
        System.out.println("\n### Setelah Dequeue ###");
        queue1.dequeue();
        queue1.displayElement();
        System.out.println("Front: " + queue1.front());
    }
}
