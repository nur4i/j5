package shapes;

public class BaseTriangle extends Triangle {

    private int sideC;

    public BaseTriangle(int a, int b, int c) {
        super(a, b);
        sideC = c;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return base + height + sideC;
    }
}
