package collections;

import java.util.*;

public class CollectionsExample {

    public static void main(String[] args) {
        int ar[] = new int[]{1, 2, 3};
        System.out.println(Arrays.toString(ar));

        Arrays.fill(ar, 5);
        Arrays.binarySearch(ar, 5);

//        List<Integer> list = Arrays.asList(4, 5, 6, 7, 8, 10);
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(10);
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);

        Random r = new Random();
        int n = list.size();
        List<Integer> newList = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            int index = r.nextInt(list.size());
            int number = list.remove(index);
            newList.add(number);
        }

        System.out.println(newList);

        newList.sort(null);
        System.out.println(newList);

    }
}
