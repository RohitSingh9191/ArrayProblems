package Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Questions {

    public static void main(String[] args) {

        Thread th = new Thread(
        ()->{
            System.out.println("hi");
        }
    );

    th.start();

    System.out.println("hello");


    Runnable r = (()->{
        System.out.println("Runnable");
    });
     Thread t1 = new Thread(r);
     t1.start();

       java.util.concurrent.Callable<String> c = ()-> "hool";

     try{
     System.out.println(c.call());
     }catch(Exception e){

     }        



    ExecutorService ex = Executors.newSingleThreadExecutor();


        ex.submit(()->{
            System.out.println("Executors");
        });
    }




    


    


    

}
