package com.tgt.igniteplus;

class Node {
    char data;
    Node left, right;

};

public class Bin_tree {

    Node root;

    static Node newNode(char data) {
        Node temp = new Node();
        temp.data = data;
        temp.left = temp.right = null;
        return temp;
    }

    static void printLeafNodes(Node root) {
        if (root == null)
            return;
        if (root.left == null && root.right == null) {
            System.out.print(root.data + " ");
            return;
        }

        if (root.left != null)
            printLeafNodes(root.left);
        if (root.right != null)
            printLeafNodes(root.right);
    }


    public static void main(String args[]) {
        Bin_tree newNode = new Bin_tree();
        Node root = newNode('A');
        root.left = newNode('B');
        root.right = newNode('F');
        root.left.left = newNode('C');
        root.left.right = newNode('E');
        root.right.left = newNode('G');
        root.right.right = newNode('H');
        root.left.left.left = newNode('D');
        root.right.right.left = newNode('K');
        System.out.print("Leaf Nodes:\t");
        printLeafNodes(root);
    }
}
/*
Leaf Nodes:	D E G K
 */