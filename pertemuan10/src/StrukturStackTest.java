public class StrukturStackTest {
    public static void main(String[] args) {
        StrukturStack stack = new StrukturStack(3);

//        Latihan 4
        System.out.println("#Sebelum push");
        System.out.println("Size: " + stack.size());
        System.out.println("Empty: " + stack.isEmpty());
        System.out.println("Full: " + stack.isFull());
        System.out.println("Top: " + stack.getTop());
        System.out.println("Elemen from TOP: ");
        stack.printElements();

        System.out.println("\n#Melakukan push 3x:");
        stack.push(2);
        stack.push(4);
        stack.push(1);
        System.out.println("Size: " + stack.size());
        System.out.println("Empty: " + stack.isEmpty());
        System.out.println("Full: " + stack.isFull());
        System.out.println("Top: " + stack.getTop());
        System.out.println("Elemen from TOP: ");
        stack.printElements();


//        Tugas
        System.out.println("\n#Melakukan pop:");
        stack.pop();
        System.out.println("Size: " + stack.size());
        System.out.println("Empty: " + stack.isEmpty());
        System.out.println("Full: " + stack.isFull());
        System.out.println("Top: " + stack.getTop());
        System.out.println("Elemen from TOP: ");
        stack.printElements();
    }
}
