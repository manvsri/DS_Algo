package com.sm.bst;

import org.junit.Test;

/**
 * Created by manvsri on 6/12/15.
 */
public class Tests {

    @Test
    public void testBst(){
        BinarySearchTree tree = new BinarySearchTree();
        tree.add(1).add(2).add(10).add(9).add(5);
        tree.inorder(tree.getRoot());
        System.out.println("");
        tree.postOrder(tree.getRoot());

        System.out.println(tree.search(21));

        System.out.println("Min is" +tree.findMin());
    }
}
