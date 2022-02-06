/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringManipulation;

import java.util.Stack;

/**
 *
 * @author welcom
 */
public class reverse_order {
    public static void main(String args[]){
        reverse_order_Solution obj=new reverse_order_Solution();
        System.out.println(obj.rev("i practise hindi"));
    }
}
class reverse_order_Solution{
    public String rev(String str){
        Stack<String> st=new Stack<>();
        String[] sarr=str.split(" ");
        for(String s:sarr){
            st.push(s);
        }
        /* String temp="";
        for(char ch:str.toCharArray()){
            if(ch==' '){
                st.push(temp);
                temp="";
            }
            else{
                temp+=ch;
            }
        }
        st.push(temp);*/
        String res="";
        while(!st.isEmpty()){
            res+=st.pop();
            res+=" ";
        }
        return res.trim();
    }
}