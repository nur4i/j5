package objects;

public class TableComparison {

    public static void main(String[] args) {
        Table t1 = new Table(10, 20, 30);
        t1.setName("Стол обычный");
        Table t2 = new Table(10, 20, 31);
        Table t3 = t1;

        System.out.println(t1 == t2);
        System.out.println(t1 == t3);


        Shape s = new Shape();

        System.out.println("Table comp = " + t1.equals(t3));
        System.out.println("Table comp = " + t1.equals(s));
        System.out.println(t1);
    }
}
