/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterviewQns;

import java.util.Stack;

/**
 *
 * @author welcom
 */
public class checkPalindrome {

    public static void main(String args[]) {
        char[] arr = {'a', 'b', 'a', 'a'};
        System.out.println(isArrayPalindrome(arr));

        LinkedLis list = new LinkedLis();
        list.insert(13);
        list.insert(23);
        list.insert(23);
        list.insert(13);

        list.print();
        System.out.println(list.isLLPalindrome());

    }

    public static boolean isArrayPalindrome(char[] arr) {
        int first = 0;
        int last = arr.length - 1;
        while (first < last) {
            if (arr[first++] != arr[last--]) {
                return false;
            }

        }
        return true;
    }
}

class LinkedLis {

    private class Node {

        private int value;
        private Node next;

        Node(int value) {
            this.value = value;
        }
    }

    private Node first;
    private Node last;

    public boolean isLLPalindrome() {
        Stack<Integer> st = new Stack<>();
        Node curr = first;
        while (curr != null) {
            st.push(curr.value);
            curr=curr.next;
        }
        curr = first;
        while(curr!=null){
        int top=st.pop();
        if(curr.value==top){
            curr=curr.next;
        }
        else
            return false;
        }
        return true;
    }

    public void insert(int value) {
        Node node = new Node(value);
        if (first == null) {
            first = last = node;
        }
        last.next = node;
        last = node;
    }

    public void reverse() {
        Node current = first;
        Node next = null;
        Node prev = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        first = prev;
    }

    public void print() {
        Node current = first;
        while (current != null) {
            System.out.print(current.value + "->");
            current = current.next;
        }

    }

}
