package Num2;

import java.util.Scanner;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test8 {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        CountDownLatch countDownLatch  = new CountDownLatch(3);

        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for (int i = 0; i<3;i++){
            executorService.submit(new Processor(i,countDownLatch));
        }

        executorService.shutdown();

        for (int i = 0;i<1;i++){
            scanner.nextLine();
            countDownLatch.countDown();
            countDownLatch.countDown();
            countDownLatch.countDown();
        }


        System.out.println("Latch has been opened, main thread is proceeding");



    }
}

class Processor implements Runnable{
    private CountDownLatch countDownLatch;
    private int id;

    public Processor(int id,CountDownLatch countDownLatch) {
        this.id = id;
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        System.out.println("Thread "+id+" is starting his job");
        try {
            Thread.sleep(3000);
            System.out.println("Thread "+id+" was stopped");
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread "+id+" was closed");

    }
}