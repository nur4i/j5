package shapes;

public abstract class Triangle extends Shape {

    protected int base;
    protected int height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public int getTotalAngles() {
        return 180;
    }
}
