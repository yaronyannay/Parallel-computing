/* name: yaron yannay id:031996515
 */ 
package maman.pkg15.ex1;


public class Prime {
    int num;
    boolean isPrime=true;
    
    public Prime(int num){
        this.num=num;
    }
    
    // check if number is prime
     public void checkIfPrime(){
        if ((this.num==1)||(this.num==2))
            this.isPrime= true;
        
        for (int i=this.num-1; i>=2;i--){ 
            if (this.num%i==0)
                this.isPrime= false;
        }
      
    }
     
     public int getNum(){ 
         return this.num;
     }
    
     public boolean getIsPrime(){ 
         return this.isPrime;
     }
}
