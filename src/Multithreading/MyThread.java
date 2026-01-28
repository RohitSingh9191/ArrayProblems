package Multithreading;
public class MyThread extends Thread  {

    @Override
    public void run(){
            System.out.println("Runnign Run");

            try {
            Thread.sleep(2000);
            System.out.println("Continue");
            } catch(InterruptedException e){
                System.out.println(e);
            }
    }
    public static void main(String[] args) throws InterruptedException{

        MyThread t1 = new MyThread(); // NEW
        System.out.println(t1.getState());

        t1.start(); // RUNNABLE
        System.out.println(t1.getState());

        // System.out.println(Thread.currentThread().getState());// RUNNABLE

        Thread.sleep(1000);
        //t1 is on wait for 2 sec use sleep
        
        

        t1.join();
        System.out.println(t1.getState()); //TERMINATED
    }
}


