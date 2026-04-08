package Multithreading;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CountDownLatchClass {

public static void main(String[] args) throws ExecutionException, InterruptedException {

        int sizeOfWork = 3;

        ExecutorService executorService =  Executors.newFixedThreadPool(sizeOfWork);      

       // List<Future<String>> all =  Arrays.asList(future1, future2, future3);

        // future1.get();
        // future2.get();
        // future3.get();


        CountDownLatch latch =  new CountDownLatch(sizeOfWork);

       //  Future<String> future1 =
       
         executorService.submit(new DependentService(latch));

        //Future<String> future2 =         
        executorService.submit(new DependentService(latch));

       // Future<String> future3 = 
        executorService.submit(new DependentService(latch)); 

        latch.await();




        System.out.println("All service is finised now main service is started");
        executorService.shutdown();


    }



}


 class DependentService implements Callable<String>{

   private final CountDownLatch lat;


   public DependentService(CountDownLatch downLatch){
          lat = downLatch;
   }

    @Override
    public String call() throws Exception {
        // TODO Auto-generated method stub
        try{
            System.out.println(Thread.currentThread().getName() + " Service started");
            Thread.sleep(3000);

        }finally{
            lat.countDown();
                return "ok";

        }

    }


   

    
}
