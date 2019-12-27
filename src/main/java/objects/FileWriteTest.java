package objects;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Calendar;

public class FileWriteTest {

    public static void main(String[] args) throws FileNotFoundException {
        Table table = new Table("Рабочий", 120, 60);
        table.setHeight(80);
        table.setManufactureDate(Calendar.getInstance().getTime());
        table.setColors(new String[]{
                "red", "blue", "black"
        });
        table.setMaterial(new Material("metal", "wood"));
        table.setDate(System.currentTimeMillis());

        GsonBuilder builder = new GsonBuilder();
        builder.setDateFormat("dd.MM.YYYY HH:mm:ss");
        builder.setPrettyPrinting();

//        Gson gson = new Gson();
        Gson gson = builder.create();
        String result = gson.toJson(table);
        System.out.println(result);


        PrintWriter out = new PrintWriter("out2.txt");
//        out.println(table.getName());
//        out.println(table.getHeight());
//        out.println(table.getLength());
//        out.println(table.getWidth());

        out.println(result);
        out.close();
    }
}
