package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class TryWithResourceExample {

    public static void main(String[] args) {
        try (PrintWriter out = new PrintWriter("a.txt");
             Scanner in = new Scanner(new File("a.txt"))
        ) {

            in.nextLine();
            out.println("Hello world 4");

            throw new ArithmeticException();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
