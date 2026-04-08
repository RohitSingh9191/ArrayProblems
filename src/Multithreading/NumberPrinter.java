package Multithreading;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class NumberPrinter {

    int number = 1;

    private final int limit;

    public NumberPrinter(int limit) {
        this.limit = limit;
    }

    public synchronized void printOdd() {

        while (number <= limit) {

            if (number % 2 == 0) {
                try {
                     System.out.println(Thread.currentThread().getName() + " waiting");
                    wait();
                    try{
                Thread.sleep(1000);
                } catch(Exception e){};
                } catch (Exception e) {
                    System.out.println(e);

                }

            } else {
                System.out.println(Thread.currentThread().getName() + " " + number++);
                notify();
            }

        }

    }

    public synchronized void printEvent() {

        while (number <= limit) {
            if (number % 2 != 0) {
                try {
                    System.out.println(Thread.currentThread().getName() + " waiting");
                    wait();
                } catch (Exception e) {
                    System.out.println(e);

                }
            } else {           
                System.out.println(Thread.currentThread().getName() + " " + number++);
                notify();
            }
        }
    }

    public static void main(String[] args) {

        NumberPrinter n = new NumberPrinter(10);

        Thread t1 = new Thread(
            ()-> n.printEvent(), "Even Number" 
        );

        Thread t2 = new Thread(
            n::printOdd, "Odd Number"
        );

         Runnable r = ()-> n.printEvent() ;

        Thread t3 = new Thread(r, "Even Number");



        // t1.start();
        //  t2.start();
        //  t3.start();

        // try{
        //     t1.join();
        //      t2.join();
        // }catch(Exception e){

        // }

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        executorService.submit(()->{
            n.printEvent();
             n.printOdd();
        });
        executorService.submit(()->{
            n.printOdd();

        }
    );


    executorService.shutdown();
    try{
    executorService.awaitTermination(10, TimeUnit.SECONDS);
    } catch (Exception e) {
        Thread.currentThread().interrupt();
    }

        System.out.println("Print all");

    }

}
