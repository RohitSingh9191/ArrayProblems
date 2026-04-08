package Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Callable {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Runnable r = (() -> {
            System.out.println("hello");
        });

        Thread t1 = new Thread(r);
        t1.start(); 

        java.util.concurrent.Callable<String> callable = () -> "Hello";

        Future<String> future = executorService.submit(callable);

        try{
        System.out.println(future.get());
        }catch(Exception e){

        }
    }

}
