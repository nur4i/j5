package threads.sync;

public class Chat {

    boolean flag = false;

    public synchronized void question(String msg) {
        if (flag) {
            try {
//                System.out.println("Waiting for Question " + msg);
                wait();
//                System.out.println("Waiting Q...");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(msg);
        flag = true;
        notify();
    }

    public synchronized void answer(String msg) {
        if (!flag) {
            try {
//                System.out.println("Waiting for Answer " + msg);
                wait();
//                System.out.println("Waiting A...");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(msg);
        flag = false;
        notify();
    }
}
