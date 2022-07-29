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
public class Q06_sum_of_digits {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int len=Integer.toString(n).length();
        System.out.println(digiSum(n,len));
    }
    public static int digiSum(int n,int len){
        if(len==1){
            return n;
        }
        int a=n%10;
        return a+digiSum(n/10,len-1);
        
    }
}
