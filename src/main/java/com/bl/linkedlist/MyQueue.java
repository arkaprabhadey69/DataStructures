package com.bl.linkedlist;

public class MyQueue {
    public static MyLinkedList myLinkedList;
    public static int size;
    public MyQueue()
    {
        myLinkedList=new MyLinkedList();
    }
    //Method to add an element to a queue
    public void enQueue(INode element){
        size++;
        myLinkedList.insert(element);
    }

    public void printQueue() {
        myLinkedList.printLinkedList();
    }

    public int returnSize() {
        return size;
    }

    public INode deQueue() {
        size--;
        return myLinkedList.pop();
    }
}

