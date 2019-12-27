package objects;

import com.google.gson.annotations.SerializedName;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;

public class Table {

    private int width;
    private int height;
    private int length;
    private String name;

    @SerializedName("manufactured")
    private Date manufactureDate;

    private long date;

    private String colors[];

    private Material material;

    Table(int length, int width) {
        this.width = width;
        this.length = length;
        this.height = 50;
    }

    Table() {
        this.height = 50;
        width = 50;
        length = 50;
    }

    public Table(int height, int width, int length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    Table(int length, int width, String name) {
        this.width = width;
        this.length = length;
        this.height = 50;
    }

    Table(String name, int length, int width) {
        this.name = name;
        this.width = width;
        this.length = length;
        this.height = 50;
    }

    int area() {
        int a = width * length;
        return a;
    }

    public int volume() {
        return area() * height;
    }

    public void print() {
        System.out.println("Размеры стола " + name + ": " + width + " x " + height + " x " + length);
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width <= 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        System.out.println("in setWidth method");
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public String[] getColors() {
        return colors;
    }

    public void setColors(String[] colors) {
        this.colors = colors;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public long getDate() {
        return date;
    }

    public Date getAsDate() {
        return new Date(date);
    }

    public void setDate(long date) {
        this.date = date;
    }

    public void readSpecs() throws FileNotFoundException {
        Scanner in = new Scanner(new File("table.txt"));
    }

//    @Override
//    public boolean equals(Object obj) {
//        Table t = (Table) obj;
//
//        if (width == t.width && height == t.height
//                && t.length == length) {
//            return true;
//        }
//
//        return false;
//    }
//
//    @Override
//    public String toString() {
//        return name + " [" + width + "x" + height + "x" + length + "]";
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Table table = (Table) o;
        return width == table.width &&
                height == table.height &&
                length == table.length;
    }

    @Override
    public String toString() {
        return height + "";
//        return "Table{" +
//                "width=" + width +
//                ", height=" + height +
//                ", length=" + length +
//                ", name='" + name + '\'' +
//                '}';
    }
}