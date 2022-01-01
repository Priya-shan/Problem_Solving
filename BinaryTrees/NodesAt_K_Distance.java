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
public class NodesAt_K_Distance {
    public static void main(String args[]){
        BinarySearchTree tree=new BinarySearchTree();
        tree.insert(20);
        tree.insert(10);
        tree.insert(30);
        tree.insert(6);
        tree.insert(14);
        tree.insert(24);
        tree.insert(3);
        tree.insert(8);
        tree.insert(26);
        
        System.out.println(tree.printNodesAtDistance(0));
    }
}
