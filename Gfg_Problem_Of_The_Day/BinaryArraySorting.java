/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gfg_Problem_Of_The_Day;

import java.util.Arrays;

/** #two pointer algorithm
 * Jan-5-2022
 * @author welcom
 */
public class BinaryArraySorting {
    public static void main(String args[]){
        BinaryArraySortingSolution obj=new BinaryArraySortingSolution();
        int[] arr={1, 0, 1, 1, 1, 1, 1, 0, 0, 0};
        obj.binSort(arr,arr.length);
        System.out.println(Arrays.toString(arr));
                
    }
}
class BinaryArraySortingSolution{
    static void binSort(int A[], int N)
    {
        int ptr1=0;
        int ptr2=N-1;
        
        while(ptr1<ptr2){
            if(A[ptr1]==0)
                ptr1++;
            else if(A[ptr2]==1)
                ptr2--;
            else{
                swap(A,ptr1,ptr2);
                ptr1++;
                ptr2--;
            }
        }
    }
    private static void swap(int[] A,int a,int b){
        int temp;
        temp=A[a];
        A[a]=A[b];
        A[b]=temp;
    }
}
