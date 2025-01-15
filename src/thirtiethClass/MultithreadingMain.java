package thirtiethClass;

public class MultithreadingMain {

    public static void main(String[] args) {
        /*Multithreading thread1 = new Multithreading();
        // Call start to run the thread
        // If we call run directly, the thread will not start. It will execute single threaded
        thread1.start();

            Multithreading thread2 = new Multithreading();
        thread2.start();

        // Demonstrate the execution of multiple threads
        for (int i = 0; i < 10; i++) {
            Multithreading thread3 = new Multithreading(i);
            thread3.start();
        }*/

        // Demonstrate multithreading with implements
        for (int i = 0; i < 10; i++) {
            MultithreadingImplements thread4 = new MultithreadingImplements();
            thread4.run();
        }

        // Another way to create threads
        for (int i = 0; i < 10; i++) {
            MultithreadingImplements task = new MultithreadingImplements();
            Thread thread = new Thread(task);
            thread.start();
        }

    }
}

