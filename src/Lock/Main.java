package Lock;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        Runnable task = new Runnable() {
            
            @Override
            public void run(){
                account.withdraw(50);
            }
            
        };

        Thread t1 = new Thread(task, "Thread 1");
        t1.start();
        Thread t2 = new Thread(task, "Thread 2");
        t2.start();
    }

}
