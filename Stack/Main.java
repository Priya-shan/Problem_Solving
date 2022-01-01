/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

/**
 *
 * @author welcom
 */
public class Main {

    public static void main(String args[]) {
        Stackk st = new Stackk();
        
        st.push(10);
        
        st.push(20);
        st.push(30);
        
        st.push(40);
        st.push(50);
        System.out.println(st);
        st.pop();      
        st.pop();
        

        System.out.println(st);
        System.out.println(st.peek());
        st.pop();
        st.pop();
        System.out.println(st.isEmpty());
        st.pop();
                System.out.println(st.isEmpty());

        
        
        
        
       

    }
}
