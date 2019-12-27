package objects;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadTest {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("out.txt"));

        Table table = new Table();

        String name = in.nextLine();
        int height = in.nextInt();
        int length = in.nextInt();
        int width = in.nextInt();

        table.setName(name);
        table.setHeight(height);
        table.setLength(length);
        table.setWidth(width);

        table.print();
    }
}
