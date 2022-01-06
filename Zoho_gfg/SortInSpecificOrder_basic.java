/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zoho_gfg;

import java.util.*;

/**
 *
 * @author welcom
 */
public class SortInSpecificOrder_basic {
     public static void main(String args[]){
        SortInSpecificOrderSolution obj=new SortInSpecificOrderSolution();
        long[] arr={1, 2, 3, 5, 4, 7, 10};
        obj.sortIt(arr,arr.length);
         System.out.println(Arrays.toString(arr));
    }
}
class SortInSpecificOrderSolution{
    public void sortIt(long arr[], long n)
    {
        //code here.
        int evencnt=0,oddcnt=0;
        for(long num:arr)
            if(num%2==0)
                evencnt++;
            else
                oddcnt++;
        long[] odd=new long[oddcnt];
        long[] even=new long[evencnt];
        
        int index1=0,index2=0;
        for(long num:arr)
            if(num%2==0)
                even[index1++]=num;
            else
                odd[index2++]=num;
        
        Arrays.sort(odd);
        Arrays.sort(even);
        //System.out.println(Arrays.toString(odd));
        //System.out.println(Arrays.toString(even));
        int oddindex=odd.length-1,evenindex=0,index=0;
        
            while(oddindex>=0){
                arr[index++]=odd[oddindex--];
            }
            int el=even.length;
            //System.out.println(el + " "+index+ " "+evenindex);
            while(el>0){
              arr[index++]=even[evenindex++];
              el--;
            }
    }
}