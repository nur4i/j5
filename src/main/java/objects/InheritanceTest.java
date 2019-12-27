package objects;

import java.util.Random;

public class InheritanceTest {

    public static void main(String[] args) {
//        Shape shapes[] = new Shape[]{
//                new Triangle(10, 20),
//                new Rectangular("ASDF", 90, 80),
//                new Shape(70, 50)
//        };

        Random r = new Random();
        Shape shapes[] = new Shape[100];
        for (int i = 0; i < shapes.length; i++) {
            int type = r.nextInt(3);

            switch (type) {
                case 0:
                    Shape s = new Shape(r.nextInt(100), r.nextInt(100));
                    shapes[i] = s;
                    break;

                case 1:
                    shapes[i] = new Rectangular(
                            "Rectangular",
                            r.nextInt(100),
                            r.nextInt(100)
                    );
                    break;

                case 2:
                    shapes[i] = new Triangle(
                            r.nextInt(100),
                            r.nextInt(100)
                    );
                    break;
            }
        }

        for (Shape s : shapes) {
            System.out.println("Area = " + s.getArea());
            if(s instanceof Rectangular){
                ((Rectangular) s).showName();
            }
        }

    }

//    public static void main(String[] args) {
//        Triangle t = new Triangle(10, 20);
//        System.out.println("Area of Triangle = " + t.getArea());
//
//        Rectangular r = new Rectangular("ASDF", 90, 80);
//        System.out.println("Area of Rectangular = " + r.getArea());
//
//        Shape s = new Shape(70, 50);
//        System.out.println("Area of Shape = " + s.getArea());
//
//        Shape s2 = new Rectangular("YUIOP", 50, 50);
//        System.out.println("Area of Shape2 = " + s2.getArea());
//
//        Shape s3 = new Triangle(60, 60);
//        System.out.println("Area of Shape3 = " + s3.getArea());
//
//    }
}
