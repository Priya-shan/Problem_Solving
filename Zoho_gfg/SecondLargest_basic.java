/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zoho_gfg;

import java.util.*;
import java.util.*;


/**
 *
 * @author welcom
 */
public class SecondLargest_basic {
     public static void main(String args[]){
        SecondLargestSolution obj=new SecondLargestSolution();
        int[] arr={ 2, 4, 9, 6, 7 };
         System.out.println(obj.print2largest(arr));
    }
}
class SecondLargestSolution{
    
  
    public static int print2largest(int[] A){
        int[] numbers=A;
        Set<Integer> set=new HashSet<>();
        int[] B=new int[A.length];
        for(int number:numbers)
          set.add(number);
          
        System.out.println(set);
        if(set.size()<=2)
            return -1;
        Iterator value=set.iterator();
        int index=0;
        while(value.hasNext()){
            B[index]=(int)value.next();
            index++;
        }
        Arrays.sort(B);
        //System.out.println(Arrays.toString(B));
        return B[B.length-2];
    }
}