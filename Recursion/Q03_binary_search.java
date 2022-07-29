/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

import java.util.Scanner;

/**
 *
 * @author welcom
 */
public class Q03_binary_search {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={1,4,8,12,16,45,99};
        int k=sc.nextInt();
        System.out.println(binarySearch(arr,k,0,arr.length-1));
    }
    public static int binarySearch(int[] arr,int k,int start,int end){
        int mid=(start+end)/2;
        if(start>end){
            return -1;
        }
        if(arr[mid]==k){
            return mid;
        }
        else if(k<arr[mid]){
            return binarySearch(arr,k,start,mid-1);
        }
        return binarySearch(arr,k,mid+1,end);
        
    }
}
