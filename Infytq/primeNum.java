/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Infytq;

import java.util.Scanner;

/**
 *
 * @author welcom
 */
public class primeNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //int n=sc.nextInt();
        /*int flag=0;
        for(int i=2;i<n;i++){
            if(n%i==0){
                flag=1;
            }
        }
        if(flag==0){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }*/
        
        /*for(int i=2;i<=n;i++){
            int flag=0;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    flag=1;
                }
            }
            if(flag==0){
                System.out.print(i+" ");
            }
        }*/
        int a=23;
        int b=33;
        
        a=a+b;
        b=a-b;
        a=a-b;
        
        System.out.println(a+" "+b);
    }
}
