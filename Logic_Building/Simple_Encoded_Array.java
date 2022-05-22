/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic_Building;

import java.util.*;

/**
 *
 * @author welcom
 */
public class Simple_Encoded_Array {
    public static void main(String args[]){
        int[] arr={35,32,62,68,35,90,132,75,119,168,150,136,127,148,170,137,63,19};
        System.out.println("Encoded Array : "+Arrays.toString(arr));
        List<Integer> lst=new ArrayList<>();
        lst.add(arr[arr.length-1]);
        int el;
        for(int i=arr.length-2;i>=0;i--){
            el=arr[i]-lst.get(lst.size()-1);
            lst.add(el);
        }
       
        Collections.reverse(lst);
        System.out.println("Original Array : "+lst);
        System.out.println("First number in the original array : "+lst.get(0));
        int sum=0;
        for(int i:lst){
            sum+=i;
        }
        System.out.println("Sum of all numbers in original array : "+sum);
    } 
}
