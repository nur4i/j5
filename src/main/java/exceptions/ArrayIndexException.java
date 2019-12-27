package exceptions;

import java.io.*;
import java.util.Scanner;

public class ArrayIndexException {

    public static void main(String[] args) {
        int a = 2;
        int b = 2;

        int ar[] = new int[]{0, 1, 2};
        try {
            System.out.println(ar[a++]);
            System.out.println(ar[++b]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            ex.printStackTrace();
        }
        System.out.println("A=" + a);
        System.out.println("B=" + b);
    }
}
