/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Binary_Search;

import java.util.Arrays;

/**
 *
 * @author Shanmuga Priya M
 */
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
public class Qn04_First_Last_Positions {

    public static void main(String[] args) {
        int[] arr = {5, 7, 7,7, 8, 8, 10};
        int t = 7;
        int[] res = {-1, -1};
        res[0] = findRange(arr, t, true);
        if(res[0]!=-1){
            res[1] = findRange(arr, t, false);
        }
        System.out.println(Arrays.toString(res));
    }

    private static int findRange(int[] arr, int t, boolean findStartIndex) {

        int start = 0;
        int end = arr.length - 1;
        int mid;
        int ans=0;
        while (start <= end) {
            mid = (start + end) / 2;
            if (arr[mid] > t) {
                end = mid - 1;
            } 
            else if (arr[mid] < t) {
                start = mid + 1;
            } 
            else {
                ans=mid;
                if(findStartIndex){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return ans;

    }
}
