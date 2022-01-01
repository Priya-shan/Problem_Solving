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
public class balancedParanthesis {

    public static void main(String args[]) {

        String str = "(A(B+C-(D+E)))";
        balancedParanthesis obj = new balancedParanthesis();
        boolean res = obj.isBalanced(str);
        System.out.println(res);

    }

    public boolean isBalanced(String str) {
        Stack<Character> st = new Stack<>();
        for (char ch : str.toCharArray()) {
            if (ch == '(')
                st.push(ch);
            if (ch == ')') {
                if (st.isEmpty()) {
                    return false;
                }
                st.pop();
            }

        }
        if (st.isEmpty())
            return true;
        else
            return false;
    }
}
