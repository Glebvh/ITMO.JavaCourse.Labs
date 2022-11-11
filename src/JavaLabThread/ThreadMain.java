package JavaLabThread;


public class ThreadMain extends Thread {

    public static void main(String[] args) {

        //1. Напишите программу, в которой запускается 10 потоков и каждый из них выводи числа от 0 до 100.
        //2. Выведете состояние потока перед его запуском, после запуска и во время выполнения.

//        startTenTreads();

        //3. Дан класс Counter. Напишите программу, в которой запускается 100 потоков, каждый из которых вызывает метод increment() 1000 раз.
        //После того, как потоки завершат работу count должен быть равен 100000 при  каждом запуске программы .
        //Если обнаружилась проблема, предложите ее решение.

//        Counter.startHundredTreads();
//        System.out.println(Counter.getCount());

        //4. Напишите программу, в которой создаются два потока, каждый из которых выводит по очереди на консоль своё имя.
        //Начать можно с написания своего класс-потока, который выводит в бесконечном цикле свое имя.
        //Потом придется добавить синхронизацию с помощью wait() и notify().

//        PrintThreadName.printNames();


    }


    public static void startTenTreads() {
        for (int i = 0; i < 10; i++) {
            ThreadMain thread = new ThreadMain();
            System.out.println(thread.getName() + " state Before: " + thread.getState());
            thread.start();
            try {
                thread.join();
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            System.out.println(thread.getName() + " state After: " + thread.getState());

        }
    }

    public static void namesThread() {

    }

    @Override
    public void run() {
        for (int j = 1; j <= 100; j++) {
            System.out.println(j + " " + getName() + " state In: " + getState());
        }
    }

}

