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

class Node {

    int value;
    Node leftChild;
    Node rightChild;

    Node(int value) {
        this.value = value;
    }

}

public class MinOfBinaryTree {

    private Node root;

    public static void main(String args[]) {
        MinOfBinaryTree tree = new MinOfBinaryTree();

        tree.root = new Node(28);
        tree.root.leftChild = new Node(7);
        tree.root.rightChild = new Node(5);
        tree.root.leftChild.rightChild = new Node(6);
        tree.root.leftChild.rightChild.leftChild = new Node(13);
        tree.root.leftChild.rightChild.rightChild = new Node(11);
        tree.root.rightChild.rightChild = new Node(9);
        tree.root.rightChild.rightChild.leftChild = new Node(4);

        tree.preorder();
        // Function call
        
        System.out.println("\nMinimum value : "+tree.min());
        System.out.println("\n"+tree.isBST());
        
    }
    public int min(){
        return min(root);
    }
    private int  min(Node root){
        if(root==null)
            return Integer.MAX_VALUE;
    
    int res=root.value;
    int left=min(root.leftChild);
    int right=min(root.rightChild);
    
    return Math.min(Math.min(left, right),res);
    }
    
    public boolean isBST(){
       return isBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
   }
    private boolean isBST(Node root,int min,int max){
       if(root==null){
           return true;
       }
       if(root.value<min || root.value>max){
           return false;
       }
       
       return isBST(root.leftChild,min,root.value-1) && isBST(root.rightChild,root.value+1,max);
   }
    public void preorder(){
     preorder(root);   
    }
    private void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.value+"\t");
        preorder(root.leftChild);
        preorder(root.rightChild);
    }

}
