/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdobeInterviewQns;

import java.util.Stack;

/**
 *
 * @author welcom
 */
public class postfixTOinfix {
    public static void main(String args[]) {
        Solution1 s=new Solution1();
        System.out.println(s.postfixtoinfix("ab*c+"));
    }
}
class Solution1 {    
    public String postfixtoinfix(String str){
        String res="";
        Stack<String> st=new Stack<>();
        for(char ch:str.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                st.push(ch+"");
            }
            else{
                String op1=st.pop();
                String op2=st.pop();
                st.push("("+op2+""+ch+""+op1+")");
            }
        
    }
        return st.peek();
}
}

