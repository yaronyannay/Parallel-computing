/* name: yaron yannay id:031996515
 */ 

package maman.pkg15.ex1;
import java.util.concurrent.locks.*;

/**
 *
 * @author me
 */
public class Controller {
    private int maxThreads, activeThreads;
    private NumDataBase  myDataBase;
     private Lock l;
    private Condition cond;
    
    
    public Controller() {
    }
    
    
    public Controller(int maxThreads, int m) {
        this.maxThreads = maxThreads;
        activeThreads =  0;
       
        myDataBase= new NumDataBase(m);
        l = new ReentrantLock();
        cond = l.newCondition();
        
    }
    
    
    // if there are 10 active threads put thread to wait
     public  void waitForThread()
    {
         l.lock();
        while(activeThreads >= maxThreads)
            try{
               cond.await();
            }
            catch(InterruptedException e){}
         l.unlock();
    }
    
     
     // thread has finished calculations
     public  void finished()
    {
        l.lock();
        activeThreads--;
        cond.signalAll();
        l.unlock();
    }
     
     
     // add thread
     public  void addThread()
    {
        l.lock();
        activeThreads++;
      l.unlock();
    }
     
     
      public String toString()
    {
        String msg = "";
        for(int i=0; i<myDataBase.returnSize()-1; i++){
             if (myDataBase.getItem(i).getIsPrime())
                msg+=myDataBase.getItem(i).getNum()+"\n";
            
        }
            
        return msg;
    }
      
      
      // barier
     public  void waitForAll()
    {
        l.lock();
        while(activeThreads !=0){
            System.out.printf("active thread %d",activeThreads );
           try {
                 cond.await();
            }
            catch(InterruptedException e){}
           
        }
        l.unlock();
    }
   
    public Prime getNum(int i){
        return myDataBase.getItem(i);
    }
    
     public Prime addNum(int i){
        return myDataBase.getItem(i);
    } 
     
}
