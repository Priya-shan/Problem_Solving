/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 *
 * @author welcom
 */
public class StackUsingQueue {
    public static void main(String args[]){
    StackQueue s=new StackQueue();
    s.push(10);
    s.push(20);
    s.push(30);
    s.push(40);
    s.push(50);
    s.display();
    s.pop();
    s.pop();
    s.pop();
    s.pop();
    s.display();
    s.peek();
    s.pop();
    
    }
}
class StackQueue{
//push
    //enqueue in q
//pop
    //dequeue q and engueue in q1 except last element
    //q=q1
Queue<Integer> q=new ArrayDeque<>();
Queue<Integer> q2=new ArrayDeque<>();
public void push(int item){
    q.add(item);
}
public int pop(){
    if(isEmpty()){
    throw new IllegalStateException();
    }
    int count=q.size();
    while(count>1){
        q2.add(q.remove());
        count--;
    }
    int le=q.poll();
    q=q2;
    return le;
}
public void peek(){
    int count=q.size();
    while(count>1){
        q2.add(q.remove());
        count--;
    }
    System.out.println(q.poll()); 
}
public boolean isEmpty(){
    return q.isEmpty();
}

public void display(){
    System.out.println(q);
    
}

}