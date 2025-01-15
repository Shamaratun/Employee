package thirtiethClass;

public class TaskThreadDemo {
    public static void main(String[] args) {
        Runnable printA = new PrintChar('a',100);
        Runnable printB = new PrintChar('b',100);
        Runnable print100 = new PrintNum(100);
 Thread thread1 = new Thread(printA);
 thread1.start();

        Thread thread2 = new Thread(printB);
        thread2.start();


        Thread thread3= new Thread(print100);
        thread3.start();


    }
}
