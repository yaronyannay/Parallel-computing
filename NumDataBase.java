/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maman.pkg15.ex1;
import java.util.ArrayList;

/**
 *
 * @author me
 */
public class NumDataBase {
    private ArrayList<Prime>  MyList=new  ArrayList<Prime>();
    // private ArrayList<digit> myNumber = new ArrayList<digit>();  
    public NumDataBase(int m){
        int startNum=1;
        for (int i=startNum;i<=m;i++){
            Prime primeToAdd= new Prime(i);
            MyList.add(primeToAdd);
        }
            
    }

   
    
    public int returnSize(){
        return this.MyList.size();
    }
    
     public Prime getItem(int i){
        return this.MyList.get(i);
    }
    
    
}
