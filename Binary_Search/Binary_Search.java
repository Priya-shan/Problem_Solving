/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Binary_Search;

/**
 *
 * @author Shanmuga Priya M
 */
public class Binary_Search {
    public static void main(String[] args) {
        int[] arr={11,23,32,44,99,104,234,333};
        int k=44;
        System.out.println(Binary_Search_Iteration(arr,k));
        System.out.println(Binary_Search_Recursion(arr,k,0,arr.length-1));
        
    }
    public static int Binary_Search_Iteration(int[] arr,int k){
        int start=0;
        int end=arr.length-1;
        int mid;
        while(start<=end){
            mid=(start+end)/2;
            if(arr[mid]==k){
                return mid;
            }
            else if(arr[mid]>k){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
    public static int Binary_Search_Recursion(int[] arr,int k,int start,int end){
        if(start>end){
            return -1;
        }
        int mid=(start+end)/2;
        if(arr[mid]==k){
            return mid;
        }
        else if(arr[mid]>k){
            return Binary_Search_Recursion(arr,k,start,mid-1);
        }
        else{
            return Binary_Search_Recursion(arr,k,mid+1,end);
        }
    }
    
}
