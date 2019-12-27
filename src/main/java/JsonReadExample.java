import com.google.gson.Gson;
import objects.Table;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Date;

public class JsonReadExample {

    public static void main(String[] args) throws FileNotFoundException {
        Gson gson = new Gson();
        FileReader r = new FileReader("out2.txt");

        Table t = gson.fromJson(r, Table.class);
        t.print();
        System.out.println(t.getManufactureDate());

        String[] colors = t.getColors();
        for (String color : colors) {
            System.out.println(color);
        }

        System.out.println(t.getMaterial().getBoardMaterial());

        System.out.println(t.getAsDate());

    }
}
