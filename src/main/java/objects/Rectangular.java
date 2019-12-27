package objects;

public class Rectangular extends Shape {

    public static void main(String[] args) {
        Rectangular a = new Rectangular("", 77, 88);
        System.out.println(a.zxc);
        Rectangular b = new Rectangular("", 77, 88);
        System.out.println(b.zxc);

        a.zxc = 55;
        System.out.println(Rectangular.zxc);
    }

    protected String name;
    public static int zxc = 9;

    protected Rectangular(String name, int width, int height) {
        super(width, height);
        this.name = name;
    }

    Rectangular(String name, int dim) {
//        super(dim);
//        this.name = name;
        this(name, dim, dim);
    }

    Rectangular(String name) {
//        super();
//        this.name = name;
        this(name, 0);
    }

    void showName() {
        System.out.println("Name of rectangular: " + name);
    }

    boolean isSquare() {
        return getHeight() == getWidth();

//        if(getHeight() == getWidth()){
//            return true;
//        } else {
//            return false;
//        }
    }

    @Override
    public void showDimens() {
        super.showDimens();
    }
}
