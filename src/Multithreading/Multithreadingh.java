package Multithreading;
public class Multithreadingh {
    public static void main(String[] args) {
         World world = new World();  //NEW
         Thread thread = new Thread(world);
        thread.start(); //RUNNABLE
        for(;  ;){
        System.out.println("Hello");
        } 
        
    }

    static class World implements Runnable {
 
        public void run(){  
            for(;  ; ){ // RUNNING
                System.out.println("Word");
            }  // TERMINATED
        }
    }
}

    // static class World extends Thread{
 
    //     public void run(){
    //         for(;  ; ){
    //             System.out.println("Word");
    //         }
    //     }
    // }
