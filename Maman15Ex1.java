/* name: yaron yannay id:031996515
 */ 
package maman.pkg15.ex1;


public class Maman15Ex1 {

    
    public static void main(String[] args) {
       final int m = 1000, n = 10;
       String msg="";
       Controller myControler = new Controller(n,m);
       // run 1000 threads each decides if one number is prime
       // only 10 thread simultaneously
       for(int i=1; i<=m;i++)
       {
           // notice controller that there is one more active thread
            myControler.addThread();
            // wait if there are 10 active threads
            myControler.waitForThread();
            // run thread
           (new ProducePrime(i,myControler)).start();
           
       }
       // barier 
       myControler.waitForAll();
       // print results
       msg=myControler.toString();
       System.out.printf("Prime numbers are:\n");
       System.out.printf("%s",msg);
       
       
    }
    
   
}
