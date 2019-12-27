package collections;

import java.util.ArrayList;

public class ArrayListExamples {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Asem");
        list.add("Vasya");
        list.add("123");
        list.add("Talgat");
        list.add("555");
        list.add("ASDF");
        list.add("QWER");
        list.add("GHJ");
        list.add("ASDF");
        list.add("Iop");
        list.add("000");

        list.sort(null);
        System.out.println(list);

        System.out.println(list.size());

        list.remove(1);
        System.out.println(list);

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(5);

        int i = numbers.get(0);

    }
}
