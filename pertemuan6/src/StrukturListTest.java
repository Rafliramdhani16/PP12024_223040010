public class StrukturListTest {
    public static void main (String[] args){
        StrukturList a = new StrukturList();

        //mencari angka 6
//        a.addTail(5);
//        a.addTail(4);
//        a.addTail(6);
//        a.displayElement();
//
//        a.find(6);

//        StrukturList b = new StrukturList();
//        b.addTail(7);
//        b.addTail(6);
//        b.addTail(4);
//        b.addTail(2);
//        b.addTail(3);
//
//        b.displayElement();
//        b.size();

        StrukturList c = new StrukturList();
        c.addTail(4);
        c.addTail(3);
        c.addTail(7);
        c.addTail(8);
        c.addTail(1);
        c.addTail(9);
        c.displayElement();

        c.removeAll();
        c.displayElement();
    }
}
