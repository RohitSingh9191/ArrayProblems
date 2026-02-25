package Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWritelockExample {

    private int count = 0;

    private final ReadWriteLock readWritelock =  new ReentrantReadWriteLock();

    private final Lock readlock = readWritelock.readLock();

    private final Lock writelock = readWritelock.writeLock();

    public void increment(){
        writelock.lock();
        try{
            count++;
        }finally{
            writelock.unlock();
        }
    }
    
    public int getCount(){
        readlock.lock();
        try{
            return count;
        }finally{
            readlock.unlock();
        }
    }
        
        
        public static void main(String[] args) {
                
            }

}
