package objects;

import java.util.Random;

public class TableArray {

    public static void main(String[] args) {
        Random r = new Random();

        int ar[] = new int[10];
        Table[] tables = new Table[10];

//        Table tt = new Table();
//        for (int i = 0; i < tables.length; i++) {
//            tables[i] = tt;
//        }

        int totalVolume = 0;
        int counter = 0;
//        while (counter < tables.length) {
//            Table t = new Table(5, 4);
//            t.height = r.nextInt(200);
//            t.width = r.nextInt(200);
//            t.length = r.nextInt(200);
//            t.name = "Table #" + counter;
//
//            int s = t.area();
//            int v = t.volume();
//            totalVolume += v;
//
//            System.out.println("Площадь = " + s);
//            System.out.println("Объем = " + v);
//            t.print();
//            System.out.println("---------------------------");
//
//            tables[counter] = t;
//
//            counter++;
//        }

        System.out.println("Объем до = " + totalVolume);

        totalVolume = 0;
//        for (int i = 0; i < tables.length; i++) {
//            Table t = tables[i];
//            t.width = 40;
//            totalVolume += t.volume();
//        }
//
//        for (Table t : tables) {
//            t.width = 40;
//            totalVolume += t.volume();
//        }

        System.out.println("Новый объем = " + totalVolume);

    }
}
