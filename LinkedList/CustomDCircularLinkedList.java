/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

/**
 *
 * @author Shanmuga Priya M
 */
public class CustomDCircularLinkedList {

    Node_cll head;
    Node_cll last;

    public void InsertFirst(int val) {
        Node_cll node = new Node_cll(val);
        if (head == null) {
            head = node;
            head.next = node;
            head.prev = node;
            last = node;
            return;
        }
        node.next = head;
        head.prev = node;
        last.next = node;
        node.prev = last;
        head = node;
    }

    public void InsertLast(int val) {
        if (head == null) {
            InsertFirst(val);
            last=head;
            return;
        }
        Node_cll node = new Node_cll(val);
        last.next=node;
        node.prev=last;
        node.next=head;
        head.prev=node;
        last=node;
        
    }
    
    public void InsertMiddle(int val,int index){
        if(index==0){
            InsertFirst(val);
            return;
        }
        Node_cll node = new Node_cll(val);
        Node_cll temp=head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        node.next=temp.next;
        temp.next=node;
        node.prev=temp;
        node.next.prev=node;
        
        
    }
    
    public void display() {
        Node_cll temp = head;
        while (temp.next != head) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.print(temp.data + " ->Ends\n");
    }
}

class Node_cll {

    int data;
    Node_cll next;
    Node_cll prev;

    Node_cll(int val) {
        this.data = val;
    }

    Node_cll(int val, Node_cll prev, Node_cll next) {
        this.data = val;
        this.next = next;
        this.prev = prev;
    }
}
