/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms_Searching;

/**
 *
 * @author welcom
 */
public class BinarySearch {

    public int search(int[] arr,int k,int left,int right) {
        if(left>right){
            return -1;
        }
        int middle=(left+right)/2;
        //System.out.println("middle"+middle);
        if(k==arr[middle]){
           // System.out.println("im in");
        return middle;
        }
        else if(k<arr[middle]){
            return search(arr,k,left,middle-1);
        }
        else{
           return search(arr,k,middle+1,right);
        }
        
    }
}
