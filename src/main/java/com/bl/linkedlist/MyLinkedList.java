package com.bl.linkedlist;

public class MyLinkedList {
    public INode head;
    public INode tail;
    public static int count;

    public void displayMessage() {
        System.out.println("Welcome to Data Structures");
    }

    public static int getCount() {
        return count;
    }

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
        count = 0;
    }
//Method to add elements from front

    public void add(INode newNode) {
        count++;
        if (this.tail == null) {
            this.tail = newNode;
        }
        if (this.head == null) {
            this.head = newNode;
        } else {
            INode tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
        }
    }
//Method to add elements from the back
    public void insert(INode newNode) {
        count++;
        if (this.tail == null) {
            this.tail = newNode;
        }

        if (this.head == null) {
            this.head = newNode;
        } else {
            INode tempNode = this.head;
            while (tempNode.getNext() != null) {
                tempNode = tempNode.getNext();
            }

            tempNode.setNext(newNode);
            this.tail = newNode;

        }
    }

    public void insertAfter(INode destNode, INode newNode) {
        count++;
        INode tempNode = this.head;
        while (!tempNode.getKey().equals(destNode.getKey())) {
            tempNode = tempNode.getNext();
        }
        newNode.setNext(tempNode.getNext());
        tempNode.setNext(newNode);
    }

    public INode pop() {
        count--;
        INode tempNode = this.head;
        this.head = head.getNext();
        return tempNode;
    }

    public INode popLast() throws NullPointerException {
        count--;
        if (this.head == null)
            return null;
        if (this.head.getNext().equals(null))
            return null;
        else {
            INode tempNode = head;
            while (!tempNode.getNext().equals(tail)) {
                tempNode = tempNode.getNext();
            }
            INode tempNode1 = tempNode.getNext();
            tempNode.setNext(null);
            return tempNode1;
        }
    }


    public void printLinkedList() {
        StringBuffer myNodes = new StringBuffer("My Nodes: ");
        INode tempNode = head;
        while (tempNode.getNext() != null) {
            myNodes.append(tempNode.getKey());
            if (!tempNode.getNext().equals(null))

                myNodes.append("->");
            tempNode = tempNode.getNext();

        }
        myNodes.append(tempNode.getKey());
        System.out.println(myNodes);

    }
}
