package collections;

import objects.Table;

import java.util.Comparator;

public class TableComparator implements Comparator<Table> {

    @Override
    public int compare(Table o1, Table o2) {
        if (o1.getHeight() == o2.getHeight()) {
            return 0;
        } else if (o1.getHeight() < o2.getHeight()) {
            return -1;
        } else {
            return 1;
        }
    }

}
