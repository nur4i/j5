package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordCounter {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < 5; i++) {
            String word = in.next();
            Integer value = map.get(word);
            if (value != null) {
                map.put(word, value + 1);
            } else {
                map.put(word, 1);
            }
        }
        System.out.println(map);
        
        String str = "кириллица";

        for (int i = 0; i < str.length(); i++) {
            String letter = str.charAt(i) + "";
            map.get(letter);
        }


    }
}
