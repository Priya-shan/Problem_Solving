/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

import java.util.*;

/**
 *
 * @author welcom
 */
public class balancedDiffParan {
    public static void main(String args[]){
     String str = "(A<B+C)-(D+E))";
        balancedParanthesis obj = new balancedParanthesis();
        boolean res = obj.isBalanced(str);
        System.out.println(res);

    }
    
    public boolean isAllBalanced(String str){
    Stack<Character> st = new Stack<>();
        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{' || ch == '<' )
                st.push(ch);
            if (ch == ')' || ch == ']' || ch == '}' || ch == '>' ) {
                
                if (st.isEmpty()) {
                    return false;
                }
                char top=st.pop();
                if((ch==')' && top!='(')|| (ch==']' && top!='[')|| (ch=='}' && top!='{')|| (ch=='>' && top!='<') )
                    return false;
            }

        }
        if (st.isEmpty())
            return true;
        else
            return false;
        
    }
}
