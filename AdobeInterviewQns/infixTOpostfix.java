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
public class infixTOpostfix {

    public static void main(String args[]) {
        Solution s=new Solution();
        System.out.println(s.infixtopostfix("a+b*(c^d-e)^(f+g*h)-i"));
    }
}

class Solution {

    static int prec(char ch) {

        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }
    
    public String infixtopostfix(String str){
        String res="";
        Stack<Character> st=new Stack<>();
        for(char ch:str.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                res=res+ch;
                System.out.println(res);
            }
            else if(ch=='('){
                st.push(ch);
            }
            else if(ch==')'){
                while(!st.isEmpty() && st.peek()!='('){
                    res=res+st.pop();
                    System.out.println(res);
                }
                st.pop();
            }
            else{
                while(!st.isEmpty() && prec(ch)<=prec(st.peek())){
                    res=res+st.pop();
                    System.out.println(res);
                }
                st.push(ch);
            }
        }
        while(!st.isEmpty()){
            if(st.peek()=='('){
                ///System.out.println();
                return "invalid expression";
            }
            res=res+st.pop();
            System.out.println(res);
        }
        return res;
    }
}
