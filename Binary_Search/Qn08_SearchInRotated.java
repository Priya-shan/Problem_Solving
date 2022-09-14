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
//https://leetcode.com/problems/search-in-rotated-sorted-array/
public class Qn08_SearchInRotated {

    public static void main(String[] args) {
        int[] arr = {4,4,5,6,7,7,8,0,1,2};
        int k = 7;
        System.out.println(search(arr, k));
    }

    private static int search(int[] arr, int k) {
        int pivot = findPivot(arr);
        if(pivot==-1){
            return ApplyAscBS(arr,k,0,arr.length-1);
        }
        System.out.println(pivot);
        int res=ApplyAscBS(arr,k,0,pivot);
        if(res==-1){
            res=ApplyAscBS(arr,k,pivot+1,arr.length-1);
        }
        return res;
    }

    private static int findPivot(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while(start!=end){
            int mid=(start+end)/2;
            System.out.println("seq "+start+" "+mid+" "+end);
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                System.out.println("founddd "+mid);
                return mid;
            }
            else if(arr[start]<arr[mid]){
                start=mid;
            }
            else if(arr[end]>arr[mid]){
                end=mid;
            }
            else{
                
            }
        }
        
        return -1;
    }

   private static int ApplyAscBS(int[] arr, int k, int start, int end) {
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
}
