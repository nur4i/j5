package shapes;

public class ShapesTest {

    public static void main(String[] args) {
        Shape circle = new Circle(8);
        Shape rect = new Rect(10, 20);

        Shape triangle = new RightTriangle(20, 5);
        Triangle tri = new BaseTriangle(20, 5, 45);

        System.out.println(triangle.getArea());
        System.out.println(circle.getPerimeter());
        System.out.println(rect.getPerimeter());
        System.out.println(triangle.getPerimeter());
    }
}
