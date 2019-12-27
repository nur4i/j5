package threads2;

public class PriorityTest {

    public static void main(String[] args) {
        Priority highPriority = new Priority("High Priority");
        Priority lowPriority = new Priority("Low Priority");

        Thread t1 = new Thread(highPriority);
        Thread t2 = new Thread(lowPriority);

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        try {
            t1.start();
            t2.start();

            t1.join();
            System.out.println("T1 joined");
            t2.join();
            System.out.println("T2 joined");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\nCчeтчик потока High Priority: " + highPriority.count);
        System.out.println("\nCчeтчик потока Low Priority: " + lowPriority.count);
    }
}

class Priority implements Runnable {

    String name;
    int count;
    static boolean stop = false;

    public Priority(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + " - запуск");
        do {
            count++;
            System.out.println(name + " - " + count);
        } while (stop == false && count < 1000000);
        stop = true;
        System.out.println("\n" + name + " - завершение");
    }
}