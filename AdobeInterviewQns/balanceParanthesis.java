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
public class balanceParanthesis {
    public static void main(String args[]){
        Stack<Character> st=new Stack<Character>();
        String str="([a+b]-{ab)";
        
        for(char ch:str.toCharArray()){
            if(ch=='('||ch=='{'||ch=='['||ch=='<')
                st.push(ch);
            
            if(ch==')'||ch=='}'||ch==']'||ch=='>'){
                
                if(st.isEmpty()){
                    System.out.println("unbalanced");
                    return;
                }
                char top=st.pop();
                if(ch==')' && top!='(' || ch=='}' && top!='{' || ch==']' && top!='[' || ch=='>' && top!='<'){
                    System.out.println("false");
                    return;
                }
            }
        }
        if(st.isEmpty()){
            System.out.println("balanced");
        }
        else{
            System.out.println("Not balanced");
        }
    }
}
