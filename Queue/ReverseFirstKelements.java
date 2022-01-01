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
public class ReverseFirstKelements {
    public static void main(String args[]){
        RevFirstK rk=new RevFirstK(); 
        Queue<Integer> q=new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        int k=3;
        System.out.println(rk.modifyQueue(q, k));
        
    }
}
class RevFirstK {
    // Function to reverse first k elements of a queue.
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        // add code here.
        Stack<Integer> s1= new Stack<>();
        Stack<Integer> s2= new Stack<>();
        Stack<Integer> s3= new Stack<>();
        Queue<Integer> q1=new ArrayDeque<>();
        int count=0;
        //frst k elements ah s1 la push panika
        while(count<k){
            s1.push(q.poll());
            count++;
        }
        //queue la ula michatha s2 la push panika 
        while(!q.isEmpty()){
        s2.push(q.poll());
        }
        //indha michatha reverse pana koodadhula so inoru stackla potu unreversed ah vachukra
        while(!s2.isEmpty()){
            s3.push(s2.pop());
        }
        //s1 la ula elathaum modho queue la add panitu
        while(!s1.isEmpty()){
            q1.add(s1.pop());
        }
        //aprm s3 la uladhaum add panipa avlodhn -- simple dimple \_/
        while(!s3.isEmpty()){
            q1.add(s3.pop());
        }
        return q1;
        
        
    }
}
