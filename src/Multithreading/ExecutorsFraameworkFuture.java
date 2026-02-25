package Multithreading;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorsFraameworkFuture {
    public static void main(String[] args) throws ExecutionException, InterruptedException{
        ExecutorService executor = Executors.newSingleThreadExecutor();


        executor.submit(()-> 1+2);

        executor.shutdown();

        executor.shutdownNow();

        executor.awaitTermination(100, TimeUnit.SECONDS);

        executor.isShutdown();
        
        executor.isTerminated();


    }    

}
