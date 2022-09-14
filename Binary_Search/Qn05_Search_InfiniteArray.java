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
//Hints to revise

// start from block size of 2 and increase exponentially

public class Qn05_Search_InfiniteArray {
    public static void main(String[] args) {
        int[] arr={11,23,32,44,99,104,234,333};
        int k=44;
        System.out.println(Search(arr,k));
        
    }

    private static int Search(int[] arr, int k) {
        int start=0;
        int end=1;
        while(arr[end]<k){
            int temp=end+1;
            end=end+(end-start+1)*2;
            start=temp;
        }
        return AppyBS(arr,k,start,end);
    }

    private static int AppyBS(int[] arr, int k, int start, int end) {
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
