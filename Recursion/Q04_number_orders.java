/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

/**
 *
 * @author welcom
 */
public class Q04_number_orders {
    public static void main(String[] args) {
        int n=5;
        print_1ton(n);
        System.out.println("---------------------------");
        print_nto1(n);
        System.out.println("---------------------------");
        print_both(n);
    }
    public static void print_nto1(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print_nto1(n-1);
    }
    public static void print_1ton(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        print_1ton(n-1);
        System.out.println(n);
    }
    public static void print_both(int n){
        System.out.println(n);
        if(n==1){
            System.out.println(n);
            return;
        }
        
        print_both(n-1);
        System.out.println(n);
    }
}
