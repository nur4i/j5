package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("AAA");
        set.add("BBB");
        set.add("CCC");
        set.add("XXX");

        set.add("AAA");
        set.add("CCC");

        set.add("WWW");

        System.out.println(set);

        for (String str : set) {
            System.out.println(str);
            set.remove(str);
        }
    }
}
