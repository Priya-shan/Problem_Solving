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
public class most_repeated {
    public static void main(String args[]){
        most_repeated_Solution obj=new most_repeated_Solution();
        System.out.println(obj.getMostRepChar("helllllllllllloooo"));
    }
}
class most_repeated_Solution{
    public char getMostRepChar(String str){
        Map<Character,Integer> hmap=new HashMap<>();
        int count;
        for(char ch:str.toCharArray()){
            if(hmap.containsKey(ch))
                count=hmap.get(ch);
            else
                count=0;
            hmap.put(ch, count+1);
        }
        System.out.println(hmap);
        int max=0;
        char res=' ';
        for(char ch:str.toCharArray()){
            if(hmap.get(ch)>max)
            {
                max=hmap.get(ch);
                res=ch;
            }
        }
        return res;
    }
}