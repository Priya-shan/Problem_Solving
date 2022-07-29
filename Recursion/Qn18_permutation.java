/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

import java.util.*;
import java.util.Scanner;

/**
 *
 * @author welcom
 */
public class Qn18_permutation {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
         System.out.println(permutation("",s));
         System.out.println(count_permutation("",s));
        //System.out.println(subseq_ascii("",s));
    }
    public static ArrayList<String> permutation(String p,String up){
        ArrayList<String> lst=new ArrayList<>();
        if(up.length()==0){
            lst.add(p);
            return lst;
        }
        int noc=p.length();
         char ch=up.charAt(0);
        for(int i=0;i<=noc;i++){
            String f=p.substring(0,i);
            String s=p.substring(i,noc);
            lst.addAll(permutation(f+ch+s,up.substring(1)));
            }
        return lst;
    }
    public static int count_permutation(String p,String up){
        //ArrayList<String> lst=new ArrayList<>();
        if(up.length()==0){
            return 1;
        }
        int noc=p.length();
         char ch=up.charAt(0);
         int cnt=0;
        for(int i=0;i<=noc;i++){
            String f=p.substring(0,i);
            String s=p.substring(i,noc);
            cnt=cnt+ count_permutation(f+ch+s,up.substring(1));
            }
        //return lst;
       return cnt;
    }
}
