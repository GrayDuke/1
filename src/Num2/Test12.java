package Num2;

import java.util.Random;

public class Test12 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Random random = new Random();
                for (int i = 0; i < 1_000_000_000; i++) {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        //e.printStackTrace();
                        System.out.println("Thread was interrupted: "+i);
                        break;
                    }
//                    if(Thread.currentThread().isInterrupted()){
//                        System.out.println("Thread was interrupted");
//                        System.out.println(i);
//                        break;
//                    }

                    Math.sin(random.nextDouble());
                }
            }
        });

        System.out.println("Starting thread");

        thread1.start();
        Thread.sleep(3000);
        thread1.interrupt();

        thread1.join();

        System.out.println("Thread has finished");
    }
}
