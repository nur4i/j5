package objects;

public class Triangle extends Shape {

    public Triangle(int width, int height) {
        super(width, height);
    }

    @Override
    double getArea() {
        System.out.println("Triangle.getArea()");
        return getHeight() * getWidth() / 2;
    }
}
