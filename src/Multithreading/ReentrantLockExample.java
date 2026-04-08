package Multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample {

    private final Lock lock = new ReentrantLock();

    public void outerCell() {

        lock.lock();
        try {
            System.out.println("Outer Cell Call");
            innerCell();
        } finally {
            lock.unlock();
        }

    }

    public void innerCell() {

        lock.lock();
        try {
            System.out.println("Inner Cell Call");
        } finally {
            lock.unlock();
        }

    }

    public static void main(String[] args) {

        ReentrantLockExample t1 = new ReentrantLockExample();

        t1.outerCell();

        // Runnable run = ()->{
        // t1.outerCell();
        // };

        // Thread thread1 = new Thread(run);

        // Thread thread2 = new Thread(run);

        // thread1.start();

        // thread2.start();

        // try{

        // thread1.join();

        // thread2.join();
        // } catch(Exception e){}

    }

}
