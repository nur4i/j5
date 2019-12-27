package threads2.sync;

public class ArraySumSync {

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        new MyThread("#1", a);
        new MyThread("#2", a);
    }
}

class SumArray {
    private int sum;

    int sum(int numbers[]) {
        sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            System.out.println("[" + Thread.currentThread().getName() + "] Current sum = " + sum);
        }

        return sum;
    }
}

class MyThread implements Runnable {

    private int array[];
    static SumArray sumArray = new SumArray();

    MyThread(String name, int array[]) {
        this.array = array;
        new Thread(this, name).start();
    }

    @Override
    public void run() {
        int sum = sumArray.sum(array);
        System.out.println("[" + Thread.currentThread().getName() + "] Total sum " + sum);
        System.out.println("End of thread " + Thread.currentThread().getName());
    }
}