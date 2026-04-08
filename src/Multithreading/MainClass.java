package Multithreading;

public class MainClass {
     public static void main(String[] args)  throws Exception {
        Synchronization synchronization = new Synchronization();

        CounterThreadClass t1 = new CounterThreadClass(synchronization);

        CounterThreadClass t2 = new CounterThreadClass(synchronization);

 
             t1.start();
             t2.start();
        try{
           t1.join();     
           t2.join();
        }catch(Exception e){
            System.out.println(e);
        }

        System.out.println(synchronization.getCounter());


        //-----------------------------------------------------------------------------

        Bank bank = new Bank();

        Runnable task = ()-> {
            bank.withdraw(50);
        };

        Thread s1 = new Thread(task, "Thread 1");

        Thread s2 = new Thread(task, "Thread 2");


        s1.start();
        s2.start();


        s1.join();

        s2.join();
        
        
     }

}
