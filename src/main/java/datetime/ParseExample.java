package datetime;

public class ParseExample {

    public static void main(String[] args) {
        String str = "45";
        int number = Integer.parseInt(str);
        System.out.println(number + 5);

        String time = "20:48:35";

        String parts[] = time.split(":");

        // Variant 1
        for (int i = 0; i < parts.length; i++) {
            System.out.println(parts[i]);
            int part = Integer.parseInt(parts[i]);
            System.out.println(part);
        }

        // Variant 2
        for (String p : parts) {
            System.out.println(Integer.parseInt(p));
        }

    }
}
