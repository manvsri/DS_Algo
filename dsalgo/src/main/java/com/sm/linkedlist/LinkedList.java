package com.sm.linkedlist;


import com.sm.Node;

/**
 * Created by manvsri on 6/7/15.
 */
public class LinkedList {

    private Node HEAD;

    public Node getHEAD() {
        return HEAD;
    }

    /**
     * Adds a given number to the end of the linkedlist
     *
     * @param number
     */
    public LinkedList add(Object number) {
        if (HEAD == null) {
            HEAD = new Node(number);
        } else {
            Node pointer = HEAD;
            while (pointer.getNext() != null) {
                pointer = pointer.getNext();
            }
            pointer.setNext(new Node(number));
        }
        return this;
    }

    public void addAtIndex(int index, Object o) {
        if (HEAD == null) {
            HEAD = new Node(o);
            return;
        } else {
            int count = 0;

            if (index == 0) {
                Node tmp = new Node(o, HEAD);
                HEAD = tmp;
                return;
            }

            Node current = HEAD;
            Node previousNode;
            while (current.getNext() != null) {
                if (count + 1 == index) {
                    Node tmp = new Node(o, current.getNext());
                    current.setNext(tmp);
                    return;
                }
                current = current.getNext();
                count++;
            }
            System.out.println("ERROR: INDEX > Size of linked list");
        }
    }

    public void addAtEnd(Object o) {
        Node newNode = new Node(o);

        if (HEAD == null) {
            HEAD = newNode;
            return;
        }

        Node current = HEAD;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(newNode);
    }

    public void remove(Object o) {
        if (HEAD == null) return;

        Node current = HEAD;
        Node previous = null;

        if (o.equals(current.getData())) {
            HEAD = current.getNext();
            return;
        }
        while (current.getNext() != null) {
            previous = current;
            current = current.getNext();
            if (o.equals(current.getData())) {
                previous.setNext(current.getNext());
                return;
            }
        }
        System.out.println("ENTRY NOT FOUND");
    }

    public Node findMiddle() {
        if (HEAD == null) return null;

        Node slowPointer;
        Node fastPointer;
        slowPointer = fastPointer = HEAD;
        int count = 1;

        while (fastPointer.getNext() != null) {
            if (count % 2 == 0) {
                slowPointer = slowPointer.getNext();
            }
            fastPointer = fastPointer.getNext();
            count++;
        }

        return slowPointer;
    }

    public int count() {
        return recursiveCount(HEAD);
    }

    public boolean search(Object o) {
        return findRecursive(o, HEAD);
    }

    private boolean findRecursive(Object o, Node current) {
        if (current == null) return false;

        if (o.equals(current.getData())) return true;

        return findRecursive(o, current.getNext());
    }

    private int recursiveCount(Node head) {
        if (head == null) return 0;
        return 1 + recursiveCount(head.getNext());
    }

    public void print() {
        StringBuilder builder = new StringBuilder();
        if (HEAD == null) {
            builder.append("LinkedList {}");
            System.out.println(builder.toString());
            return;
        }
        builder.append("LinkedList { ");
        Node pointer = HEAD;
        builder.append(pointer.getData());

        while (pointer.getNext() != null) {
            pointer = pointer.getNext();
            builder.append(" -> " + pointer.getData());
        }
        builder.append(" }");

        System.out.println(builder.toString());
    }

    /*
      Returns nth node from the end.
     */
    public Node nthFromEnd(int n) {
      /*
        Can be done in 2 ways, traverse till end to find the length and then traverse again to stop at end-n
        2nd way is to have 2 pointers, one of them starts incrementing only after count=n, so when the other pointer reaches end
        we would have found nth node from end
         */

        Node current, nth;
        current = nth = HEAD;
        int count=1;
        boolean started = false;

        if(n < 1 || HEAD == null) return HEAD;

        while(current.getNext() != null){

            if(count >= n){
                nth = nth.getNext();
                started=true;
            }
            current = current.getNext();
            count++;
        }
        if(!started) throw new IllegalArgumentException("Requested node is out of bounds");
        return nth;
    }

    /**
     * Removes all elements of linked list
     */
    public void clear(){
        HEAD = null;
    }

    /**
     * Reverses the linkedlist
     */
//    public void reverse(){
////        HEAD = rev(HEAD);
//    }
//
//    private Node rev(Node node, Node predecessor) {
//        if (node.getNext() == null){
//            node.setNext(predecessor);
//            return node;
//        }
//        node.setNext(rev());
//        return node;
//    }
//
//    private Node reverseNode(Node precedessor, Node node){
//
//        if(node.getNext() == null) return precedessor;
//
//        node.setNext(reverseNode(node,precedessor));
//
//    }
}
