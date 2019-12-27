package objects;

public class Shape {

    private int width;
    private int height;

    static int a;

    Shape() {
        width = 0;
        height = 0;
    }

    Shape(int dim) {
//        width = height = dim;
        width = dim;
        height = dim;
    }

    Shape(int width, int height) {
        this.width = width;
        this.height = height;
    }

    void showDimens() {
        System.out.println("Width = " + width + "; Height = " + height);
        Rectangular.zxc = 77;
    }

    void showDimens(boolean show) {
        System.out.println("Width = " + width + "\nHeight = " + height);
    }

    double getArea() {
        System.out.println("Shape.getArea()");
        return width * height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

}
