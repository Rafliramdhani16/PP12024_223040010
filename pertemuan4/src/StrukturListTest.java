public class StrukturListTest {
        public static void main(String[] args) {
            //Latihan 3
            StrukturList list = new StrukturList();
            list.addTail(3);
            list.addTail(4);
            list.addMid(7,2);
            list.addMid(8,2);
            list.addHead(5);
            list.displayElement();

            // Tugas A
            StrukturList list2 = new StrukturList();
            list2.addTail(3.4);
            list2.addMid(4.5, 2);
            list2.addHead(2.1);
            list2.displayElement();

            // Tugas B
            StrukturList list3 = new StrukturList();
            list3.addTail(1.1);
            list3.addTail(4.5);
            list3.addMid(5.5, 3);
            list3.addHead(2.1);
            list3.addHead(3.4);
            list3.displayElement();
        }
}

