package collections;

import java.util.*;

public class ListComparisons {

    public static void main(String[] args) {

        System.out.println("ArrayList");
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        addToEnd(arrayList1, 100000);

        ArrayList<Integer> arrayList2 = new ArrayList<>();
        addToStart(arrayList2, 100000);


        System.out.println("Vector");
        Vector<Integer> vector1 = new Vector<>();
        addToEnd(vector1, 100000);

        Vector<Integer> vector2 = new Vector<>();
        addToStart(vector2, 100000);


        System.out.println("LinkedList");
        LinkedList<Integer> linkedList1 = new LinkedList<>();
        addToEnd(linkedList1, 100000);

        LinkedList<Integer> linkedList2 = new LinkedList<>();
        addToStart(linkedList2, 100000);

        // === READ ===
        System.out.println();
        System.out.println("Reading");
        forIndices(arrayList1);
        forIndices(vector1);
        forIndices(linkedList1);
//        iterator(arrayList1);
//        forEach(arrayList1);

        System.out.println();
        System.out.println("Removing from start");
        removeFromStart(arrayList1);
        removeFromStart(vector1);
        removeFromStart(linkedList1);

        System.out.println("Removing from end");
        removeFromEnd(arrayList2);
        removeFromEnd(vector2);
        removeFromEnd(linkedList2);
    }

    private static void addToEnd(List<Integer> list, int limit) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < limit; i++) {
            list.add(1000);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("[END] Time elapsed: " + (endTime - startTime));
    }

    private static void addToStart(List<Integer> list, int limit) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < limit; i++) {
            list.add(0, 1000);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("[STR] Time elapsed: " + (endTime - startTime));
    }

    private static void forIndices(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            int n = list.get(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("[FIN] Time elapsed: " + (endTime - startTime));
    }

    private static void removeFromStart(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.remove(0);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("[END] Time elapsed: " + (endTime - startTime));
    }

    private static void removeFromEnd(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        int size = list.size();
        for (int i = size - 1; i >= 0; i--) {
            list.remove(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("[END] Time elapsed: " + (endTime - startTime));
    }

    private static void forEach(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        for (int n : list) {
        }
        long endTime = System.currentTimeMillis();
        System.out.println("[FEA] Time elapsed: " + (endTime - startTime));
    }

    private static void iterator(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int n = iterator.next();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("[ITR] Time elapsed: " + (endTime - startTime));
    }
}
