package Num2;

import javax.sound.midi.Soundbank;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Test6 {
    private static BlockingQueue<Integer>  queue = new ArrayBlockingQueue<>(10);
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    consumer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    private static void produce() throws InterruptedException{
        Random random = new Random();
        for(int i = 0;i<100;i++) {
            queue.put(i);
        }
        System.out.println("Produce ended his work");
    }

    private static void consumer() throws InterruptedException {
        for (int i = 0; i<100;i++){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(queue.take() + "    :    "+ queue.size());

        }
        System.out.println("Consumer ended his work");
    }
}
