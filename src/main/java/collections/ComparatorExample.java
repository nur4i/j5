package collections;

import objects.Table;

import java.lang.reflect.Array;
import java.util.*;

public class ComparatorExample {

    public static void main(String[] args) {
        List<Table> tables = Arrays.asList(
                new Table(10, 20, 30),
                new Table(10, 40, 40),
                new Table(70, 50, 60),
                new Table(10, 70, 90),
                new Table(30, 20, 30)
        );

        System.out.println(tables);

        TableComparator myComp = new TableComparator();
        tables.sort(myComp);
        System.out.println(tables);

        Collections.shuffle(tables);

        Comparator<Table> comp = new Comparator<Table>() {
            @Override
            public int compare(Table o1, Table o2) {
                if (o1.volume() == o2.volume()) {
                    return 0;
                } else if (o1.volume() < o2.volume()) {
                    return -1;
                } else {
                    return 1;
                }
            }
        };

        tables.sort(comp);
        System.out.println(tables);


        List<String> color = Arrays.asList(
                "orange",
                "blue",
                "orange"
        );
    }
}
