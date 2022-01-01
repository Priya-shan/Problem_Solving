/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

import java.util.Stack;

/**
 *
 * @author welcom
 */
public class QueueUsingStack {

    public static void main(String args[]) {
        QueueStack qs = new QueueStack();
        qs.enqueue(10);
        qs.enqueue(20);
        qs.enqueue(30);
        qs.enqueue(40);
        qs.enqueue(50);
        qs.dequeue();
        qs.dequeue();
        System.out.println(qs.peek());

    }
}

class QueueStack {

    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    public void enqueue(int val) {
        s1.push(val);
    }

    public void reverse() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
    }

    public int dequeue() {
        //checking if s2 is empty if its empty revrse s1 and add to st2
        reverse();
        //if s2 is not empty simply pop
        return s2.pop();
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException();
        }
        return s2.peek();
    }

    public boolean isEmpty() {
        return s2.isEmpty() && s1.isEmpty();
    }

}
