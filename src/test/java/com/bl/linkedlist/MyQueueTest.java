package com.bl.linkedlist;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyQueueTest {

    @Test
    public void givenNumbersShouldAppendToFormAQueue() {
        LinkedListMain<Integer> myFirstNode = new LinkedListMain<>(56);
        LinkedListMain<Integer> mySecondNode = new LinkedListMain<>(30);
        LinkedListMain<Integer> myThirdNode = new LinkedListMain<>(70);
        MyQueue myQueue=new MyQueue();
        myQueue.enQueue(myFirstNode);
        myQueue.enQueue(mySecondNode);
        myQueue.enQueue(myThirdNode);
        myQueue.printQueue();
        int size=myQueue.returnSize();
        Assert.assertEquals(3,size);

    }
    @Test
    public void givenNumbersShouldAppendToDequeue() {
        LinkedListMain<Integer> myFirstNode = new LinkedListMain<>(56);
        LinkedListMain<Integer> mySecondNode = new LinkedListMain<>(30);
        LinkedListMain<Integer> myThirdNode = new LinkedListMain<>(70);
        MyQueue myQueue=new MyQueue();
        myQueue.enQueue(myFirstNode);
        myQueue.enQueue(mySecondNode);
        myQueue.enQueue(myThirdNode);
        INode element=myQueue.deQueue();
        System.out.println("Size of queue is: "+myQueue.returnSize());
        Assert.assertEquals(56,element.getKey());


    }
}