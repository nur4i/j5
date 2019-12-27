package threads;

public class MainThread {

    public static void main(String[] args) {

        MyThread thread = new MyThread("Gagarin");
        thread.start();

        MyThread thread2 = new MyThread("Titov");
        thread2.start();

//        OneMoreThread runnable = new OneMoreThread();
//        Thread thread3 = new Thread(runnable);
        Thread thread3 = new Thread(new OneMoreThread());
        thread3.start();

        new Thread(new OneMoreThread()).start();

        for (int i = 500; i < 600; i++) {
            System.out.println(i);
            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
