/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Infytq;

import java.io.*;
import java.util.*;
import java.lang.Math;


class Solution {
    public static int CountSubarrays(int N, int X, int Y, String S) {
        // Write your code here
         ArrayList<String>lst=new ArrayList<>();
        subseq("",S,lst);
        int maincnt=0;
        lst.remove(lst.size()-1);
        for(String s:lst){
           int acount=count_a(s);
           int bcount=count_b(s);
            if(acount-bcount>=X && acount-bcount<=Y){
                maincnt++;
            }
        }
          return maincnt%(10^9+7);
    }
    public static int count_a(String s){
        int cnt=0;
        for (char ch:s.toCharArray()){
            if(ch=='A'){
                cnt++;
            }
        }
        return cnt++;
    }
    public static int count_b(String s){
        int cnt=0;
        for (char ch:s.toCharArray()){
            if(ch=='B'){
                cnt++;
            }
        }
        return cnt;
    }
    public static ArrayList<String>subseq(String p,String up,ArrayList<String>lst){
        if(up.length()==0){
            lst.add(p);
            return lst;
        }
        char ch=up.charAt(0);
        subseq(p+ch,up.substring(1),lst);
        subseq(p,up.substring(1),lst);
        return lst;
    }
    
    

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    StringBuilder sb=new StringBuilder("86");
    sb.reverse().toString();
        
    
        System.out.println(sb);
    }
}