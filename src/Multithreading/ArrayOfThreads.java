package Multithreading;

import java.sql.Time;

public class ArrayOfThreads {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        Thread[] threads = new Thread[9];


        for (int i = 1; i < 10 ; i++) {

            int finalI = i;

            threads[i -1] = new Thread(
                ()->{
            System.out.println(finalI+ " : " + factorial(finalI));

                }

            );

            threads[i - 1].start();

        }

        for(Thread thread: threads){
                try{
                    thread.join();
                }catch(Exception e){
                    Thread.currentThread().interrupt();
                }
        }

        System.out.println("Total time : " + (System.currentTimeMillis() - startTime));

    }

    public static int factorial(int n) {

        try{
        Thread.sleep(100);
        }catch(Exception e){

        }
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;

    }

}
