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
public class Q08_count_zero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int len=Integer.toString(n).length();
        System.out.println(count0(n,0));
    }
    public static int count0(int n,int cnt){
        if(n==0){
            return cnt;
        }
        int a=n%10;
        if(a==0){
            cnt++;
        }
        return count0(n/10,cnt);
    }
}
