/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinaryTrees;

/**
 *
 * @author welcom
 */
public class MinValueInBST {
    public static void main(String args[]){
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(20);
        tree.insert(10);
        tree.insert(30);
        tree.insert(6);
        tree.insert(21);
        tree.insert(4);
        tree.insert(3);
        tree.insert(8);
        
        System.out.println(tree.minimum());
    }
}