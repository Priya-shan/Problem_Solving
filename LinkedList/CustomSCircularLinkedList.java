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
public class CustomSCircularLinkedList {

    Node_cll_s head;
    Node_cll_s last;

    public void InsertFirst(int val) {
        Node_cll_s node = new Node_cll_s(val);
        if(head==null){
            node.next=head;
            head=node;
            last=node;
            return;
        }
        node.next=head;
        last.next=node;
        head=node;
    }

    public void InsertLast(int val) {
        Node_cll_s node = new Node_cll_s(val);
        if(head==null){
            InsertFirst(val);
            return;
        }
        last.next=node;
        node.next=head;
        last=node;
    }

    public void InsertMiddle(int val, int index) {
        Node_cll_s node = new Node_cll_s(val);
        if(index==0){
            InsertFirst(val);
            return;
        }
        Node_cll_s temp=head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        node.next=temp.next;
        temp.next=node;
    }
    public void deleteVal(int val){
        Node_cll_s temp=head;
        int flag=0;
        if(temp.data==val){
            head=temp.next;
            last.next=head; 
            return;
        }
        do{
            if(temp.next.data==val){
                flag=1;
                temp.next=temp.next.next;
            }
            temp=temp.next;
        }while(temp!=head);
        
        if(flag==0){
            System.out.println("Not found");   
        }
    }

    public void display() {
        Node_cll_s temp = head;
        while (temp.next != head) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print(temp.data + " ->Ends\n");
    }
}

class Node_cll_s {

    int data;
    Node_cll_s next;

    Node_cll_s(int val) {
        this.data = val;
    }

    Node_cll_s(int val, Node_cll_s prev) {
        this.data = val;
        this.next = next;
    }
}
