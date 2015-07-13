package com.sm;

/**
 * Created by manvsri on 6/7/15.
 */
public class Node {

    private Object data;

    /*Used by linkedlist */
    private Node next;
    public Node(Object data, Node next) {
        this.next = next;
        this.data = data;
    }


    /*Used by trees*/
    private Node leftChild;
    private Node rightChild;

    public Node(Object data, Node leftChild, Node rightChild) {
        this.data = data;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }


    public Node() {}

    public Node(Object data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }
}
