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
public class BuildBinaryTree {
    
    public static void main(String args[]) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(3);
        tree.insert(2);
        tree.insert(5);
        tree.insert(1);
        tree.insert(4);
//        tree.insert(24);
//        tree.insert(3);
//        tree.insert(8);
//        tree.insert(26);
        tree.preorder();

    }
}
