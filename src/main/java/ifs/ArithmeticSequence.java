package ifs;

public class ArithmeticSequence implements BidirectionalSequence {

    private int current;
    private int step = 1;

    public ArithmeticSequence(int start) {
        current = start;
    }

    public ArithmeticSequence(int start, int step) {
        current = start;
        this.step = step;
    }

    public int getPrevious() {
        int val = current;
        current -= step;
        return val;
    }

    public int getNext() {
        int val = current;
        current += step;
        return val;
    }

    public void setStart(int number) {
        current = number;
    }

    public void setStep(int step) {
        this.step = step;
    }
}
