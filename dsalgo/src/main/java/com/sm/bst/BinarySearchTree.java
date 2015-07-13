package com.sm.bst;


import com.sm.Node;

/**
 * Created by manvsri on 6/12/15.
 */
public class BinarySearchTree {

    private Node ROOT = null;

    public Node getRoot(){
        return ROOT;
    }
    public BinarySearchTree add(int key) {
        Node newNode = new Node(key, null, null);
        if (ROOT == null) {
            ROOT = newNode;
        } else {
            Node current = ROOT;
            Node pointer = null;

            while (current != null) {
                pointer = current;
                if (key < (Integer) current.getData()) {
                    current = current.getLeftChild();
                } else {
                    current = current.getRightChild();
                }
            }
            if (key < (Integer) pointer.getData()) {
                pointer.setLeftChild(newNode);
            } else
                pointer.setRightChild(newNode);
        }
        return this;
    }

    public void inorder(Node node) {
        if (node == null)
            return;

        inorder(node.getLeftChild());
        System.out.print(" " + node.getData() + " ");
        inorder(node.getRightChild());
    }

    public void postOrder(Node node){
        if (node == null)
            return;

        inorder(node.getLeftChild());
        inorder(node.getRightChild());
        System.out.print(" " + node.getData() + " ");

    }

    public Node search(int key) {
        if (ROOT == null) {
            return ROOT;
        }
        Node current = ROOT;
        while (current != null && !current.getData().equals(key)) {
            if (key > (Integer) current.getData()) {
                current = current.getRightChild();
            } else {
                current = current.getLeftChild();
            }
        }
        return current;
    }

    public Node findMin() {
        if (ROOT == null)
            return ROOT;

        Node current = ROOT;

        while (current.getLeftChild() != null) {
            current = current.getLeftChild();
        }
        return current;
    }
}

