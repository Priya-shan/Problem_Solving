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
public class remove_duplicates {
    public static void main(String args[]){
        remove_duplicates_Solution obj=new remove_duplicates_Solution();
        System.out.println(obj.remove("helooooo!"));
    }
}
class remove_duplicates_Solution{
    public String remove(String str){
        List<Character> lst=new ArrayList<>();
        for(char ch:str.toCharArray()){
            if(lst.contains(ch))
                continue;
            lst.add(ch);
            //set.add(ch);
        }
        String res="";
        for(char ch:lst){
            res+=ch;
        }
        return res;
    }
}