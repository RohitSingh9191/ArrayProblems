package Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PrintNumbers {


    int number = 0;

    private final int limit;

    public PrintNumbers(int limit){
        this.limit = limit; 
    }


    public synchronized void printNumbers(int reminder){

        while (number <= limit) {

            while (number % 7 != reminder) {
                try{
                    wait();
                }catch(Exception e){}
            }

            if(number <= limit){
                System.out.println(Thread.currentThread().getName() +" "+ number++);
                notifyAll();
            }
        }
    }


    public static void main(String[] args) {
        PrintNumbers pr = new PrintNumbers(50);


        Thread t1 = new Thread(()->pr.printNumbers(1), " Thread 1");
        Thread t2 = new Thread(()->pr.printNumbers(2), " Thread 2");
        Thread t3 = new Thread(()->pr.printNumbers(0), " Thread 3");
        Thread t4 = new Thread(()->pr.printNumbers(0), " Thread 4");


        // t1.start();
        // t2.start();
        // t3.start();
        // t4.start();


        ExecutorService er = Executors.newFixedThreadPool(10);


        for(int i = 0 ; i < 8 ; i++){

            int finalI = i;
            er.submit(()->pr.printNumbers(finalI))
            ;
        }


    }



}
