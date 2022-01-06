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
public class MakeADistinctDigitArray_basic {
     public static void main(String args[]){
        MakeADistinctDigitArraySolution obj=new MakeADistinctDigitArraySolution();
        int[] arr={131, 11, 48};
        System.out.println(Arrays.toString(obj.common_digits(arr)));
    }
}
class MakeADistinctDigitArraySolution{
    public int[] common_digits(int[] nums)
    {
        // code here
        List<Integer> lst=new ArrayList<>();
        int rem;
        for(int number : nums){
            while(number>0){
                rem=number%10;
                number=number/10;
                lst.add(rem);
            }
        }
        Set<Integer> set=new HashSet<>();
        
        for(int i:lst)
            set.add(i);
        //System.out.println(set);
        int[] arr=new int[set.size()];
        int index=0;
        for(int i:set)
            arr[index++]=i;
        //System.out.println(Arrays.toString(arr));
        return arr;
    }
}