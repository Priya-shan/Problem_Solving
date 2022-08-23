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
public class Main {

    public static void main(String args[]) {
        
        System.out.println("---------------Linked List--------------------");
        CustomLinkedList lst=new CustomLinkedList();
        lst.insertFirst(5);
        lst.insertFirst(15);
        lst.insertFirst(6);
        lst.insertFirst(76);
        lst.insertFirst(9);
        lst.insertFirst(34);
        lst.insertLast(100);
        lst.display();
        lst.insertMiddle(333, 3);
        lst.display();
        System.out.println(lst.deleteFirst());
        lst.display();
        System.out.println(lst.deleteLast());
        lst.display();
        System.out.println(lst.deleteMiddle(5));
        lst.display();
        System.out.println("Reverse");
        lst.reverse();
        lst.insertLast(1000);
        lst.display();
        
        System.out.println("---------------Doubly Linked List--------------------");
        CustomDoublyLinkedList dll=new CustomDoublyLinkedList();
        dll.InsertFirst(1);
        dll.InsertFirst(2);
        dll.InsertFirst(3);
        dll.display();
        dll.InsertLast(4);
        dll.display();
        dll.InsertMiddle(9, 3);
        dll.display();
        dll.InsertMiddle(11, 1);
        dll.display();
        System.out.println("----");
        dll.InsertAfterValue(22, 3);
        dll.display();

        System.out.println("---------------Singly Circular Linked List--------------------");
        CustomSCircularLinkedList clls=new CustomSCircularLinkedList();
        clls.InsertFirst(1);
        clls.InsertFirst(2);
        clls.InsertFirst(3);
        clls.InsertFirst(4);
        clls.display();
        clls.InsertLast(33);
        clls.InsertLast(44);
        clls.display();
        clls.InsertMiddle(55,0);
        clls.display();
        clls.deleteVal(447);
        clls.display();
        
        System.out.println("---------------Doubly Circular Linked List--------------------");
        CustomDCircularLinkedList cll=new CustomDCircularLinkedList();
        cll.InsertFirst(1);
        cll.InsertFirst(2);
        cll.InsertFirst(3);
        cll.InsertFirst(4);
        cll.display();
        cll.InsertLast(33);
        cll.InsertLast(44);
        cll.display();
        cll.InsertMiddle(55,6);
        cll.display();
    }
}
