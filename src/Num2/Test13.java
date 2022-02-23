package Num2;

import java.util.concurrent.*;

public class Test13 {
    public static void main(String[] args)  {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<Integer> future = executorService.submit(() -> {
            System.out.println("Starting");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Finished");
            if (4<5)
                throw new Exception("Something bad happened");


            return 5;
        });

        executorService.shutdown();
        //executorService.awaitTermination(1, TimeUnit.DAYS);
        try {
            int result = future.get();
            System.out.println(result);
        } catch (ExecutionException e) {
            Throwable ex = e.getCause();
            System.out.println(ex.getMessage());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("It's end of tale");
    }

    public static int calculate(){
        return 5+5;
    }
}
