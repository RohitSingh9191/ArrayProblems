package Multithreading;

public class ThreadMethods extends Thread{

    public void run() { //Method 2
            System.out.println("Thread is running......");

            for(int i =1 ; i<10 ; i++){
                try{
                Thread.sleep(1000); //Method 3
                System.out.println(i);
                }
                catch(InterruptedException e){
                    System.out.println(e);
                }

            }
    }

        public static void main(String[] args) throws InterruptedException{
                ThreadMethods t1 = new ThreadMethods();
                t1.start(); // Method 1
                t1.join(); // Method 4
                System.out.println("Main thread is Run");
        }
}
