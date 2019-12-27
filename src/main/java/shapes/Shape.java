package shapes;

public abstract class Shape {

    private String name;

    public abstract double getArea();

    public abstract double getPerimeter();

    public abstract int getTotalAngles();

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                '}';
    }
}
