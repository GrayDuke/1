package Num2;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        Scanner sc = new Scanner(System.in);
        sc.nextLine();

        myThread.shutdown();


    }
}

class MyThread extends Thread{
    private volatile boolean running = true;

    @Override
    public void run() {
        while (running) {
            System.out.println("Hello, George!");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void shutdown(){
        this.running = false;
    }
}
