/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Stack;

/**
 *
 * @author welcom
 */
public class ReverseString {

    public static void main(String args[]) throws Exception{
        String str = null;
        Stack<Character> st = new Stack<>();
        /*String rev="";
    for(int i=0;i<str.length();i++){
        st.push(str.charAt(i));
    }
    for(int i=0;i<str.length();i++){
        rev = rev+st.peek();
        st.pop();
    }
        System.out.println(rev);*/

//Optimised solution

try{
        for (char ch : str.toCharArray()) {
            st.push(ch);
        }
}
catch(Exception e){
    System.out.println("Bad Input Exception");
}
        StringBuffer sbr = new StringBuffer();
        while (!st.isEmpty()) {
            sbr.append(st.pop());

        }
        System.out.println(sbr.toString());
    }
}
