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
        LinkedList ll = new LinkedList();
        ll.addLast(10);
        ll.addLast(20);
        ll.addLast(30);
        ll.addLast(40);
        System.out.println(ll);
        ll.reverse();
        System.out.println(ll);
    }
}
