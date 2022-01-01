/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zoho;

import java.util.*;

/**
 *
 * @author welcom
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
        for(int i=s.length()-1;i>=0;i--){
            ch=s.charAt(i);
            if(ch=='a' || ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'){
                ss.setCharAt(i, vow.charAt(c++));
            }
        }
        return ss.toString();
    }
    boolean isVowel(char ch){
        if(ch=='a' || ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'|| ch=='A' || ch=='E'|| ch=='I'|| ch=='O'|| ch=='U')
            return true;
        return false;
    }
}