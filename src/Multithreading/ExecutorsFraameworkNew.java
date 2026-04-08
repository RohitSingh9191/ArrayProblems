package Multithreading;

import java.lang.invoke.CallSite;
import java.sql.Time;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class ExecutorsFraameworkNew {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        // Thread[] threads = new Thread[9];

        ExecutorService executorService = Executors.newFixedThreadPool(9);

        for (int i = 1; i < 10; i++) {

            int finalI = i;

            // threads[i -1] = new Thread( ()->{
            // );
            // threads[i - 1].start();

            executorService.submit(() -> {
                System.out.println(finalI + " : " + factorial(finalI));
            });

        }

        // for(Thread thread: threads){
        // try{
        // thread.join();
        // }catch(Exception e){
        // Thread.currentThread().interrupt();
        // }
        // }

        executorService.shutdown();
        try {
            executorService.awaitTermination(1, TimeUnit.SECONDS);
        } catch (Exception e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Total time : " + (System.currentTimeMillis() - startTime));

    }

    public static int factorial(int n) {

        try {
            Thread.sleep(100);
        } catch (Exception e) {

        }
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;

    }

}
