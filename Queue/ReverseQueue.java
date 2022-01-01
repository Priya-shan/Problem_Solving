/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author welcom
 */
public class ReverseQueue {
    
    public static void main(String args[]){
        Queue <Integer> q=new ArrayDeque<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.poll();
        q.add(90);
        System.out.println(q);
        reverse(q);
    }
    public static void reverse(Queue <Integer> q){
    int item;
    //Queue <Integer> rq=new ArrayDeque<>();
    Stack <Integer> st=new Stack<>();
    while(!q.isEmpty())
        st.push(q.remove());
    
    while(!st.isEmpty())
        q.add(st.pop());
        System.out.println(q);
    }
}
