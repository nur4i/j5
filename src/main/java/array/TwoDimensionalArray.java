package array;

import java.util.Random;

public class TwoDimensionalArray {

    public static void main(String[] args) {
        int ar[] = new int[5];
        int ar2[][] = new int[3][5];

//        Random r = new Random();
//
//        int i = 0;
//        while (i < 3) {
//            int j = 0;
//            while (j < 5) {
//                ar2[i][j] = r.nextInt(10);
//                j++;
//            }
//            i++;
//        }

//        int x = 0, y = 0;
//        while (x < 3) {
//            y = 0;
//            while (y < 5) {
//                System.out.print(ar2[x][y] + " ");
//                y++;
//            }
//            System.out.println();
//
//            x++;
//        }

        System.out.println(ar2.length);

        for (int x = 0; x < ar2.length; x++) {
            int c = 1;
            for (int y = 0; y < ar2[x].length; y++) {
                ar2[x][y] = c;
                c++;
            }
        }

        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 5; y++) {
                System.out.print(ar2[x][y] + " ");
            }
            System.out.println();
        }


    }
}
