package threads2;

public class JoinTest {

    public static void main(String[] args) {
        long id = Thread.currentThread().getId();
        String name = Thread.currentThread().getName();
        int priority = Thread.currentThread().getPriority();

        System.out.println(id + " [" + priority + "] " + name);

        new Thread(new SecondaryThread()).start();
    }
}

class SecondaryThread implements Runnable {
    @Override
    public void run() {
        new Thread(new ThirdThread()).start();

        for (int i = 0; i < 10; i++) {
            long id = Thread.currentThread().getId();
            String name = Thread.currentThread().getName();
            int priority = Thread.currentThread().getPriority();

            System.out.println(id + " [" + priority + "] " + name + " " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class ThirdThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            long id = Thread.currentThread().getId();
            String name = Thread.currentThread().getName();
            int priority = Thread.currentThread().getPriority();

            System.out.println(id + " [" + priority + "] " + name + " " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

