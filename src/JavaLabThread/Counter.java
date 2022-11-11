package JavaLabThread;

import java.util.concurrent.CountDownLatch;

class Counter extends Thread {
    public static void main(String[] args) throws InterruptedException {

        startHundredTreads();
        System.out.println("result: " + getCount());
    }

    private static final CountDownLatch cdl = new CountDownLatch(100);
    static int count = 0;

    public static void increment() {
        count = count + 1;
    }

    public static int getCount() {
        return count;
    }

    public static void startHundredTreads() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            new Counter().start();
        }
        cdl.await();
    }

    @Override
    public void run() {
        synchronized (Counter.class) {
            for (int i = 1; i <= 1000; i++) {
                increment();
            }
            cdl.countDown();
        }
    }
}