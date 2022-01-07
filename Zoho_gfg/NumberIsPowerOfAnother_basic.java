/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zoho_gfg;

/**
 *
 * @author welcom
 */
public class NumberIsPowerOfAnother_basic {
    public static void main(String args[]){
        NumberIsPowerOfAnotherSolution obj=new NumberIsPowerOfAnotherSolution();
        System.out.println(obj.isPowerOfAnother((long)100,(long)1));
    }
}
class NumberIsPowerOfAnotherSolution{
    static Long isPowerOfAnother(Long X, Long Y){
        // code here
        
        if(X==1 && Y==1){
            return (long)1;
        }
        if(X==1 && Y!=1)
            return (long)0;
        int i=0;
        while(Math.pow(X,i)<=Y){
            if(Math.pow(X,i)==Y)
                return (long)1;
            else
                i++;
        }
        return (long)0;
    }
}
