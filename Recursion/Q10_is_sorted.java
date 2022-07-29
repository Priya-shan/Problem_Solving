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
public class Q10_is_sorted {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={12,18,1,85,99};
        System.out.println(check(arr,0));
    }
    public static boolean check(int[] arr,int idx){
        if(idx==arr.length-1){
            return true;
        }
        if(arr[idx]>arr[idx+1]){
            return false;
        }
        return check(arr,++idx);
        
    }
}
