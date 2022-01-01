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
public class EqualityChecking {

    public static void main(String args[]) {

        Tree tree = new Tree();
        tree.insert(20);
        tree.insert(10);
        tree.insert(30);
        tree.insert(6);
        

        Tree tree1 = new Tree();
        tree1.insert(20);
        tree1.insert(10);
        tree1.insert(30);
        tree1.insert(6);
        

        System.out.println(tree.equals(tree1));
    }
}

class Tree {

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
        while (true) {
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

    public boolean equals(Tree other) {
        return equals(root, other.root);
    }

    private boolean equals(Node first, Node second) {
        if (first == null && second == null) {
            return true;
        }
        if (first != null && second != null) {
            return first.value == second.value
                    && equals(first.leftChild, second.leftChild)
                    && equals(first.rightChild, second.rightChild);
        }
        return false;
    }

    public void preorder() {
        preorder(root);
    }

    private void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.value + "\t");
        preorder(root.leftChild);
        preorder(root.rightChild);
    }
   

}
