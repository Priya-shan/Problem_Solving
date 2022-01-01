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
        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addFirst(50);
        list.addLast(90);
        //System.out.println(list.indexOf(50));
        System.out.println(list.contains(90));
        //list.removeFirst();
list.removeLast();
        System.out.println(list.contains(90));

    }
}
