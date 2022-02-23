package Num2;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) throws InterruptedException {
        NotifyAndWait nw = new NotifyAndWait();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    nw.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    nw.consumer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
    }
}
class NotifyAndWait{
    public void produce() throws InterruptedException {
        synchronized (this) {
            System.out.println("Command Produce started");
            wait();
            System.out.println("Command Produce is continuing");
        }

    }
    public void consumer() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        synchronized (this) {
            Thread.sleep(2000);
            System.out.println("Command Produce was paused");
            scanner.nextLine();
            notify();

            //System.out.println("Command notify started");
        }

    }
}
