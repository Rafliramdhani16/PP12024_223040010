public class ListMKTest {
    public static void main(String[] args) {
//        latihan 4
        StrukturList l1 = new StrukturList();
        l1.addHead(new Matakuliah("IF001", "Dasar Pemograman", 4));
        l1.addHead(new Matakuliah("IF002", "Pemograman Web", 3));
        l1.displayElements();

//        Test 4
        StrukturList t4 = new StrukturList();
        t4.addTail(new Matakuliah("IF001", "Konstruksi PL Berorientasi Object", 3));
        t4.addMid(new Matakuliah("IF002","Struktur Distrit" , 3), 1);
        t4.addMid(new Matakuliah("IF003","Pemograman Web" , 3), 1);
        t4.addHead(new Matakuliah("IF004", "Dasar Pemograman", 4));
        t4.displayElements();


        

    }
}