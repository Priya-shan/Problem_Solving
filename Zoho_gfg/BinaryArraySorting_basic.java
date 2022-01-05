/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zoho_gfg;

import java.util.Arrays;

/**
 *
 * @author welcom
 */
public class BinaryArraySorting_basic {
    public static void main(String args[]){
        BinaryArrSortingSolution obj=new BinaryArrSortingSolution();
        int[] arr={1, 0, 1, 1, 1, 1, 1, 0, 0, 0};
        arr=obj.SortBinaryArray(arr,arr.length);
        System.out.println(Arrays.toString(arr));
                
    }
}
class BinaryArrSortingSolution{
    static int[] SortBinaryArray(int arr[], int n) 
	{ 
	    int ptr1=0;
        int ptr2=n-1;
        
        while(ptr1<ptr2){
        if(arr[ptr1]==0)
            ptr1++;
        else if(arr[ptr2]==1)
            ptr2--;
        else{
            swap(arr,ptr1,ptr2);
            ptr1++;
            ptr2--;
        }
        }
        return arr;
	}
	private static void swap(int[] a,int x,int y){
        int temp;
        temp=a[x];
        a[x]=a[y];
        a[y]=temp;
    }
}