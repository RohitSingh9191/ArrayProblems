package Multithreading;

public class VertualThreads {

    public static void main(String[] args) {

        Thread t = Thread.startVirtualThread(() -> {
            System.out.println("Vertual Threds runnig 1");
        });

        try{
        t.join();
        }catch(Exception e){

        }

        Thread t2 = Thread.ofVirtual().start(() -> {
            System.out.println("Vertual Threds runnig 2");
        });

        try {
            t2.join();
            t.join();
        } catch (Exception e) {

        }

    }

}
