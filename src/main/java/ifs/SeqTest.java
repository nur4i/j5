package ifs;

public class SeqTest {

    public static void main(String[] args) {
        Sequence s = new BasicSequence();
        s.setStart(10);

        System.out.println(s.getNext());
        System.out.println(s.getNext());

        System.out.println("=========================================");

        ArithmeticSequence as = new ArithmeticSequence(2, 5);

        System.out.println(as.getNext());
        System.out.println(as.getNext());
        System.out.println(as.getPrevious());
        System.out.println(as.getPrevious());
        as.setStep(6);
        System.out.println(as.getNext());
        as.setStart(0);
        System.out.println(as.getNext());

        // ==================================================================

        System.out.println("=== BidirectionalSequence =================");
        BidirectionalSequence bs = new ArithmeticSequence(3, 2);
        System.out.println(bs.getNext());
        System.out.println(bs.getNext());
        System.out.println(as.getNext());
        ((ArithmeticSequence) bs).setStep(3);
        System.out.println(bs.getNext());
        System.out.println(bs.getNext());

        // ==================================================================

        System.out.println("=== Sequence =================");

        Sequence sa = new ArithmeticSequence(10, 7);

    }
}
