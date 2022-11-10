package JavaLabThread;

class Counter extends Thread {
    static int count = 0;

    public static void increment() {
        count = count + 1;
    }

    public static int getCount() {
        return count;
    }

    public static void startHundredTreads() {
        try {
            for (int i = 0; i < 100; i++) {
                Counter thread = new Counter();
                thread.start();
                //Thread.sleep(1); <== это тоже работает
                thread.join();
            }
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

    }
    @Override
    public void run() {
        for (int i = 1; i <= 1000 ; i++) {
            Counter.increment();
        }
    }
}
