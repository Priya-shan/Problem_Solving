/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

import java.util.*;

/**
 *
 * @author welcom
 */
public class Qn13_skip_character {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        
        //System.out.println(skip(s,""));
        System.out.println(skip_using_1_arg(s));
        String key="app";
        System.out.println(skip_string(s,key));
    }
    public static String skip(String s,String ans){
        if(s.isEmpty()){
            return ans;
        }
        if(s.charAt(0)=='a'){
            return skip(s.substring(1),ans);
        }
        else{
            return skip(s.substring(1),ans+s.charAt(0));
        }
    }
     public static String skip_using_1_arg(String s){
        if(s.isEmpty()){
            return "";
        }
        char ch=s.charAt(0);
        if(ch=='a'){
            return skip_using_1_arg(s.substring(1));
        }
        else{
            return ch+skip_using_1_arg(s.substring(1));
        }
    }
     public static String skip_string(String s,String key){
       /*if(idx==s.length()-(key.length()-1)){
           return false;
       }
       else if(s.substring(idx, key.length()+idx).equals(key)){
           return true;
       }
       else{
           return skip_string(s,++idx,key);
       }*/
       if(s.isEmpty()){
           return "";
       }
       if(s.startsWith(key) && !s.startsWith("apple")){
           return skip_string(s.substring(key.length()),key);
       }
       else{
           return s.charAt(0)+skip_string(s.substring(1),key);
       }
    }
}
