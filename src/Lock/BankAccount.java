package Lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private int balance = 100;

    private Lock lock = new ReentrantLock();

    public synchronized void withdraw(double amount) {

        lock.lockInterruptibly();
        System.out.println(Thread.currentThread().getName() + " attemplting to withraw " + amount);
        try {
            if (lock.tryLock(1000, TimeUnit.MICROSECONDS)) {
                if (balance >= amount) {
                    System.out.println(Thread.currentThread().getName() + " proceeding with withdrawal ");
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        System.out.println(e);
                    }
                    balance -= amount;
                    System.out.println(Thread.currentThread().getName() + " remains balance is: " + balance);

                } else {
                    System.out.println(Thread.currentThread().getName() + " insufficient balance ");
                }
            } else {

            }

        } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
        }finally{
            lock.unlock();
        }

    }
}
