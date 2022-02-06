/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringManipulation;

/**
 *
 * @author welcom
 */
public class palindrome {
    public static void main(String args[]){
        palindrome_Solution obj=new palindrome_Solution();
        System.out.println(obj.isPal("mom"));
    }
}
class palindrome_Solution{
    public boolean isPal(String str){
        StringBuilder sb=new StringBuilder(str);
        if(str.equalsIgnoreCase(sb.reverse().toString()))
            return true;
        return false;
    }
}