/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

/**
 *
 * @author welcom
 */
public class QueueUsingLinkedList {

    public static void main(String args[]) {
        LinkedListQueue lq = new LinkedListQueue();
        lq.enqueue(50);
        lq.enqueue(100);
        lq.enqueue(150);
        lq.enqueue(200);
        lq.dequeue();
        System.out.println(lq);
        lq.dequeue();
        lq.dequeue();
        System.out.println(lq.peek());
        lq.dequeue();
        System.out.println(lq.isEmpty());

    }

}

class LinkedListQueue {

    private class Node {

        private int value;
        private Node next;

        Node(int val) {
            this.value = val;
        }
    }

    private Node first;
    private Node last;

    //addlast
    public void enqueue(int item) {
        Node node = new Node(item);
        if (first == null) {
            first = last = node;
        } else {
            last.next = node;
            last = node;
        }
    }

    //removefirst
    public void dequeue() {
        if (first == last) {
            first = last = null;
            return;
        }
        Node second = first.next;
        first.next = null;
        first = second;

    }

    public int peek() {
        Node head = first;
        return head.value;
    }

    public boolean isEmpty() {
        return first == null && last == null;
    }

    public String toString() {
        Node current = first;
        String res = "";
        while (current != null) {
            res = res + current.value + "->";
            current = current.next;
        }
        return "LinkedList : " + res;
    }

}
