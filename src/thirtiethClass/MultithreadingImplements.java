package thirtiethClass;

public class MultithreadingImplements  implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.print("  "+i);

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.err.println("Error " + e.getMessage());
                }
            }
        }

    }

