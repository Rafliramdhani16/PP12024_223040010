public class ListTest {
    public static void main(String[] args) {
        StrukturList list = new StrukturList();
        StrukturList list1 = new StrukturList();
        StrukturList list2 = new StrukturList();

        //Remove mid
        System.out.println("Remove Mid");
        list.addMid(6, 2);
        list.addTail(3);
        list.addTail(5);
        list.addTail(1);
        list.addHead(2);

        list.displayElement();

        list.removeMid(3);
        list.displayElement();

        list.removeMid(5);
        list.removeMid(6);
        list.displayElement();
        System.out.println(" ");

        //Remove Head
        System.out.println("Remove Head");
        list1.addTail(7);
        list1.addTail(9);
        list1.addTail(2);

        list1.displayElement();
        list1.removeHead();
        list1.displayElement();
        System.out.println(" ");


        //Remove tail
        System.out.println("Remove Tail");
        list2.addTail(2);
        list2.addTail(6);
        list2.addTail(3);
        list2.addTail(5);
        list2.addTail(1);
        list2.displayElement();

        list2.removeTail();
        list2.displayElement();

        list2.removeHead();
        list2.displayElement();

        list2.removeTail();
        list2.displayElement();

    }

}
