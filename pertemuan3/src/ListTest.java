
public class ListTest {
    public static void main(String[] args) {
        // Latihan 4
        StrukturList list = new StrukturList();
        list.addTail(3);
        list.addTail(4);
        list.addTail(5);
        list.displayElement(); // Output: 3 4 5

        // Latihan 5
        StrukturList list2 = new StrukturList();
        list2.addTail(3);
        list2.addTail(2);
        list2.addTail(1);
        list2.addTail(7);
        list2.displayElement(); // Output: 3 2 1 7
    }
}
