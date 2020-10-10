package com.bl.linkedlist;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListMainTest {
    @Test
    public void given3NumbersShouldPass() {
        LinkedListMain<Integer> myFirstNode = new LinkedListMain<>(56);
        LinkedListMain<Integer> mySecondNode = new LinkedListMain<>(30);
        LinkedListMain<Integer> myThirdNode = new LinkedListMain<>(70);
        myFirstNode.setNext(mySecondNode);
        mySecondNode.setNext(myThirdNode);
        boolean result = myFirstNode.getNext().equals(mySecondNode) &&
                mySecondNode.getNext().equals(myThirdNode);
        Assert.assertTrue(result);
    }

    @Test
    public void given3NumbersShouldPassHeadFromFront() {
        LinkedListMain<Integer> myFirstNode = new LinkedListMain<>(56);
        LinkedListMain<Integer> mySecondNode = new LinkedListMain<>(30);
        LinkedListMain<Integer> myThirdNode = new LinkedListMain<>(70);
        MyLinkedList L = new MyLinkedList();
        L.add(myFirstNode);
        L.add(mySecondNode);
        L.add(myThirdNode);
        L.printLinkedList();
        boolean result = L.head.equals(myThirdNode) && L.head.getNext().equals(mySecondNode)
                && L.tail.equals(myFirstNode);
        Assert.assertTrue(result);
    }

    @Test
    public void given3NumbersShouldPassHeadFromEnd() {
        LinkedListMain<Integer> myFirstNode = new LinkedListMain<>(56);
        LinkedListMain<Integer> mySecondNode = new LinkedListMain<>(30);
        LinkedListMain<Integer> myThirdNode = new LinkedListMain<>(70);
        MyLinkedList L = new MyLinkedList();
        L.insert(myFirstNode);
        L.insert(mySecondNode);
        L.insert(myThirdNode);
        L.printLinkedList();
        System.out.println(MyLinkedList.getCount());
        boolean result = L.head.equals(myFirstNode) && L.head.getNext().equals(mySecondNode)
                && L.tail.equals(myThirdNode);
        Assert.assertTrue(result);
    }

    @Test
    public void given3NumbersShouldPassHeadFromEndAtSpecificPosition() {
        LinkedListMain<Integer> myFirstNode = new LinkedListMain<>(56);
        LinkedListMain<Integer> myNewNode = new LinkedListMain<>(30);
        LinkedListMain<Integer> mySecondNode = new LinkedListMain<>(70);
        MyLinkedList L = new MyLinkedList();
        L.insert(myFirstNode);
        L.insert(mySecondNode);
        L.insertAfter(myFirstNode, myNewNode);
        L.printLinkedList();
        System.out.println(MyLinkedList.getCount());
        boolean result = L.head.equals(myFirstNode) && L.head.getNext().equals(myNewNode) && L.tail.equals(mySecondNode);
        Assert.assertTrue(result);
    }

    @Test
    public void given3NumbersShouldDeleteHead() {
        LinkedListMain<Integer> myFirstNode = new LinkedListMain<>(56);
        LinkedListMain<Integer> mySecondNode = new LinkedListMain<>(30);
        LinkedListMain<Integer> myThirdNode = new LinkedListMain<>(70);
        MyLinkedList L = new MyLinkedList();
        L.insert(myFirstNode);
        L.insert(mySecondNode);
        L.insert(myThirdNode);
        L.pop();

        L.printLinkedList();
        System.out.println(MyLinkedList.getCount());
        boolean result = L.head.equals(mySecondNode) && L.head.getNext().equals(myThirdNode);
        Assert.assertTrue(result);
    }

    @Test
    public void given3NumbersShouldDeleteFromLast() {
        LinkedListMain<Integer> myFirstNode = new LinkedListMain<>(56);
        LinkedListMain<Integer> mySecondNode = new LinkedListMain<>(30);
        LinkedListMain<Integer> myThirdNode = new LinkedListMain<>(70);
        MyLinkedList L = new MyLinkedList();
        L.insert(myFirstNode);
        L.insert(mySecondNode);
        L.insert(myThirdNode);
        L.popLast();
        L.printLinkedList();
        System.out.println(MyLinkedList.getCount());
        boolean result = L.head.equals(myFirstNode) && L.head.getNext().equals(mySecondNode);
        Assert.assertTrue(result);
    }
    @Test
    public void given3NumbersShouldSearch() {
        LinkedListMain<Integer> myFirstNode = new LinkedListMain<>(56);
        LinkedListMain<Integer> mySecondNode = new LinkedListMain<>(30);
        LinkedListMain<Integer> myThirdNode = new LinkedListMain<>(70);
        MyLinkedList L = new MyLinkedList();
        L.insert(myFirstNode);
        L.insert(mySecondNode);
        L.insert(myThirdNode);
        INode element=L.search(myThirdNode);
        L.printLinkedList();
        System.out.println(MyLinkedList.getCount());
        System.out.println(element);
        boolean result = element.getKey().equals(myThirdNode.getKey());
        Assert.assertTrue(result);
    }
    @Test
    public void givenFewNumbersShouldAddNewElementAtSpecificPosition() {
        LinkedListMain<Integer> myFirstNode = new LinkedListMain<>(56);
        LinkedListMain<Integer> mySecondNode = new LinkedListMain<>(30);
        LinkedListMain<Integer> myThirdNode= new LinkedListMain<>(70);
        LinkedListMain<Integer> myNewNode = new LinkedListMain<>(40);
        MyLinkedList L = new MyLinkedList();
        L.insert(myFirstNode);
        L.insert(mySecondNode);
        L.insert(myThirdNode);
        L.insertAfter(mySecondNode, myNewNode);
        L.printLinkedList();
        System.out.println(MyLinkedList.getCount());
        boolean result = L.head.equals(myFirstNode) && L.head.getNext().equals(mySecondNode) &&
                L.head.getNext().getNext().equals(myNewNode)&&L.tail.equals(myThirdNode);
        Assert.assertTrue(result);
    }
    @Test
    public void givenFewNumbersShouldDeleteNewElementAtSpecificPosition() {
        LinkedListMain<Integer> myFirstNode = new LinkedListMain<>(56);
        LinkedListMain<Integer> mySecondNode = new LinkedListMain<>(30);
        LinkedListMain<Integer> myThirdNode= new LinkedListMain<>(70);
        LinkedListMain<Integer> myNewNode = new LinkedListMain<>(40);
        MyLinkedList L = new MyLinkedList();
        L.insert(myFirstNode);
        L.insert(mySecondNode);
        L.insert(myNewNode);
        L.insert(myThirdNode);
        L.deleteAtIndex(myNewNode);
        L.printLinkedList();
        System.out.println(MyLinkedList.getCount());
        boolean result = L.head.equals(myFirstNode) && L.head.getNext().equals(mySecondNode) &&L.tail.equals(myThirdNode);
        Assert.assertTrue(result);
    }
    @Test
    public void givenFewNumbersShouldBeSorted() {
        LinkedListMain<Integer> myFirstNode = new LinkedListMain<>(56);
        LinkedListMain<Integer> mySecondNode = new LinkedListMain<>(30);
        LinkedListMain<Integer> myThirdNode= new LinkedListMain<>(70);
        LinkedListMain<Integer> myNewNode = new LinkedListMain<>(40);
        MyLinkedList L = new MyLinkedList();
        L.addSorted(myFirstNode);
        L.addSorted(mySecondNode);
        L.addSorted(myNewNode);
        L.addSorted(myThirdNode);
       // L.deleteAtIndex(myNewNode);
        L.printLinkedList();
        System.out.println(MyLinkedList.getCount());
//        boolean result = L.head.equals(myFirstNode) && L.head.getNext().equals(mySecondNode) &&L.tail.equals(myThirdNode);
//        Assert.assertTrue(result);
    }

}