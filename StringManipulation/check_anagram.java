/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringManipulation;

import java.util.*;

/**
 *
 * @author welcom
 */

public class check_anagram {
    public static void main(String args[]){
        check_anagram_Solution obj=new check_anagram_Solution();
        System.out.println(obj.isAanagram("cato","taco"));
    }
}
class check_anagram_Solution{
    public boolean isAanagram(String str1,String str2){
        if(str1==null || str2 == null || str1.length()!=str2.length())
            return false;
      char[] arr1=str1.toLowerCase().toCharArray(); 
      char[] arr2=str2.toLowerCase().toCharArray();
      
      Arrays.sort(arr1);
      Arrays.sort(arr2);
      
      return Arrays.equals(arr1, arr2);
    }
}

/* Map<Character,Integer> hmap1=new HashMap<>();
       Map<Character,Integer> hmap2=new HashMap<>();
       int count;
       for(char ch:str1.toCharArray()){
           if(hmap1.containsKey(ch))
               count=hmap1.get(ch);
           else
               count=0;
           hmap1.put(ch,count+1);
       }
       for(char ch:str2.toCharArray()){
           if(hmap2.containsKey(ch))
               count=hmap2.get(ch);
           else
               count=0;
           hmap2.put(ch,count+1);
       }
       for(char ch:str1.toCharArray()){
           if(hmap1.get(ch)!=hmap2.get(ch))
               return false;
       }
       return true;*/