package Multithreading;

public class Synchronization {

    private int counter = 0;

    public synchronized void increment(){
        counter++;
    }

    public int getCounter(){
        return counter;
    }


}
