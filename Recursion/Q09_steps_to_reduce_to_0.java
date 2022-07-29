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
public class Q09_steps_to_reduce_to_0 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(reduce(n,0));
    }
     public static int reduce(int num,int cnt){
        if(num==0){
            return cnt;
        }
        if(num%2==0){
            return reduce(num/2,++cnt);
        }
        else{
            return reduce(num-1,++cnt);
        }
        
        
    }
}
