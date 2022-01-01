/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

import java.util.*;

/**
 *
 * @author welcom
 */
public class LinkedList {

    private class Node {

        private int value;
        private Node next;

        Node(int value) {
            this.value = value;
        }
    }
    private Node first;
    private Node last;

    public void reverse() {
        Node current = first;
        Node after=null;
        Node prev=null;
        while (current != null) {
            after=current.next;
            current.next=prev;
            prev=current;
            current=after;
            
        }
        first=prev;
    }

    public void addLast(int item) {
        Node node = new Node(item);
        //node.value=item;
        if (isEmpty()) {
            first = last = node;
        } else {
            last.next = node;
            last = node;
        }
    }

    public void addFirst(int item) {
        Node node = new Node(item);

        if (isEmpty()) {
            first = last = node;
        } else {
            node.next = first;
            first = node;

        }
    }

    public int indexOf(int item) {
        Node node = new Node(item);
        int index = 0;
        Node current = first;
        while (current != null) {
            if (current.value == item) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    public boolean contains(int item) {
        /*Node node = new Node(item);
     Node current=first;
     while(current!=null){
         if(current.value==item)
             return true;
         current=current.next;
     }
     return false;*/
        return indexOf(item) != -1;
    }

    public void removeFirst() {
        //Node node = new Node(item);
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        if (first == last) {
            first = last = null;
            return;
        }
        Node second = first.next;
        first.next = null;
        first = second;

    }

    public void removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        if (first == last) {
            first = last = null;
            return;
        }
        Node prev;
        Node current = first;

        while (current != null) {
            if (current.next == last) {
                prev = current;
                last = prev;
                current.next = null;
                return;
            }
            current = current.next;
        }
    }

    private boolean isEmpty() {
        return first == null;
    }
    
    public String toString(){
    Node cur=first;
    String res="";
    while(cur!=null){
        res=res+cur.value+"->";
        cur=cur.next;
    }
    return res+"null";
    }
}
