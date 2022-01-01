/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zoho_gfg;

import java.util.*;

/**
 * Just store the vowels in a separate string vow in the order in which 
 * they appear in string S. Then, traverse the string S in reverse while placing
 * the vowels that you stored in vow.
 */
public class Reversing_Vowels {
    public static void main(String args[]){
        Solution obj=new Solution();
        System.out.println(obj.modify("practise"));
    }
}

class Solution
{
    String modify (String s)
    {
         StringBuilder ss=new StringBuilder(s);
        String vow="";
        for(char ch:s.toCharArray()){
            if(isVowel(ch)){
                vow+=ch;
            }
        }
        char ch;
        int c=0;
        for(int i=ss.length()-1;i>=0;i--){
            ch=s.charAt(i);
            if(isVowel(ch)){
                ss.setCharAt(i, vow.charAt(c++));
            }
        }
        return ss.toString();
    }
    boolean isVowel(char ch){
        if(ch=='a' || ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'||
                ch=='A' || ch=='E'|| ch=='I'|| ch=='O'|| ch=='U')
            return true;
        return false;
    }
}