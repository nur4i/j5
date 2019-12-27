package objects;

public class FigureTest {

    public static void main(String[] args) {
        Shape s = new Shape();
        s.setWidth(10);
        s.setHeight(14);
        s.showDimens();

        Shape s2 = new Shape();
        s2.showDimens();

        new Shape(33).showDimens();

        s2 = new Shape(45, 55);
        s2.showDimens();

//        Rectangular r = new Rectangular();
        Rectangular r = new Rectangular("My box", 25, 35);
        r.showDimens();
        r.showName();

        r.setWidth(25);
        r.setHeight(25);
        r.name = "My box";
        r.showDimens();
        r.showName();
        System.out.println("Square = " + r.isSquare());
        System.out.println(r.getHeight() == r.getWidth());

        System.out.println("Rectangular is square = " +
                new Rectangular("New Box", 99).isSquare());

        System.out.println("======================================");
        new Rectangular("AAAAAA", 2).showDimens();

        Shape ss = new Rectangular("obj", 58);
        ss.showDimens();

        System.out.println(ss);
    }
}
