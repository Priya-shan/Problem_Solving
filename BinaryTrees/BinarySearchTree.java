/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinaryTrees;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author welcom
 */

class BinarySearchTree {

    private class Node {

        private int value;
        private Node leftChild;
        private Node rightChild;

        public Node(int value) {
            this.value = value;
        }
    }
    private Node root;

    public void insert(int value) {
        if (root == null) {
            root = new Node(value);
            return;
        }
        Node current = root;
        while(true){
        if (value < current.value) {
            if (current.leftChild == null) {
                current.leftChild = new Node(value);
                return;
            }
            current = current.leftChild;
        }
        if (value > current.value) {
            if (current.rightChild == null) {
                current.rightChild = new Node(value);
                return;
            }
            current = current.rightChild;
        }
       }
    }

    public boolean findValue(int value) {

        return false;
    }

    public void preorder() {
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
    
    public void inorder() {
        inorder(root);
    }
    private void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.leftChild);
        System.out.print(root.value+"\t");
        inorder(root.rightChild);
    }
    
    public void postorder() {
        postorder(root);
    }
    private void postorder(Node root) {
        if (root == null) {
            return;
        }
        postorder(root.leftChild);
        postorder(root.rightChild);
        System.out.print(root.value+"\t");
    }
    
    public int minimum(){
        Node current=root;
        Node tracer=root;
        while(current!=null){
            tracer=current;
            current=current.leftChild;
        }
        return tracer.value;
    }
    
    public int height() {
        return height(root);
    }
    private int height(Node root){
        if(root==null)
            return -1;
        if(root.leftChild==null && root.rightChild==null){
            return 0;
        }
        return 1+Math.max(height(root.leftChild),height(root.rightChild));
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
    
   public List<Integer> printNodesAtDistance(int distance){
       List<Integer> lst=new ArrayList<>();
       printNodesAtDistance(root,distance,lst);
       return lst;
   }
   private void printNodesAtDistance(Node root,int distance,List<Integer> lst){
       if(root==null){
           return;
       }
   if(distance==0){
       //System.out.println(root.value);
       lst.add(root.value);
       return;
   }
    printNodesAtDistance(root.leftChild,distance-1,lst);
    printNodesAtDistance(root.rightChild,distance-1,lst);
   }
   
   public void levelOrder(){
       for(int i=0;i<height();i++){
           List<Integer> lst=printNodesAtDistance(i);
           for(int val:lst){
               System.out.println(val);
           }
           
       }
   }
}
