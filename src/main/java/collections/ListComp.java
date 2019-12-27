package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListComp {

    public static void main(String[] args) {
        System.out.println("Add to end");
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        addToEnd(arrayList1);

        Vector<Integer> vector1 = new Vector<>();
        addToEnd(vector1);

        LinkedList<Integer> linkedList1 = new LinkedList<>();
        addToEnd(linkedList1);

        // =================================================
        System.out.println("Add to start");
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        addToStart(arrayList2);

        Vector<Integer> vector2 = new Vector<>();
        addToStart(vector2);

        LinkedList<Integer> linkedList2 = new LinkedList<>();
        addToStart(linkedList2);

        // =================================================
        System.out.println("Iterate");
        iterate(arrayList2);
        iterate(vector2);
        iterate(linkedList2);

        // =================================================
        System.out.println("Remove from end");
        removeFromEnd(arrayList1);
        removeFromEnd(vector1);
        removeFromEnd(linkedList1);

        // =================================================
        System.out.println("Remove from start");
        removeFromStart(arrayList2);
        removeFromStart(vector2);
        removeFromStart(linkedList2);
    }

    private static void addToEnd(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list.add(1000);
        }
        long endTime = System.currentTimeMillis();

        System.out.println("Time elapsed: " + (endTime - startTime));
    }

    private static void addToStart(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list.add(0, 1000);
        }
        long endTime = System.currentTimeMillis();

        System.out.println("Time elapsed: " + (endTime - startTime));
    }

    private static void removeFromEnd(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        for (int i = list.size() - 1; i >= 0; i--) {
            list.remove(i);
        }
        long endTime = System.currentTimeMillis();

        System.out.println("Time elapsed: " + (endTime - startTime));
    }

    private static void removeFromStart(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.remove(0);
        }
        long endTime = System.currentTimeMillis();

        System.out.println("Time elapsed: " + (endTime - startTime));
    }

    private static void iterate(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int num = list.get(i);
        }
        long endTime = System.currentTimeMillis();

        System.out.println("Time elapsed: " + (endTime - startTime));
    }

}
