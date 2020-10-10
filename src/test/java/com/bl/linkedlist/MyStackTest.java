package com.bl.linkedlist;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyStackTest {
    @Test
    public void givenElementsShouldPushInLIFOManner() {
        LinkedListMain<Integer> myFirstNode = new LinkedListMain<>(56);
        LinkedListMain<Integer> mySecondNode = new LinkedListMain<>(30);
        LinkedListMain<Integer> myThirdNode = new LinkedListMain<>(70);
        MyStack myStack=new MyStack();
        myStack.push(myFirstNode);
        myStack.push(mySecondNode);
        myStack.push(myThirdNode);
        myStack.printStack();
        INode element=myStack.peak();
        int size=myStack.returnSize();
        Assert.assertEquals(3,size);


    }
}