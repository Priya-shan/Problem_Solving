/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zoho_OnCampus;

import java.util.*;

/*
Rearrange a given array in-place such that all the negative numbers occurs
before positive numbers maintain the order of all negative and positive numbers
as given in the original array 

example 
input 
4
-3 3 - 2 2
5
2 - 4 7 - 3 4
Output
- 3 - 2 3 2
-4 -3 2 7 4
 */
public class Rearrange_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in).useDelimiter("\n");
        int n=sc.nextInt();
        String str=sc.next();
        String[] sarr =str.split(" ");
       int[] arr=new int[sarr.length];
       int index=0;
       for(String s:sarr){
           arr[index++]=Integer.parseInt(s);
       }
       
       
       int negcnt=0;
       int poscnt=0;
       
       for(int i:arr){
           if(i<0)
               negcnt++;
           else
               poscnt++;
       }
       int[] negarr=new int[negcnt];
       int[] posarr=new int[poscnt];
       int idx1=0;
       int idx2=0;
       for(int i:arr){
           if(i<0)
               negarr[idx1++]=i;
           else
               posarr[idx2++]=i;
       }
        
       int[] res=new int[arr.length];
       int idx3=0;
       for(int i=0;i<negarr.length;i++){
           res[idx3++]=negarr[i];
       }
       
       
       for(int i=0;i<posarr.length;i++){
           res[idx3++]=posarr[i];
       }
        System.out.println(Arrays.toString(res));
       
       
    }
}
