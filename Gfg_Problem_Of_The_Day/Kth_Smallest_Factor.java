/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gfg_Problem_Of_The_Day;

import java.util.Arrays;

/**
 *
 * @author welcom
 */
public class Kth_Smallest_Factor {

    public static void main(String args[]) {
        Kth_Smallest_Factor_Solution obj = new Kth_Smallest_Factor_Solution();
        System.out.println(obj.kThSmallestFactor(4, 3));
    }
}

class Kth_Smallest_Factor_Solution {

    static int kThSmallestFactor(int n, int k) {
        int [] factors=new int[n];
        
        factors=getFactors(n);
        if(k<=factors.length){
            return factors[k-1];
        }
        return -1;
    }
    
    int[] getFactors(int n){
        int [] factors=new int[n];
        int [] factorss=new int[n];
        factors[0]=1;
        int i=2,c=1;
        while(i<=n){
            if(n%i==0){
                factors[c++]=i;
            }
            i++;
        }
        factorss=Arrays.copyOfRange(factors, 0, c);
        System.out.println(Arrays.toString(factorss));
        return factorss;
    }
}
