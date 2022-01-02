/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdobeInterviewQns;

/**
 *
 * @author welcom
 */
public class reverseLL {
    public static void main(String args[]){
        LinkedList list=new LinkedList();
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

class LinkedList {

    private class Node {

        private int value;
        private Node next;

        Node(int value) {
            this.value = value;
        }
    }
    
    private Node first;
    private Node last;
    
    
    public void insert(int value){
        Node node=new Node(value);
        if(first==null){
            first=last=node;
        }
        last.next=node;
        last=node;   
    }
    public void reverse(){
        Node current=first;
        Node next=null;
        Node prev=null;
        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        first=prev;
    }
    public void print(){
        Node current=first;
        while(current!=null){
            System.out.print(current.value+"->");
            current=current.next;
        }
        
    }
        
}
