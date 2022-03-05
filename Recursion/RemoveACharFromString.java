/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

/**
 *
 * @author welcom
 */

//abbacda -> bbcd
public class RemoveACharFromString {
    public static void main(String args[]){
       RemoveACharFromString_solution obj=new RemoveACharFromString_solution();
       String s="abbacda";
        System.out.println(obj.alter(s,""));
               
   } 
}
class RemoveACharFromString_solution{
    public String alter(String s,String res){
    if(s.length()==0){
        return res;
    }
    char ch=s.charAt(0);
    if(ch=='a'){
        return alter(s.substring(1),res);
    }
    else{
        return alter(s.substring(1),res+ch);
    }
    }
}