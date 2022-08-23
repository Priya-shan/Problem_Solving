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
public class CustomDoublyLinkedList {

    private Node_dll head;

    public void InsertFirst(int val) {
        Node_dll node = new Node_dll(val);
        if (head == null) {
            head = node;
            node.prev = null;
            return;
        }
        if (head != null) {
            head.prev = node;
        }
        node.next = head;
        node.prev = null;
        head = node;
    }

    public void InsertLast(int val) {
        Node_dll node = new Node_dll(val);
        node.next = null;

        if (head == null) {
            node.prev = null;
            head = node;
            return;
        }
        Node_dll last = head;
        Node_dll temp = head;
        while (temp.next != null) {
            last = temp.next;
            temp = temp.next;
        }
        last.next = node;
        node.prev = last;

    }

    public void InsertMiddle(int val, int index) {
        Node_dll node = new Node_dll(val);
        if (index == 0) {
            InsertFirst(val);
            return;
        }

        Node_dll temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        node.prev = temp;
        node.next = temp.next;
        temp.next = node;
        temp.next.next.prev = node;

    }

    public void InsertAfterValue(int val, int prevVal) {
        Node_dll node = new Node_dll(val);
        Node_dll temp = head;
        int flag = 0;
        while (temp != null) {
            if (temp.data == prevVal) {
                flag = 1;

                node.next = temp.next;
                node.prev = temp;
                if (temp.next != null) {
                    node.next.prev = node;
                }
                temp.next = node;

            }
            temp = temp.next;
        }
        if (flag == 0) {
            System.out.println("Given value not found");
        }
    }

    public void reverse() {
        Node_dll temp;
        Node_dll before = null;
        Node_dll after;
        Node_dll curr = head;
        curr.prev = null;
        while (curr.next != null) {
            after = curr.next;
            curr.next = before;
            curr.prev = after;
            before = curr;
            curr = curr.next;
        }
        //curr.next=curr.prev;
        head = curr;
        display();
    }

    public void display() {
        Node_dll temp = head;
        Node_dll last = null;
        System.out.print("Start -> ");
        while (temp.next != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        last = temp;
        System.out.print(temp.data + " -> End\n");

        System.out.println("Printing in Reverse Order");
        System.out.print("Start -> ");
        while (last.prev != null) {
            System.out.print(last.data + " <-> ");
            last = last.prev;
        }
        System.out.print(last.data + " -> End\n");

    }
}

class Node_dll {

    int data;
    Node_dll next;
    Node_dll prev;

    public Node_dll(int val) {
        this.data = val;
    }

    public Node_dll(int val, Node_dll next, Node_dll prev) {
        this.data = val;
        this.next = next;
        this.prev = prev;
    }
}
