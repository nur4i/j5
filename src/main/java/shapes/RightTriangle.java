package shapes;

public class RightTriangle extends Triangle {

    public RightTriangle(int base, int height) {
        super(base, height);
    }

    @Override
    public double getArea() {
        return base * height / 2;
    }

    @Override
    public double getPerimeter() {
        return base + height + 10;
    }
}
