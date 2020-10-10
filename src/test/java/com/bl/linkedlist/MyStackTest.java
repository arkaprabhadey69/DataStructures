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
    @Test
    public void givenElementsShouldPeakLIFOManner() {
        LinkedListMain<Integer> myFirstNode = new LinkedListMain<>(56);
        LinkedListMain<Integer> mySecondNode = new LinkedListMain<>(30);
        LinkedListMain<Integer> myThirdNode = new LinkedListMain<>(70);
        MyStack myStack=new MyStack();
        myStack.push(myFirstNode);
        myStack.push(mySecondNode);
        myStack.push(myThirdNode);
        myStack.printStack();
        INode element=myStack.peak();
        System.out.println("Size of stack is "+myStack.returnSize());
        Assert.assertEquals(70,element.getKey());


    }
    @Test
    public void givenElementsShouldPopLIFOManner() {
        LinkedListMain<Integer> myFirstNode = new LinkedListMain<>(56);
        LinkedListMain<Integer> mySecondNode = new LinkedListMain<>(30);
        LinkedListMain<Integer> myThirdNode = new LinkedListMain<>(70);
        MyStack myStack=new MyStack();
        myStack.push(myFirstNode);
        myStack.push(mySecondNode);
        myStack.push(myThirdNode);
        INode element=myStack.pop();
        myStack.printStack();
        System.out.println("Size of stack is "+myStack.returnSize());
        Assert.assertEquals(70,element.getKey());


    }
}