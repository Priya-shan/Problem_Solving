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
public class Q07_reverse_num {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(rev(n));
    }
    public static String rev(int n){
        if(n==0){
            return "";
        }
        int a=n%10;
        return a+""+rev(n/10);
    }
}
