package shapes;

public class Rect extends Shape {

    private int width;
    private int length;

    public Rect(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return (width + length) * 2;
    }

    @Override
    public int getTotalAngles() {
        return 360;
    }
}
