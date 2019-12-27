package datetime;

import objects.Shape;

public class BasicTimeExample {

    public static void main(String[] args) {
        int h = 6, m = 5, s = 7;
        if (h < 10) {
            System.out.print("0");
        }
        System.out.print(h + ":");

        if (m < 10) {
            System.out.print("0");
        }
        System.out.print(m + ":");

        if (s < 10) {
            System.out.print("0");
        }
        System.out.println(s);

        System.out.printf("%02d:%02d:%02d\n", h, m, s);

        Romb r = new Romb();

    }
}
