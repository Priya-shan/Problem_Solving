/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms_Sorting;

/**
 *
 * @author welcom
 */
public class InsertionSort {
    public void sort(int[] arr) {
        int n = arr.length;
        for(int i=1;i<n;i++){
            int curr=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>curr){
                arr[j+1]=arr[j];
                j--;
            } 
            arr[j+1]=curr;
        }
    }
}
