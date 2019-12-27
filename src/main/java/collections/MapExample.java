package collections;

import java.util.HashMap;
import java.util.Set;

public class MapExample {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        int n = 6;

        map.put("one", 1);
        map.put("two", 2);
        map.put("zero", 0);
        map.put("one", n);

        System.out.println(map);
        System.out.println(map.size());

        System.out.println(map.get("one"));
        System.out.println(map.get("four"));

        System.out.println(map.containsKey("four"));
        System.out.println(map.containsValue(2));

        Set<String> keys = map.keySet();
        for (String k : keys) {
            Integer value = map.get(k);
            System.out.println(k + " - " + value);
        }

    }
}
