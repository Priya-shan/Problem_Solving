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
public class BeautifulFunctions {
    public static void main(String[] args){
        BeautifulFunctions_Solution obj =new BeautifulFunctions_Solution();
        Scanner scan = new Scanner(System.in);
        int N=scan.nextInt();
        System.out.print(obj.beautifulFunction(N));
    }
}

class BeautifulFunctions_Solution{
 public static int beautifulFunction(int n){
        int cnt=0;
        while(n/10!=0){
            while(n%10!=0){
                cnt=cnt+1;
                n=n+1;
            }
            String s1=removetrailingzeros(Integer.toString(n));
            n=Integer.parseInt(s1);
        }
        return cnt+9;
    }
public static String removetrailingzeros(String s){
        if(s==""){
            return "";
        }
        String original=s;
        StringBuilder sb=new StringBuilder(s);
        sb=sb.reverse();
        String str=sb.toString();
        int cnt=0;
        for(char ch:str.toCharArray()){
            if(ch=='0'){
                cnt++;
            }
            else{
                break;
            }
        }
        if(cnt==0){
            return original;
        }
        else{
            return original.substring(0,original.length()-cnt);
        }
    } 
}