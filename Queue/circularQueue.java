/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

import java.util.Arrays;

/**
 *
 * @author welcom
 */
public class circularQueue {
    public static void main(String args[]){
    CirArrayQueue q=new CirArrayQueue();
    q.enqueue(10);
    q.enqueue(20);
    q.enqueue(30);
    q.enqueue(40);
    q.dequeue();
    q.dequeue();
    q.enqueue(50);
    q.enqueue(60);
    q.enqueue(100);
    q.dequeue();
   q.enqueue(300);
    
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q.isEmpty());
        
    
    }
}

class CirArrayQueue{
int[] arr=new int[5];
int front=0;
int rear,count;
// [10, 2, 30, 40, 0]
public void enqueue(int val){
    if(isFull()){
    throw new IllegalStateException();
    }
arr[rear]=val;
count++;
rear=(rear+1)%arr.length;
//rear++;
}
public void dequeue(){
    arr[front]=0;
    front=(front+1)%arr.length;
    count--;
//front++;
}
public int peek(){
return arr[front];
}
public boolean isEmpty(){
return front==0 && rear ==0;
}
public boolean isFull(){
return count==arr.length;
}
public String toString(){
    return Arrays.toString(arr);
    
 
}

}