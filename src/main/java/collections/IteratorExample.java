package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        addToEnd(list);

        // for
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("=======================");

        // for-each
        for (int n : list) {
            System.out.println(n);
        }

        // iterator
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }

    private static void addToEnd(List<Integer> list) {
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }
    }
}
