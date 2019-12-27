package array;

import java.util.Random;
import java.util.Scanner;

public class HwArray {

    public static void main(String[] args) {
        Random r = new Random(2);

        // Task 2.b
//        int ar[][] = new int[2][3];
//        for (int i = 0; i < ar[0].length; i++) {
//            ar[0][i] = r.nextInt(21) - 10;
//        }
//
//        for (int i = 0; i < ar.length; i++) {
//            for (int j = 0; j < ar[i].length; j++) {
//                System.out.print(ar[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//        for (int i = 0; i < ar[0].length; i++) {
//            ar[1][i] = ar[0][i];
//        }
//
//        for (int i = 0; i < ar.length; i++) {
//            for (int j = 0; j < ar[i].length; j++) {
//                System.out.print(ar[i][j] + " ");
//            }
//            System.out.println();
//        }

        // Task 4
        double goods[] = new double[]{
                2.98, 4.5, 9.98, 4.49, 6.87
        };

        Scanner in = new Scanner(System.in);

        int totalGoodsAmount = 0;
        double totalSum = 0;

        boolean running = true;
        while (running) {
            int goodNumber = in.nextInt();
            if (goodNumber == 0) {
                running = false;
            } else {
                int amount = in.nextInt();

                totalGoodsAmount += amount;
                totalSum += goods[goodNumber - 1] * amount;
            }
        }

        System.out.println("общее количество проданного товара " + totalGoodsAmount);
        System.out.println("общую сумму продаж " + totalSum);

    }
}
