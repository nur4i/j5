package threads2;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        ScannerThread th = new ScannerThread();
        th.start();

        Scanner in = new Scanner(System.in);

        while (true) {
            int i = in.nextInt();
            if (i == -1) {
//                th.stopThread();
                th.interrupt();
                break;
            } else {
                th.setCounter(i);
            }
        }

        System.out.println("Counter = " + th.getCounter());


//        for (int i = 0; i < 100; i++) {
//            System.out.println(i);
//        }
    }
}

class ScannerThread extends Thread {

    private boolean running = true;
    private long counter = 0;

    @Override
    public void run() {
//        while (!Thread.currentThread().isInterrupted()) {
        while (!isInterrupted()) {
            counter++;
//            System.out.println("ScannerThread [" + running + "]" + counter++);
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//                Thread.currentThread().interrupt();
//            }
        }
    }

    public void stopThread() {
        running = false;
    }

    public void setCounter(int c) {
        counter = c;
    }

    public long getCounter() {
        return counter;
    }
}
