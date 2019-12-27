package objects;

public class TableTest {

    public static void main(String[] args) {
        Table t;
        t = new Table(60, 180, 80);
        t.print();

        Table t2 = new Table(5, 4);
//        t.setLength(100);

        int s2 = t2.area();
        int s = t.area();
        int v1 = t.volume();

        System.out.println("Площадь = " + s);
        System.out.println("Площадь 2 = " + s2);

//        System.out.println("===========================================");
        t.print();
        t2.print();
//
//        t2 = t;
//        t2.width = 77;
//
        t.print();
//
//        t = t2;
//        t2.height = 90;
        t.print();
    }
}
