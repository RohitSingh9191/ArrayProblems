package Multithreading;

public class SetPriority extends Thread{

    

    SetPriority(String name){
        super(name);
    }

    public void run(){
        for(int i = 0 ; i < 5 ; i++){
            System.out.println(Thread.currentThread().getName() + " Priorirty: " + Thread.currentThread().getPriority() + " Count: " + i );
            try{
                Thread.sleep(1000);
            }catch(Exception e){

            }
        System.out.println("======================= ");
        Thread.yield(); // use for give time to all theaeds

        }
    }

    public static void main(String[] args) {
        SetPriority t1 = new SetPriority("Low PRIORITY");
        SetPriority t2 = new SetPriority("Medium PRIORITY");
        SetPriority t3 = new SetPriority("high PRIORITY");

        t1.setPriority(MIN_PRIORITY);
        t2.setPriority(NORM_PRIORITY);
        t3.setPriority(MAX_PRIORITY);
        t1.start();

          t1.interrupt();

         t2.start();
          t3.start();

          MyThread myThread = new MyThread();
          myThread.setDaemon(true);// use to terminate thread when main block is end

          myThread.start();


    }


    static class MyThread extends Thread{

        public void run(){
                while (true) {
                    System.out.println("Hello World.........");
                }
        }

    }

}


