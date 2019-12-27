package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsExample {

    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            int a = in.nextInt();
            int b = in.nextInt();

            System.out.println(a / b);
            System.out.println("Следующий код");

            int ar[] = {1, 2, 3};
            System.out.println(ar[4]);

        } catch (ArithmeticException ex) {
            showError();
        } catch (ArrayIndexOutOfBoundsException e) {
            showError();
        } catch (InputMismatchException ex) {
            ex.printStackTrace();
        }

        System.out.println("Последний код");

    }

    private static void showError() {
        System.out.println("Нельзя делить на 0");
    }
}
