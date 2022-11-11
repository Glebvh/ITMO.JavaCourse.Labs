package JavaLabThread;

public class PrintThreadName {

    public static synchronized void printNames() {

        Print print = new Print();
        new NameThread(print).start();
        new NameThread(print).start();
    }

}

class Print {
    int i = 0;
    public synchronized void print() {
        while (i < 10) {
            try {
                System.out.println(Thread.currentThread().getName());
                notify();
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            i++;
            notify();

        }
    }
}

class NameThread extends Thread {
    Print print;
    NameThread(Print print) {
        this.print = print;
    }

    @Override
    public void run() {
        print.print();
    }
}

