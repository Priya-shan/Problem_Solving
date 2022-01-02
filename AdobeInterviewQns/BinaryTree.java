/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdobeInterviewQns;

/**
 *
 * @author welcom
 */

public class BinaryTree {
    Node root;
    public static void main(String args[]){
        BinaryTree tree=new BinaryTree();
        
        tree.root=new Node(20);
        tree.root.leftchild=new Node(10);
        tree.root.rightchild=new Node(30);
        tree.root.leftchild.leftchild=new Node(5);
        System.out.println(tree.isbst());
        
    } 
    
    public boolean isbst(){
        return isbst(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
    public boolean isbst(Node root,int min,int max){
        if(root==null)
            return true;
        if(root.value<min || root.value>max){
            return false;
        }
        return isbst(root.leftchild,min,root.value-1) && isbst(root.rightchild,root.value+1,max);
        
    }
}
class Node{
    int value;
         Node leftchild;
         Node rightchild;
        Node(int value){
            this.value=value;
        }
}
/*
class BinaryTree{
    private class Node{
        private int value;
        private Node leftchild;
        private Node rightchild;
        Node(int value){
            this.value=value;
        }
    }
    private Node root;
    
    public void insert(int value){
        if(root==null){
            root=new Node(value);
            return;
        }
        Node current=root;
        while(true){
            if(value<current.value){
                if(current.leftchild==null){
                current.leftchild=new Node(value);
                return;
                }
                current=current.leftchild;
            }
            else{
                if(current.rightchild==null){
                current.rightchild=new Node(value);
                return;
                }
                current=current.rightchild;
            }
        }
    }
    public void preorder(){
    preorder(root);
    }
    private void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.value+"\t");
        preorder(root.leftchild);
        preorder(root.rightchild);
    }

}
*/