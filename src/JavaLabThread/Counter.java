package JavaLabThread;

class Counter extends Thread {
    public static void main(String[] args) {
        startHundredTreads();

        System.out.println("result: " + getCount());



    }
    static int count = 0;

    public static void increment() {
        count = count + 1;
    }

    public static int getCount() {
        return count;
    }

    public static void startHundredTreads() {
        for (int i = 0; i < 100; i++) {
            new Counter().start();
        }
    }

    @Override
    public void run() {
        synchronized (Counter.class) {
            for (int i = 1; i <= 1000; i++) {
                Counter.increment();
            }
        }
    }
}