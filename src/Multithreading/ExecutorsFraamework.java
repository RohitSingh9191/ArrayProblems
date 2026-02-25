package Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorsFraamework {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis(); // 1 jan 1970 
          // Thread[] thread = new Thread[9]; 
        ExecutorService executorService =  Executors.newFixedThreadPool(1);
          for( int i = 1 ; i < 10 ; i++){
            int finanli = i;

            executorService.submit(()->{
                    System.out.println("Fac - " + factorial(finanli));
            });
            // thread[i - 1] = new Thread(
            //     ()->{
            //            System.out.println("Fac - " + factorial(finanli));
            //     }
            // );
            // thread[i - 1].start();
        } 

        executorService.shutdown();
        try{
            executorService.awaitTermination(100, TimeUnit.SECONDS);
        }catch(Exception e){

        }

        // for(Thread thrd : thread){
        //     try{
        //         thrd.join();
        //     }catch(InterruptedException e){

        //     }
        // }


            System.out.println("Total Time: " + ( System.currentTimeMillis() - startTime) );

    }


    public static  Long factorial(int n){       
        long result = 1;
        for(int i=  1 ; i <= n ; i++){
                result *= i;
        }
        return result;
    }

    

}
