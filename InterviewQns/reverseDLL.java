/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterviewQns;

/**
 *
 * @author welcom
 */
public class reverseDLL {
    public static void main(String args[]){
    doublyLinkedList list=new doublyLinkedList();
        list.insert(13);
        list.insert(23);
        list.insert(33);
        list.insert(43);
        
        list.print();
        list.reverse();
        System.out.println("\n");
        list.print();
    }
}

class doublyLinkedList {

    private class Node {

        int value;
        Node next;
        Node prev;

        Node(int value) {
            this.value = value;
        }

    }
    Node first;
    Node last;

    public void insert(int value) {
        Node node = new Node(value);
        if (first == null) {
            first = last = node;
            return;
        }
        last.next = node;
        node.prev = last;
        last=node;
    }
    public void reverse(){
        Node current=first;
        Node next=null;
        Node prev=null;
        while(current!=null){
            next=current.next;
            current.next=current.prev;
            current.prev=next;
            current=next;
        }
        current=first;
        first=last;
    }
    public void print(){
        Node current=first;
        while(current!=null){
            System.out.print(current.value+"->");
            current=current.next;
        }
        
    }
}
