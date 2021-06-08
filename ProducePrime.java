/* name: yaron yannay id:031996515
 */ 
package maman.pkg15.ex1;


public  class  ProducePrime extends Thread{
   
    private Controller primeController;
    private int numTocheck;
    
    
    public ProducePrime(int num, Controller myController){
        this.primeController=myController;
        Prime myNum = new Prime(num);
        this.numTocheck=num;
} 
     public void run()
    {
           Prime FindPrime;
           // update 
           Prime findIfThisNumIsPrime;
           FindPrime=primeController.getNum(numTocheck-1);
           FindPrime.checkIfPrime();
           primeController.finished();
    }
     
    
}
