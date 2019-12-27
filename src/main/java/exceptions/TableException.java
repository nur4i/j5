package exceptions;

import objects.Table;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TableException {

    public static void main(String[] args) {

        Table t = new Table(0, 0, 0);
        t.setWidth(-45);

        try {
            t.readSpecs();
            System.out.println("AAAAAAAAA");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("EXEXEXEX");
        } finally {
            System.out.println("FINALLY");
        }

        System.out.println(t.getWidth());


        try {
            FileReader in = new FileReader("a.txt");
            in.read();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (Exception l) {

        }
    }
}
