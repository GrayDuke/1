package Num2;

public class Test3 {
    private int counter;
    public static void main(String[] args) throws InterruptedException {
        Test3 test3 = new Test3();
        test3.doWork();

    }

    public /*synchronized*/ void increment(){
        synchronized (this){
            counter++;
        }
    }

    public void doWork() throws InterruptedException {
            Thread thread1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i<100000; i++){
                        increment();
                    }
                }
            });

            Thread thread2 = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i<100000; i++){
                        increment();
                    }
                }
            });

            thread1.start();
            thread2.start();

            thread1.join();
            thread2.join();

        System.out.println(counter);


    }
}
