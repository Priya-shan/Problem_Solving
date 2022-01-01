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
public class QueueUsingArray {
    public static void main(String args[]){
    ArrayQueue q=new ArrayQueue();
    q.enqueue(10);
    q.enqueue(20);
    q.enqueue(30);
    q.enqueue(40);
    q.dequeue();
    q.dequeue();
    q.enqueue(50);
    //q.enqueue(60);
    
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q.isEmpty());
        
    
    }
}

class ArrayQueue{
int[] arr=new int[5];
int front=0;
int rear;
// [10, 2, 30, 40, 0]
public void enqueue(int val){
arr[rear++]=val;
//rear++;
}
public void dequeue(){
    arr[front++]=0;
//front++;
}
public int peek(){
return arr[front];
}
public boolean isEmpty(){
return front==0 && rear ==0;
}
public boolean isFull(){
return rear==arr.length;
}
public String toString(){
    return Arrays.toString(arr);
    
 
}
}