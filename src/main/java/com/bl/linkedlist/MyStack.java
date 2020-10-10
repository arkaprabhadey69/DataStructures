package com.bl.linkedlist;

public class MyStack {

    public static MyLinkedList myLinkedList;
    public static int size;
    public MyStack()
    {
        myLinkedList=new MyLinkedList();
    }

    public void push(INode element){
        size++;
        myLinkedList.add(element);
    }
    public void printStack()
    {
        myLinkedList.printLinkedList();
    }
    public int returnSize()
    {
        return size;
    }
    public INode peak()
    {
        return myLinkedList.head;
    }
    public INode push()
    {
        return myLinkedList.pop();
    }
}
