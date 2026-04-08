package Multithreading;

import java.util.Currency;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bank {

    int balance = 1000;

    // public synchronized void withdraw(int amoount){

    private Lock lock = new ReentrantLock();

    public void withdraw(int amoount) {

        try {

            if (lock.tryLock(2, TimeUnit.SECONDS)) {

                if (amoount < balance) {

                    System.out.println(Thread.currentThread().getName() + " withdrawling  amount " + amoount);

                    try {
                        Thread.sleep(2000);

                        balance -= amoount;

                        System.out.println(
                                Thread.currentThread().getName() + " withdrawling complited amount " + amoount);

                        System.out.println("Your Balance is " + balance);
                    } catch (Exception e) {
                            Thread.currentThread().interrupt();
                    } finally {
                        lock.unlock();
                    }
                } else {
                    System.out.println("Insuficiant Balance");
                }

            } else {
                System.out.println(Thread.currentThread().getName() + " Thread is not free try after some time ");
            }

        } catch (Exception e) {
             Thread.currentThread().interrupt();
            System.out.println(e);
        }
    }

}
