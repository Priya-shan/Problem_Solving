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
public class Q02_fibo_series {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println(fibo(i));
        }
    }
    public static int fibo(int n){
        if(n==0||n==1){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
}
