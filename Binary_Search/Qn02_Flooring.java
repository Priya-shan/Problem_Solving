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

//https://practice.geeksforgeeks.org/problems/ceil-the-floor2802/0

public class Qn02_Flooring {
    public static void main(String[] args) {
        int[] arr = {74, 1, 66, 82, 93, 79, 20, 17, 25};
        Arrays.sort(arr);
        int t = 0;
        System.out.println(findCieling(arr, t));
    }
    private static int findCieling(int[] arr, int t) {
        if(arr[0]>t){
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        int mid=0;
        while (start <= end) {
             mid= (start + end) / 2;
            if (arr[mid] == t) {
                return arr[mid];
            } else if (arr[mid]>t) {
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return arr[end];
    }
}
