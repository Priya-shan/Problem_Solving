/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Cycle_Sort;

import java.util.Arrays;
/**
 *
 * @author Shanmuga Priya M
 */
public class Cycle_Sort {
    public static void main(String[] args) {
        int[] arr={3,5,2,1,4};
        Cycle_sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void Cycle_sort(int[] arr){
        int i=0;
        while(i<arr.length){
            int curr=arr[i]-1;
            if(arr[curr]!=arr[i]){
                swap(i,curr,arr);
            }
            else{
                i++;
            }
        }
    }

    private static void swap(int a, int b,int[] arr){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
