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
public class Qn06_PeakInMountain {
    public static void main(String[] args) {
        int[] arr={1,2,1,3,5,6,4};
        System.out.println(findPeak(arr));
        
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
        return arr[start];
    }
}
