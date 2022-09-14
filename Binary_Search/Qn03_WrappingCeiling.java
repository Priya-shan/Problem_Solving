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
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/

public class Qn03_WrappingCeiling {

    public static void main(String[] args) {
        char[] arr = {'c','f','f','f','j'};
//        Arrays.sort(arr);
        int t = 'f';
        System.out.println(find_W_Cieling(arr, t));
    }
//'c','f','j'
    private static char find_W_Cieling(char[] arr, int t) {
        int start=0;
        int end=arr.length-1;
        int mid;
        while(start<=end){
            mid=(start+end)/2;
            if(arr[mid]>t){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return arr[start%arr.length];
    }
}
