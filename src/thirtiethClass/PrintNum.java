package thirtiethClass;

 class PrintNum implements Runnable{
    private int lastNum;


    public PrintNum(int n) {
        this.lastNum = n;
    }
        @Override
        public void run () {
            for (int i =1; i <= lastNum; i++) {
                System.out.print("  "+i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.err.println("Error " + e.getMessage());
                }
            }
        }
    }


