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

//https://leetcode.com/problems/find-in-mountain-array/

public class Qn07_SearchInMountain {

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 5, 6, 4};
        int k=4;
        System.out.println(search(arr,k));

    }

    private static int search(int[] arr, int k) {
        int peak=findPeak(arr);
        int res=ApplyAscBS(arr,k,0,peak);
        if(res==-1){
            res=ApplyDescBS(arr,k,peak,arr.length-1);
        }
        return res;
    }
    private static int findPeak(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while(start!=end){
            int mid=(start+end)/2;
            if(arr[mid]<arr[mid+1]){
                start=mid+1;
            }
            else if(arr[mid]>arr[mid+1]){
                end=mid;
            }
        }
        return start;
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
    private static int ApplyDescBS(int[] arr, int k, int start, int end) {
        int mid;
        while(start<=end){
            mid=(start+end)/2;
            if(arr[mid]==k){
                return mid;
            }
            else if(arr[mid]<k){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
}
