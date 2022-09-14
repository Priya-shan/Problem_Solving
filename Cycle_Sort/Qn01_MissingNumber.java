/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Cycle_Sort;

/**
 *
 * @author Shanmuga Priya M
 */
public class Qn01_MissingNumber {
    public static void main(String[] args) {
        int[] arr={9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(arr));
    }
public static int missingNumber(int[] arr) {
        int i=0;
        while(i<arr.length){
            int currsidx=arr[i];
            if(currsidx>=arr.length){
                i++;
                continue;
            }
            if(arr[i]!=arr[currsidx]){
                swap(arr,i,currsidx);
            }
            else{
                i++;
            }
        }
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=j){
                return j;
            }
        }
        return arr.length;
    }
    static void swap(int[] arr,int i,int curr){
        int temp=arr[i];
        arr[i]=arr[curr];
        arr[curr]=temp;
    }
}