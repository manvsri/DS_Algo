package com.sm.linkedlist;

import org.junit.Test;

/**
 * Created by manvsri on 6/7/15.
 */
public class Tests {

    LinkedList ll = new LinkedList();
    @Test
    public void mytest(){
        ll.add(1).add(2).add(3);
        ll.print();
        ll.addAtIndex(2, 2.5);
        ll.print();
        ll.addAtIndex(0, 2);
        ll.print();
        ll.addAtEnd(100);
        ll.print();
        ll.remove(3);
        ll.print();

        System.out.println("Count :" + ll.count());
        System.out.println("Search : " + ll.search(1001));

        ll.print();
        System.out.println("Middle Element : " + ll.findMiddle());

    }

    @Test
    public void test2()
    {
        //nthFromEnd
        ll.add(1).add(2).add(3).add(4).add(5).add(6).add(7);
        ll.print();
        System.out.printf("3rd from end : "+ll.nthFromEnd(3));

        ll.clear();
        ll.print();
    }

}
