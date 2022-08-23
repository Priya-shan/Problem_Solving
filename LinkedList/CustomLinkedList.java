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
public class CustomLinkedList {

    private Node head;
    private Node tail;
    private int size;

    CustomLinkedList() {
        this.size = 0;
    }
    
    //InsertAtFirst -> O(1)
    public void insertFirst(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;
        if(tail==null){
            tail=node;
        }
        size+=1;
    }
    
    //InsertAtLast -> O(1)
    public void insertLast(int val){
        Node node=new Node(val);
        if(head==null){
            node.next=head;
            head=node;
            if(tail==null){
                tail=node;
            }
            return;
        }
        //if no tail is given//
//        Node temp=head;
//        while(temp.next!=null){
//            temp=temp.next;
//        }
//        temp.next=node;
//        tail=node;
        
        //if tail is given//
        tail.next=node;
        tail=node;
        size+=1;
    }
    
    //InsertAtFirst -> O(idx-1)/O(n)
    public void insertMiddle(int val,int index){
        
        Node temp=head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        Node node=new Node(val,temp.next);
        temp.next=node;
        
        size+=1;
    }
    
    //deleteFirst -> O(1)
    public int deleteFirst(){
        int val=head.data;
        if(head==null){
            tail=null;
        }
        head=head.next;
        size--;
        return val;
    }
    
    //deleteLast -> O(n)
    public int deleteLast(){
        
        Node temp=head;
        for(int i=1;i<size-1;i++){
            temp=temp.next;
        }
        int val=temp.next.data;
        temp.next=null;
        size--;
        return val;
        
    }
    //deleteMiddle -> O(n)
    public int deleteMiddle(int index){
        if(index==0){
            return deleteFirst();
            
        }
        Node temp=head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        int val=temp.next.data;
        temp.next=temp.next.next;
        
        size--;
        return val;
    }
    
    public void reverse(){
        Node before=null;
       Node after;
       Node curr=head;
       while(curr.next!=null){
           after=curr.next;
           curr.next=before;
           before=curr;
           curr=after;
       }
       curr.next=before;
       head=curr;
       display();
        
    }
    //display -> O(n)
    public void display(){
        Node temp=head;
        while(temp.next!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.print(temp.data+" -> ENDS\n");
        System.out.println("size "+size);
    }

}

class Node {

    int data;
    Node next;

    public Node(int val) {
        this.data = val;
    }

    public Node(int val, Node next) {
        this.data = val;
        this.next = next;
    }
}
