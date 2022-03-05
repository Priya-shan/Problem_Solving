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
public class removeSubstringFromString {
    public static void main(String args[]){
       removeSubstringFromString_solution obj=new removeSubstringFromString_solution();
       String s="abbapplecda";
        System.out.println(obj.alter(s,""));
    }
}
class removeSubstringFromString_solution{
    public String alter(String s,String res){
    if(s.length()==0){
        return res;
    }
    if(s.startsWith("apple")){
        return alter(s.substring(5),res);
    }
    else{
        return alter(s.substring(1),res+s.charAt(0));
    }
    }
}
