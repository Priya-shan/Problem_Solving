/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Infytq;

import java.util.*;
import java.util.stream.IntStream;

/**
 *
 * @author welcom
 */
public class GreatSum {
    public static void main(String args[]){
        GreatSum_Solution obj=new GreatSum_Solution();
        int[] arr={-1, 1, 0, 0, 2, -2};
        int r=4;
        System.out.println(obj.getGreatSum(arr,r));
        
    }
}
class GreatSum_Solution{
    public int getGreatSum(int [] arr,int r){
        List<String> combi=new ArrayList<>();
        int cnt=0;
        combi=getCombiArray(arr,arr.length,r,combi);
        for(String s : combi){
            String[] arr1 = s.split(",");
            int sum=0;
            for(String ch:arr1){
                sum=sum+Integer.parseInt(ch);
            }
            if(sum==0)
                cnt++;
        }
        return cnt;
    }
    
    static List<String> getCombiArray(int arr[], int n, int r,List<String> combi)
    {
        int data[]=new int[r];
        combinationUtil(arr, data, 0, n-1, 0, r,combi);
        System.out.println(combi);
        return combi;
    }
    
    static void combinationUtil(int arr[], int data[], int start,
                                int end, int index, int r,List<String> combi)
    {
        if (index == r)
        {
            String res="";
            for (int j=0; j<r; j++)
                res=res+data[j]+",";
            combi.add(res);
            return;
        }
        for (int i=start; i<=end && end-i+1 >= r-index; i++)
        {
            data[index] = arr[i];
            combinationUtil(arr, data, i+1, end, index+1, r,combi);
        }
    }
 
   
    
}



/* arr[]  ---> Input Array
   n      ---> Size of input array
   r      ---> Size of a combination to be printed
   index  ---> Current index in data[]
   data[] ---> Temporary array to store current combination
   i      ---> index of current element in arr[]     */
