package threads2.sync;

import java.util.ArrayList;
import java.util.List;

public class SyncTest {

    public static void main(String[] args) {
        Printer printer = new Printer();
        new OddNumbers(printer);
        new BigNumbers(printer);
    }
}

class Printer {

    public synchronized void printNumbers(String printer, List<Integer> numbers) {
        for (Integer i : numbers) {
            System.out.println(printer + " - " + i);
        }
    }

    public void printNumbers2(String printer, List<Integer> numbers) {
        for (Integer i : numbers) {
            System.out.println(printer + " - " + i);
        }
    }

}

class OddNumbers implements Runnable {

    private ArrayList<Integer> list = new ArrayList<>();
    private Printer printer;

    public OddNumbers(Printer printer) {
        this.printer = printer;

        for (int i = 1; i < 100; i += 2) {
            list.add(i);
        }

        new Thread(this).start();
    }

    @Override
    public void run() {
        printer.printNumbers("OddNumbers", list);
    }
}

class BigNumbers implements Runnable {

    private ArrayList<Integer> list = new ArrayList<>();
    private Printer printer;

    public BigNumbers(Printer printer) {
        this.printer = printer;

        for (int i = 0; i < 50; i++) {
            list.add(i + 100000);
        }

        new Thread(this).start();
    }

    @Override
    public void run() {
        printer.printNumbers2("BigNumbers", list);
    }
}