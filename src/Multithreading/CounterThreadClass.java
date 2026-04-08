package Multithreading;

public class CounterThreadClass extends Thread{

    private Synchronization synchronization;

    public CounterThreadClass(Synchronization synchronization){
        this.synchronization = synchronization;
    }

    public void run(){
        for(int i = 0; i < 10000 ; i++){
                synchronization.increment();
        }
    }


}
