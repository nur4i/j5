package threads;

public class ThreadPriorityTest {

    public static void main(String[] args) throws InterruptedException {
        Priority p1 = new Priority("High");
        Priority p2 = new Priority("Low");

        Thread t1 = new Thread(p1);
        t1.setPriority(Thread.NORM_PRIORITY + 4);

        Thread t2 = new Thread(p2);
        t2.setPriority(Thread.NORM_PRIORITY - 4);

        t1.start();
        t2.start();

        t1.join();
        System.out.println("T1 joined");

        t2.join();
        System.out.println("T2 joined");

        System.out.println("==========================================");
        System.out.println(p1.getCount());
        System.out.println(p2.getCount());
    }

}

class Priority implements Runnable {

    private long count = 0;
    static boolean stop = false;
    String name;

    public Priority(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        while (stop != true && count < 1000000) {
            count++;
            System.out.println(name + " - " + count);
        }

        stop = true;
    }

    public long getCount() {
        return count;
    }
}