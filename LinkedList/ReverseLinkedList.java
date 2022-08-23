/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

/**
 *
 * @author welcom
 */
public class ReverseLinkedList {

    public static void main(String args[]) {
        CustomLinkedList ll = new CustomLinkedList();
        ll.insertLast(10);
        ll.insertLast(20);
        ll.insertLast(30);
        ll.insertLast(40);
        ll.display();
        ll.reverse();

//        CustomDoublyLinkedList dll = new CustomDoublyLinkedList();
//        dll.InsertLast(10);
//        dll.InsertLast(20);
//        dll.InsertLast(30);
//        dll.InsertLast(40);
//        dll.display();
//        dll.reverse();
//        
//        CustomDCircularLinkedList cll = new CustomDCircularLinkedList();
//        cll.InsertLast(10);
//        cll.InsertLast(20);
//        cll.InsertLast(30);
//        cll.InsertLast(40);
//        cll.display();
        //cll.reverse();
        
        
    }
}
