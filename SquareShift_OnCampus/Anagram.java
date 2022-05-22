/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SquareShift_OnCampus;

import java.util.*;

/**
 *
 * @author welcom
 */
public class Anagram {
    public static void main(String[] args) {
        String str1 = "heloo";
        String str2 = "oleoh";
        System.out.println(findAnagram(str1,str2));;

    }

    public static String findAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return "false";
        }
        Map<Character,Integer> hmap1=new HashMap<Character,Integer>();
        Map<Character,Integer> hmap2=new HashMap<Character,Integer>();
        int count;
        for(char c:str1.toCharArray()){
            if(hmap1.containsKey(c)){
                count=hmap1.get(c);
            }
            else{
                count=0;
            }
            hmap1.put(c, count+1);
        }
       
        for(char c:str2.toCharArray()){
            if(hmap2.containsKey(c)){
                count=hmap2.get(c);
            }
            else{
                count=0;
            }
            hmap2.put(c, count+1);
        }
       
        for(char c:str1.toCharArray()){
            if(hmap1.get(c)!=hmap2.get(c)){
                return "false";
            }
        }
        return "true";
    }
}
